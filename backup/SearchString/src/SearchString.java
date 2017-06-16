import java.util.Scanner;

public class SearchString {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("문자열 s1 : ");
		String s1 = stdIn.nextLine();
		
		System.out.print("문자열 s2 : ");
		String s2 = stdIn.nextLine();
		
		int idx = s1.indexOf(s2);
		if(idx == -1) {
			System.out.println("s1 내에 s2가 포함되지 않았습니다.");
		} else {
			System.out.println("s1의 " + (idx+1) + "번째 문자에 s2가 포함되어 있습니다.");
		}
	}

}
