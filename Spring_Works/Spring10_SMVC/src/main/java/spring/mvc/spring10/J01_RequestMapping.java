package spring.mvc.spring10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class J01_RequestMapping {

//	@RequestMapping("j01_basic") // /j01_basic도 가능
//	public String basic(){
//		return "j01_basic";
//	}
	
//	void 메소드의 경우 메핑 이름으로 이동 처리 된다.
	@RequestMapping("j01_basic")
	public void basic(){}
	
	@RequestMapping("/works01")
	public String works01(){
		return "redirect:works02"; 
// 		=> redirect : 컨트롤러 내부 이동
//				: /spring10/works02와 같음
	}
	
	@RequestMapping("/works02")
	public String works02(){
		return "j01_works02";
	}
	
//	메핑에 이름을 주지 않아도 해당 메소드 이름이 메핑 처리 된다.
	@RequestMapping 
	public void j01_works03(){
		
	}
}
