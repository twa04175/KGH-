package Exception;

public class ExceptionExample02 {
	
	public static void main(String[] args) {
		int[] intArray = new int[5];
		
		try {
			intArray[2] = 3;
			intArray[6] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("�迭�� ������ �ʰ��Ͽ� ���ҿ� �����Ͽ����ϴ�.");
		}
		
		
		for(int i: intArray) {
			System.out.println(i);
		}
	}

}
