package exe3_2_5;

class Account {
	
	private static float interest = 0.002f;
	private String name;
	private float balance;
	
	public Account(String name) {
		this.name = name;
		this.balance = 0;
	}
	
	public Account(String name, float balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
	}
	
	public void interestAt() {
		balance = balance * (1 + interest);
	}
	
	public static float getInterest() {
		return interest;
	}
	
}
