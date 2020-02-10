package ex3;

import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;

public class TodayBeforeAdvice {
	
	@Autowired
	private MyPublic myPublic;
	
	public void beforToday(JoinPoint jp) {
		System.out.println(myPublic.todayMethod());
	}
}
