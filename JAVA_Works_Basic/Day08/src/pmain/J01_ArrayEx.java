package pmain;

import javax.swing.JOptionPane;
import entity.*;
import java.util.ArrayList;

public class J01_ArrayEx {
	
	public static void main(String[] args) {
		
		String showMenu =  "1. ���� ���� ����\n" + "2. ���� ���� ����\n" + "3. ���� ���� �˻�\n" + "4. ���α׷� ����";
		
		ArrayList listc = new ArrayList<>();
		
		while(true){
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")) {//����
				J01_Nation nt = new J01_Nation();
				nt.setData();
				listc.add(nt);
				msg = "����Ϸ�";		
			}else if(sel.equals("2")){//��ü����
				if(listc.isEmpty()) {
					msg = "����� ������ �����ϴ�.";
				} else {
					msg = "";
					for(Object each :listc) {
						J01_Nation info = (J01_Nation)each;
						msg += info.getData() + "\n";
					}
				}
			}else if(sel.equals("3")){//�˻�
				if(listc.isEmpty()) {
					msg = "����� ������ �����ϴ�.";
				} else {
					String search = JOptionPane.showInputDialog("�˻��� ������ �Է�");
					for(Object each : listc){
						J01_Nation info = (J01_Nation)each;
						if (search.equals(info.getName())) {//���� ����
							msg = info.getData();
							break;
						} else {
							msg = "�˻� ����� �����ϴ�.";
						}
					}
				}		
			}else if(sel.equals("4")){//����
				break;
			}else{
				msg = "�߸��� �Է�";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
	}

}
