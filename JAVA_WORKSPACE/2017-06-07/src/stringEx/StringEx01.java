package stringEx;

public class StringEx01 {
	
	public static void main(String[] args) {
		String a = "java";
		String b = "jasa";
		
		int res = a.compareTo(b);
		
		if(res == 0) {
			System.out.println("the same");
		} else if(res < 0) {
			System.out.println(a+"<"+b);
		} else if(res > 0) {
			System.out.println(a+">"+b);
		}
		
	}

}
