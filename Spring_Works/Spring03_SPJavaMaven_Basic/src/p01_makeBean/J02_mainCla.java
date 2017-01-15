package p01_makeBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class J02_mainCla {
	public static void main(String[] args) {
		
		ApplicationContext container =
				new GenericXmlApplicationContext(
						"/p01_makeBean/contextBean.xml");
		
//		경로 형식
//		- "classpath:/p01_makeBean/contextBean.xml"
//		- "p01_makeBean/contextBean.xml"
		
//		1. singleTone : 같은 헤시 코드 값
		People speo1 = (People)container.getBean("singleBean");
		People speo2 = (People)container.getBean("singleBean");
		People speo3 = (People)container.getBean("singleBean");
		System.out.println("speo1 : " + speo1);
		System.out.println("speo2 : " + speo2);
		System.out.println("speo3 : " + speo3);
		
//		2. protoType : 각각 다른 헤시 코드 값
		People ppeo1 = (People)container.getBean("protoBean");
		People ppeo2 = (People)container.getBean("protoBean");
		People ppeo3 = (People)container.getBean("protoBean");
		System.out.println("ppeo1 : " + ppeo1);
		System.out.println("ppeo2 : " + ppeo2);
		System.out.println("ppeo3 : " + ppeo3);
		
		((GenericXmlApplicationContext)container).close();
		
	}
}
