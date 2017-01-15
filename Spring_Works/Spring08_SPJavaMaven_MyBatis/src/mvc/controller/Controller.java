package mvc.controller;

import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mvc.dto.MapperDTO;
import mvc.dto.PeopleDTO;
import mvc.repository.PeopleRepository;

@Component
public class Controller {

	@Autowired
	private PeopleRepository repository;
	
	public void works() {
		String showMenu = "[인사 정보 관리 프로그램]\n"
						+ "1. 정보 입력\n"
						+ "2. 정보 보기\n"
						+ "3. 정보 검색(이름검색-String)\n"
						+ "4. 정보 검색(이름검색-dto파라미터)\n"
						+ "5. 정보 검색(나이 범위)\n"
						+ "6. 컬럼 지정 검색(이름 검색)\n"
						+ "7. 정보 검색(특정 키워드 포함)\n"
						+ "8. 프로그램 종료";
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")){
				String name = JOptionPane.showInputDialog("이름 입력");
				int age = Integer.parseInt(JOptionPane.showInputDialog("나이 입력"));
				PeopleDTO dto = new PeopleDTO(name, age);
				
				int res = repository.insertOne(dto);
				msg =  res > 0 ? "저장 성공" : "저장 실패";
				
			} else if(sel.equals("2")){
				List<PeopleDTO> listc = repository.selectList();
				if(listc == null) {
					msg = "저장된 정보가 없습니다.";
				} else {
					msg = "";
					for(PeopleDTO each : listc){
						msg += each.getNum() + ". 이름 : " + each.getName() + ", 나이 : " + each.getAge() + "\n";
					}
				}
				
			} else if(sel.equals("3")){ // 이름검색 - String
				String search = JOptionPane.showInputDialog("이름 입력");
				PeopleDTO dto = repository.searchName(search);
				
				if(dto == null){
					msg = "검색 결과가 존재하지 않습니다.";
				} else {
					msg = dto.getNum() + ". 이름 : " + dto.getName() + ", 나이 : " + dto.getAge();
				}
			} else if(sel.equals("4")){ // 이름검색-dto파라미터
				String search = JOptionPane.showInputDialog("이름 입력");
				
				PeopleDTO peoDto = new PeopleDTO();
				peoDto.setName(search);
				
				PeopleDTO dto = repository.searchName2(peoDto);
				
				if(dto == null){
					msg = "검색 결과가 존재하지 않습니다.";
				} else {
					msg = dto.getNum() + ". 이름 : " + dto.getName() + ", 나이 : " + dto.getAge();
				}
				
			} else if(sel.equals("5")){ // 나이 범위
				
				int beginAge = Integer.parseInt(JOptionPane.showInputDialog("시작 나이 입력"));
				int endAge = Integer.parseInt(JOptionPane.showInputDialog("끝 나이 입력"));
				MapperDTO mmDto = new MapperDTO(beginAge, endAge);
				
				List<PeopleDTO> listc = repository.searchArea(mmDto);
				if(listc == null) {
					msg = "저장된 정보가 없습니다.";
				} else {
					msg = "";
					for(PeopleDTO each : listc){
						msg += each.getNum() + ". 이름 : " + each.getName() + ", 나이 : " + each.getAge() + "\n";
					}
				}
				
			} else if(sel.equals("6")){ // 컬럼 지정 검색(이름 검색)
				MapperDTO mm = new MapperDTO("t_peo", "name", "왕눈이");
				
				PeopleDTO dto = repository.searchSQL(mm);
				
				if(dto == null){
					msg = "검색 결과가 존재하지 않습니다.";
				} else {
					msg = dto.getNum() + ". 이름 : " + dto.getName() + ", 나이 : " + dto.getAge();
				}
			
			} else if(sel.equals("7")){
				String search = JOptionPane.showInputDialog("키워드 검색");
				
				MapperDTO mm = new MapperDTO();
				mm.setValue(search);
				
				List<PeopleDTO> listc = repository.searchKey(mm);
				if(listc == null) {
					msg = "저장된 정보가 없습니다.";
				} else {
					msg = "";
					for(PeopleDTO each : listc){
						msg += each.getNum() + ". 이름 : " + each.getName() + ", 나이 : " + each.getAge() + "\n";
					}
				}
				
			} else if(sel.equals("8")){
				break;
			} else {
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
		
	}
	
	
}
