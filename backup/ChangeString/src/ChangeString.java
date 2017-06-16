import java.util.Scanner;

public class ChangeString {
	
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "XYZ";
		
		s1 = "XYZ";
		
		System.out.println("문자열 s1 = " + s1);
		System.out.println("문자열 s2 = " + s2);
		
		System.out.println("s1과 s2는 같은 문자열 리터럴을 참조"
				+ ((s1 == s2) ? "하고 있다." : "하지 않는다."));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 a : ");
		String a = sc.nextLine();
		
		System.out.print("문자열 b : ");
		String b = sc.nextLine();
		
		System.out.println("a과 b는 같은 문자열 리터럴을 참조"
				+ ((a == b) ? "하고 있다." : "하지 않는다."));
		
		System.out.println("a과 b는 같은 문자열의 내용을 "
				+ ((a.equals(b)) ? "갖고 있다." : "가지지 않는다."));
		
	}

}
