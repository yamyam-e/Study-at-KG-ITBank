package spring.mvc.spring14.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("logInterceptor")
public class LogInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("prehandler 작동");
		HttpSession session = request.getSession();
		String logStatus = (String)session.getAttribute("nowLogin");
		System.out.println("logStatus : " + logStatus);
		
		boolean nowLogin = logStatus != null;
		if(!nowLogin){ // 비로그인 상태
			response.sendRedirect("logAlert"); // 컨트롤러로 보내서 경로를 바꾸는 과정 것
			return false; // 기존 url을 무시하고 redirect 경로 적용
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("postHandler 작동");
	}
	
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		System.out.println("afterHandler 작동");
	}

}
