package springEX08.mvc.spring08;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockMultipartHttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MailController {
	
	private MockHttpServletRequest mocksvlRequest;
	
	@RequestMapping("test01")
	public String works01(){
		
		String serverName = mocksvlRequest.DEFAULT_SERVER_NAME;
		String serverAddr = mocksvlRequest.DEFAULT_SERVER_ADDR;
		int serverPort = mocksvlRequest.DEFAULT_SERVER_PORT;
		String protocol = mocksvlRequest.DEFAULT_PROTOCOL;
		String remoteAddr = mocksvlRequest.DEFAULT_REMOTE_ADDR;
		String remoteHost = mocksvlRequest.DEFAULT_REMOTE_HOST;
		
		System.out.println("DEFAULT_SERVER_NAME : " + serverName);
		System.out.println("DEFAULT_SERVER_ADDR : " + serverAddr);
		System.out.println("DEFAULT_SERVER_PORT : " + serverPort);
		System.out.println("DEFAULT_PROTOCOL : " + protocol);
		System.out.println("DEFAULT_REMOTE_ADDR : " + remoteAddr);
		System.out.println("DEFAULT_REMOTE_HOST : " + remoteHost);
		
		return "home";
		
	}
	
	@RequestMapping("test02")
	public String works02(){
		
		mocksvlRequest = new MockMultipartHttpServletRequest();
		
		return "home";
	}
}
