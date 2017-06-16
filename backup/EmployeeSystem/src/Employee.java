
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
		System.out.println("��    �� : " + getName());
		System.out.println("�ֹι�ȣ : " + getId());
		System.out.println("��    �� : " + getAddress());
		System.out.println("��ȭ��ȣ : " + getTel());
	}
}