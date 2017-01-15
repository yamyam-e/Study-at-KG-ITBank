package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.DAO;

@Controller
public class HomeController {

	@RequestMapping(value="/hello.mv")
	public String works01(Model model){
		model.addAttribute("msg", "Spring MVC 시작");
//		=> Model은 request와 관련된 처리를 진행하는 bean
		
		return "/WEB-INF/intro.jsp";
	}
	
	@Autowired
	private DAO dao;
	
	@RequestMapping("/selectList.mv")
	public String works02(Model model){
		
		model.addAttribute("listc", dao.selectList());
		
		return "/WEB-INF/intro.jsp";
	}
}
