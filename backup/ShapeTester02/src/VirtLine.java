/**
 * 클래스 VirtLine은 수직직선을 나타내는 클래스입니다.
 * 이 클래스는 직선을 나타내는 추상 클래스 AbstLine로부터 파생된 클래스입니다.
 * @author	육치성
 * @see		Shape
 * @see		AbstLine
*/
public class VirtLine extends AbstLine {

	/**
	 * 수직직선을 생성하는 생성자입니다.
	 * 길이를 인수로 할당받습니다.
         * @param length 생성할 직선의 길이
	*/
	
	/**
	 * 
	 * @param length
	 */
	public VirtLine(int length) { 
		super(length); 
	}

	/**
	 * 메소드 toString은 수직직선에 관한 도형 정보를 나타내는 문자열을 반환합니다.
	 * @return 문자열 "VirtLine(length:3)"을 반환합니다.
	 *			  3은 길이의 값입니다.
	*/
	
	/**
	 * 
	 */
	public String toString( ) {
		return "VirtLine(length:" + getLength( ) + ")"; 
	}

	/**
	 * 메소드 draw는 수직직선을 그립니다.
     	 * 그리기는 종선기호 '|'을 세로로 나열합니다.
	 * 길이의 개수만큼 '|'을 표시해서 줄 바꿈을 하는 것을 반복합니다.
	*/
	public void draw( ) {
		for (int i = 1; i <= getLength( ) ; i++)
			System.out.println('|'); 
	}
}
