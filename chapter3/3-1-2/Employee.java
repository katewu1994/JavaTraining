package exe3_1_2;

class Employee {
	
	private int id;        //id
	private String name;   //name
	private String section;  //name
	private String phone;   //phone
	
	//値idの設定
	public void setId(int pId) {
		id = pId;
	}
	
	//値nameの設定
	public void setName(String pName) {
		name = pName;
	}
	
	//値sectionの設定
	public void setSection(String pSection) {
		section = pSection;
	}
	
	//値phoneの設定
	public void setPhone(String pPhone) {
		phone = pPhone;
	}
	
	//idの取得
	public int getId() {
		return id;
	}
	
	//nameの取得
	public String getName() {
		return name;
	}
	
	//sectionの取得
	public String getSection() {
		return section;
	}
	
	//phoneの取得
	public String getPhone() {
		return phone;
	}
	
	//表示メソッド
	public void print() {
		System.out.println("ID:" + id);
		System.out.println("NAME:" + name);
		System.out.println("SECTION:" + section);
		System.out.println("PHONE:" + phone);
	}
	
}
