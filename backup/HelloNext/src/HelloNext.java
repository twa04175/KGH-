import java.util.Scanner;

public class HelloNext {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("¿Ã∏ß¿∫ : ");
//		String s = stdIn.next();
		String s = stdIn.nextLine();
		
		System.out.println("æ»≥Á«œººø‰ " + s + "ææ!");
		
		stdIn.close();
	}

}
