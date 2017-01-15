package p05_properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class J01_mainCla {
	public static void main(String[] args) {
		
		ApplicationContext container =
				new GenericXmlApplicationContext("p05_properties/contextBean.xml");
		
		J02_JdbcSource jdbc= 
				(J02_JdbcSource)container.getBean("jdbcBean");
		
		System.out.println("jdbc : " + jdbc);
		
		((GenericXmlApplicationContext)container).close();
	}
}
