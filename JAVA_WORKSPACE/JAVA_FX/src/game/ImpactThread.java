package game;


public class ImpactThread extends Thread {
	
	private Player ball;
	private Attackball[] atb;
	private FinishDTO isPlay;
	
	public ImpactThread(Player ball, Attackball[] atb, FinishDTO isPlay) {
		this.ball = ball;
		this.atb = atb;
		this.isPlay = isPlay;
	}
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		while(isPlay.isPlay()) {
			try {
				double ballX = ball.getLayoutX();
				double ballY = ball.getLayoutY();
				System.out.println("플레이어 위치 : "+ballX+","+ballY);
				System.out.println(ball.computeAreaInScreen());
				
				
				for(int i = 0; i<atb.length; i++) {
					double atbX = atb[i].getLayoutX();
					double atbY = atb[i].getLayoutY();
					System.out.println(atb[i].computeAreaInScreen());
					System.out.println(i+"번 공위치 :"+atbX+","+atbY);
					Thread.sleep(20000);
//					if(Crash(ballX,ballY,atbX,atbY)) {// 여기서 충돌하면 false 로 만들어주면됨
						isPlay.setPlay(false);
//					}
				}
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(isPlay);
		}
	}
	
	public boolean Crash(double x1, double y1, double x2, double y2){//x1은 플레이어

		boolean check = false;// 중점 사이의 거리가 반지름 + 반지름 이하면 충돌이다!! 30 / 10

		if (Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)) < 40 ){

		check = true;//위 값이 true면 check에 true를 전달합니다.
		} else {
			check = false;
		}

		return check; //check의 값을 메소드에 리턴 시킵니다.

	 }
}
