import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

class DateId {
	private static int counter; // Ŭ���� ����
	
	private int id;		// �ν��Ͻ� ����
	
	static {	// Ŭ���� �ʱ���
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);
		int m = today.get(MONTH) + 1;
		int d = today.get(DATE);
		
		System.out.printf("������ %4d�� %3d�� %2d���Դϴ�.\n", y, m, d);
		
		counter = y * 1000000 + m * 10000 + d * 100;
	}
	
	public DateId() {
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
}

public class DateIdTester {
	
	public static void main(String[] args) {
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();
		
		System.out.println("a�� �ĺ���ȣ : " + a.getId());
		System.out.println("b�� �ĺ���ȣ : " + b.getId());
		System.out.println("c�� �ĺ���ȣ : " + c.getId());
	}

}
