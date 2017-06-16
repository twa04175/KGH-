import java.util.Scanner;

public class P139 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("1 - 파일 열기");
			System.out.println("2 - 파일 저장");
			System.out.println("3 - 파일 쓰기");
			System.out.println("4 - 파일 닫기");
			
			System.out.print("메뉴 선택(1-4) : ");
			n = stdIn.nextInt();
			
			System.out.println();
		//} while(!(n >= 1 && n <= 4));
		} while(n < 1 || n > 4); // 드모르간의 법칙
		
		switch(n) {
		case 1:
			System.out.println("파일을 열었습니다.");
			break;
		case 2:
			System.out.println("파일을 저장했습니다.");
			break;
		case 3:
			System.out.println("파일에 쓰기를 하였습니다.");
			break;
		case 4:
			System.out.println("파일을 닫았습니다.");
			break;
		}
				
		stdIn.close();
	}

}
