
public class IntArrayInit {
	
	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 3, 4, 5};
		
//		int[] a;
//		a = new int[]{1, 2, 3, 4, 5}; 
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
