package springEX02.mvc.spring02;

import java.util.List;

import javax.jws.WebParam.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springEX02.mvc.spring02.dto.HambergerDTO;
import springEX02.mvc.spring02.repository.HambergerRepository;

@Controller
public class HambergerController {
	
	@Autowired
	private HambergerRepository repository;
	
	@RequestMapping("selectList")
	public ModelAndView getSelectList(){
		List<HambergerDTO> listc = repository.selectList();
		ModelAndView mav = new ModelAndView();
		mav.addObject("listc", listc);
		mav.setViewName("j01_selectList");
		return mav;
	}
	
	@RequestMapping("insertOne")
	public String getInsertOne(){
		return "j02_insertOne";
	}
	
	@RequestMapping(value="insertOne", method=RequestMethod.POST)
	public ModelAndView postInsertOne(
			@RequestParam(value="name", required=true) String name,
			@RequestParam(value="price", required=true) int price,
			@RequestParam(value="cal", required=true) int cal
			){
		
		HambergerDTO dto = new HambergerDTO(name, price, cal);
		int res = repository.insertOne(dto);
		
		ModelAndView mav = new ModelAndView();
		
		String msg = res > 0 ? "저장 성공" :  "저장 실패";
		mav.addObject("msg", msg);
		mav.setViewName("home");
		return mav;
	}
	
	@RequestMapping("update")
	public ModelAndView getDelte(
			@RequestParam(value="num") String num){
		
		HambergerDTO dto = repository.selectOne(num);
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("j03_updateOne");
		return mav;
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST)
	public ModelAndView postUpdate(
			@RequestParam(value="num") int num,
			@RequestParam(value="price") int price,
			@RequestParam(value="cal") int cal
			){
		HambergerDTO dto = new HambergerDTO();
		dto.setNum(num);
		dto.setPrice(price);
		dto.setCal(cal);
		
		int res = repository.updateOne(dto);
		String msg = res>0 ? "수정 성공" : "수정 실패";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.setViewName("home");
		return mav;
	}
	
	@RequestMapping("deleteOne")
	public ModelAndView getDeleteOne(
			@RequestParam(value="num") String num
			){
		
		System.out.println("num : " + num);
		
		int res = repository.deleteOne(num);
		
		ModelAndView mav = new ModelAndView();
		String msg = res > 0 ? "삭제 성공" : "삭제 실패";
		mav.addObject("msg", msg);
		mav.setViewName("home");
		return mav;
	}
}
