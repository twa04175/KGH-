import java.util.Scanner;

public class PointSumAveArray {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int sum = 0;
		final int person = 5;
		int[] point = new int[person];
		
		System.out.println(person + "명의 점수를 입력하시오.");
		for(int i=0; i<person; i++) {
			System.out.print((i+1) + "번의 점수 : ");
			point[i] = stdIn.nextInt();
			sum += point[i];
		}
		
		System.out.println("합계는 " + sum + "점입니다.");
		System.out.println("평균은 " + (double)sum/person + "점입니다.");
		
		stdIn.close();
	}

}
