
public class Day {
	
	private int year;
	private int month;
	private int date;
	
	// 5개 생성자 오버로딩
	public Day() {
		set(1, 1, 1);
	}
	
	public Day(int year) {
		set(year, 1, 1);
	}
	
	public Day(int year, int month) {
		set(year, month, 1);
	}
	
	public Day(int year, int month, int date) {
		set(year, month, date);
	}
	
	public Day(Day d) {	// 복사 생성자
		set(d.year, d.month, d.date);
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
