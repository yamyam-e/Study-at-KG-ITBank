package spring.mvc.spring14;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class J06_Ajax {

	@RequestMapping("j06_ajax")
	public void works(){}
	
	@RequestMapping(value="ajax", produces="text/plain; charset=UTF-8")
	@ResponseBody
	public Object ajax(){
		
		
		String msg = "보여주고 싶은 메시지";
		
		return msg;
	}
	
}
