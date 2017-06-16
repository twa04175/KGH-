
public class DoWhileEx01 {
	
	public static void main(String[] args) {
		// 1 ~ 10까지
/*		int n = 1;
		
		do {
			System.out.println(n);
			n++;
		} while(n <= 10);*/
		
		// 10 ~ 1까지
		int n = 10;  // 초기값
		
		do {
			System.out.println(n);
			n--; // 증감값
		} while(n >= 1); // 조건
	}

}
