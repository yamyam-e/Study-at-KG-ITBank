package p02_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class J01_mainCla {
	public static void main(String[] args) {
		
		ApplicationContext container =
				new GenericXmlApplicationContext(
						"p02_setter/contextBean.xml");
		
		J02_Food fd1 = (J02_Food)container.getBean("whopper");
		J02_Food fd2 = (J02_Food)container.getBean("1995");
		
		System.out.println("fd : " + fd1.getName() + ", " + fd1.getPrice());
		System.out.println("fd1 : " + fd2.getName() + ", " + fd2.getPrice());
	}

}
