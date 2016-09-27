package buddies;

public class BuddyInfo {
	
	private String name;
	private int phoneNumber;
	private String address;

	
	public BuddyInfo(String name, int phoneNumber, String address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		BuddyInfo buddy = new BuddyInfo("Griffen",2142354234,"123 somestreet");
		System.out.println("Hello " + buddy.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
