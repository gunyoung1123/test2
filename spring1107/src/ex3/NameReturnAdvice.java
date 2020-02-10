package ex3;

import org.aspectj.lang.JoinPoint;

public class NameReturnAdvice {
	//반드시 반환값은 이름을 기억해야 한다.
	//JoinPoint는 생략가능하지만, 반환값은 생략하면 안된다. 
	public void myReturnMethod(JoinPoint jp, Object ret) {
		String namev = jp.getSignature().getName();
		System.out.println("Name : "+namev);
		System.out.println("반환값 : ");
		System.out.println(ret);
	}
}
