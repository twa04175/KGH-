
public class CarTester01 {
	
	public static void main(String[] args) {
		Day d = new Day(2010, 10, 15);
		Car myCar = new Car("마이카", 1885, 1490, 5220, 90.0, d);
		
		Day p = myCar.getPurchaseDay();
		System.out.println("마이카의 구입일 : " + p);
		
		p.set(1999, 12, 31);
		
		Day q = myCar.getPurchaseDay();
		System.out.println("마이카의 구입일 : " + q);
	}

}
