
public class MultiTable4 {
	
	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=9) {
			int j=2;
			while(j<=9) {
				System.out.printf("%d*%d=%2d  ", j, i, j*i);
				j++;
			}
			i++;
			System.out.println();
		}
		
	}

}
