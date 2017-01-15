package p03_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class J01_mainCla {
	public static void main(String[] args) {
		
		ApplicationContext container =
				new GenericXmlApplicationContext("p03_constructor/contextBean.xml");
		
		J02_Milk m1 = (J02_Milk)container.getBean("m01");
		J02_Milk m2 = (J02_Milk)container.getBean("m02");
		J02_Milk m3 = (J02_Milk)container.getBean("m03");
		
		System.out.println("m1 : " + m1.getName() + ", " + m1.getPrice());
		System.out.println("m2 : " + m2.getName() + ", " + m2.getPrice());
		System.out.println("m3 : " + m3.getName() + ", " + m3.getPrice());
	}
}
