import java.util.Random;

public class LuckyNo02 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		boolean lucky1 = rand.nextBoolean();
		double lucky2 = rand.nextDouble();
		
		System.out.println("青款狼 荐 1 : " + lucky1);
		System.out.println("青款狼 荐 2 : " + lucky2);
		
	}

}
