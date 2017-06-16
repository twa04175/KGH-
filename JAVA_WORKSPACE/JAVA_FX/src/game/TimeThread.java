package game;

import javafx.application.Platform;
import javafx.scene.text.Text;

public class TimeThread extends Thread {
	
	private Text time;
	private FinishDTO play;
	private int sec = 0;
	private int min = 0;
	private int hour = 0;
	private String text;
	private TimeDTO timeDTO;
	
	public TimeThread(Text time, FinishDTO isPlay,TimeDTO texttime) {
		this.time = time;
		play = isPlay;
		timeDTO = texttime;
	}
	
	@Override
	public void run() {
		try {
			while(play.isPlay()) {
				sec++;
				if(sec == 60) {
					min++;
				}

				if(min == 60) {
					hour++;
				}
				
				text = String.format("%02d:%02d:%02d", hour,min,sec);
				
				Platform.runLater(()->{
					time.setText(text.toString());
				});
				
				timeDTO.setHour(hour);
				timeDTO.setMin(min);
				timeDTO.setSec(sec);
				Thread.sleep(1000);
//				System.out.println(play);
			}
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
