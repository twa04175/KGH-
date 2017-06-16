/**
 * 클래스 Shape는 도형의 개념을 나타내는 추상 클래스입니다.
 * 추상 클래스이기 때문에 이 클래스의 인스턴스를 생성할 수는 없습니다.
 * 구체적인 도형 클래스는 이 클래스로부터 파생됩니다.
 * @author	육치성
 * @see		Object
*/
public abstract class Shape {

	/**
	 * 도형 정보를 나타내는 문자열을 반환하는 추상 메소드입니다.
	 * 클래스 Shape로부터 파생되는 클래스이고, 이 메소드의 본체를 구현합니다.
	 * 이 메소드는 java.lang.Object 클래스의 메소드를 추상 메소드로
    	 * 오버라이드한 메소드입니다.
	*/
	public abstract String toString( );

	/**
	 * 메소드 draw는 도형을 그리기 위한 추상 메소드입니다.
	 * 클래스 Shape로부터 파생된 클래스이고, 이 메소드의 본체를 구현합니다.
	*/
	public abstract void draw( );

	/**
	 * 메소드 print는 도형 정보의 표시와 도형의 그리기를 실행합니다.
	 * 구체적으로는 아래의 두 가지 과정을 순서대로 실행합니다. <BR>
	 * Step 1. 메소드 toString이 반환하는 문자열을 표시해서 줄 바꿈. <BR>
	 * Step 2. 메소드 draw을 호출한 도형의 그리기. <BR>
	*/
	public void print( ) {
		System.out.println(toString( ));
		draw( );
	}
}
