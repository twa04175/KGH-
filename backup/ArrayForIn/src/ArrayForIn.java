
public class ArrayForIn {
	
	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		double sum = 0.0;
		// Ȯ�� for��
//		for(double i : a) {
//			sum += i;
//		}
		
		// �⺻ for��
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		System.out.println("��� ����� ����  " + sum + "�Դϴ�.");
	}

}
