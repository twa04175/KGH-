package Exception;

public class NumberFormatException {

	public static void main(String[] args) {
		String[] stringNumber = {"23","12","998","3.161592"};
		
		try {
			for(String i : stringNumber) {
				int j = Integer.parseInt(i);
				System.out.println("���ڷ� ��ȯ�� ���� "+j);
			}
		} catch (Exception e) {
			System.out.println("������ ��ȯ�Ҽ� �����ϴ�.");
		}
	}
}
