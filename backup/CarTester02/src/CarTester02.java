
public class CarTester02 {
	
	public static void main(String[] args) {
		
//		Car myCar = new Car("����ī", 1885, 1490, 5220, 90.0, new Day(2000, 11, 18));
//		
//		myCar.putSpec();
//		
//		System.out.println("������ : " + myCar.getPurchaseDay());
		
		Day d = new Day(2000, 11, 18);
		Car myCar = new Car("����ī", 1885, 1490, 5220, 90.0, d);
		
		myCar.putSpec();
		
		Day p = myCar.getPurchaseDay();		
		System.out.println("������ : " + p.toString());
	}

}
