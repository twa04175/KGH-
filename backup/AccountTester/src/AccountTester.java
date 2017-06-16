
class Account {
	private String name;
	private String no;
	private long balance;
	
	Account(String n, String num, long z) {	// »ı¼ºÀÚ
		name = n;
		no = num;
		balance = z;
	}
	
	String getName() {
		return name;
	}
	
	String getNo() {
		return no;
	}
	
	long getBalance() {
		return balance;
	}
	
	void deposit(long k) {	// ¿¹±İ
		balance += k;
	}
	
	void withdraw(long k) {	// ÀÎÃâ
		balance -= k;
	}
}

public class AccountTester {
	
	public static void main(String[] args) {
		
		Account chulsoo = new Account("Ã¶¼ö", "123456", 1000);
		Account younghee = new Account("¿µÈñ", "654321", 200);
		
		chulsoo.withdraw(200);
		younghee.deposit(100);
				
		System.out.println("¡á Ã¶¼öÀÇ °èÁÂ");
		System.out.println("    °èÁÂ¸íÀÇ : " + chulsoo.getName());
		System.out.println("    °èÁÂ¹øÈ£ : " + chulsoo.getNo());
		System.out.println("    ¿¹±İÀÜ°í : " + chulsoo.getBalance());
		
		System.out.println("¡á ¿µÈñÀÇ °èÁÂ");
		System.out.println("    °èÁÂ¸íÀÇ : " + younghee.getName());
		System.out.println("    °èÁÂ¹øÈ£ : " + younghee.getNo());
		System.out.println("    ¿¹±İÀÜ°í : " + younghee.getBalance());
	}
}
