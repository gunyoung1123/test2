package ex1;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class MessageMain {

	public static void main(String[] args) {
		//1.target객체를 생성한다.//Bean
		MessageImple target = new MessageImple();
		
		//2.Advice객체를 생성//Bean
		MessageAdvice advice = new MessageAdvice();
		
		//3.ProxyFactoryBean(본체)
		ProxyFactoryBean pBean= new ProxyFactoryBean();
		
		//3-1. ProxyFactoryBean에게 target을 지정 , advice 적용
		pBean.setTarget(target);//target은하나 //property //setter
		//pBean.addAdvice(advice);//advice은 추가될 수 있다.//property//setter
		/*
		<bean id="pBean" class="ProxyFactoryBean" p:target-ref= target>
		  */
		
		//3-2.Pointcut, Advice를 결합 Advisor를 생성 
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		
		pointcut.setMappedNames("print*");
		//ProxyFactoryBean에게 Advisor를 생성해서 넣어준다. 
		pBean.addAdvisor(new DefaultPointcutAdvisor(pointcut, advice));
		//MessageInter pr = new MessageImple();과 유사하다. <= Advice가 적용된 
		MessageInter prMessage = (MessageInter) pBean.getObject();
		//지금은 다 실행되지만, 선별해서 실행할 필요가 있다. 
		prMessage.print();
		//prMessage.print2();
		//prMessage.test();
		//prMessage.message();
	}

}
