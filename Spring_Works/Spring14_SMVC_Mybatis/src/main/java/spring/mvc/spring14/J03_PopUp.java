package spring.mvc.spring14;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class J03_PopUp {
	
//	@RequestMapping("j03_popUpHome")
//	public void works(){} ========> 팝업창이 닫힌 후에 변경이 있어야 함
//  쿠키생성과 소멸시 반드시 컨트롤러에서 처리 필요
	
	@RequestMapping("j03_popUpHome")
	public ModelAndView works(
			@CookieValue(value="nopop", required=false) String ckValue){
		ModelAndView mav = new ModelAndView();
		mav.addObject("nopop", ckValue);
		mav.setViewName("j03_popUpHome");
		return mav;
	}
	
	@RequestMapping("showPopup")
	public String popShow(){
		return "j03_popView";
	}
	
	@RequestMapping("nopop")
	public String makeCK(HttpServletResponse response, ModelMap mmap){
		
		System.out.println("쿠키 생성 메소드 @Controller");
		
		Cookie ck = new Cookie("nopop", "no"); // no 상태인지 표시 해준다.
		ck.setMaxAge(10);
		response.addCookie(ck);
		
		mmap.addAttribute("msg", "nopop");
		return "j03_popView";
	}
	

}
