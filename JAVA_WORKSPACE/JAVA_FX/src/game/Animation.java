package game;

import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.scene.Node;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Animation {

	//회전 애니매이션 생성해서 객체반환
	public <T extends Node> RotateTransition getAnimation(int cycleTime, int angle, int count, int n, boolean reverse, T obj) {
		
		RotateTransition rotateTransition = new RotateTransition() ; 
		rotateTransition.setDuration(Duration.millis(cycleTime) );
		rotateTransition.setByAngle(angle);
		rotateTransition.setCycleCount(count);
		rotateTransition.setAutoReverse(reverse);
		rotateTransition.setNode(obj) ;     
		
		switch(n) {
		
		case 1:	
			rotateTransition.setAxis(Rotate.X_AXIS) ;
			break;
		case 2:
			rotateTransition.setAxis(Rotate.Y_AXIS) ;
			break;
		case 3:
			rotateTransition.setAxis(Rotate.Z_AXIS) ;
			break;
			
		default:
			break;
		}
		
		return rotateTransition;
	}
	
	/**
	 * 
	 * @param cycleTime 한사이클이 돌아가는 시간을 의미한다 높을수록 애니매이션 속도가 느려지고 낮을수록 빨라진다
	 * @param count 사이클이 돌아가는 횟수를 의미한다 애니매이션 총 지속시간은 cycleTime * count로 구할수 잇다
	 * @param n 오리엔테이션 타입을 설정해준다
	 * @param reverse 사이클이 끝나고 다시 반대로 돌아가는것을 true or false 로 지정해준다
	 * @param path 애니매이션이 지나는 경로클래스이다
	 * @param obj 애니매이션을 적용할 객체이다
	 * @return 애니매이션실행객체를 반환한다.
	 */
	public <T extends Node> PathTransition getAnimation(int cycleTime,  int count,int n, boolean reverse,Path path, T obj) {
		
		PathTransition pathTransition = new PathTransition() ; 
		pathTransition.setDuration(Duration.millis(cycleTime) );
		pathTransition.setCycleCount(count);
		pathTransition.setAutoReverse(reverse);
		pathTransition.setPath(path) ;  
		pathTransition.setNode(obj) ;     
		
		switch(n) {
		case 1:	
			pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
			break;
		case 2:
			pathTransition.setOrientation(PathTransition.OrientationType.NONE);
			break;
		}
		
		return pathTransition;
	}
	
	/**배열을 받아서 패스 반환하는 함수
	 * 배열의 첫번째행은 시작점을 의미한다
	 * 두번때행이후로는 도착점을 의미한다.
	 */
	public Path returnPath(double[][] arr) {
		Path path = new Path();
		
		for(int i = 0; i<arr.length; i++) {
			if(i == 0) {
				MoveTo moveTo = new MoveTo(arr[i][0], arr[i][1]) ;   
				path.getElements() .add(moveTo); 
			} else {
				LineTo line = new LineTo(arr[i][0], arr[i][1]) ; 
				path.getElements() .add(line); 
			}
		}	
		
		return path;
	}
	
	
}
