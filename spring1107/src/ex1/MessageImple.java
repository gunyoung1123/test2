package ex1;
//핵심포인트 : AOP의 원리를 이해하기 위해서 가장 원본적인 인터셉터 기능만 구현 해본다. 
//목적 : 공통관심사항을 print계열의 메서드에게마 적용한다. 
public class MessageImple implements MessageInter {

	@Override
	public void print() {
		//System.out.println("타겟보다 먼저 처리될 공통 관심 사항!");
		System.out.println("print 메서드 호출");
		//System.out.println("타겟이 수행이 된 후  처리될 공통 관심 사항!");
	}

	@Override
	public void print2() {
		System.out.println("print2 메서드 호출");

	}

	@Override
	public void test() {
		System.out.println("test 메서드 호출");

	}

	@Override
	public String message() {
		StringBuilder sb = new StringBuilder();
		sb.append("Message가 반환이 되는 로직");
		return sb.toString();
	}

}
