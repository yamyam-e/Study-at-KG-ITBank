package spring.mvc.spring11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.spring11.repository.TestRepository;

@Controller
public class TestController {
	
	@Autowired
	private TestRepository repository;
	
	@RequestMapping(value="test", method=RequestMethod.GET)
	public ModelAndView selectList(){
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("test", repository.selectList());
		mv.setViewName("j00_testView");
		return mv;
	}
}
