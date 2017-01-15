package p03_intro;

import javax.swing.JOptionPane;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class J01_mainCla {
	public static void main(String[] args) {
		
		String showMenu = "1. 정보입력\n"
						+ "2. 정보보기\n"
						+ "3. 프로그램 종료";
		
		while(true){
			String sel = JOptionPane.showInputDialog(showMenu);
			
			ApplicationContext container = 
					new GenericXmlApplicationContext("p03_intro/bean.xml");
			
			J03_Injection connBean =
					(J03_Injection) container.getBean("DBConn");
			J02_DAO dao = new J02_DAO(connBean);
			
			if(sel.equals("1")){
				dao.insertOne();
			} else if(sel.equals("2")){
				dao.selectList();
			} else if(sel.equals("3")){
				break;
			}
			
			((GenericXmlApplicationContext)container).close();
		}
		
	}

}
