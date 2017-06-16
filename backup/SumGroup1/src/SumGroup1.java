import java.util.Scanner;

public class SumGroup1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수의 덧셈을 계산합니다.");
		int total = 0;
		
		Outer:
			for(int i=1; i<=10; i++) {
				System.out.println("■ 제" + i + "그룹");
				int sum = 0;
				Inner:
					for(int j=0; j<5; j++) {
						System.out.print("정수 : ");
						int t = stdIn.nextInt();
						
						if(t == 99999) {
							break Outer;
						} else if(t == 88888) {
							break Inner;
						}
						sum += t;
					}
					System.out.println("소계는 " + sum + "입니다.");
					total += sum;
			}
			System.out.println("\n합계는 " + total + "입니다.");
		
		
		stdIn.close();
	}

}
