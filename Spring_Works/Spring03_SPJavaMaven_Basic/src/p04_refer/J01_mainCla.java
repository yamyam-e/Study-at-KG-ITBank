package p04_refer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class J01_mainCla {
	public static void main(String[] args) {
		
		ApplicationContext container =
				new GenericXmlApplicationContext("p04_refer/contextBean.xml");
		
		J02_AAA aaa = (J02_AAA)container.getBean("aaa");
		System.out.println("aaa : " + aaa.getBbb().getData());
		
		((GenericXmlApplicationContext)container).close();
	}
}
