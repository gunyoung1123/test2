package ex3;

public class DaoImple implements DaoInter {

	@Override
	public void first() {
		//long start = System.currentTrmeMillis();
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i+" ");
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("END!");
		//long end = System.currentTimeMillis();
	}

	@Override
	public String second() {
		StringBuffer sb = new StringBuffer();
		sb.append("---------------").append("\n");
		sb.append("��浿").append("\n");
		sb.append("---------------").append("\n");
		
		return sb.toString();
	}

	@Override
	public void third() {
		String[] ar = {"�޼���1", "�޼���2", "�޼���3", "�޼���4","�޼���5"};
		for(int i=0; i<=ar.length ; i++) {
			System.out.println("�����Ͻ�������"+ar[i] );
		}
	}


}
