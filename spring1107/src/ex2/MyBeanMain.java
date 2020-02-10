package ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex2/mybean.xml");
		MyBeanInter ref = ctx.getBean("pfBean", MyBeanInter.class);
		System.out.println(ref.myGetMessage("gg"));	
	}

}
