package ex2;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice {
	//Ÿ�ϸ޼��尡 ���� �� ���Ŀ� ����(mybean�� �߰��ϱ�)
	/*
	 * void afterReturning(Object returnValue,
	 * 						Method method,
	 * 						Object[] args,
	 * 						Object target)
	 * */
	@Override
	public void afterReturning(Object returns, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("�޼����� ����");
		System.out.println("Method : "+arg1.getReturnType());
		System.out.println("Return : "+returns.toString());
	}
}
