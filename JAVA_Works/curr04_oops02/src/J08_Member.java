import javax.swing.JOptionPane;

public class J08_Member {
	
	String name, id, pw, tel;
	
	String myJop(String str){
		return JOptionPane.showInputDialog(str);
	}
	
	String setData(String id){
		this.id = id;
		this.name = myJop("이름 입력");
		this.pw = myJop("비밀번호 입력");
		this.tel = myJop("전화번호 입력(입력형식 000-0000-0000)");
		return this.name + "님 가입을 축하드립니다.";
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
