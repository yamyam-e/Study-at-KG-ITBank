import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J07_HW {
	public static void main(String[] args) {
		
//		�л� ���� ���� ���α׷�
//		**** �迭 ������ ���� ����. ��ü���� �ƴ�. Ŭ���� �ʿ� ����
		
//		1. ���� �׸�
//			- �̸�, ��ȣ, ����, ����, ����, ����, ���
//			- �� ������ int, ��� double
//		2. ���� ���� ���� : 5��
//		3. �޴�
//			1. �л� ���� �Է�
//				- 1�� ���� �Է�
//					1�� ���� �� �޴��� ����
//					���� ������ �� ���� �޽��� ���
//			2. �л� ���� ��� (��ȣ��)
//				- 1 ~ 5�������� ����
//				- �Էµ� �л��� ���ؼ��� ���
//			3. �л� ���� ��� (������)
//				- �Էµ� �л��� ���ؼ��� ���
//			4. �л� ���� �˻� (�̸� �˻�)
				
//			5. ���α׷� ����
//		4. �䱸����
//			1. �Էµ� ������ ���� ��� �˸� �޽���
//			2. ������ ������ ���� ��� �˸� �޽���
//		5. ����Ǵ� �迭 ��
//			String[] name = new String[5];
//			int[] num = new int[5];.......
//		6. ��� ����
//			�̸�	��ȣ	����	����	.........
//			==========================================
		
		String showMenu = "[�л� ���� �������α׷�]\n"
							+ "1. �л� ���� �Է�\n"
							+ "2. �л� ���� ���(��ȣ��)\n"
							+ "3. �л� ���� ���(������)\n"
							+ "4. �л� ���� �˻�(�̸� �˻�)\n"
							+ "5. ���α׷� ����\n";
		
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
			String title =	"�̸�\t��ȣ\t����\t����\t����\t����\t���\n"
							   + "===========================================================================================\n";
			
			if(sel.equals("1")){
				
				if(count == 5) {
					JOptionPane.showMessageDialog(null, "���� �� ������ �����ϴ�.");
					continue;
				}
				
				stuName[count] = JOptionPane.showInputDialog("�л� �̸� �Է�");
				String rcv = JOptionPane.showInputDialog("�л� ��ȣ �Է�");
				num[count] = Integer.parseInt(rcv);
				rcv = JOptionPane.showInputDialog("���� ���� �Է�");
				kor[count] = Integer.parseInt(rcv);
				rcv = JOptionPane.showInputDialog("���� ���� �Է�");
				eng[count] = Integer.parseInt(rcv);
				rcv = JOptionPane.showInputDialog("���� ���� �Է�");
				math[count] = Integer.parseInt(rcv);
				
				total[count] = kor[count] + eng[count] + math[count];
				avg[count] = total[count] / 3.0;
				
				count++;
				
				msg = "������ �Ϸ� �Ǿ����ϴ�.";
				
			} else if(sel.equals("2")){
				if(count == 0) {
					msg = "����� ������ �����ϴ�.";
				} else {
					String selNumOf2 = "[�л� ���� ���(��ȣ��)]\n";
					msg = selNumOf2 + title;
					
					// �ӽ� �ε��� ��ȣ ����
					int tmp;
					int[] numTmp = new int[count];
					
					for(int i = 0; i<count; i++) {
						numTmp[i] = i;
					}// �ӽ� �ε��� ��ȣ ���� ��
					
					// �ӽ� �ε��� ��ȣ �������� : ��ȣ ����
					for(int i = 0; i<count; i++) {
						for(int j = i+1; j<count; j++) {
							if(num[i]>num[j]) { // ��ȣ�� �������� �ӽ� �ε��� ��ȣ�� ������ ����
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
					msg = "����� ������ �����ϴ�.";
				} else {
					
					String selNumOf3 = "[�л� ���� ���(������)]\n";
					msg = selNumOf3 + title;
					
					// �ӽ� �ε��� ��ȣ ����
					int tmp;
					int[] numTmp = new int[count];
					
					for(int i = 0; i<count; i++) {
						numTmp[i] = i;
					}// �ӽ� �ε��� ��ȣ ���� ��
					
					// �ӽ� �ε��� ��ȣ �������� : ��ռ��� ����
					for(int i = 0; i<count; i++) {
						for(int j = i+1; j<count; j++) {
							if(avg[i]<avg[j]) { // ����� �������� �ӽ� �ε��� ��ȣ�� ������ ����
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
					msg = "����� ������ �����ϴ�.";
				} else {
					String rcv = JOptionPane.showInputDialog("�˻� �� �л� �̸� �Է�");
					
					String selNumOf4 = "[�л� ���� �˻� ���]\n";
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
						msg = selNumOf4 + rcv + " �л� ������ �����ϴ�.";
					}	
				}
				
			} else if(sel.equals("5")){
				break;
			} else {
				msg = "�߸��� �Է��Դϴ�.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
		
	}

}












