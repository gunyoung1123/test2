package ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DaoMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex3/ex1_aop.xml");
		DaoInter ref = ctx.getBean("dao", DaoInter.class);
		ref.second();
	}
}
