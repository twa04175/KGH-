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
				System.out.println("\n----- 사원관리프로그램 -----");
				System.out.println("1. 신규등록");
				System.out.println("2. 검    색");
				System.out.println("3. 수    정");
				System.out.println("4. 삭    제");
				System.out.println("5. 전체보기");
				System.out.println("6. 종    료");
				System.out.println("--------------------");
				System.out.print(">> 번호 선택 : ");
	
				int no = sc.nextInt();
				
				switch(no) {
				case 1 : registMenu(); break;
				case 2 : searchMenu(); break;
				case 3 : updateMenu(); break;
				case 4 : deleteMenu(); break;
				case 5 : me.displayEmployee(); break;
				case 6 : System.out.println("\n프로그램 종료");
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
	
	// 직원 등록
	public void registMenu() {
		System.out.println();
		System.out.println("\n----- 신규등록 메뉴 -----");
		System.out.println("1. 관리직");
		System.out.println("2. 생산직");
		System.out.println("3. 임시직");
		System.out.println("4. 아르바이트 ");
		System.out.println("5. 상위메뉴");
		System.out.println("-------------------");
		System.out.print(">> 번호 선택 : ");
		
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
	
	// 직원 중에서 관리직 등록
	public void makeManager() {
		String name, id, address, tel, dept, position;
		
		while(true) {
			System.out.print("이    름 : ");	name = sc.next();
			System.out.print("주민번호 : ");	id = sc.next();
			System.out.print("주    소 : ");	address = sc.next();
			System.out.print("전화번호 : ");	tel = sc.next();
			System.out.print("근무부서 : ");	dept = sc.next();
			System.out.print("직    급 : ");	position = sc.next();
			break;
		}
		
		MngEmployee mng = new MngEmployee(name, id, address, tel, dept, position);
		me.addEmployee(mng);
	}
	
	// 직원 중에서 생산직 등록
	public void makeProduct() {
		String name, id, address, tel, factory, work;
		
		while(true) {
			System.out.println();
			System.out.print("이    름 : ");	name = sc.next();
			System.out.print("주민번호 : ");	id = sc.next();
			System.out.print("주    소 : ");	address = sc.next();
			System.out.print("전화번호 : ");	tel = sc.next();
			System.out.print("작업공장 : ");	factory = sc.next();
			System.out.print("담당작업 : ");	work = sc.next();
			break;
		}
		
		PrtEmployee prt = new PrtEmployee(name, id, address, tel, factory, work);
		me.addEmployee(prt);
	}
	
	// 직원 중에서 계약직 등록
	public void makeTempJob() {
		String name, id, address, tel, dept, jobClass;
		
		while(true) {
			System.out.println();
			System.out.print("이    름 : ");	name = sc.next();
			System.out.print("주민번호 : ");	id = sc.next();
			System.out.print("주    소 : ");	address = sc.next();
			System.out.print("전화번호 : ");	tel = sc.next();
			System.out.print("근무부서 : ");	dept = sc.next();
			System.out.print("담당업무 : ");	jobClass = sc.next();
			break;
		}
		
		TmpEmployee tmp = new TmpEmployee(name, id, address, tel, dept, jobClass);
		me.addEmployee(tmp);
	}
	
	// 직원 중에서 아르바이트 등록
	public void makePartJob() {
		String name, id, address, tel, dept;
		
		while(true) {
			System.out.println();
			System.out.print("이    름 : ");	name = sc.next();
			System.out.print("주민번호 : ");	id = sc.next();
			System.out.print("주    소 : ");	address = sc.next();
			System.out.print("전화번호 : ");	tel = sc.next();
			System.out.print("근무부서 : ");	dept = sc.next();
			break;
		}
		
		PartJobEmployee pj = new PartJobEmployee(name, id, address, tel, dept);
		me.addEmployee(pj);
	}
	
	// 직원 정보 수정
	public void updateMenu() {
		String name, id, address, tel, dept, position, factory, work, jobClass;
		System.out.print("\n>> 수정할 이름을 입력 : ");
		name = sc.next();
		Employee em = me.updateCheckEmployee(name);
		
		if(em == null) {
			System.out.println("수정할 이름이 없습니다!!!");
			return;
		}
		
		System.out.println("\n--- 업데이트할 내용을 입력해 주세요!!! ---");
		System.out.print("주민번호 : ");	id = sc.next();
		System.out.print("주    소 : ");	address = sc.next();
		System.out.print("전화번호 : ");	tel = sc.next();
		
		if(em instanceof MngEmployee) {
			System.out.print("근무부서 : ");	dept = sc.next();
			System.out.print("직    급 : ");	position = sc.next();
			MngEmployee mng = new MngEmployee(name, id, address, tel, dept, position);
			me.updateEmployee(mng);
		} else if(em instanceof PrtEmployee) {
			System.out.print("작업공장 : ");	factory = sc.next();
			System.out.print("담당작업 : ");	work = sc.next();
			PrtEmployee prt = new PrtEmployee(name, id, address, tel, factory, work);
			me.updateEmployee(prt);
		} else if(em instanceof TmpEmployee) {
			System.out.print("근무부서 : ");	dept = sc.next();
			System.out.print("담당업무 : ");	jobClass = sc.next();
			TmpEmployee tmp = new TmpEmployee(name, id, address, tel, dept, jobClass);
			me.updateEmployee(tmp);
		} else if(em instanceof PartJobEmployee) {
			System.out.print("근무부서 : ");	dept = sc.next();
			PartJobEmployee pj = new PartJobEmployee(name, id, address, tel, dept);
			me.updateEmployee(pj);
		}
	}
	
	// 직원 검색
	public void searchMenu() {
		System.out.print("\n>> 검색할 이름을 입력 : ");
		String name = sc.next();
		int idx = me.findEmployee(name);
		
		if(idx == -1)
			System.out.println(name + "님은 등록된 직원이 아닙니다.");
	}
	
	// 직원 삭제
	public void deleteMenu() {
		System.out.print("\n>> 삭제할 이름을 입력 : ");
		String name = sc.next();
		me.removeEmployee(name);
	}
}