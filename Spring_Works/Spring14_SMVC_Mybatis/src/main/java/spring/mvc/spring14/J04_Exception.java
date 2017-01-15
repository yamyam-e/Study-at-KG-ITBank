package spring.mvc.spring14;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class J04_Exception {

	@RequestMapping(value="j04_exception", method=RequestMethod.GET)
	public String go(){
		return "j04_exc01_Home";
	}
	
//	1. bean 활용 (예: classpath:/z04_exception/exception-context.xml)
//		스프링프레임워크에 예외처리를 감시하는 빈을 만드는 것
	@RequestMapping("nullpointExc")
	public void nullExc(){
		ArrayList listc = null;
		listc.add(10);
	}
	
//	2. 메소드 직접 처리 방식
	@RequestMapping("indexOutExc")
	public void indexEx(){
		int[] a = { 10, 20 };
		a[3] = 30;
	}
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public String catchExc(ArrayIndexOutOfBoundsException e){
		System.out.println("인덱스 예외 처리 메소드");
		return "j04_exc03_indexOut";
	}
	
//	3. 최상위 Exception 설정
	@RequestMapping(value="j04_exception", method=RequestMethod.POST)
	public String works(
			@RequestParam(value="num1") Integer num1,
			@RequestParam(value="num2") Integer num2
			){
		
		int res = num1 / num2;
		
		return "j04_exception";
	}
}
