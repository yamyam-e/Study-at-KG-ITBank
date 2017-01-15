package p03_componentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class J01_mainCla {
	public static void main(String[] args) {
		
		ApplicationContext container =
				new GenericXmlApplicationContext("p03_componentScan/contextBean.xml");
		
		People peo = (People)container.getBean("people"); // people 클래스 component에 이름을 주지 않았을 경우 클래스이름 소문자가 id
		System.out.println("peo : " + peo.getName() + ", " + peo.getAge());
		
		People2 peo2 = (People2)container.getBean("ppp"); // people 클래스 component(이름)에 이름을 주면 이름이 id가 된다.
		System.out.println("peo2 : " + peo2.getName() + ", " + peo2.getAge());
		
		((GenericXmlApplicationContext)container).close();
		
	}
}
