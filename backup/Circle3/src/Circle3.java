import java.util.Scanner;
import static java.lang.Math.*;

public class Circle3 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� ������ ����մϴ�.");
		System.out.print("������ : ");
		double r = stdIn.nextDouble();
		
		System.out.println("������ " + PI * r * r);
	}

}
