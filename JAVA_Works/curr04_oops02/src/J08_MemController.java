import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J08_MemController {
	
	String rcv1, rcv2, msg;
	String showMenu = "[ȸ�� ���� ���� ���α׷�]\n"
							+ "1. ȸ������(���̵��ߺ� ����)\n"
							+ "2. �α���\n"
							+ "3. ��й�ȣ ã��\n"
							+ "4. ���α׷� ����";
	
	J08_Member[] mm = new J08_Member[5];
	
	int nowSaveNum = 0;

	void works(){
		
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			
			if(sel.equals("1")){ // ȸ������
				
				if(nowSaveNum == 5){
					JOptionPane.showMessageDialog(null, new JTextArea("������ ������ �����ϴ�."));
					continue;
				}
					
				mm[nowSaveNum] = new J08_Member();
				rcv1 = JOptionPane.showInputDialog("���̵� �Է�");
				J08_Member search = searchID(mm, nowSaveNum, rcv1);
				
				if(search == null){
					
					msg = mm[nowSaveNum].setData(rcv1);
					nowSaveNum++;
				} else {
					
					mm[nowSaveNum] = null;
					msg = "����� �� ���� ���̵� �Դϴ�.";
				}
				
			} else if(sel.equals("2")){ // �α���
				
				if(nowSaveNum == 0) {
					
					msg = "����� ������ �����ϴ�.";
				} else {
					
					rcv1 = JOptionPane.showInputDialog("���̵� �Է�");
					J08_Member search = searchID(mm, nowSaveNum, rcv1);
					
					if(search == null) {
						
						msg = "���̵� �������� �ʽ��ϴ�.";
					} else {
						
						msg = checkPW(search);		
					}
				}
				
			} else if(sel.equals("3")){ // ��й�ȣ ã��
				
				if(nowSaveNum == 0) {
					
					msg = "����� ������ �����ϴ�.";
				} else {
				
					rcv1 = JOptionPane.showInputDialog("���̵� �Է�");
					J08_Member search = searchID(mm, nowSaveNum, rcv1);
					
					if(search == null) {
						
						msg = "���̵� �������� �ʽ��ϴ�.";
					} else {
						
						rcv1 = JOptionPane.showInputDialog("�̸� �Է�");
						rcv2 = JOptionPane.showInputDialog("��ȭ��ȣ�Է�");
						if(rcv1.equals(search.getName())
								&& rcv2.equals(search.getTel())){
							msg = search.getName() +"���� ��й�ȣ�� : " + search.getPw();
						} else {
							msg = "�Է��Ͻ� ������ �ùٸ��� �ʽ��ϴ�.";
						}
					}
				}
				
			} else if(sel.equals("4")){ // ����
				break;
			} else { // ��Ÿ
				msg = "�߸��� �Է��Դϴ�.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
	}
	
	J08_Member searchID(J08_Member[] mm, int len, String id) {
		
		J08_Member search = null;
		
		for(int i=0; i<len; i++){
			if(id.equals(mm[i].getId())){
				search = mm[i];
			}
		}
		return search;
	}
	
	String checkPW(J08_Member mm){
		
		rcv1 = JOptionPane.showInputDialog("�н����� �Է�");
				
		if(rcv1.equals(mm.getPw())){
			
			J08_LogController logC = new J08_LogController();
			msg = logC.logedIn(mm);
		
		} else{
			
			msg = "�н����尡 �ùٸ��� �ʽ��ϴ�.\n"
						+ "�ٽ� �õ� ���ּ���.";
		}
		
		return msg;
	}
}
