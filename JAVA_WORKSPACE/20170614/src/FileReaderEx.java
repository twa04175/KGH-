import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	
	public static void main(String[] args) {
		FileReader in = null;
		
		try {
			in = new FileReader("c:\\windows\\system.ini");
			
			int c;
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			in.read();
		} catch (IOException e) {
			System.err.println("입출력 오류");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Ddd");
	}

}
