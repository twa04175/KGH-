
public class CDPlayer implements Player {
	
	@Override
	public void play() {
		System.out.println("□ CD 재생 시작!");
	}
	
	@Override
	public void stop() { 
		System.out.println("□ CD 재생 종료!");
	}
	
	public void cleaning() {
		System.out.println("헤드를 청소했습니다.");
	}

}
