import java.util.Scanner;

public class For2Var {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Á¤¼ö°ª : ");
		int n = stdIn.nextInt();
		
		for(int i=1, j=n-1; i<=n; i++, j--) {
			System.out.println(i + " " + j);
		}
		
		for(int i=0; i<n; i++) {
			System.out.print("-");
		}
		
		stdIn.close();			
	}

}
