package spring.mvc.spring10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.spring10.bean.People;
import spring.mvc.spring10.bean.People2;

@Controller
public class J05_CommandObject {
	
	@RequestMapping(value="j05_insertOne", method=RequestMethod.GET)
	public String getWorks(){
		return "j05_insertForm";
	}
	
	@RequestMapping(value="j05_insertOne", method=RequestMethod.POST)
	public ModelAndView postWorks(People peo, People2 peo2){
		
		System.out.println("peo " + peo.getName() + ", " + peo.getAge());
		System.out.println("peo2 " + peo2.getName() + ", " + peo2.getAge());
		
		ModelAndView mav = new ModelAndView("j05_insertView");
		mav.addObject("peo", peo);
		
		return mav;
	}

}
