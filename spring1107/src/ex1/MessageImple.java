package ex1;
//�ٽ�����Ʈ : AOP�� ������ �����ϱ� ���ؼ� ���� �������� ���ͼ��� ��ɸ� ���� �غ���. 
//���� : ������ɻ����� print�迭�� �޼��忡�Ը� �����Ѵ�. 
public class MessageImple implements MessageInter {

	@Override
	public void print() {
		//System.out.println("Ÿ�ٺ��� ���� ó���� ���� ���� ����!");
		System.out.println("print �޼��� ȣ��");
		//System.out.println("Ÿ���� ������ �� ��  ó���� ���� ���� ����!");
	}

	@Override
	public void print2() {
		System.out.println("print2 �޼��� ȣ��");

	}

	@Override
	public void test() {
		System.out.println("test �޼��� ȣ��");

	}

	@Override
	public String message() {
		StringBuilder sb = new StringBuilder();
		sb.append("Message�� ��ȯ�� �Ǵ� ����");
		return sb.toString();
	}

}
