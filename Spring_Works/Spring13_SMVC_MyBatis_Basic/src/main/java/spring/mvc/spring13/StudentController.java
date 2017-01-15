package spring.mvc.spring13;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.spring13.dto.StudentDTO;
import spring.mvc.spring13.repository.StudentRepository;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepository repository;

	@RequestMapping("selectList")
	public ModelAndView selectList(){
		
		List<Object> listc = repository.selectList();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("listc", listc);
		mav.setViewName("j01_selectList");
		return mav;
	}
	
	@RequestMapping(value="insertOne", method=RequestMethod.GET)
	public String getInsertOne(){
		return "j02_insertForm";
	}
	
	@RequestMapping(value="insertOne", method=RequestMethod.POST)
	public ModelAndView postInsertOne(
			@RequestParam(value="name", required=true) String name,
			@RequestParam(value="kor", required=true) int kor,
			@RequestParam(value="eng", required=true) int eng,
			@RequestParam(value="math", required=true) int math){
		
		StudentDTO dto = new StudentDTO(name, kor, eng, math);
		dto.setTotal(kor+eng+math);
		dto.setAvg((kor+eng+math)/3.0);
		
		int res = repository.insertOne(dto);
		ModelAndView mav = new ModelAndView();
		if(res>0){
			mav.addObject("msg", "저장 성공");
		} else {
			mav.addObject("msg", "저장 실패");
		}
		mav.setViewName("home");
		return mav;
	}
	
	@RequestMapping(value="update", method=RequestMethod.GET)
	public ModelAndView getUpdate(
			@RequestParam(value="num", required=true) String num){
		
		StudentDTO dto = repository.selectOne(num);
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("j03_updateForm");
		return mav;
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST)
	public ModelAndView postUpdate(
			@RequestParam(value="num", required=true) int num,
			@RequestParam(value="kor", required=true) int kor,
			@RequestParam(value="eng", required=true) int eng,
			@RequestParam(value="math", required=true) int math
			){
		
		StudentDTO dto = new StudentDTO();
		dto.setNum(num);
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMath(math);
		dto.setTotal(kor+eng+math);
		dto.setAvg((kor+eng+math)/3.0);
		
		int res = repository.update(dto);
		ModelAndView mav = new ModelAndView();
		if(res>0){
			mav.addObject("msg", "업데이트 성공");
		} else {
			mav.addObject("msg", "업데이트 실패");
		}
		mav.setViewName("home");
		return mav;
	}
	
	@RequestMapping(value="deleteOne", method=RequestMethod.GET)
	public ModelAndView deleteOne(
			@RequestParam(value="num", required=true) String num){
		
		int res = repository.update(num);
		ModelAndView mav = new ModelAndView();
		if(res>0){
			mav.addObject("msg", "삭제 성공");
		} else {
			mav.addObject("msg", "삭제 실패");
		}
		mav.setViewName("home");
		return mav;
	}
}
