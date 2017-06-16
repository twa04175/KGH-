
public class MngEmployee extends Employee {
	private String dept;
	private String position;
	
	public MngEmployee(String name, String id, String address, String tel, String dept, String position) {
		super(name, id, address, tel);
		setDept(dept);
		setPosition(position);
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void printAll() {
		super.printAll();
		System.out.println("근무부서 : " + getDept());
		System.out.println("직    급 : " + getPosition());
	}
}