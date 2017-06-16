
class Member { 
	
	private String name;
	private int no;
	private int age;
	
	Member(String name, int no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	void print() {
		System.out.println("No. " + no + " : " + name + "(" + age + "¼¼)");
	}
	
}

public class MemberTester {
	
	public static void main(String[] args) {
		
		Member youngjin = new Member("¿µÁø", 1357, 25);
		Member captain6 = new Member("Ä¸Æ¾6", 613, 32);
		
		youngjin.print();
		captain6.print();
	}

}
