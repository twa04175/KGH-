
public class TmpEmployee extends Employee {
	private String dept;
	private String jobClass;
	
	public TmpEmployee(String name, String id, String address, String tel, String dept, String jobClass) {
		super(name, id, address, tel);
		setDept(dept);
		setJobClass(jobClass);
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setJobClass(String jobClass) {
		this.jobClass = jobClass;
	}
	
	public String getJobClass() {
		return jobClass;
	}
	
	public void printAll() {
		super.printAll();
		System.out.println("근무부서 : " + getDept());
		System.out.println("담당업무 : " + getJobClass());
	}
}