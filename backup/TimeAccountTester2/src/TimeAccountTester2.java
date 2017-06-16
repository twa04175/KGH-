
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
		Account chulsoo = new Account("Ã¶¼ö", "123456", 1000);
		TimeAccount younghee = new TimeAccount("¿µÈñ", "654321", 200, 500);
		
		switch(compBalance(chulsoo, younghee)) {
		case 0:
			System.out.println("Ã¶¼ö¿Í ¿µÈñÀÇ ¿¹±ÝÀÜ°í´Â °°´Ù");
			break;
		case 1:
			System.out.println("Ã¶¼ö ÂÊ ¿¹±ÝÀÜ°í°¡ ¸¹´Ù.");
			break;
		case 2:
			System.out.println("¿µÈñ ÂÊ ¿¹±ÝÀÜ°í°¡ ¸¹´Ù.");
			break;
		}
	}

}
