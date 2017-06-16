import java.util.Scanner;

public class LinearSearch01 {
	
	static int linearSearch(int[] a, int key) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
//		System.out.print("요소 수는? : ");
//		int num = stdIn.nextInt();
//		int[] x = new int[num];
//		
//		for(int i=0; i<num; i++) {
//			System.out.print("x[" + i + "] : ");
//			x[i] = stdIn.nextInt();
//		}
		
		System.out.print("검색할 값은? : ");
		int ky = stdIn.nextInt();
		
//		int idx = linearSearch(x, ky);
		int idx = linearSearch(new int[]{15, 25, 35, 45, 55}, ky); // 일회용 배열
		
		if(idx == -1) {
			System.out.println("이 값의 요소는 존재하지 않습니다.");
		} else {
			System.out.println("이 값은 x[" + idx + "]에 있습니다.");
		}
		
		stdIn.close();
	}

}
