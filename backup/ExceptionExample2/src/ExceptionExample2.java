
public class ExceptionExample2 {
	
	public static void main(String[] args) {
		int[] intArray = new int[5];
		
		try {
			intArray[3] = 10;
			intArray[6] = 5;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("�迭�� ������ �ʰ��Ͽ� �����Ͽ����ϴ�.");
		}
			
		for(int i=0; i<intArray.length; i++) {
			System.out.println("intArray[" + i + "] = " + intArray[i]);
		}
		
	}

}
