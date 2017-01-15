package spring.mvc.spring10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.spring10.bean.People;

@Controller
public class J02_ModelAndView {

	@RequestMapping("j02_mav01")
	public ModelAndView works01(){
		
		People peo = new People("둘리", 10);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("peo", peo);
		mav.setViewName("j02_mavView01");
		
		return mav;
	}
	
	@RequestMapping("j02_mavView02")
	public ModelAndView work02(){
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("peo", new People("도우너" , 20));
		
		return mav;
	}
	
	@RequestMapping("j03_mav03")
	public ModelAndView works03(){
		
		ModelAndView mav = new ModelAndView("j03_mavView03"); //생성자에 패스 설정
		mav.addObject("peo", new People("마이콜", 30));
		
		return mav;
		
//		ModelAndView mav = new ModelAndView("j03_mavView03?data=100"); 
//		=>에러 파라메타 설정 불가
	}
	
	
	
	
}
