package ex2;

public class MyBeanImple implements MyBeanInter {

	@Override
	public String myGetMessage(String name) {
		StringBuilder sb = new StringBuilder();
		sb.append("Message : ").append("Test").append("�ٽɷ��� ����");
		return sb.toString();
	}

}
