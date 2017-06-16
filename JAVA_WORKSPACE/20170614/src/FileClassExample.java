import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileClassExample {
	
	public static void dir(File fd) {
		String[] filenames = fd.list();
		
		for(String s : filenames) {
			File f = new File(fd, s);
			long t = f.lastModified();
			System.out.print(s);
			System.out.print("\t파일크기 : "+f.length());
			System.out.printf("\t수정한시간: %tb %td %ta %tT\n",t,t,t,t);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cmd = null;
		
		while(!"exit".equals(cmd)) {
			System.out.print("명령어를 입력해주세요 : ");
			cmd = sc.nextLine();
			
			StringTokenizer sto = new StringTokenizer(cmd);
			
			String first = sto.nextToken();
			String second = sto.nextToken();
			
			if("cd".equals(first)) {
				File file = new File(second);
				
			} else if("pwd".equals(first)) {
				
			} else if("mkdir".equals(first)) {
				
			}
			
		}
		
		sc.close();
	}

}
