package p02_model01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class J04_AdviceCla implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation joinPoint) throws Throwable {
		
		Object ret = null;
		
		System.out.println("프로그램 시작(관련 메모리 확보)");
		
		try {
			
			ret = joinPoint.proceed();
			
		} catch (Exception e) {
			System.out.println("예외 발생 : 정보 - " + e.getMessage());
		} finally {
			System.out.println("메모리 정상 반납");
		}
		System.out.println("프로그램 종료");
		
		return ret;
	}
}
