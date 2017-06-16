
public class PrtEmployee extends Employee {
	private String factory;
	private String work;
	
	public PrtEmployee(String name, String id, String address, String tel, String factory, String work) {
		super(name, id, address, tel);
		setFactory(factory);
		setWork(work);
	}
	
	public void setFactory(String factory) {
		this.factory = factory;
	}
	
	public String getFactory() {
		return factory;
	}
	
	public void setWork(String work) {
		this.work = work;
	}
	
	public String getWork() {
		return work;
	}
	
	public void printAll() {
		super.printAll();
		System.out.println("�۾����� : " + getFactory());
		System.out.println("����۾� : " + getWork());
	}
}