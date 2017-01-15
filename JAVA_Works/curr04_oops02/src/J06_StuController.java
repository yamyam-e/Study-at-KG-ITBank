import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J06_StuController {
	
	String showMenu = "[학생 정보 관리 프로그램]\n"
						+ "1. 학생 정보 입력\n"
						+ "2. 학생 정보 출력 (입력순)\n"
						+ "3. 학생 정보 출력 (등수순)\n"
						+ "4. 학생 정보 출력 (원하는 등급)\n"
						+ "5. 학생 정보 수정 (이름 등으로 선택 후 3과목 점수 수정)\n"
						+ "6. 프로그램 정보";

	J06_Student[] stu;
	int nowSaveNum = 0;

	void works(){

		stu = new J06_Student[5]; 
		
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")){ // 입력
				
				if(nowSaveNum == 5){
					msg = "저장할 공간이 없습니다.";
				} else {
					stu[nowSaveNum] = new J06_Student();
					msg = stu[nowSaveNum].setData();
					nowSaveNum++;
				}
				
			}else if(sel.equals("2")){ // 출력(입력순)
				
				if(nowSaveNum == 0){
					msg = "저장된 정보가 없습니다.";
				} else {					
					msg = showTitle("[학생 정보(입력순)");
					msg += showAllData(stu, nowSaveNum);
				}
				
			}else if(sel.equals("3")){ // 출력(성적순)
				
				if(nowSaveNum == 0){
					msg = "저장된 정보가 없습니다.";
				} else{
					setRank(stu, nowSaveNum);
					msg = showRank(stu, nowSaveNum);
				}
				
			}else if(sel.equals("4")){ // 출력(등급)

				if(nowSaveNum == 0){
					msg = "저장된 정보가 없습니다.";
				} else{
					String res = showGrade(stu, nowSaveNum);
					if(res == null) {
						msg = "해당 등급 학생이 없습니다.";
					} else {
						msg = showTitle("[학생 정보(등급)]")
							+ res;
					}
				}
				
			}else if(sel.equals("5")){ // 수정
				
				if(nowSaveNum == 0){
					msg = "저장된 정보가 없습니다.";
				} else{
					msg = modify(stu, nowSaveNum);	
				}
				
			}else if(sel.equals("6")){ // 종료
				break;
			}else{ // 기타
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));	

		}
		
	}
	
	String showAllData(J06_Student[] stu, int len){
		
		String msg = "";
		
		for(int i=0; i<len; i++){
			msg += stu[i].showData() + "\n";
		}
		
		return msg;
	}
	
	String showRank(J06_Student[] stu, int len){
		
		String msg = showTitle("[학생정보(등수)]\n");
		
		for(int i=1; i<=len; i++){
			for(int k=0; k<len; k++){
				if(i == stu[k].rank) {
					msg += stu[k].showData() + "\n";
				}
			}
		}
		
		return msg;
	}
	
	String showGrade(J06_Student[] stu, int len){
		
		String rcv = JOptionPane.showInputDialog("A~B 중 보고 싶은 등급 입력");
		String res  = null;
		
		for(int i=0; i<len; i++){
			if(stu[i].getGrade().equalsIgnoreCase(rcv)){
				res += stu[i].showData() + "\n";
			}
		}
		
		return res;
	}
	
	String showTitle(String str){
		return  str + "\n"
					+ "이름\t국어\t영어\t수학\t총점\t평균\t등급\n"
					+ doLine() + "\n";
	}
	
	String modify(J06_Student[] stu, int len){
		
		String res = "";
		
		for(int i=0; i<len; i++){
			res += stu[i].getName() +"\n";
		}
		
		String rcv = JOptionPane.showInputDialog("아래 학생중 수정할 학생 이름 입력\n" + res);
		
		boolean search = false;
		
		for(int i=0; i<len; i++){
			if(stu[i].name.equals(rcv)){
				stu[i].modifyData();
				search = true;
			}
		}
	    res = "수정이 완료 되었습니다.";
		
		if(!search) {
			res = "정보가 존재하지 않습니다.";
		}
		
		return res;
	}
	
	void setRank(J06_Student[] stu, int len){
		
		for(int i=0; i<len; i++){
			stu[i].rank = 1;
			for(int k=0; k<len; k++){
				if(stu[i].avg < stu[k].avg) {
					stu[i].rank++;
				}
			}
		}		
	}
	
	String doLine(){
		String str = "";
		for(int i=0; i<100; i++){
			str += "=";
		}
		return str;
	}
}
