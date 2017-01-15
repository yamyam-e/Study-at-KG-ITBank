package spring.mvc.spring10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.mvc.spring10.bean.PeopleList;

@Controller
public class J09_ListField {
	
	@RequestMapping(value="j09_insertAll", method=RequestMethod.GET)
	public String get(){
		return "j09_insertForm";
	}
	
	@RequestMapping(value="j09_insertAll", method=RequestMethod.POST)
	public String post(PeopleList listc){
		
		System.out.println(listc.getListc().get(0).getName());
		return "j09_view";
	}
}
