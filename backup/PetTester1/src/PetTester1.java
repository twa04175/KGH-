
public class PetTester1 {
	
	public static void main(String[] args) {
		Pet kurt = new Pet("kurt", "����");
		kurt.introduce();
		
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("R2D2", "��ũ");
		r2d2.introduce();
		
		System.out.println();
		
		Pet p = r2d2;
		p.introduce();
	}

}
