
public class ManagerEmployee {
	
	Employee [] em;
	int index;
	int find_idx;
	
	public ManagerEmployee() {
		this(100);
	}
	
	public ManagerEmployee(int size) {
		em = new Employee[size];
	}
	
	// 직원 등록
	public void addEmployee(Employee employee) {
		int count = findEmployee(employee.getName());
		
		if(count < 0) {
			em[index++] = employee;
			System.out.printf("\n%s 님이 등록되었습니다.\n", employee.getName());
		} else {
			System.out.println("\n중복되는 사람이 있습니다.");
		}
	}
	
	// 직원 검색
	public int findEmployee(String name) {
		boolean check = false;
		
		for(int i=0 ; i<index ; i++) {
			System.out.println();
			if(em[i].getName().equals(name)) {
				em[i].printAll();
				check = true;
				find_idx = i;
				break;
			}
		}
		
		if(!check) {
			find_idx = -1;
		}
		
		return find_idx;
	}
	
	// 직원 수정 체크
	public Employee updateCheckEmployee(String name) {
		for(int i=0; i<index; i++) {
			if(em[i].getName().equals(name)) {
				return em[i];
			}
		}

		return null;
	}
	
	// 직원 수정
	public void updateEmployee(Employee employee) {
		for(int i=0; i<index; i++) {
			if(em[i].getName().equals(employee.getName())) {
				em[i] = employee;
				break;
			}
		}
		
		System.out.printf("\n%s 님이 수정되었습니다.\n", employee.getName());
	}
	
	// 직원 삭제
	public void removeEmployee(String name) {
		int count = findEmployee(name);
		
		if(count >= 0) {
			System.out.println();
			for(int i=count ; i<index ; i++) {
				em[i] = em[i+1];
			}
			index--;
			System.out.printf("\n%s 님이 삭제되었습니다.", name);
		} else {
			System.out.println("\n삭제할 사람이 없습니다.");
		}
	}
	
	// 직원 출력
	public void displayEmployee() {
		for(int i=0 ; i<index ; i++) {
			System.out.println("\n[" + i + "]");
			em[i].printAll();
		}
	}	
}