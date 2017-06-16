package Exception;

public class NumberFormatException {

	public static void main(String[] args) {
		String[] stringNumber = {"23","12","998","3.161592"};
		
		try {
			for(String i : stringNumber) {
				int j = Integer.parseInt(i);
				System.out.println("숫자로 변환된 값은 "+j);
			}
		} catch (Exception e) {
			System.out.println("정수로 변환할수 없습니다.");
		}
	}
}
