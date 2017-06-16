/**
 * 클래스 HorzLine는 수평직선을 나타내는 클래스입니다.
 * 이 클래스는 직선을 나타내는 추상 클래스 AbstLine으로부터 파생된 클래스입니다.
 * @author	육치성
 * @see		Shape
 * @see		AbstLine
*/
public class HorzLine extends AbstLine {

	/**
	 * 수평직선을 생성하는 클래스입니다.
	 * 길이를 인수로 전달받습니다.
         * @param length 생성할 직선의 길이
	*/
	public HorzLine(int length) { 
		super(length); 
	}

	/**
	 * 메소드 toString은 수평직선에 관한 도형 정보를 나타내는 문자열을 반환합니다.
	 * @return 문자열 "HorzLine(length:3)"을 반환합니다.
	 *			  3은 길이의 값입니다.
	*/
	public String toString( ) {
		return "HorzLine(length:" + getLength( ) + ")"; 
	}

	/**
	 * 메소드 draw는 수평직선을 그립니다.
     	 * 그리기는 마이너스 기호 '-'을 가로로 나열합니다.
	 * 길이의 개수만큼 '-'을 연속 표시하고 줄 바꿈을 합니다.
	*/
	public void draw( ) {
		for (int i = 1; i <= getLength( ) ; i++)
			System.out.print('-'); 
		System.out.println( ); 
	}
}
