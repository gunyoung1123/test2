package ex2;

public class MyBeanImple implements MyBeanInter {

	@Override
	public String myGetMessage(String name) {
		StringBuilder sb = new StringBuilder();
		sb.append("Message : ").append("Test").append("핵심로직 수행");
		return sb.toString();
	}

}
