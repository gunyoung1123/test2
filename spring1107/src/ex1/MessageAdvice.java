package ex1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//Around Advice����� ����
public class MessageAdvice implements MethodInterceptor {

	//Around�� ��쿡��
	//������ɻ���1 ---- Advice���뿵��
	//�ٽɷ��� ���� --- �޼��� ȣ��
	//������ɻ���2 --- Advice���뿵��
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Ÿ�ٺ��� ���� ó���� ���� ���� ����!");
		//�����Ͻ� ������ �޼��� ȣ���Ѵ�.
		Object rev = invocation.proceed();
		System.out.println("Ÿ���� ������ �� ��  ó���� ���� ���� ����!");
		return rev;
	}

}
