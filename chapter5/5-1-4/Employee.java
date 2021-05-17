package exe5_1_4;

public class Employee {
	
	private int id;
	private String name;
	private String section;
	private String phone;
	
	public Employee(int id, String name, String section, String phone) {
		this.id = id;
		this.name = name;
		this.section = section;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}
	
	public void print() {
		System.out.println("ID: " + id);
		System.out.println("NAME: " + name);
		System.out.println("SECTION: " + section);
		System.out.println("PHONE: " + phone);
	}
}
