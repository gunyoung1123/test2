package ex3;

import org.aspectj.lang.ProceedingJoinPoint;
//**Around Advice => ProceedingJoinPoint pjp ���� �ʼ�
//Around Advice�� �ݵ�� ProceedingJoinPoint ���־���Ѵ�. 
//������� ����
public class CheckAdvice {

	public void checkTime(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		//target��ü�� �޼��带 ȣ��!
		pjp.proceed();
		
		long end = System.currentTimeMillis();
		System.out.println("�ҿ�ð� : "+ (end-start) +"��");
	}
}
