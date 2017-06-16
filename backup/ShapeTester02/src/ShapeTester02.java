public class ShapeTester02 {

	public static void main(String[ ] args) {
		Shape[ ] p = new Shape[5];

		p[0] = new Point( );			// 점
		p[1] = new HorzLine(5);			// 수평직선
		p[2] = new VirtLine(3);			// 수직직선
		p[3] = new Rectangle(4, 3);		// 직사각형
		p[4] = new Parallelogram(7, 3);		// 평행사변형
		for (Shape s : p) {
			s.print( );
			if(s instanceof Plane2D) {
				System.out.println("Area : " + ((Plane2D)s).getArea());
			}
			System.out.println( );
		}
	}
}
