/**
 * Ŭ���� VirtLine�� ���������� ��Ÿ���� Ŭ�����Դϴ�.
 * �� Ŭ������ ������ ��Ÿ���� �߻� Ŭ���� AbstLine�κ��� �Ļ��� Ŭ�����Դϴ�.
 * @author	��ġ��
 * @see		Shape
 * @see		AbstLine
*/
public class VirtLine extends AbstLine {

	/**
	 * ���������� �����ϴ� �������Դϴ�.
	 * ���̸� �μ��� �Ҵ�޽��ϴ�.
         * @param length ������ ������ ����
	*/
	
	/**
	 * 
	 * @param length
	 */
	public VirtLine(int length) { 
		super(length); 
	}

	/**
	 * �޼ҵ� toString�� ���������� ���� ���� ������ ��Ÿ���� ���ڿ��� ��ȯ�մϴ�.
	 * @return ���ڿ� "VirtLine(length:3)"�� ��ȯ�մϴ�.
	 *			  3�� ������ ���Դϴ�.
	*/
	
	/**
	 * 
	 */
	public String toString( ) {
		return "VirtLine(length:" + getLength( ) + ")"; 
	}

	/**
	 * �޼ҵ� draw�� ���������� �׸��ϴ�.
     	 * �׸���� ������ȣ '|'�� ���η� �����մϴ�.
	 * ������ ������ŭ '|'�� ǥ���ؼ� �� �ٲ��� �ϴ� ���� �ݺ��մϴ�.
	*/
	public void draw( ) {
		for (int i = 1; i <= getLength( ) ; i++)
			System.out.println('|'); 
	}
}
