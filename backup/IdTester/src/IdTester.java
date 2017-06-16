
class Id {
	static int counter = 0;
	
	private int id;
	
	public Id() {
		this.id = ++counter;
	}
	
	public int getId() {
		return id;
	}
}

public class IdTester {
	
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a�� �ĺ���ȣ : " + a.getId());
		System.out.println("b�� �ĺ���ȣ : " + b.getId());
		
		System.out.println("Id.counter = " + Id.counter);
		System.out.println("a.counter = " + a.counter);
		System.out.println("b.counter = " + b.counter);
	}

}
