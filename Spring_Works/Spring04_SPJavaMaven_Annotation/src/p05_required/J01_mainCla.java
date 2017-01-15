package p05_required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class J01_mainCla {
	public static void main(String[] args) {
		
		ApplicationContext container = 
				new GenericXmlApplicationContext("p05_required/contextBean.xml");
		
		People peo = (People)container.getBean("peoBean");
		System.out.println("peo : " + peo.getName() + ", " + peo.getAge());
		
		((GenericXmlApplicationContext)container).close();
	}
}
