import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J07_HW {
	public static void main(String[] args) {
		
//		학생 정보 관리 프로그램
//		**** 배열 연습을 위한 문제. 객체지향 아님. 클래스 필요 없음
		
//		1. 정보 항목
//			- 이름, 번호, 국어, 영어, 수학, 총점, 평균
//			- 각 과목은 int, 평균 double
//		2. 관리 정보 갯수 : 5개
//		3. 메뉴
//			1. 학생 정보 입력
//				- 1명 단위 입력
//					1명 저장 후 메뉴로 복귀
//					저장 공간이 다 차면 메시지 출력
//			2. 학생 정보 출력 (번호순)
//				- 1 ~ 5번까지만 적용
//				- 입력된 학생에 대해서만 출력
//			3. 학생 정보 출력 (성적순)
//				- 입력된 학생에 대해서만 출력
//			4. 학생 정보 검색 (이름 검색)
				
//			5. 프로그램 종료
//		4. 요구사항
//			1. 입력된 정보가 없는 경우 알림 메시지
//			2. 저장할 공간이 없는 경우 알림 메시지
//		5. 선언되는 배열 예
//			String[] name = new String[5];
//			int[] num = new int[5];.......
//		6. 출력 형식
//			이름	번호	국어	영어	.........
//			==========================================
		
		String showMenu = "[학생 정보 관리프로그램]\n"
							+ "1. 학생 정보 입력\n"
							+ "2. 학생 정보 출력(번호순)\n"
							+ "3. 학생 정보 출력(성적순)\n"
							+ "4. 학생 정보 검색(이름 검색)\n"
							+ "5. 프로그램 종료\n";
		
		String[] stuName = new String[5];
		int[] num = new int[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		
		int count = 0;
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = "";
			String title =	"이름\t번호\t국어\t영어\t수학\t총점\t평균\n"
							   + "===========================================================================================\n";
			
			if(sel.equals("1")){
				
				if(count == 5) {
					JOptionPane.showMessageDialog(null, "저장 할 공간이 없습니다.");
					continue;
				}
				
				stuName[count] = JOptionPane.showInputDialog("학생 이름 입력");
				String rcv = JOptionPane.showInputDialog("학생 번호 입력");
				num[count] = Integer.parseInt(rcv);
				rcv = JOptionPane.showInputDialog("국어 성적 입력");
				kor[count] = Integer.parseInt(rcv);
				rcv = JOptionPane.showInputDialog("영어 성적 입력");
				eng[count] = Integer.parseInt(rcv);
				rcv = JOptionPane.showInputDialog("수학 성적 입력");
				math[count] = Integer.parseInt(rcv);
				
				total[count] = kor[count] + eng[count] + math[count];
				avg[count] = total[count] / 3.0;
				
				count++;
				
				msg = "저장이 완료 되었습니다.";
				
			} else if(sel.equals("2")){
				if(count == 0) {
					msg = "저장된 정보가 없습니다.";
				} else {
					String selNumOf2 = "[학생 정보 출력(번호순)]\n";
					msg = selNumOf2 + title;
					
					// 임시 인덱스 번호 생성
					int tmp;
					int[] numTmp = new int[count];
					
					for(int i = 0; i<count; i++) {
						numTmp[i] = i;
					}// 임시 인덱스 번호 생성 끝
					
					// 임시 인덱스 번호 오름차순 : 번호 기준
					for(int i = 0; i<count; i++) {
						for(int j = i+1; j<count; j++) {
							if(num[i]>num[j]) { // 번호를 기준으로 임시 인덱스 번호의 순서를 정렬
								tmp = numTmp[i];
								numTmp[i] = numTmp[j];
								numTmp[j] = tmp;
							}
						}
					}
					
					for(int i = 0; i<count; i++) {
						int index = numTmp[i];
						msg += stuName[index] + "\t" + num[index] + "\t" + kor[index] + "\t"
									+ eng[index] + "\t" + math[index] + "\t" + total[index] + "\t" + avg[index] + "\n"; 
					}
				}
			} else if(sel.equals("3")){
				
				if(count == 0) {
					msg = "저장된 정보가 없습니다.";
				} else {
					
					String selNumOf3 = "[학생 정보 출력(성적순)]\n";
					msg = selNumOf3 + title;
					
					// 임시 인덱스 번호 생성
					int tmp;
					int[] numTmp = new int[count];
					
					for(int i = 0; i<count; i++) {
						numTmp[i] = i;
					}// 임시 인덱스 번호 생성 끝
					
					// 임시 인덱스 번호 내림차순 : 평균성적 기준
					for(int i = 0; i<count; i++) {
						for(int j = i+1; j<count; j++) {
							if(avg[i]<avg[j]) { // 평균을 기준으로 임시 인덱스 번호의 순서를 정렬
								tmp = numTmp[i];
								numTmp[i] = numTmp[j];
								numTmp[j] = tmp;
							}
						}
					}
				
					for(int i = 0; i<count; i++) {
						int index = numTmp[i];
						msg += stuName[index] + "\t" + num[index] + "\t" + kor[index] + "\t"
									+ eng[index] + "\t" + math[index] + "\t" + total[index] + "\t" + avg[index] + "\n"; 
						
					}
				}
				
			} else if(sel.equals("4")){
				
				if (count == 0) {
					msg = "저장된 정보가 없습니다.";
				} else {
					String rcv = JOptionPane.showInputDialog("검색 할 학생 이름 입력");
					
					String selNumOf4 = "[학생 정보 검색 결과]\n";
					msg = selNumOf4 + title;
					
					int numOfSearch = 0;
					
					for(int i = 0; i<count; i++){
						
						if(stuName[i].equals(rcv)) {
							msg += stuName[i] + "\t" + num[i] + "\t" + kor[i] + "\t"
									+ eng[i] + "\t" + math[i] + "\t" + total[i] + "\t" + avg[i] + "\n";
							numOfSearch++;
						} 
	
					}
					
					if (numOfSearch == 0){
						msg = selNumOf4 + rcv + " 학생 정보가 없습니다.";
					}	
				}
				
			} else if(sel.equals("5")){
				break;
			} else {
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
	}

}












