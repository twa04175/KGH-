
public class PrintArray {
	
	public static void main(String[] args) {
		int[] a = new int[5];
//		System.out.println("a = " + a);
		
//		a = null;
		a = new int[10];
		a[0] = 10;
		
		for(int i : a) {
			System.out.println(i);
		}
		
//		System.out.println("a = " + a);
	}

}
