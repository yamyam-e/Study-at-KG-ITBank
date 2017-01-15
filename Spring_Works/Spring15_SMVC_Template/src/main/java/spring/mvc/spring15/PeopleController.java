package spring.mvc.spring15;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.spring15.repository.PeopleRepository;

@Controller
@RequestMapping("main/peo/")
public class PeopleController {
	
	@Autowired
	private PeopleRepository repository;

	private String mainBasePath = "/WEB-INF/views/main/peo/";
	
	@ModelAttribute("left")
	public String leftPath(){
		return "/WEB-INF/views/ext/peoleft.jsp";
	}
	// 아래 메소드 실행 후 위스 모델에트리뷰트 메소드 자동 실행
	@RequestMapping({"home", "insertForm"})
	public String works(ModelMap mmap, HttpServletRequest request){
		
		String servletPath = request.getServletPath();
		System.out.println(servletPath);
		
		String mainView = servletPath.replace("/main/peo/", "");
		
		mmap.addAttribute("main", mainBasePath + mainView + ".jsp");
		return "home"; // "/views/home"
	}
}
