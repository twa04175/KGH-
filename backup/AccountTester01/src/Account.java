
public class Account {
	// Ŭ���� ���� (���� �ʵ�), static field
	private static int counter = 0; 	
	
	// �ν��Ͻ� ���� (������ �ʵ�), non-static field
	private String name;
	private String no;
	private long balance;
	private int id;		// �ν��Ͻ��� �ĺ���ȣ (�ѹ���)
	
	public Account(String name, String no, long balance) {	// ������
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.id = ++counter;
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
	
	public int getId() {
		return id;
	}
	
	public void deposit(long k) {	// ����
		balance += k;
	}
	
	public void withdraw(long k) {	// ����
		balance -= k;
	}
}