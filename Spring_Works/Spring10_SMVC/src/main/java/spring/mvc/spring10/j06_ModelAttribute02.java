package spring.mvc.spring10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class j06_ModelAttribute02 {
	
	@ModelAttribute("data")
	public String works(){
		System.out.println("이 클래스 내부의 모든 메소드 mapping 시 실행됨");
		return "ModelAttribute에서 리턴한 데이터";
	}
	
	@RequestMapping("j06_test01")
	public String test01(){
		return "j06_test01";
	}
	@RequestMapping("j06_test02")
	public String test02(){
		return "j06_test02";
	}
}
