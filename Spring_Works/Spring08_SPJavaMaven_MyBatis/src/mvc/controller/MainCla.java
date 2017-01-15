package mvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainCla {
	public static void main(String[] args) {
		
		ApplicationContext container =
				new GenericXmlApplicationContext("context_config/bean-context.xml");
		
		Controller cont = (Controller)container.getBean("controller");
		cont.works();
		
		((GenericXmlApplicationContext)container).close();
	}
}
