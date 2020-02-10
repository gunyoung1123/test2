package ex1;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class MessageMain {

	public static void main(String[] args) {
		//1.target��ü�� �����Ѵ�.//Bean
		MessageImple target = new MessageImple();
		
		//2.Advice��ü�� ����//Bean
		MessageAdvice advice = new MessageAdvice();
		
		//3.ProxyFactoryBean(��ü)
		ProxyFactoryBean pBean= new ProxyFactoryBean();
		
		//3-1. ProxyFactoryBean���� target�� ���� , advice ����
		pBean.setTarget(target);//target���ϳ� //property //setter
		//pBean.addAdvice(advice);//advice�� �߰��� �� �ִ�.//property//setter
		/*
		<bean id="pBean" class="ProxyFactoryBean" p:target-ref= target>
		  */
		
		//3-2.Pointcut, Advice�� ���� Advisor�� ���� 
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		
		pointcut.setMappedNames("print*");
		//ProxyFactoryBean���� Advisor�� �����ؼ� �־��ش�. 
		pBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, advice));
		//MessageInter pr = new MessageImple();�� �����ϴ�. <= Advice�� ����� 
		MessageInter prMessage = (MessageInter) pBean.getObject();
		//������ �� ���������, �����ؼ� ������ �ʿ䰡 �ִ�. 
		prMessage.print();
		//prMessage.print2();
		//prMessage.test();
		//prMessage.message();
	}

}
