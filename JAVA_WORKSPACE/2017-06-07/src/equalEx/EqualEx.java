package equalEx;

class Rect {
	int width, height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			if(((Rect)obj).width*((Rect)obj).height == width*height) {
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException e) {
			return false;
		}
	}
}

public class EqualEx {

	
}
