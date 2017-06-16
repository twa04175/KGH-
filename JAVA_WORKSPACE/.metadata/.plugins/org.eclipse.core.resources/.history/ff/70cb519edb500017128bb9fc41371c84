import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("d:\\temp\\test01.txt");
			
			int c;
			while((c=fin.read()) != -1) {
				System.out.print((char)c);
			}
					
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
