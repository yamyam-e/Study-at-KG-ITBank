package p03_model02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class J01_mainCla {
	public static void main(String[] args) {
		
		ApplicationContext container =
				new GenericXmlApplicationContext("p03_model02/contextBean.xml");
		
		J02_Math injector = (J02_Math)container.getBean("divBean");
		Object rcv = injector.coreWorks();
		System.out.println(rcv);
		
		((GenericXmlApplicationContext)container).close();
	}
}
