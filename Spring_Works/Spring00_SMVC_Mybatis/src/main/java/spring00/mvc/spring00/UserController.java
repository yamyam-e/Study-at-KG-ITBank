package spring00.mvc.spring00;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring00.mvc.spring00.dto.UserDTO;
import spring00.mvc.spring00.module.VerificationToken;

@Controller
public class UserController {
	
	@RequestMapping("reg")
	public void goReg(){}
	
	@RequestMapping(value="regWorks", method=RequestMethod.POST)
	public String regWorks(UserDTO dto, ModelMap mmap){
		
		String email = dto.getEmail();
		String password = dto.getPassword();
		
		System.out.println("email : " + email + ", password : " + password);
		
		VerificationToken vt = new VerificationToken(email, password);
		
		
		return "/home";
	}

}
