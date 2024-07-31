package kr.co.pionnet.hamonica2.zconfiguration.interceptor;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;

@Component
public class WebSocketHandshakeInterceptor extends HttpSessionHandshakeInterceptor {

	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
	
//		// 웹소켓 세션에 현재 로그인된 사용자 정보를 전달 한다.
//    	UserDetails userDetails = LoginManager.getUserDetails();
//
//    	attributes.put(Const._USER_SESSION_KEY, userDetails);
    	
		return super.beforeHandshake(request, response, wsHandler, attributes);
	}
}