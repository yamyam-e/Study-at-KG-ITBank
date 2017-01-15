package spring.mvc.spring10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.spring10.bean.People;

//post 방식 사용시 한글 엔코딩 설정 web.xml
//<!-- 한글 UTF-8 설정 -->
//<filter>
//   <filter-name>encodingFilter</filter-name>
//   <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
//   <init-param>
//      <param-name>encoding</param-name>
//      <param-value>UTF-8</param-value>
//   </init-param>
//</filter>
//<filter-mapping>
//   <filter-name>encodingFilter</filter-name>
//   <url-pattern>/*</url-pattern>
//</filter-mapping>


@Controller
public class J04_GetPostRequestMapping {

	@RequestMapping(value="j04_insertOne", method=RequestMethod.GET)
	public String getWorks(){
		return "j04_insertForm";
	}
	
	@RequestMapping(value="j04_insertOne", method=RequestMethod.POST)
	public ModelAndView postWorks(
			@RequestParam(value="name", required=false) String name,
			@RequestParam(value="age", required=false) Integer age,
			@RequestParam(value="data1", required=false) String data1,
			@RequestParam(value="data2", required=false) Integer data2,
			@RequestParam(value="data3", defaultValue="기본값") String data3){
		
//		required=false : parameter 값이 없어도 에러 발생하지 않음
		
//		JSP로부터 전달된 파라미터의 값이 존재하지 않는 경우
//			- String의 경우 "" 수신
//			- Integer의 경우 null 수신
//		존재하지 않는 파라미터에 대한 값은
//			- String과 Integer의 경우 null 수신
		
		System.out.println(name + ", " + age);
		System.out.println(data1 + ", " + data2 + ", " + data3);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("peo", new People(name, age));
		mav.setViewName("j04_insertView");
		
		return mav;
	}
}
