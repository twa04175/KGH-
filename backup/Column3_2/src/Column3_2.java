import java.util.Scanner;

public class Column3_2 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int a = stdIn.nextInt();
		
		System.out.print("정수 2 : ");
		int b = stdIn.nextInt();
		
		// 방법 1
		if(a == 1) {
			if(b == 1) {
				System.out.println("a도 1이고 b도 1입니다.");
			}
		} else {
			System.out.println("a가 1이 아닙니다.");
		}
		
		// 방법 2
		if(a == 1) {
			if(b == 1) {
				System.out.println("a도 1이고 b도 1입니다.");
			} else {
				System.out.println("a가 1이고 b는 1이 아닙니다.");
			}
		}
		
		stdIn.close();
	}

}
