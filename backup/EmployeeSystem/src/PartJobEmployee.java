
public class PartJobEmployee extends Employee {	
	private String dept;
	
	public PartJobEmployee(String name, String id, String address, String tel, String dept) {
		super(name, id, address, tel);
		setDept(dept);
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void printAll() {
		super.printAll();
		System.out.println("근무부서 : " + getDept());
	}
}