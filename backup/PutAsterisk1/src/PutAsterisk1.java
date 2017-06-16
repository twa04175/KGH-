import java.util.Scanner;

public class PutAsterisk1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("割 俺狼 *甫 钎矫钦聪鳖? : ");
		int n = stdIn.nextInt();
		
		// 1锅 规过
		System.out.print("1锅 规过 : ");
		int i = 0;
		while(i < n) {
			System.out.print('*');
			i++;
		}
		System.out.println();
		
		// 2锅 规过
		System.out.print("2锅 规过 : ");
		i = 0;
		while(i < n) {
			System.out.print('*');
			i++;
		}
		System.out.println();
		
		// 3锅 规过
		System.out.print("3锅 规过 : ");
//		while(n > 0) {
//			System.out.print('*');
//			n--;
//		}
		
//		while(n-- > 0)
//			System.out.print('*');
		
		System.out.println();
		
		// 4锅 规过
		System.out.print("4锅 规过 : ");
//		while(n > 0) {
//			System.out.print('*');
//			--n;
//		}
		
		System.out.println();
		while(--n >= 0) {
//			System.out.print(n + " ");
			System.out.print('*');
//			System.out.println();
		}
		
		System.out.println();
				
		stdIn.close();
	}

}
