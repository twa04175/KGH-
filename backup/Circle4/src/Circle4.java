
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.Math.PI;

public class Circle4 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(in);
		
		out.println("���� ������ ����մϴ�.");
		out.print("������ : ");
		double r = stdIn.nextDouble();
		out.println("������  " + (PI * r * r) + "�Դϴ�.");
		
		stdIn.close();
	}

}
