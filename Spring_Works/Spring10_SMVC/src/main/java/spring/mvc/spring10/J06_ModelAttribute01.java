package spring.mvc.spring10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.mvc.spring10.bean.People;

@Controller
public class J06_ModelAttribute01 {
	
	@RequestMapping(value="j06_view01", method=RequestMethod.GET)
	public String getWorks(){
		return "j06_insertForm";
	}
//	1. 기본 형식
//	@RequestMapping(value="j06_view01", method=RequestMethod.POST)
//	public String postWorks01(@ModelAttribute People peo){
////		=> attribute의 이름은 클래스의 이름 첫글자를 소문자로 변경한 단어(현재 people)
//		
//		return "j06_insertView";
//	}
	
//	2. ModelAttribute 이름을 생략 가능
//	@RequestMapping(value="j06_view01", method=RequestMethod.POST)
//	public String postWorks01(People peo){
//		return "j06_insertView";
//	}
	
//	3. ModelAttribute 이름을 직접 설정 가능
	@RequestMapping(value="j06_view01", method=RequestMethod.POST)
	public String postWorks01(@ModelAttribute("peo") People peo){
		return "j06_insertView";
	}

}
