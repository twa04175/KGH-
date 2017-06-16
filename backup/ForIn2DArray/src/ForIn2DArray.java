
public class ForIn2DArray {
	
	public static void main(String[] args) {
		
		double[][] d = new double[][]{{1.0, 2.0}, {3.0, 4.0, 5.0}, {6.0, 7.0}};
		
		// 확장 for문
		for(double[] i : d) {
			for(double j : i) {
				System.out.printf("%5.1f", j);
			}
			System.out.println();
		}
		System.out.println();
		
		// 기본 for문
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				System.out.printf("%5.1f", d[i][j]);
			}
			System.out.println();
		}
	}

}
