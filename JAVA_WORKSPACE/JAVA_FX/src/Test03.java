
class Test03 {
	
	protected double getName() {
		return Math.E;
	}
	
	public static void getName2() {
		
	}
	
}

class Test04 extends Test03 {
	
	@Override
	public double getName() {
		return 0;
	}

}
