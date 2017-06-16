
public class PetInstanceOf {
	
	public static void main(String[] args) {
		
		Pet[] a = new Pet[] {
				new Pet("Kurt", "아이"),
				new RobotPet("R2D2", "루크"),
				new Pet("마이클", "영진")
		};
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] ");
			if(a[i] instanceof RobotPet) { // a[i]가 RobotPet을 참조하고 있다면
				((RobotPet)a[i]).work(2);
			} else {
				a[i].introduce();
			}
		}
	}

}
