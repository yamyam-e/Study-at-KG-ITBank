package mvc.controller;

import java.util.List;

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
						+ "3. 인사 정보 선택 보기\n"
						+ "4. 프로그램 종료";
		
		while(true){
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")){
				String rcv = JOptionPane.showInputDialog("이름 입력");
				String name = rcv;
				rcv = JOptionPane.showInputDialog("나이 입력");
				int age = Integer.parseInt(rcv);
				PeopleDTO dto = new PeopleDTO(name, age);
				int res = service.insertOne(dto);
				if(res>0){
					msg = "저장 성공";
				} else {
					msg = "저장 실패";
				}
				
			} else if(sel.equals("2")){
				
				List<PeopleDTO> listc = service.selectList();
				
				if(listc == null){
					msg = "저장된 정보가 없습니다.";
				} else {
					msg = "";
					for(PeopleDTO each : listc){
						msg += each.getNum() + ". 이름 : " + each.getName() + ", 나이 : " + each.getAge() + "\n";
					}
				}
				
			} else if(sel.equals("3")){
				String name = JOptionPane.showInputDialog("검색 대상 이름 입력");
				PeopleDTO rcvDto = new PeopleDTO();
				rcvDto.setName(name);
				PeopleDTO dto = service.selectOne(rcvDto);
				
				if(dto == null ){
					msg ="저장된 정보가 없습니다.";
				} else {
					msg = dto.getNum() + ". 이름 : " + dto.getName() + ", 나이 : " + dto.getAge();
				}
				
			} else if(sel.equals("4")){
				break;
			} else {
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
	}

}
