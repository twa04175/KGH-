
public class TimeAccount extends Account {
	
	private long timeBalance;
	
	public TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
	
	public long getTimeBalance() {
		return timeBalance;
	}
	
	public void cancel() {
		//balance += timeBalance;
		deposit(timeBalance);
		timeBalance = 0;
	}

}
