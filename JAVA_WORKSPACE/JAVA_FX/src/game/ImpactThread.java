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
				System.out.println("�÷��̾� ��ġ : "+ballX+","+ballY);
				System.out.println(ball.computeAreaInScreen());
				
				
				for(int i = 0; i<atb.length; i++) {
					double atbX = atb[i].getLayoutX();
					double atbY = atb[i].getLayoutY();
					System.out.println(atb[i].computeAreaInScreen());
					System.out.println(i+"�� ����ġ :"+atbX+","+atbY);
					Thread.sleep(20000);
//					if(Crash(ballX,ballY,atbX,atbY)) {// ���⼭ �浹�ϸ� false �� ������ָ��
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
	
	public boolean Crash(double x1, double y1, double x2, double y2){//x1�� �÷��̾�

		boolean check = false;// ���� ������ �Ÿ��� ������ + ������ ���ϸ� �浹�̴�!! 30 / 10

		if (Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)) < 40 ){

		check = true;//�� ���� true�� check�� true�� �����մϴ�.
		} else {
			check = false;
		}

		return check; //check�� ���� �޼ҵ忡 ���� ��ŵ�ϴ�.

	 }
}
