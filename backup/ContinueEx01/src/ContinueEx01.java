
public class ContinueEx01 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			
			if(i%5 == 0) {
				//break;
				continue;
			}
			
			System.out.print(i + " ");
		}
		
	}

}
