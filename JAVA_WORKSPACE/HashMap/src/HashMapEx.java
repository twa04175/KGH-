import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class HashMapEx {
	
	public static void main(String[] args) {
		HashMap<String,String> dic = new HashMap<String,String>();
		
		String[] Key = new String[]{"baby","love","apple"};
		String[] Value = new String[]{"아기","사랑","사과"};
		
		for(int i = 0; i<Key.length; i++) {
			dic.put(Key[i], Value[i]);
		}
		
		Set<String> keys = dic.keySet();
		Stream<String> st = keys.stream();
		
		st.forEach(key->{
			System.out.println("("+key+","+dic.get(key)+")");
		});
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
			System.out.print("찾고 싶은 단어는 ㅇ? :");
			System.out.println(dic.get(sc.nextLine()));
		}
		
		sc.close();
	}

}
