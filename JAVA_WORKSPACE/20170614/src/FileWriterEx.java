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
			
			while((c = in.read()) != -1) {//���⼭ �о�ù��ڰ������� �Է´����¿� �����Ѵ�. ctrl+z = -1 �ǹ�
				fout.write(c);//���⼭ ���Ͽ� ����.
				System.out.print((i++)+" ");//���Ͱ� �ԷµǴ� ���� while���� �۵��� 4�����Է¿� 5�� �ۼ��� �ϳ��� \n �ε�
				
			}
			System.out.println("�Է¿Ϸ�");
			in.close();
			fout.close();
			
		} catch (IOException e) {
			System.out.println("����¿���");
		}
		
	}

}