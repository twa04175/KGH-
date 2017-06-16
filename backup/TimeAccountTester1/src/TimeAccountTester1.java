
public class TimeAccountTester1 {
	
	public static void main(String[] args) {
		Account chulsoo = new Account("√∂ºˆ", "123456", 1000);
		TimeAccount younghee = new TimeAccount("øµ»Ò", "654321", 200, 500);
		
		Account x;
		x = chulsoo;
		x = younghee;
		
		System.out.println("x¿« øπ±›¿‹∞Ì : " + x.getBalance());
		
		TimeAccount y;
		//y = chulsoo;
		y = younghee;
		
		System.out.println("y¿« øπ±›¿‹∞Ì : " + y.getBalance());
		System.out.println("y¿« ¡§±‚øπ±›¿‹∞Ì : " + y.getTimeBalance());
	}

}
