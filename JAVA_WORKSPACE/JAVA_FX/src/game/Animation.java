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

	//ȸ�� �ִϸ��̼� �����ؼ� ��ü��ȯ
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
	 * @param cycleTime �ѻ���Ŭ�� ���ư��� �ð��� �ǹ��Ѵ� �������� �ִϸ��̼� �ӵ��� �������� �������� ��������
	 * @param count ����Ŭ�� ���ư��� Ƚ���� �ǹ��Ѵ� �ִϸ��̼� �� ���ӽð��� cycleTime * count�� ���Ҽ� �մ�
	 * @param n ���������̼� Ÿ���� �������ش�
	 * @param reverse ����Ŭ�� ������ �ٽ� �ݴ�� ���ư��°��� true or false �� �������ش�
	 * @param path �ִϸ��̼��� ������ ���Ŭ�����̴�
	 * @param obj �ִϸ��̼��� ������ ��ü�̴�
	 * @return �ִϸ��̼ǽ��ఴü�� ��ȯ�Ѵ�.
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
	
	/**�迭�� �޾Ƽ� �н� ��ȯ�ϴ� �Լ�
	 * �迭�� ù��°���� �������� �ǹ��Ѵ�
	 * �ι��������ķδ� �������� �ǹ��Ѵ�.
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
