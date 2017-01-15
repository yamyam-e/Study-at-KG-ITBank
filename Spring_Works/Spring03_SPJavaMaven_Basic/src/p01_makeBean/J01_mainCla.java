package p01_makeBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class J01_mainCla {
	public static void main(String[] args) {
		
		People peo1 = null;
		People peo2 = null;
		
		// 한개의 컨테이너에 두개의 빈 넣기
		ApplicationContext container =
				new GenericXmlApplicationContext(
						"/p01_makeBean/contextBean.xml",
						"/p01_makeBean/extra.xml");
		
		// 두 가지다 같은 형식임 
		// 싱글톤 방식 peo1&peo2는 같은 레퍼런스 주소 찍힘
		// 그러나 peo3는 다른 bean 이기 때문에 다른 레퍼런스 주소 찍힘
		// bean을 만드려면 기본 생성자가 반드시 존재하여야 한다.
		peo1 = (People)container.getBean("peoBean");
		peo2 = container.getBean("peoBean", People.class);
		People peo3 =(People)container.getBean("ext");
		
		System.out.println("peo1 : " + peo1);
		System.out.println("peo2 : " + peo2);
		System.out.println("peo3 : " + peo3);
		
		peo1.setName("둘리");
		System.out.println(peo2.getName()); // 둘리 찍힘
		
		((GenericXmlApplicationContext)container).close();
	}
}
