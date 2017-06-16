package Exception;

public class ExceptionExample02 {
	
	public static void main(String[] args) {
		int[] intArray = new int[5];
		
		try {
			intArray[2] = 3;
			intArray[6] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열의 범위를 초과하여 원소에 접근하였습니다.");
		}
		
		
		for(int i: intArray) {
			System.out.println(i);
		}
	}

}
