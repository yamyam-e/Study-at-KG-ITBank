import javax.swing.JOptionPane;

public class J09_Student {
	String name;
	int kor, eng, math, sci, total;
	double avg;
	
	String setData() {
		name = JOptionPane.showInputDialog("�̸��Է�");
		modData();
		return "������ �Ϸ� �Ǿ����ϴ�.";
	}
	
	String modData() {
		kor = myJopInt("��������");
		eng = myJopInt("��������");
		math = myJopInt("��������");
		sci = myJopInt("��������");
		total = kor + eng + math + sci;
		avg = total/4.0;
		return "������ �Ϸ� �Ǿ����ϴ�.";
	}
	
	int myJopInt(String title) {
		String rcv = JOptionPane.showInputDialog(title);
		return Integer.parseInt(rcv);
	}
	
	String getData(){
		return "�̸�: " + name + "\n"
				+ "����: " + kor + "\n"
				+ "����: " + eng + "\n"
				+ "����: " + math + "\n"
				+ "����: " + sci + "\n"
				+ "����: " + total + "\n"
				+ "���: " + avg;
	}

}
