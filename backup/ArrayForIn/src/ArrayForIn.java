
public class ArrayForIn {
	
	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		double sum = 0.0;
		// 확장 for문
//		for(double i : a) {
//			sum += i;
//		}
		
		// 기본 for문
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		System.out.println("모든 요소의 합은  " + sum + "입니다.");
	}

}
