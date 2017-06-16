/**
 * Ŭ���� Rectangle�� ���簢���� ��Ÿ���� Ŭ�����Դϴ�.
 * �� Ŭ������ ������ ��Ÿ���� �߻� Ŭ���� Shape�κ��� �Ļ��� Ŭ�����Դϴ�.
 * @author	��ġ��
 * @see		Shape
*/
public class Rectangle extends Shape implements Plane2D {

	/**
	 * ���簢���� ���� ��Ÿ���� int�� �ʵ��Դϴ�.
	*/
	private int width;

	/**
	 *	���簢���� ���̸� ��Ÿ���� int�� �ʵ��Դϴ�.
	*/
	private int height;

	/**
	 * ���簢���� �����ϴ� �������Դϴ�.
	 * ���� ���̸� �μ��� �Ҵ�޽��ϴ�.
     	 * @param width  ���簢���� ��.
     	 * @param height ���簢���� ����.
	*/
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * �޼ҵ� toString�� ���簢���� ���� ���� ������ ��Ÿ���� ���ڿ��� ��ȯ�մϴ�.
	 * @return ���ڿ� "Rectangle(width:4, height:3)"�� ��ȯ�մϴ�.
	 *			  4�� 3�� ���� ���� ������ ���Դϴ�.
	*/
	public String toString( ) {
		return "Rectangle(width:" + width + ", height:" + height + ")"; 
	}

	/**
	 * �޼ҵ� draw�� ���簢���� �׸��ϴ�.
     * �׸���� �ֽ��͸���ũ ��ȣ '*'�� �����մϴ�.
	 * ���� ������ŭ '*'�� ǥ���ϰ� �� �ٲ� �ϴ� ���� width����ŭ �ݺ��մϴ�.
	*/
	public void draw( ) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print('*'); 
			}
			System.out.println( ); 
		}
	}

	public int getArea() { 
		return width * height; 		// �۸����� ����Ѵ�
	}		
}
