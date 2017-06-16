
public class Employee {
	private String name;
	private String id;
	private String address;
	private String tel;

	public Employee(String name, String id, String address, String tel) {
		setName(name);
		setId(id);
		setAddress(address);
		setTel(tel);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTel() {
		return tel;
	}

	public void printAll() {
		System.out.println("이    름 : " + getName());
		System.out.println("주민번호 : " + getId());
		System.out.println("주    소 : " + getAddress());
		System.out.println("전화번호 : " + getTel());
	}
}