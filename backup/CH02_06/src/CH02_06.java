import java.util.Scanner;

public class CH02_06 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("삼각형의 면적을 구합니다.");
		
		System.out.print("밑변 : ");
		double width = stdIn.nextDouble();
		
		System.out.print("높이 : ");
		double height = stdIn.nextDouble();
		
		double area = (width*height)/2;
		
		System.out.println("면적은 " + area + "입니다.");
		
		stdIn.close();
	}

}
