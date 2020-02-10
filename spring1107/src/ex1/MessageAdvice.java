package ex1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//Around Advice기능을 적용
public class MessageAdvice implements MethodInterceptor {

	//Around일 경우에는
	//공통관심사항1 ---- Advice적용영역
	//핵심로직 수행 --- 메서드 호출
	//공통관심사항2 --- Advice적용영역
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("타겟보다 먼저 처리될 공통 관심 사항!");
		//비지니스 로직의 메서들 호출한다.
		Object rev = invocation.proceed();
		System.out.println("타겟이 수행이 된 후  처리될 공통 관심 사항!");
		return rev;
	}

}
