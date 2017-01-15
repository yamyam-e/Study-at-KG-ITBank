package spring00.mvc.spring00;

import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MailController {
	
	@Autowired 
	private JavaMailSender mailSender;
	
	private String from 	= "보내는사람";
	private String subject	= "메일제목 (생략가능)";
	
	@RequestMapping(value = "/mail")
	public String sendMail(
			@RequestParam(value="email", required=true) String email) {
		
		System.out.println("email : " + email);
		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			messageHelper.setTo(email);
			messageHelper.setText("메일본문");
			messageHelper.setFrom(from);
			messageHelper.setSubject(subject);	// 메일제목은 생략이 가능하다
			
			mailSender.send(message);
		} catch(Exception e){
			System.out.println(e);
		}
		
		return "Sucess";
	}
	
}

