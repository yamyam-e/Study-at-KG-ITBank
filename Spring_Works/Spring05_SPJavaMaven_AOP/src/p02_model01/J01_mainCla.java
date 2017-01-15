package p02_model01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class J01_mainCla {
	
//	pom.xml설정 : aspectjrt && aspect weaver
	
	public static void main(String[] args) {
		
		ApplicationContext container =
				new GenericXmlApplicationContext("p02_model01/contextBean.xml");
		
		J02_Math injector = (J02_Math)container.getBean("divBean");
		Object rcv = injector.coreWorks();
		System.out.println(rcv);
		
		((GenericXmlApplicationContext)container).close();
	}
}
