
public class Day {
	// 초기값 설정
	private int year = 1; 
	private int month = 1;
	private int date = 1;
	
	// 5개 생성자 오버로딩 
	// 멤버 변수의 처리(변경)을 한 곳으로 집약하기 위함 -> 프로그램의 유지보수성을 향상시킴.
	public Day() {
	}
	
	public Day(int year) {
		this.year = year; // year값의 처리는  반드시 이 생성자에서 처리
	}
	
	public Day(int year, int month) { 
		this(year);
		this.month = month; // month값의 처리는 반드시 이 생성자에서 처리
	}
	
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;	// date값의 처리는 반드시 이 생성자에서 처리
	}
	
	public Day(Day d) {	// 복사 생성자
		this(d.year, d.month, d.date);
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
		String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
		
		return String.format("%04d년 %02d월 %02d일(%s)", 
				year, month, date, wd[dayOfWeek()]);
	}

}
