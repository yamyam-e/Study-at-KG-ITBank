package mvc.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mvc.dto.PeopleDTO;
import mvc.service.PeopleService;

@Component
public class Controller {
	
	@Autowired
	private PeopleService service;

	public void works() {
		String showMenu = "1. 인사 정보 입력\n"
						+ "2. 인사 정보 보기\n"
						+ "3. 프로그램 종료";
		
		while(true){
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = "";
			
			if(sel.equals("1")){
				String name = JOptionPane.showInputDialog("이름 입력");
				int age = Integer.parseInt(JOptionPane.showInputDialog("나이 입력"));
				
				PeopleDTO dto = new PeopleDTO(name, age);
				
				int res = service.insertOne(dto);
				if(res>0){
					msg = "저장 완료";
				}else{
					msg = "저장 실패";
				}
				
			}else if(sel.equals("2")){
				ArrayList<PeopleDTO> listc = service.selectList();
				msg = "";
				for(PeopleDTO each : listc){
					msg += "번호 : " + each.getNum() 
						+ ", 이름: " + each.getName() 
						+ ", 나이 : " + each.getAge()
						+ "\n";
				}
				
			}else if(sel.equals("3")){
				break;
			}else {
				msg = "잘못 입력하셨습니다.";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
		
	}

}
