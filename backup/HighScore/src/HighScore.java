import java.util.Scanner;

public class HighScore {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int person = 5;
		int[] point = new int[person];
		
		System.out.println(person + "명의 점수를 입력하시오.");
		for(int i=0; i<person; i++) {
			System.out.print((i+1) + "번 점수 : ");
			point[i] = stdIn.nextInt();
		}
		
		int max = point[0];
		for(int i=1; i<point.length; i++) {
			if(point[i] > max) {
				max = point[i];
			}
		}
		
		System.out.println("최고 점수는  " + max + "입니다.");
		
		stdIn.close();
	}

}
