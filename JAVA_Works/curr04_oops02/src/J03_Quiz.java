import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J03_Quiz {
	public static void main(String[] args) {
		
//		���� : �ܹ��� ���� ���� ���α׷�
//		1. ���� �׸�
//			- �̸�, ����, Į�θ�
//		2. �޴�
//			1. �ܹ��� ���� �Է�
//			2. �ܹ��� ���� ����
//			3. �ܹ��� ���� ����(�̸��� ������ ����, Į�θ� ����)
//			4. ���α׷� ����
//		3. ��ü ���� : 1��
		
		String showMenu = "1. �ܹ��� ���� �Է�\n"
							+ "2. �ܹ��� ���� ����\n"
							+ "3. �ܹ��� ���� ����\n"
							+ "4. ���α׷� ����";		
				
		J03_Hamberger ham = null;
		
		while(true){
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
								
			if(sel.equals("1")){ // �Է�
				
				if(ham == null) {
					ham = new J03_Hamberger();
					ham.setData();
					msg = "������ �Ϸ� �Ǿ����ϴ�.";
				} else {
					msg = "����� ������ �ֽ��ϴ�.";
				}
				
			} else if(sel.equals("2")){ // ����
				
				if(ham == null) {
					msg = "����� ������ �����ϴ�.";
				} else {
					
					msg = ham.getTitle("[�ܹ�������]", 40) 
							+ ham.showData();
				}
				
			} else if(sel.equals("3")){ // ����
				
				if(ham == null) {
					msg = "����� ������ �����ϴ�.";
				} else {
				
					String rcv = JOptionPane.showInputDialog("������ �Ͻðڽ��ϱ�?(y/n)");
					if(rcv.equalsIgnoreCase("y")){
						ham.setPriceData();
						ham.setCaloriData();
						msg = "������ ���� �Ǿ����ϴ�.";
					} else {
						continue;
					}
				}
				
			} else if(sel.equals("4")){ // ����
				break;
			} else { // ����
				msg = "�߸��� �Է��Դϴ�.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}		
	}

}
