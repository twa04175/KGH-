import java.util.Scanner;

public class Palindrome01 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String s = stdIn.nextLine();
		boolean isPalindrome = true;
		
		for(int i=0; i<s.length()/2; i++) {			
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome == true) {
			System.out.println(s + "�� ȸ���Դϴ�.");
		} else {
			System.out.println(s + "�� ȸ���� �ƴմϴ�.");
		}
		
		stdIn.close();
	}

}
