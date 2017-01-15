package mvc.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mvc.dto.StudentDTO;
import mvc.service.StudentService;

@Component
public class Controller {
	
	@Autowired
	private StudentService service;
	
	public void works(){
		
		String showMenu = "[학생 정보 프로그램]\n"
						+ "1. 학생 정보 입력\n"
						+ "2. 학생 정보 보기\n"
						+ "3. 학생 정보 검색\n"
						+ "4. 학생 정보 수정\n"
						+ "5. 학생 정보 삭제\n"
						+ "6. 프로그램 종료";
		
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")){ // 정보 입력
				String rcv = JOptionPane.showInputDialog("학생 이름 입력");
				String name = rcv;
				rcv = JOptionPane.showInputDialog("국어 점수 입력");
				int kor = Integer.parseInt(rcv);
				rcv = JOptionPane.showInputDialog("영어 점수 입력");
				int eng = Integer.parseInt(rcv);
				rcv = JOptionPane.showInputDialog("수학 점수 입력");
				int math = Integer.parseInt(rcv);
				StudentDTO dto = new StudentDTO(name, kor, eng, math);
				
				int res = service.insertOne(dto);
				
				if(res>0) {
					msg = "저장 성공";
				} else {
					msg = "저장 실패";
				}
			} else if(sel.equals("2")){ // 정보 보기
				ArrayList<StudentDTO> listc = service.selectList();
				
				if(listc == null){
					msg = "저장된 정보가 없습니다.";
				} else {
					msg = "번호\t이름\t국어\t영어\t수학\t총점\t평균\n";
					for(StudentDTO each : listc){
						msg += each.getNum() + "\t" + each.getName() + "\t" + each.getKor() + "\t" 
							+ each.getEng() + "\t" + each.getMath() + "\t" + each.getTotal() + "\t" 
							+ each.getAvg() + "\n"; 
					}
				}
				
			} else if(sel.equals("3")){ // 정보 검색
				String search = JOptionPane.showInputDialog("학생 이름 입력");
				StudentDTO dto = service.selectOne(search);
				
				if(dto == null){
					msg = "저장된 정보가 없습니다.";
				} else {
					msg = "번호\t이름\t국어\t영어\t수학\t총점\t평균\n";
					msg += dto.getNum() + "\t" + dto.getName() + "\t" + dto.getKor() + "\t" 
						+ dto.getEng() + "\t" + dto.getMath() + "\t" + dto.getTotal() + "\t" 
						+ dto.getAvg() + "\n"; 
				}
				
			} else if(sel.equals("4")){ // 정보 수정
				String search = JOptionPane.showInputDialog("학생 이름 입력");
				StudentDTO dto = service.selectOne(search);
				
				if(dto == null){
					msg = "저장된 정보가 없습니다.";
				} else {
					msg = "번호\t이름\t국어\t영어\t수학\t총점\t평균\n";
					msg += dto.getNum() + "\t" + dto.getName() + "\t" + dto.getKor() + "\t" 
						+ dto.getEng() + "\t" + dto.getMath() + "\t" + dto.getTotal() + "\t" 
						+ dto.getAvg() + "\n"; 
					
					int ans = JOptionPane.showConfirmDialog(
							null, new JTextArea(msg), "정말로 수정 하시겠습니까?", JOptionPane.YES_NO_OPTION);
					if(ans == 0){
						int kor = Integer.parseInt(JOptionPane.showInputDialog("국어 점수 입력"));
						int eng = Integer.parseInt(JOptionPane.showInputDialog("영어 점수 입력"));
						int math = Integer.parseInt(JOptionPane.showInputDialog("수학 점수 입력"));
						
						StudentDTO rcvDto = new StudentDTO(search, kor, eng, math);
						int res = service.update(rcvDto);
						msg = res > 0 ? "수정 성공" : "수정 실패";
					} else {
						msg = "수정을 취소 하셨습니다.";
					}
				}
			} else if(sel.equals("5")){ // 정보 삭제
				String search = JOptionPane.showInputDialog("학생 이름 입력");
				StudentDTO dto = service.selectOne(search);
				
				if(dto == null){
					msg = "저장된 정보가 없습니다.";
				} else {
					msg = "번호\t이름\t국어\t영어\t수학\t총점\t평균\n";
					msg += dto.getNum() + "\t" + dto.getName() + "\t" + dto.getKor() + "\t" 
						+ dto.getEng() + "\t" + dto.getMath() + "\t" + dto.getTotal() + "\t" 
						+ dto.getAvg() + "\n"; 
					
					int ans = JOptionPane.showConfirmDialog(
							null, new JTextArea(msg), "정말로 삭제 하시겠습니까?", JOptionPane.YES_NO_OPTION);
					if(ans == 0){
						int res = service.delete(search);
						msg = res > 0 ? "삭제 성공" : "삭제 실패";
					} else {
						msg = "삭제를 취소 하셨습니다.";
					}
				}
			} else if(sel.equals("6")){ // 종료
				break;
			} else {
				msg = "잘못 입력하셨습니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
	}
	
}
