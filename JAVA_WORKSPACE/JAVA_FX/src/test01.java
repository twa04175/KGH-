
public class test01 {

	int x = 0;
	public int add(int x) {
		this.x +=x;
		return x;
	}
	
	public static void main(String[] args) {
		test01 t = new test01();
		int x = t.add(3);
		System.out.println(x);
	}
}
