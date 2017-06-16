
public class FinalParameter {
	
	static int sumOf(final int x, final int y, final int z) {
		//x = 10;
		return x + y + z;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOf(1, 2, 3));
	}

}
