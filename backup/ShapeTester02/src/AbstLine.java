/**
 * Ŭ���� AbstLine�� ������ ��Ÿ���� �߻� Ŭ�����Դϴ�.
 * �� Ŭ������ ������ ��Ÿ���� �߻� Ŭ���� Shape�κ��� �Ļ��� Ŭ�����Դϴ�.
 * �߻� Ŭ�����̱� ������ �� Ŭ������ �ν��Ͻ��� ������ ���� �����ϴ�.
 * ��ü���� ���� Ŭ������ �� Ŭ�����κ��� �Ļ��˴ϴ�.
 * @author	��ġ��
 * @see		Shape
 * @see		HorzLine VirtLine
*/
public abstract class AbstLine extends Shape {

	/**
	 * ������ ���̸� ��Ÿ���� int�� �ʵ��Դϴ�.
	*/
	private int length;

	/**
	 * ������ �����ϴ� �������Դϴ�.
	 * ���̸� �μ��� ���޹޽��ϴ�.
     * @param length ������ ������ ����
	*/
	public AbstLine(int length) {
		setLength(length);
	}

	/**
	 * ������ ���̸� ����մϴ�.
    	 * @return ������ ����
	*/
	public int getLength( ) {
		return length;
	}

	/**
	 * ������ ���̸� �����մϴ�.
   	 * @param length ������ ������ ����
	*/
	public void setLength(int length) {
		this.length = length;
	}

}
