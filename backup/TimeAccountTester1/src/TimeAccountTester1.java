
public class TimeAccountTester1 {
	
	public static void main(String[] args) {
		Account chulsoo = new Account("ö��", "123456", 1000);
		TimeAccount younghee = new TimeAccount("����", "654321", 200, 500);
		
		Account x;
		x = chulsoo;
		x = younghee;
		
		System.out.println("x�� �����ܰ� : " + x.getBalance());
		
		TimeAccount y;
		//y = chulsoo;
		y = younghee;
		
		System.out.println("y�� �����ܰ� : " + y.getBalance());
		System.out.println("y�� ���⿹���ܰ� : " + y.getTimeBalance());
	}

}
