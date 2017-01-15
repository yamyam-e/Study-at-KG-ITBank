package spring.mvc.spring14;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class J05_Interceptor {

	@RequestMapping("j05_interceptor")
	public String go(){
		System.out.println("Interceptor : 로그인 해야만 사용 할 수 있는 기능이 있을 때 사용");
		return "j05_interceptor";
	}
	
	@RequestMapping("logAlert")
	public String goAlert(){
		System.out.println("goAlert 작동");
		return "j05_alert";
	}
}
