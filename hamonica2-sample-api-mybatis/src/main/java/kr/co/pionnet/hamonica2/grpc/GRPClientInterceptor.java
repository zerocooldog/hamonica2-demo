package kr.co.pionnet.hamonica2.grpc;

import kr.co.pionnet.hamonica2.constant.ServerGroupType;
import kr.co.pionnet.hamonica2.constant.ServerType;
import kr.co.pionnet.hamonica2.io.grpc.*;

import java.util.UUID;
import java.util.logging.Logger;

public class GRPClientInterceptor implements ClientInterceptor {

    private static final Logger logger = Logger.getLogger(GRPClientInterceptor.class.getName());

    private static final String SERVER_GROUP_TYPE_KEY = "ServerGroupType";
    
    // Context 키 정의
    private static final Metadata.Key<String> META_SERVER_GROUP_TYPE_KEY = Metadata.Key.of(SERVER_GROUP_TYPE_KEY, Metadata.ASCII_STRING_MARSHALLER);


    /**
     * 클라이언트 연결 대상 지정
     * 
     * AGENT: 수집 서버 -> 에이전트로 연결.
     * COLLECTOR: 수집 서버만 연결
     */
    private ServerGroupType target = ServerGroupType.COLLECTOR;
    
    public GRPClientInterceptor(ServerGroupType target) {
        this.target = target;
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
            MethodDescriptor<ReqT, RespT> methodDescriptor,
            CallOptions callOptions, Channel channel
    ) {


        return new ForwardingClientCall.SimpleForwardingClientCall<>(channel.newCall(methodDescriptor, callOptions)) {
            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {

                // 메타데이터 추가
                headers.put(KeyConst.META_TARGET_KEY, target.name());
                headers.put(KeyConst.META_SERVER_GROUP_TYPE_KEY, ServerGroupType.ADMIN.name());
                headers.put(KeyConst.META_SERVICE_NAME_KEY, UUID.randomUUID().toString());

                // 호출 시작
                super.start(responseListener, headers);
            }
        };
    }
}
