
public class MagicSquare01 {
	
	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int i=0, j=2;
		
		// ������ ���� �κ�
		for(int k=1; k<=25; k++) {
			a[i][j] = k;
			
			if(k%5 == 0) {
				i++;
				if(i == 5) {
					i = 0;
				}
			} else {
				i--;
				if(i == -1) {
					i = 4;
				}
				j++;
				if(j == 5) {
					j = 0;
				}
			}
		}
		
		// ������ ��� �κ�
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
		
	}

}
