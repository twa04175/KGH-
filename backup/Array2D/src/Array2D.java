import java.util.Random;
import java.util.Scanner;

public class Array2D {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("행수 : ");
		int h = stdIn.nextInt();
		
		System.out.print("열수 : ");
		int w = stdIn.nextInt();
		
		int[][] x = new int[h][w];
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				x[i][j] = rand.nextInt(100);
				System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
			}
		}
		
		stdIn.close();
	}

}
