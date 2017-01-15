package mvc.controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mvc.dto.HambergerDTO;
import mvc.dto.MapperDTO;
import mvc.repository.HambergerRepository;

@Component
public class Controller {

	@Autowired
	private HambergerRepository repository;
	
	public void works(){
		String showMenu = "[햄버거 관리 프로그램]\n"
						+ "1. 햄버거 정보 입력\n"
						+ "2. 햄버거 정보 보기\n"
						+ "3. 햄버거 정보 검새(이름 검색-String)\n"
						+ "4. 햄버거 정보 검색(번호 검색-Integer)\n"
						+ "5. 햄버거 정보 검색(이름 검색-DTO)\n"
						+ "6. 햄버거 정보 검색(가격 범위)\n"
						+ "7. 햄버거 정보 검색(컬럼 지정)\n"
						+ "8. 햄버거 정보 검색(키워드)\n"
						+ "9. 햄버거 정보 수정\n"
						+ "10. 햄버거 정보 삭제\n"
						+ "11. 프로그램 종료";
		
		while(true){
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")){ // 정보 입력
				String name = JOptionPane.showInputDialog("햄버거 이름 입력");
				int price = Integer.parseInt(JOptionPane.showInputDialog("햄버거 가격 입력"));
				int cal = Integer.parseInt(JOptionPane.showInputDialog("햄버거 칼로리 입력"));
				HambergerDTO dto = new HambergerDTO(name, price, cal);
				
				int res = repository.insertOne(dto);
				msg = res > 0 ? "저장 성공" : "저장 실패";
				
			} else if(sel.equals("2")){ // 정보 보기
				
				List<HambergerDTO> listc = repository.selectList();
				msg = myWorks(listc);
				
			} else if(sel.equals("3")){ // 이름 검색(String)
				String search = JOptionPane.showInputDialog("검색 대상 햄버거 이름 입력");
				
				HambergerDTO dto = repository.search(search);
				msg = myWorks(dto);
				
			} else if(sel.equals("4")){ // 번호 검색(Integer)
				int search = Integer.parseInt(JOptionPane.showInputDialog("검색 대상 번호 입력"));
				
				HambergerDTO dto = repository.search(search);
				msg = myWorks(dto);
				
			} else if(sel.equals("5")){ // 이름 검색(DTO)
				String search = JOptionPane.showInputDialog("검색 대상 햄버거 이름 입력");
				HambergerDTO rcvDto = new HambergerDTO();
				rcvDto.setName(search);
				
				HambergerDTO dto = repository.search(rcvDto);
				msg = myWorks(dto);
				
			} else if(sel.equals("6")){ // 가격 범위 검색
				int start = Integer.parseInt(JOptionPane.showInputDialog("시작 가격 입력"));
				int end = Integer.parseInt(JOptionPane.showInputDialog("끝 가격 입력"));
				MapperDTO mDto = new MapperDTO(start, end);
				
				List<HambergerDTO> listc = repository.selectList(mDto);
				msg = myWorks(listc);
				
			} else if(sel.equals("7")){ // 테이블 이름 및 컬럼 사용
				String tableName = JOptionPane.showInputDialog("테이블 이름 입력");
				String colName = JOptionPane.showInputDialog("컬럼 이름 입력");
				String value = JOptionPane.showInputDialog("컬럼 값 입력");
				
				MapperDTO mDto = new MapperDTO(tableName, colName, value);

				HambergerDTO dto = repository.selectOneByColName(mDto);
				msg = myWorks(dto);
				
			} else if(sel.equals("8")){ // 키워드 검색
				String keyWord = JOptionPane.showInputDialog("키워드 입력");
				MapperDTO mDto = new MapperDTO();
				mDto.setValue(keyWord);
				List<HambergerDTO> listc = repository.selectListByKeyWord(mDto);
				msg = myWorks(listc);
				
			} else if(sel.equals("9")){ // 정보 수정
				String search = JOptionPane.showInputDialog("수정 하실 햄버거 이름 입력");
				HambergerDTO dto = repository.search(search);
				
				msg = myWorks(dto);
				if(!msg.equals("저장된 정보가 없습니다.")){
					JOptionPane.showMessageDialog(null, new JTextArea(msg));
					int price = Integer.parseInt(JOptionPane.showInputDialog("새로운 가격 입력"));
					dto.setPrice(price);
					int res = repository.update(dto);
					msg = res > 0 ? "수정 성공" : "수정 실패";
				}
				
			} else if(sel.equals("10")){ // 정보 삭제
				String search = JOptionPane.showInputDialog("삭제하실 햄버거 이름 입력");
				HambergerDTO dto = repository.search(search);
				
				msg = myWorks(dto);
				if(!msg.equals("저장된 정보가 없습니다.")){
					int ans = JOptionPane.showConfirmDialog(
							null, new JTextArea(msg), "정말로 삭제 하시겠습니까?", JOptionPane.YES_NO_OPTION);
					
					if(ans == 0){
						int res = repository.delete(dto);
						msg = res > 0 ? "삭제 성공" : "삭제 실패";
					} else {
						msg = "삭제를 취소 하셨습니다.";
					}
				}
				
			} else if(sel.equals("11")){ // 종료
				break;
			} else {
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
	}
	
	private String myWorks(List<HambergerDTO> listc){
		
		String msg = null;
		
		if(listc == null){
			msg = "저장된 정보가 없습니다.";
		} else {
			msg = "번호\t이름\t가격\t칼로리\n";
			for(HambergerDTO each : listc){
				msg += each.getNum() + "\t" + each.getName() + "\t" + each.getPrice()
					+ "\t" + each.getCal() + "\n";
			}
		}
		return msg;
	}
	
	private String myWorks(HambergerDTO dto){
		
		String msg = null;
		
		if(dto == null) {
			msg = "저장된 정보가 없습니다.";
		} else {
			msg = "번호\t이름\t가격\t칼로리\n";
			msg += dto.getNum() + "\t" + dto.getName() + "\t" + dto.getPrice()
			+ "\t" + dto.getCal();
		}
		return msg;
	}
}