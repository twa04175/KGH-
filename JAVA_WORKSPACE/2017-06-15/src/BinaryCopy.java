import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopy {

	public static void main(String[] args) {
		File src = new File("c:\\windows\\explorer.exe");
		File dst = new File("D:\\temp\\explorer.bin");
		FileInputStream fi = null;
		FileOutputStream fo = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		int c;
		
		try {
			
			long n = System.currentTimeMillis();
			fi = new FileInputStream(src);
			fo = new FileOutputStream(dst);
			in = new BufferedInputStream(fi);
			out = new BufferedOutputStream(fo);
			
			while((c = in.read()) != -1) {
				out.write((char)c);
			}
			System.out.println("복사를 완료하였습니다.");
			System.out.println(System.currentTimeMillis()-n+"ms초 경과되었습니다");
			in.close();
			out.close();
			fi.close();
			fo.close();
			
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
		
	}
}


