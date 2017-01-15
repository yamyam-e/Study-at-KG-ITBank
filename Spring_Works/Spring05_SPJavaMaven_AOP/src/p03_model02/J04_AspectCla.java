package p03_model02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component@Aspect => 하나의 프로젝트에서 하나의 빈만 존재해야 함

@Component
@Aspect
public class J04_AspectCla {
	
	@Pointcut("execution(public * *(..))")
	public void targetMethod(){};

	@Around("targetMethod()")
	public Object joinPointWorks(ProceedingJoinPoint jointPoint) throws Throwable{
		
		Object ret = null;
		
		System.out.println("프로그램 시작(관련 메모리 확보)");
		
		try {
			
			ret = jointPoint.proceed();
			
		} catch (Exception e) {
			System.out.println("예외 발생 : 정보 - " + e.getMessage());
		} finally {
			System.out.println("메모리 정상 반납");
		}
		System.out.println("프로그램 종료");
		
		return ret;
	}
}
