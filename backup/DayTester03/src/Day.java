
public class Day {
	// �ʱⰪ ����
	private int year = 1; 
	private int month = 1;
	private int date = 1;
	
	// 5�� ������ �����ε� 
	// ��� ������ ó��(����)�� �� ������ �����ϱ� ���� -> ���α׷��� ������������ ����Ŵ.
	public Day() {
	}
	
	public Day(int year) {
		this.year = year; // year���� ó����  �ݵ�� �� �����ڿ��� ó��
	}
	
	public Day(int year, int month) { 
		this(year);
		this.month = month; // month���� ó���� �ݵ�� �� �����ڿ��� ó��
	}
	
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;	// date���� ó���� �ݵ�� �� �����ڿ��� ó��
	}
	
	public Day(Day d) {	// ���� ������
		this(d.year, d.month, d.date);
	}
	
	// ������ ����ϴ� Ŭ���� �޼ҵ� (���� �޼ҵ�)
	public static boolean isLeap(int y) {
		return y%4==0 && y%100!=0 || y%400==0;
	}
	
	// ������ ����ϴ� �ν��Ͻ� �޼ҵ� (������ �޼ҵ�)
	public boolean isLeap() {
		//return year%4==0 && year%100!=0 || year%400==0;
		return isLeap(year);
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDate() {
		return date;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if(m==1 || m==2) {
			y--;
			m += 12;
		}
		return (y + y/4 - y/100 + y/400 + (13*m+8)/5 + date) % 7;
	}
	
	public boolean equalTo(Day d) {
		return this.year == d.year 
				&& this.month == d.month 
				&& this.date == d.date;
	}
	
	public String toString() {
		String[] wd = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		return String.format("%04d�� %02d�� %02d��(%s)", 
				year, month, date, wd[dayOfWeek()]);
	}

}
