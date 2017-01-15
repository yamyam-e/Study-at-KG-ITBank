import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J06_StuController {
	
	String showMenu = "[�л� ���� ���� ���α׷�]\n"
						+ "1. �л� ���� �Է�\n"
						+ "2. �л� ���� ��� (�Է¼�)\n"
						+ "3. �л� ���� ��� (�����)\n"
						+ "4. �л� ���� ��� (���ϴ� ���)\n"
						+ "5. �л� ���� ���� (�̸� ������ ���� �� 3���� ���� ����)\n"
						+ "6. ���α׷� ����";

	J06_Student[] stu;
	int nowSaveNum = 0;

	void works(){

		stu = new J06_Student[5]; 
		
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")){ // �Է�
				
				if(nowSaveNum == 5){
					msg = "������ ������ �����ϴ�.";
				} else {
					stu[nowSaveNum] = new J06_Student();
					msg = stu[nowSaveNum].setData();
					nowSaveNum++;
				}
				
			}else if(sel.equals("2")){ // ���(�Է¼�)
				
				if(nowSaveNum == 0){
					msg = "����� ������ �����ϴ�.";
				} else {					
					msg = showTitle("[�л� ����(�Է¼�)");
					msg += showAllData(stu, nowSaveNum);
				}
				
			}else if(sel.equals("3")){ // ���(������)
				
				if(nowSaveNum == 0){
					msg = "����� ������ �����ϴ�.";
				} else{
					setRank(stu, nowSaveNum);
					msg = showRank(stu, nowSaveNum);
				}
				
			}else if(sel.equals("4")){ // ���(���)

				if(nowSaveNum == 0){
					msg = "����� ������ �����ϴ�.";
				} else{
					String res = showGrade(stu, nowSaveNum);
					if(res == null) {
						msg = "�ش� ��� �л��� �����ϴ�.";
					} else {
						msg = showTitle("[�л� ����(���)]")
							+ res;
					}
				}
				
			}else if(sel.equals("5")){ // ����
				
				if(nowSaveNum == 0){
					msg = "����� ������ �����ϴ�.";
				} else{
					msg = modify(stu, nowSaveNum);	
				}
				
			}else if(sel.equals("6")){ // ����
				break;
			}else{ // ��Ÿ
				msg = "�߸��� �Է��Դϴ�.";
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
		
		String msg = showTitle("[�л�����(���)]\n");
		
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
		
		String rcv = JOptionPane.showInputDialog("A~B �� ���� ���� ��� �Է�");
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
					+ "�̸�\t����\t����\t����\t����\t���\t���\n"
					+ doLine() + "\n";
	}
	
	String modify(J06_Student[] stu, int len){
		
		String res = "";
		
		for(int i=0; i<len; i++){
			res += stu[i].getName() +"\n";
		}
		
		String rcv = JOptionPane.showInputDialog("�Ʒ� �л��� ������ �л� �̸� �Է�\n" + res);
		
		boolean search = false;
		
		for(int i=0; i<len; i++){
			if(stu[i].name.equals(rcv)){
				stu[i].modifyData();
				search = true;
			}
		}
	    res = "������ �Ϸ� �Ǿ����ϴ�.";
		
		if(!search) {
			res = "������ �������� �ʽ��ϴ�.";
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
