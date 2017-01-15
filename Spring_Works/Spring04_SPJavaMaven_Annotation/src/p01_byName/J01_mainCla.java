package p01_byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class J01_mainCla {
	public static void main(String[] args) {
		
		ApplicationContext container =
				new GenericXmlApplicationContext("p01_byName/contextBean.xml");
		
		J02_AAA aaa = (J02_AAA)container.getBean("aaa");
		System.out.println(aaa.getBbb().getData());
		
		((GenericXmlApplicationContext)container).close();
		
	}
}
