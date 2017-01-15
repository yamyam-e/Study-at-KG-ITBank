package spring.mvc.spring10;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.spring10.bean.People;

@Controller
public class J07_Model {
	
	@RequestMapping("j07_view")
	public void works(Model model){
		People peo = new People("둘리", 10);
		model.addAttribute("peo", peo);
		model.addAttribute("msg", "컨트롤러에서 보내는 메시지");
	}

}
