import java.util.Scanner;

public class Season {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("계절을 표시합니다.\n몇 월입니까? : ");
		int month = stdIn.nextInt();
		
		if(month>=3 && month<=5) {
			System.out.println("이것은 봄입니다.");
		} else if(month>=6 && month<=8) {
			System.out.println("이것은 여름입니다.");
		} else if(month>=9 && month<=11) {
			System.out.println("이것은 가을입니다.");
		} else if(month==1 || month==2 || month==12) {
			System.out.println("이것은 겨울입니다.");
		} else {
			System.out.println("잘못 입력하였습니다.\n1~12 중에서 다시 입력하세요!");
		}
		
		stdIn.close();
	}

}
