
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
	
	// ���� ���
	public void addEmployee(Employee employee) {
		int count = findEmployee(employee.getName());
		
		if(count < 0) {
			em[index++] = employee;
			System.out.printf("\n%s ���� ��ϵǾ����ϴ�.\n", employee.getName());
		} else {
			System.out.println("\n�ߺ��Ǵ� ����� �ֽ��ϴ�.");
		}
	}
	
	// ���� �˻�
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
	
	// ���� ���� üũ
	public Employee updateCheckEmployee(String name) {
		for(int i=0; i<index; i++) {
			if(em[i].getName().equals(name)) {
				return em[i];
			}
		}

		return null;
	}
	
	// ���� ����
	public void updateEmployee(Employee employee) {
		for(int i=0; i<index; i++) {
			if(em[i].getName().equals(employee.getName())) {
				em[i] = employee;
				break;
			}
		}
		
		System.out.printf("\n%s ���� �����Ǿ����ϴ�.\n", employee.getName());
	}
	
	// ���� ����
	public void removeEmployee(String name) {
		int count = findEmployee(name);
		
		if(count >= 0) {
			System.out.println();
			for(int i=count ; i<index ; i++) {
				em[i] = em[i+1];
			}
			index--;
			System.out.printf("\n%s ���� �����Ǿ����ϴ�.", name);
		} else {
			System.out.println("\n������ ����� �����ϴ�.");
		}
	}
	
	// ���� ���
	public void displayEmployee() {
		for(int i=0 ; i<index ; i++) {
			System.out.println("\n[" + i + "]");
			em[i].printAll();
		}
	}	
}