
public class AccountTester01 {
	
public static void main(String[] args) {
		
		Account chulsoo = new Account("ö��", "123456", 1000);
		Account younghee = new Account("����", "654321", 200);
				
		System.out.println("�� ö���� ����");
		System.out.println("    ���¸��� : " + chulsoo.getName());
		System.out.println("    ���¹�ȣ : " + chulsoo.getNo());
		System.out.println("    �����ܰ� : " + chulsoo.getBalance());
		System.out.println("    �ĺ���ȣ : " + chulsoo.getId());
		
		System.out.println("�� ������ ����");
		System.out.println("    ���¸��� : " + younghee.getName());
		System.out.println("    ���¹�ȣ : " + younghee.getNo());
		System.out.println("    �����ܰ� : " + younghee.getBalance());
		System.out.println("    �ĺ���ȣ : " + younghee.getId());
	}

}
