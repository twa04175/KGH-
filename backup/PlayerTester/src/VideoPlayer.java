
public class VideoPlayer implements Player {
	
	private static int count = 0;
	
	private int id;
	
	public VideoPlayer() {
		id = ++count;
	}
	
	public void play() {
		System.out.println("�� ���� ��� ����!");
	}
	
	public void stop() {
		System.out.println("�� ���� ��� ����!");
	}
	
	public void printInfo() {
		System.out.println("�� ����� ������ȣ�� [" + id + "]�Դϴ�.");
	}

}
