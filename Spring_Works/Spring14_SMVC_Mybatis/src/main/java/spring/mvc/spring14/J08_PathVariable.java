package spring.mvc.spring14;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


//path로 시작하는 request는 이쪽으로 들어 온다. url1, ... 변수 지정 가능
@Controller
@RequestMapping("path/{url1}/{url2}/{url3}") 
public class J08_PathVariable {
	
	@RequestMapping
	public String path(
			@PathVariable String url1,
			@PathVariable String url2,
			@PathVariable String url3
			){
		
		System.out.println(url1 + ", " + url2 + ", " + url3);
		
		return "j08_path";
	}

}
