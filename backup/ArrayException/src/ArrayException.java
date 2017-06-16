
public class ArrayException {
	
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 0;
		
		try {
			for(int i=0; i<intArray.length; i++) {
				intArray[i+1] = i+1+intArray[1];
				System.out.println("intArray[" + i + "] = " + intArray[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("¹è¿­ÀÇ ÀÎµ¦½º°¡ ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");
		}
		
	}

}
