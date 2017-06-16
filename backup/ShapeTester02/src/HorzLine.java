/**
 * Ŭ���� HorzLine�� ���������� ��Ÿ���� Ŭ�����Դϴ�.
 * �� Ŭ������ ������ ��Ÿ���� �߻� Ŭ���� AbstLine���κ��� �Ļ��� Ŭ�����Դϴ�.
 * @author	��ġ��
 * @see		Shape
 * @see		AbstLine
*/
public class HorzLine extends AbstLine {

	/**
	 * ���������� �����ϴ� Ŭ�����Դϴ�.
	 * ���̸� �μ��� ���޹޽��ϴ�.
         * @param length ������ ������ ����
	*/
	public HorzLine(int length) { 
		super(length); 
	}

	/**
	 * �޼ҵ� toString�� ���������� ���� ���� ������ ��Ÿ���� ���ڿ��� ��ȯ�մϴ�.
	 * @return ���ڿ� "HorzLine(length:3)"�� ��ȯ�մϴ�.
	 *			  3�� ������ ���Դϴ�.
	*/
	public String toString( ) {
		return "HorzLine(length:" + getLength( ) + ")"; 
	}

	/**
	 * �޼ҵ� draw�� ���������� �׸��ϴ�.
     	 * �׸���� ���̳ʽ� ��ȣ '-'�� ���η� �����մϴ�.
	 * ������ ������ŭ '-'�� ���� ǥ���ϰ� �� �ٲ��� �մϴ�.
	*/
	public void draw( ) {
		for (int i = 1; i <= getLength( ) ; i++)
			System.out.print('-'); 
		System.out.println( ); 
	}
}
