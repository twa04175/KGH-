
//import java.lang.Object;

public class NumException /*extends Object*/ {
	
	public static void main(String[] args) {
		String[] stringNumber = {"23", "12", "998", "3.141592"};
		
		try {
			for(int i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			}
		} catch(NumberFormatException e) {
			System.err.println("정수로  변화할 수 없습니다.");
		} finally {
			System.out.println("정상 종료");
		}
	}

}
