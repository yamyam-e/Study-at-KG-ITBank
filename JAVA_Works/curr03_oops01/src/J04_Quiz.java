import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J04_Quiz {
	public static void main(String[] args) {
		
//		���� : �ڵ��� ���� ���� ���α׷�
		
//		1. ���� �׸�
//			- �̸�, ��������, Ÿ�̾��,
//				�ɼ� ��ǰ �̸�, �ɼ� ��ǰ ����, �� ���Ű���
//		2. �޴�
//			1. �ڵ��� ���� �Է�
//				- �̸� �� �� ��ǰ ����
//				- �ɼ��� �ִ��� ���� ��, �ɼǿ� ���� �Է��� ����
//			2. �ڵ��� ���� ���
//				- ��� ����
//				- ��, �ɼ��� ���� ��� ����
//			3. �ڵ��� ���� ����
//			4. ���α׷� ����
		
		String showMenu = "[�ڵ��� ���� ���� ���α׷�]\n"
							+ "1. �ڵ��� ���� �Է�\n"
							+ "2. �ڵ��� ���� ���\n"
							+ "3. �ڵ��� ���� ����\n"
							+ "4. ���α׷� ����";
		
		J04_CarInfo car = new J04_CarInfo();
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")){
				
				//car = new J04_CarInfo();
				
				car.name = JOptionPane.showInputDialog("�ڵ��� �̸� �Է�");
				String rcv = JOptionPane.showInputDialog("�������� �Է�");
				car.engPrice = Integer.parseInt(rcv);
				rcv = JOptionPane.showInputDialog("Ÿ�̾�� �Է�");
				car.tirePrice = Integer.parseInt(rcv);
				
				rcv = JOptionPane.showInputDialog("�ɼ��� �����Ͻðڽ��ϱ�? (y/n)");
				
				if (rcv.equalsIgnoreCase("y")){ 
					car.optionName = JOptionPane.showInputDialog("�ɼ� ��ǰ�� �Է�");
					rcv = JOptionPane.showInputDialog("�ɼ� ���� �Է�");
					car.optionPrice = Integer.parseInt(rcv);
				} 
				
				car.totalPrice = car.engPrice + car.tirePrice + car.optionPrice;
				msg = "������ �Ϸ�Ǿ����ϴ�.";
			} else if(sel.equals("2")){
				if(car.name == null){
					msg = "����� ������ �����ϴ�.";
				} else {
					msg = "[�ڵ��� ����]\n" 
							+ "�̸� : " + car.name + "\n"
							+ "�������� : " + car.engPrice + "\n"
							+ "Ÿ�̾�� : " + car.tirePrice;
					if(car.optionName != null) {
						msg +=  "\n�ɼ��̸� : " + car.optionName 
								+ "\n�ɼǰ��� : " + car.optionPrice;
					}
					msg += "\n�� ���Ű��� : " + car.totalPrice;
				}	
			} else if(sel.equals("3")){
				car.name = null;
				msg = "����� ������ �����Ǿ����ϴ�.";
			} else if(sel.equals("4")){
				break;
			} else {
				msg = "�߸��� �Է��Դϴ�.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
		
	}

}














