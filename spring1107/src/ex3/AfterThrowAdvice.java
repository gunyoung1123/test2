package ex3;
//예외도 일종의 로그이다.
//반환되고 실행되는 부분에대한 예외를 공통관심사항으로 처리하고 싶을 때
public class AfterThrowAdvice {
	//JoinPoint jp생략....
	public void commThrow(Exception ex) {
		System.out.println("예외 메시지 :  "+ex.getMessage());
	}
}
