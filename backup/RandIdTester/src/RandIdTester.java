import java.util.Random;

class RandId {
	private static int counter = 0;
	
	private int id;
	
	static {
		Random rand = new Random();
		counter = rand.nextInt(10) * 100;
	}
	
	public RandId() {
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
}

public class RandIdTester {
	
	public static void main(String[] args) {
		RandId a = new RandId();
		RandId b = new RandId();
		RandId c = new RandId();
		
		
		System.out.println("a�� �ĺ���ȣ : " + a.getId());
		System.out.println("b�� �ĺ���ȣ : " + b.getId());
		System.out.println("c�� �ĺ���ȣ : " + c.getId());
	}

}
