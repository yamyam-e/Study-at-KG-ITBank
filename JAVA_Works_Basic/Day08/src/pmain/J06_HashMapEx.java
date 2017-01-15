package pmain;

import java.util.*;

import javax.swing.JOptionPane;

import entity.*;

public class J06_HashMapEx {
	public static void main(String[] args) {
		
//		���� ���� ���α׷� : �̸� , ����
		String showMenu = "1. ���� ���� �Է�\n" + "2. ���� ���� ����\n" + "3. ���� ���� �˻�\n" + "4. ���α׷� ����";
		
		HashMap<String , J06_Food> mapc = new HashMap<>();
		
		while(true){
			String sel = JOptionPane.showInputDialog(showMenu);
			String msg = null;
			
			if(sel.equals("1")) {//�Է�
				J06_Food ff = new J06_Food();
				ff.setData();
				mapc.put(ff.getName(), ff);
				msg = "���� �Ϸ�";
			}else if(sel.equals("2")){//����
				if(mapc.isEmpty()) {
					msg = "������ �����ϴ�.";
				} else {
					msg = "";
					Set<String> keyGroup = mapc.keySet();
					for(String key : keyGroup) {
						J06_Food ff = mapc.get(key);
						msg += ff.getData() + "\n";
					}
				}
				
			}else if(sel.equals("3")){//�˻�
				if(mapc.isEmpty()) {
					msg = "������ �����ϴ�.";
				} else {
					String search = JOptionPane.showInputDialog("�˻� ���� �̸� �Է�");
					if(mapc.containsKey(search)) {
						J06_Food ff = mapc.get(search);
						msg = ff.getData();
					} else {
						msg = "������ �����ϴ�.";
					}
				}			
			}else if(sel.equals("4")){//����
				break;
			}else{
				msg = "�߸��� �Է��Դϴ�.";
			}
			JOptionPane.showMessageDialog(null, msg);
			
		}
		
	}
}
