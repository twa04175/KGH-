
public class PetInstanceOf {
	
	public static void main(String[] args) {
		
		Pet[] a = new Pet[] {
				new Pet("Kurt", "����"),
				new RobotPet("R2D2", "��ũ"),
				new Pet("����Ŭ", "����")
		};
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] ");
			if(a[i] instanceof RobotPet) { // a[i]�� RobotPet�� �����ϰ� �ִٸ�
				((RobotPet)a[i]).work(2);
			} else {
				a[i].introduce();
			}
		}
	}

}
