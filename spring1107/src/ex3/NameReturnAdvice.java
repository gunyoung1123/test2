package ex3;

import org.aspectj.lang.JoinPoint;

public class NameReturnAdvice {
	//�ݵ�� ��ȯ���� �̸��� ����ؾ� �Ѵ�.
	//JoinPoint�� ��������������, ��ȯ���� �����ϸ� �ȵȴ�. 
	public void myReturnMethod(JoinPoint jp, Object ret) {
		String namev = jp.getSignature().getName();
		System.out.println("Name : "+namev);
		System.out.println("��ȯ�� : ");
		System.out.println(ret);
	}
}
