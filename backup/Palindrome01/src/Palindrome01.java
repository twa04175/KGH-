import java.util.Scanner;

public class Palindrome01 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String s = stdIn.nextLine();
		boolean isPalindrome = true;
		
		for(int i=0; i<s.length()/2; i++) {			
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome == true) {
			System.out.println(s + "는 회문입니다.");
		} else {
			System.out.println(s + "는 회문이 아닙니다.");
		}
		
		stdIn.close();
	}

}
