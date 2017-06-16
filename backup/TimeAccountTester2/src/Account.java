
public class Account {
	
	private String name;
	private String no;
	private long balance;

	public Account(String name, String no, long balance) {	// 생성자
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(long k) {	// 예금
		balance += k;
	}
	
	public void withdraw(long k) {	// 인출
		balance -= k;
	}
}