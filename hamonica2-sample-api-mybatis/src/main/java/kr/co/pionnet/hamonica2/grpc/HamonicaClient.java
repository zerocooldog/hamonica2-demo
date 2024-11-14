package kr.co.pionnet.hamonica2.grpc;

import io.opentelemetry.proto.collector.hamonica2.CommandRequest;
import io.opentelemetry.proto.collector.hamonica2.CommandResponse;
import io.opentelemetry.proto.collector.hamonica2.CommandServiceGrpc;
import kr.co.pionnet.hamonica2.constant.ServerGroupType;
import kr.co.pionnet.hamonica2.io.grpc.*;

public class HamonicaClient {


    private ManagedChannel channel;

    private CommandServiceGrpc.CommandServiceBlockingStub stub;


    /**
     * GRPC 수집서버와 통신할 GRPC client 초기화 작업.
     *
     * @param ip
     * @param port
     * @author 장진철(zerocooldog @ pionnet.co.kr)
     * @since 2024-10-23
     */
    private HamonicaClient(String ip, int port, ServerGroupType target) {
        this.channel = createManageChannel(ip, port);
        this.stub = CommandServiceGrpc.newBlockingStub(channel).withInterceptors(new GRPClientInterceptor(target));
    }

    /**
     * <pre>
     *
     *  GrpcClient 연결을 생성 한다.
     *

     * </pre>
     * @param ip GRPC 서버 연결 ip
     * @param port GRPC 서버 연결 port
     *
     * @since 2024-10-23
     * @author 장진철(zerocooldog@pionnet.co.kr)
     */
    public static synchronized HamonicaClient createAgentClient(String ip, int port){
        return new HamonicaClient(ip, port, ServerGroupType.AGENT);
    }

    public static synchronized HamonicaClient createCollectorClient(String ip, int port){
        return new HamonicaClient(ip, port, ServerGroupType.COLLECTOR);
    }

    /**
     * 수집 서버에 접속할 설정정보를 담고 있는 ManagedChannel을 생성한다.
     *
     * @param ip 연결 주소
     * @param port 연결 포트
     * @return ManagedChannel
     */
    public ManagedChannel createManageChannel(String ip, int port){
        return ManagedChannelBuilder.forAddress(ip, port)
                .usePlaintext()
                .build();
    }

    // 연결 상태 확인 메서드
    public ConnectivityState checkConnectionState() {

        if(channel == null){
            return ConnectivityState.SHUTDOWN;
        }

        return channel.getState(true);
    }

    public boolean isConnectionStateReady(){
        return checkConnectionState() == ConnectivityState.READY;
    }

    public CommandResponse send(CommandRequest command){
        return stub.exportBlocking(command);
    }

    public void close() {
        channel.shutdownNow();
    }

}
