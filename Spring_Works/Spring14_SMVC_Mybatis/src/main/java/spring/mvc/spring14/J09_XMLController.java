package spring.mvc.spring14;

import org.springframework.stereotype.Controller;

//0. XML - 객체
//	- @XmlAccessorType(XmlAccessType.Field)
//	- @XmlRootElement(name="peopleList")
//	- @XmlElement(name="people")
//	- @XmlType(name="", propOrder={"name","age"}
//1. 객체 정보 -> XML 형식으로
//	- @ResponseBody
//	- responseXML
//2. XML 정보 -> 객체 형식으로
//	- httpRequest의 contentType에 application/xml이 적용 되어야 함
//	- @RequestBody

@Controller
public class J09_XMLController {

}
