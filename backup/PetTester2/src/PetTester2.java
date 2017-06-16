
public class PetTester2 {
	
	static void intro(Pet p) {
		p.introduce();
	}
	
	public static void main(String[] args) {
		Pet[] a = new Pet[] {
				new Pet("Kurt", "¾ÆÀÌ"),
				new RobotPet("R2D2", "·çÅ©"),
				new Pet("¸¶ÀÌÅ¬", "¿µÁø"),
				//new RobotPet("ºÀºÀ", "Ä¸Æ¾6")
		};
		
		for(Pet p : a) {
			intro(p);
			System.out.println(p.toString());
			System.out.println();
		}
	}

}
