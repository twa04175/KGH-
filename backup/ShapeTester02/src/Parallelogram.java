//===== 평행사변형 =====//
public class Parallelogram extends Shape implements Plane2D {
	private int width;			// 밑변의 폭
	private int height;			// 높이

	public Parallelogram(int width, int height) {
		this.width = width;	
		this.height = height;
	}

	public String toString( ) {					// 문자열 표현
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}

	public void draw( ) {						// 그림 그리기
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) {
				System.out.print(' '); 
			}
			for (int j = 1; j <= width; j++) {
				System.out.print('#'); 
			}
			System.out.println(); 
		}
	}

	public int getArea() { 
		return width * height; 		// 면적을 계산한다
	}			
}
