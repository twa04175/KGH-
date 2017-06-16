import java.util.Scanner;

public class FingerFlashing1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("손을 선택하시오. (0-가위 / 1-바위 / 2-보) : ");
		int hand = stdIn.nextInt();
		
		// if문으로 처리
/*		if(hand == 0) {
			System.out.println("가위");
		} else if(hand == 1) {
			System.out.println("바위");
		} else if(hand == 2) {
			System.out.println("보");
		} else {
			System.out.println("잘못 입력하셨습니다.\n다시 실행해 주세요.");
		}
			*/
		
		// switch문으로 처리
		switch(hand) {
		case 0:	
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		default:
			System.out.println("잘못 입력하였습니다.\n다시 실행해 주세요.");
			break;
		}
		
		stdIn.close();
	}

}
