package spring.mvc.spring14;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.mvc.spring14.dto.J07_People;
import spring.mvc.spring14.dto.J07_PeopleList;

@Controller
public class J07_JsonController {
	
	@RequestMapping("j07_json")
	public void works(){}
	
	@RequestMapping("json01")
	@ResponseBody
	public J07_People json01(){
		J07_People peo = new J07_People("둘리", 10);
		return peo;
	} // 결과물은 텍스트 또는 XML형식으로 받는다.
	
	@RequestMapping("json02")
	@ResponseBody
	public J07_PeopleList json02(){
		
		List<J07_People> listc = new ArrayList<>();
		listc.add(new J07_People("둘리", 12));
		listc.add(new J07_People("마이콜", 22));
		listc.add(new J07_People("도우너", 32));
		listc.add(new J07_People("또치", 10));
		return new J07_PeopleList(listc);
	}

}
