import java.util.Scanner;

public class CarTester03 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("자동차의 데이터를 입력하시오.");
		System.out.print("이름은 : ");
		String name = stdIn.nextLine();
		System.out.print("너비는 : ");
		int width = stdIn.nextInt();
		System.out.print("길이는 : ");
		int height = stdIn.nextInt();
		System.out.print("높이는 : ");
		int length = stdIn.nextInt();
		System.out.print("연료량은 : ");
		double fuel = stdIn.nextDouble();
		
		System.out.print("구입연도 : ");
		int y = stdIn.nextInt();
		System.out.print("구입월 : ");
		int m = stdIn.nextInt();
		System.out.print("구입일 : ");
		int d = stdIn.nextInt();
		
		Car car2 = new Car(name, width, height, length, fuel, new Day(y, m, d));
		
		car2.putSpec();
		
		System.out.println(car2.getPurchaseDay());
	}

}
