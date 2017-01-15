package spring.mvc.spring14;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.spring14.dto.LogValidateDTO;
import spring.mvc.spring14.repository.LogRepository;

@Controller
public class J01_LogSession {
	
	@Autowired
	private LogRepository repository;
	
	@RequestMapping("j01_logHome")
	public void logView(){}
	
	@RequestMapping("login")
	public String loginWorks(LogValidateDTO dto,
							HttpSession session,
							ModelMap mmap){
		
		LogValidateDTO chk = repository.selectOne(dto);
		
		if(chk != null){
			session.setAttribute("nowLogin", chk.getId());
			mmap.addAttribute("msg", chk.getId()+"님 환영합니다.");
		} else {
			mmap.addAttribute("msg", "로그인 실패");
		}
		return "j01_logHome";
	}
	
	@RequestMapping("logOut")
	public String logOut(HttpSession session, ModelMap mmap){
		
		String id = (String)session.getAttribute("nowLogin");
		mmap.addAttribute("msg", id + "님 안녕히가세요.");
		session.invalidate();
		return "home";
	}
	
	@RequestMapping("j01_regHome")
	public void regLog(){};
	
	@RequestMapping("regLog")
	public String register(LogValidateDTO dto, ModelMap mmap){
		
		LogValidateDTO existID = repository.checkID(dto.getId());

		if(existID == null){
			int res = repository.insertOne(dto);
			mmap.addAttribute("msg", dto.getId() + "님 가입을 축하드립니다.");
		} else {
			mmap.addAttribute("msg", dto.getId() + "는 사용 할 수 없는 아이디 입니다.");
		}
		return "j01_logHome";
	}
}
