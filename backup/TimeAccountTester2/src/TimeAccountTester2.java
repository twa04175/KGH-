
public class TimeAccountTester2 {
	
	static int compBalance(Account a, Account b) {
		if(a.getBalance() > b.getBalance()) {
			return 1;
		} else if(a.getBalance() < b.getBalance()) {
			return -1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Account chulsoo = new Account("ö��", "123456", 1000);
		TimeAccount younghee = new TimeAccount("����", "654321", 200, 500);
		
		switch(compBalance(chulsoo, younghee)) {
		case 0:
			System.out.println("ö���� ������ �����ܰ�� ����");
			break;
		case 1:
			System.out.println("ö�� �� �����ܰ� ����.");
			break;
		case 2:
			System.out.println("���� �� �����ܰ� ����.");
			break;
		}
	}

}
