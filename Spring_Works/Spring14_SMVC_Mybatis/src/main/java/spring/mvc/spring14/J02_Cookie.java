package spring.mvc.spring14;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class J02_Cookie {
	
	@RequestMapping("j02_cookieHome")
	public void works(){}
	
//	1. 쿠키 생성 (response 사용)
	@RequestMapping("makeCK")
	public String makeCK(HttpServletResponse response, ModelMap mmap){
		Cookie ck = new Cookie("myCookie", "12345");
		response.addCookie(ck);
		mmap.addAttribute("msg", "쿠키 전송 완료");
		return "j02_cookieHome";
	}
	
//	2. 쿠키 확인 및 전송
	@RequestMapping("showCK")
	public ModelAndView showCK(
			@CookieValue(value="myCookie", required=false) Cookie ck1,
			@CookieValue(value="myCookie", defaultValue="기본값") String ck2
			){
		
		if(ck1 != null){
			System.out.println("쿠키 : " + ck1.getName() + ", " + ck1.getValue());
		}
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("myCookie", ck2);
		mav.setViewName("j02_cookieHome");
		return mav;
	}
	
//	3. 쿠키 삭제 (response 사용)
	@RequestMapping("delCK")
	public String delCK(HttpServletResponse response, ModelMap mmap){
		
		Cookie ck = new Cookie("myCookie", "delCK");
		ck.setMaxAge(0);
		response.addCookie(ck);
		
		mmap.addAttribute("msg", "myCookie 삭제");
		
		return "j02_cookieHome";
	}
}
