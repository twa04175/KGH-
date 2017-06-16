import java.util.Scanner;


public class EmployeeSystem {	
	Scanner sc = new Scanner(System.in);
	ManagerEmployee me;
	
	public EmployeeSystem() {
		me = new ManagerEmployee(100);
	}
	
	public static void main(String [] args) {
//		EmployeeSystem ms = new EmployeeSystem();
//		ms.startMenu();
		new EmployeeSystem().startMenu();
	}
	
	public void startMenu() {
		while(true) {
			try {
				System.out.println("\n----- ����������α׷� -----");
				System.out.println("1. �űԵ��");
				System.out.println("2. ��    ��");
				System.out.println("3. ��    ��");
				System.out.println("4. ��    ��");
				System.out.println("5. ��ü����");
				System.out.println("6. ��    ��");
				System.out.println("--------------------");
				System.out.print(">> ��ȣ ���� : ");
	
				int no = sc.nextInt();
				
				switch(no) {
				case 1 : registMenu(); break;
				case 2 : searchMenu(); break;
				case 3 : updateMenu(); break;
				case 4 : deleteMenu(); break;
				case 5 : me.displayEmployee(); break;
				case 6 : System.out.println("\n���α׷� ����");
					System.exit(0);
					break;
				default : return;
				}
			} catch(Exception e) {
				System.out.println("Message : " + e.getMessage());
				e.getStackTrace();
			}
		}
	}
	
	// ���� ���
	public void registMenu() {
		System.out.println();
		System.out.println("\n----- �űԵ�� �޴� -----");
		System.out.println("1. ������");
		System.out.println("2. ������");
		System.out.println("3. �ӽ���");
		System.out.println("4. �Ƹ�����Ʈ ");
		System.out.println("5. �����޴�");
		System.out.println("-------------------");
		System.out.print(">> ��ȣ ���� : ");
		
		int no = sc.nextInt();
		
		switch(no) {
		case 1 : makeManager(); break;
		case 2 : makeProduct(); break;
		case 3 : makeTempJob(); break;
		case 4 : makePartJob(); break;
		case 5 : 
		default : return;
		}
	}
	
	// ���� �߿��� ������ ���
	public void makeManager() {
		String name, id, address, tel, dept, position;
		
		while(true) {
			System.out.print("��    �� : ");	name = sc.next();
			System.out.print("�ֹι�ȣ : ");	id = sc.next();
			System.out.print("��    �� : ");	address = sc.next();
			System.out.print("��ȭ��ȣ : ");	tel = sc.next();
			System.out.print("�ٹ��μ� : ");	dept = sc.next();
			System.out.print("��    �� : ");	position = sc.next();
			break;
		}
		
		MngEmployee mng = new MngEmployee(name, id, address, tel, dept, position);
		me.addEmployee(mng);
	}
	
	// ���� �߿��� ������ ���
	public void makeProduct() {
		String name, id, address, tel, factory, work;
		
		while(true) {
			System.out.println();
			System.out.print("��    �� : ");	name = sc.next();
			System.out.print("�ֹι�ȣ : ");	id = sc.next();
			System.out.print("��    �� : ");	address = sc.next();
			System.out.print("��ȭ��ȣ : ");	tel = sc.next();
			System.out.print("�۾����� : ");	factory = sc.next();
			System.out.print("����۾� : ");	work = sc.next();
			break;
		}
		
		PrtEmployee prt = new PrtEmployee(name, id, address, tel, factory, work);
		me.addEmployee(prt);
	}
	
	// ���� �߿��� ����� ���
	public void makeTempJob() {
		String name, id, address, tel, dept, jobClass;
		
		while(true) {
			System.out.println();
			System.out.print("��    �� : ");	name = sc.next();
			System.out.print("�ֹι�ȣ : ");	id = sc.next();
			System.out.print("��    �� : ");	address = sc.next();
			System.out.print("��ȭ��ȣ : ");	tel = sc.next();
			System.out.print("�ٹ��μ� : ");	dept = sc.next();
			System.out.print("������ : ");	jobClass = sc.next();
			break;
		}
		
		TmpEmployee tmp = new TmpEmployee(name, id, address, tel, dept, jobClass);
		me.addEmployee(tmp);
	}
	
	// ���� �߿��� �Ƹ�����Ʈ ���
	public void makePartJob() {
		String name, id, address, tel, dept;
		
		while(true) {
			System.out.println();
			System.out.print("��    �� : ");	name = sc.next();
			System.out.print("�ֹι�ȣ : ");	id = sc.next();
			System.out.print("��    �� : ");	address = sc.next();
			System.out.print("��ȭ��ȣ : ");	tel = sc.next();
			System.out.print("�ٹ��μ� : ");	dept = sc.next();
			break;
		}
		
		PartJobEmployee pj = new PartJobEmployee(name, id, address, tel, dept);
		me.addEmployee(pj);
	}
	
	// ���� ���� ����
	public void updateMenu() {
		String name, id, address, tel, dept, position, factory, work, jobClass;
		System.out.print("\n>> ������ �̸��� �Է� : ");
		name = sc.next();
		Employee em = me.updateCheckEmployee(name);
		
		if(em == null) {
			System.out.println("������ �̸��� �����ϴ�!!!");
			return;
		}
		
		System.out.println("\n--- ������Ʈ�� ������ �Է��� �ּ���!!! ---");
		System.out.print("�ֹι�ȣ : ");	id = sc.next();
		System.out.print("��    �� : ");	address = sc.next();
		System.out.print("��ȭ��ȣ : ");	tel = sc.next();
		
		if(em instanceof MngEmployee) {
			System.out.print("�ٹ��μ� : ");	dept = sc.next();
			System.out.print("��    �� : ");	position = sc.next();
			MngEmployee mng = new MngEmployee(name, id, address, tel, dept, position);
			me.updateEmployee(mng);
		} else if(em instanceof PrtEmployee) {
			System.out.print("�۾����� : ");	factory = sc.next();
			System.out.print("����۾� : ");	work = sc.next();
			PrtEmployee prt = new PrtEmployee(name, id, address, tel, factory, work);
			me.updateEmployee(prt);
		} else if(em instanceof TmpEmployee) {
			System.out.print("�ٹ��μ� : ");	dept = sc.next();
			System.out.print("������ : ");	jobClass = sc.next();
			TmpEmployee tmp = new TmpEmployee(name, id, address, tel, dept, jobClass);
			me.updateEmployee(tmp);
		} else if(em instanceof PartJobEmployee) {
			System.out.print("�ٹ��μ� : ");	dept = sc.next();
			PartJobEmployee pj = new PartJobEmployee(name, id, address, tel, dept);
			me.updateEmployee(pj);
		}
	}
	
	// ���� �˻�
	public void searchMenu() {
		System.out.print("\n>> �˻��� �̸��� �Է� : ");
		String name = sc.next();
		int idx = me.findEmployee(name);
		
		if(idx == -1)
			System.out.println(name + "���� ��ϵ� ������ �ƴմϴ�.");
	}
	
	// ���� ����
	public void deleteMenu() {
		System.out.print("\n>> ������ �̸��� �Է� : ");
		String name = sc.next();
		me.removeEmployee(name);
	}
}