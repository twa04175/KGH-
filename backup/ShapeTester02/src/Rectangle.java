/**
 * 클래스 Rectangle은 직사각형을 나타내는 클래스입니다.
 * 이 클래스는 도형을 나타내는 추상 클래스 Shape로부터 파생된 클래스입니다.
 * @author	육치성
 * @see		Shape
*/
public class Rectangle extends Shape implements Plane2D {

	/**
	 * 직사각형의 폭을 나타내는 int형 필드입니다.
	*/
	private int width;

	/**
	 *	직사각형의 높이를 나타내는 int형 필드입니다.
	*/
	private int height;

	/**
	 * 직사각형을 생성하는 생성자입니다.
	 * 폭과 높이를 인수로 할당받습니다.
     	 * @param width  직사각형의 폭.
     	 * @param height 직사각형의 높이.
	*/
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * 메소드 toString은 직사각형에 관한 도형 정보를 나타내는 문자열을 반환합니다.
	 * @return 문자열 "Rectangle(width:4, height:3)"을 반환합니다.
	 *			  4와 3은 각각 폭과 높이의 값입니다.
	*/
	public String toString( ) {
		return "Rectangle(width:" + width + ", height:" + height + ")"; 
	}

	/**
	 * 메소드 draw는 직사각형을 그립니다.
     * 그리기는 애스터리스크 기호 '*'을 나열합니다.
	 * 폭의 개수만큼 '*'을 표시하고 줄 바꿈 하는 것을 width번만큼 반복합니다.
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
		return width * height; 		// ○면적을 계산한다
	}		
}
