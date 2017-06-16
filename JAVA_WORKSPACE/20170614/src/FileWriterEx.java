import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		
		FileWriter fout = null;
	
		int c;
		int i = 0;
		try {
			fout = new FileWriter("d:\\temp\\test.txt");
			
			while((c = in.read()) != -1) {//여기서 읽어올문자가없으면 입력대기상태에 돌입한다. ctrl+z = -1 의미
				fout.write(c);//여기서 파일에 쓴다.
				System.out.print((i++)+" ");//엔터가 입력되는 순간 while문이 작동함 4문자입력에 5번 작성됨 하나는 \n 인듯
				
			}
			System.out.println("입력완료");
			in.close();
			fout.close();
			
		} catch (IOException e) {
			System.out.println("입출력오류");
		}
		
	}

}
