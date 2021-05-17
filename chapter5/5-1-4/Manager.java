package exe5_1_4;

public class Manager {
	
	private Employee[] empList = {
			new Employee(111111,"Okada", "Education", "7707-1234"),
			new Employee(111112,"Ayumi", "Education", "7707-2345"),
			new Employee(111113,"Sari","Development","7707-3456"),
			new Employee(111114,"Kumi","Development","7707-4567"),
			new Employee(111115,"Rena","Promotion","7707-5678"),
			new Employee(111116,"Ono","Promotion","7707-6789")
	};
	
	public Manager() {}
	
	public Employee findEmployee(int id) throws NotFoundException {
		//int i;
		Employee target = null;
		for(Employee emp : empList) {
			if(id == emp.getId()) {
				target = emp;
				break;
			}
		}
		if (target == null) {
			throw new NotFoundException("従業員が見つかりません。");
		}
		
		return target;
	}
}
