package ex3;
//���ܵ� ������ �α��̴�.
//��ȯ�ǰ� ����Ǵ� �κп����� ���ܸ� ������ɻ������� ó���ϰ� ���� ��
public class AfterThrowAdvice {
	//JoinPoint jp����....
	public void commThrow(Exception ex) {
		System.out.println("���� �޽��� :  "+ex.getMessage());
	}
}
