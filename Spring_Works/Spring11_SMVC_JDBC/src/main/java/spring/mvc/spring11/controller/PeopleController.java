package spring.mvc.spring11.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.spring11.dto.PeopleDTO;
import spring.mvc.spring11.module.FileWorks;
import spring.mvc.spring11.service.PeopleService;

@Controller
public class PeopleController {
	
	@Autowired
	private PeopleService service;
	
	@Autowired
	private FileWorks fileWorks;
	
	private String msg;

	@RequestMapping(value="insertOne", method=RequestMethod.GET)
	public String getInsertOne(){
		return "j01_insertForm";
	}
	
	@RequestMapping(value="insertOne", method=RequestMethod.POST)
	public String postInsertOne(
			MultipartHttpServletRequest mulRequest){
			
		String name = mulRequest.getParameter("name");
		int age = Integer.parseInt(mulRequest.getParameter("age"));
		PeopleDTO dto = new PeopleDTO(name, age);
		
		MultipartFile upfile = mulRequest.getFile("upfile");
		String sysName = fileWorks.uploadAndGetSysName(upfile);
		
		dto.setSysName(sysName);
		dto.setOrgName(upfile.getOriginalFilename());
		
		int res = service.insertOne(dto);
		msg = res > 0 ? "파일업로드 성공" : "파일업로드 실패";
		System.out.println(msg + " - " + dto.getSysName());
		
		return "redirect:selectList";
	}
	
	@RequestMapping("selectList")
	public ModelAndView selectList(){
		
		List<Object> listc = service.selectList();
		ModelAndView mav = new ModelAndView();
		mav.addObject("listc", listc);
		if(msg != null){
			mav.addObject("msg", msg);
			msg = null;
		}
		mav.setViewName("j02_selectList");
		return mav;
	}
	
	@RequestMapping("download")
	public void download(
		@RequestParam("org") String orgName,
		@RequestParam("sys") String sysName,
		HttpServletResponse response){
		
		fileWorks.download(orgName, sysName, response);
			
	}
	
	@RequestMapping("delete")
	public String delete(
			@RequestParam("num") int num,
			@RequestParam("sys") String sysName){
		
		fileWorks.delete(sysName);
		service.delete(num);
		return "redirect:selectList";
	}
	
	@RequestMapping("update")
	public String update(
			@RequestParam("num") int num,
			@RequestParam("sys") String sysName,
			MultipartHttpServletRequest mulRequest){
		
		fileWorks.delete(sysName);
		
		MultipartFile upfile = mulRequest.getFile("upfile");
		String newSysName = fileWorks.uploadAndGetSysName(upfile);
		String newOrgName = upfile.getOriginalFilename();
		
		service.update(num, newSysName, newOrgName);
		
		return "redirect:selectList";
	}
}
