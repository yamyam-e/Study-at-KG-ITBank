package spring.mvc.spring10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.mvc.spring10.bean.J08_Info;

@Controller
public class J08_ClassField {
	
	@RequestMapping(value="j08_insertOne", method=RequestMethod.GET)
	public String get(){
		return "j08_insertForm";
	}
	
	@RequestMapping(value="j08_insertOne", method=RequestMethod.POST)
	public String post(J08_Info info){
		System.out.println(info.getSch().getKor());
		return "j08_view";
	}

}
