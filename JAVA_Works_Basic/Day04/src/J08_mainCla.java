import javax.swing.JOptionPane;

public class J08_mainCla {
	public static void main(String[] args) {
		
		String showMenu = "1. �λ� ���� �Է�\n"
						+ "2. �λ� ���� ����\n"
						+ "3. ���α׷� ����\n";
		
		J08_People peo = new J08_People();
		while(true){
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			if (sel.equals("1")) {
				peo.setData();
				msg = "������ �Ϸ� �Ǿ����ϴ�.";
			} else if(sel.equals("2")) {
				msg = peo.getData();
			} else if(sel.equals("3")) {
				break;
			} else {
				msg = "�߸��� �Է�";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
		
		
		
	}
}
