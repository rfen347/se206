package rfen347.softeng206;

public class Contact {

	private String firstName;
	private String lastName;
	private String mobile;
	private String home;
	private String work;
	private String email;
	private String address;
	private String dob;
	
	Contact(String fn, String ln, String mb, String hm, String wk, String em, String adrs, String dob){
		this.firstName = fn;
		this.lastName = ln;
		this.mobile = mb;
		this.home = hm;
		this.work = wk;
		this.email = em;
		this.address = adrs;
		this.dob = dob;
	}

	public String getFirstName() {
		//return firstName;
		return "Jack";
	}

	public String getLastName() {
		//return lastName;
		return "White";
	}

	public String getMobile() {
		//return mobile;
		return "02110299384";
	}

	public String getHome() {
		//return home;
		return "6575803";
	}

	public String getWork() {
		//return work;
		return "5675432";
	}

	public String getEmail() {
		//return email;
		return "JackWhite@hotmail.com";
	}

	public String getAddress() {
		//return address;
		return "12 Jay Rd, Auckland";
	}

	public String getDob() {
		//return dob;
		return "12/2/92";
	}
	
	
}
