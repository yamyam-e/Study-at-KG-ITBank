import javax.swing.JOptionPane;

public class J08_Member {
	
	String name, id, pw, tel;
	
	String myJop(String str){
		return JOptionPane.showInputDialog(str);
	}
	
	String setData(String id){
		this.id = id;
		this.name = myJop("�̸� �Է�");
		this.pw = myJop("��й�ȣ �Է�");
		this.tel = myJop("��ȭ��ȣ �Է�(�Է����� 000-0000-0000)");
		return this.name + "�� ������ ���ϵ帳�ϴ�.";
	}
	
	String showData(){
		return this.name + "\t" + this.id + "\t" + this.pw + "\t" + this.tel;
	}
	
	String getName(){
		return this.name;
	}
	
	String getId(){
		return this.id;
	}
	
	String getPw(){
		return this.pw;
	}
	
	String getTel(){
		return this.tel;
	}

}
