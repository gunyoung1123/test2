package ex3;

import org.aspectj.lang.ProceedingJoinPoint;
//**Around Advice => ProceedingJoinPoint pjp 정의 필수
//Around Advice는 반드시 ProceedingJoinPoint 가있어야한다. 
//공통관심 사항
public class CheckAdvice {

	public void checkTime(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		//target객체의 메서드를 호출!
		pjp.proceed();
		
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : "+ (end-start) +"초");
	}
}
