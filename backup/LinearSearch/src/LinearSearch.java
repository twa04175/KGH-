import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		final int n = 12;
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) { 
			a[i] = rand.nextInt(10);
		}
		
		System.out.print("배열 a의 모든 요소의 값\n{");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("}");
		
		System.out.print("검색할 수치 : ");
		int key = stdIn.nextInt();
		
		int i;
		for(i=0; i<n; i++) {
			if(a[i] == key) {
				break;
			}
		}
		
		//if(i < n) {
		//if(i != n) {
		if(!(i == n)) { // 드모르간의 법칙
			System.out.println("이 값은 a[" + i + "]에 있습니다.");
		} else {
			System.out.println("이 값은 없습니다.");
		}
		
		stdIn.close();
	}

}
