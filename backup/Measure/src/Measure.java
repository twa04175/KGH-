import java.util.Scanner;

public class Measure {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Á¤¼ö°ª : ");
		int n = stdIn.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
		stdIn.close();
	}

}
