package springEX03.mvc.spring03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springEX03.mvc.spring03.repository.CarRepository;

@Controller
public class CarController {
	
	private CarRepository repository;
	
	@RequestMapping("selectList")
	public String selectList(){
		return "j01_selectList";
	}

}
