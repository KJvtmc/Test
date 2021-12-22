package it.akademija.users;

public class UserFromService {
	
	private String userName;
	private String firstName;
	private String lastName;

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public UserFromService(String userName) {
		super();
		this.userName = userName;
	}

	public UserFromService(String userName, String firstName, String lastName) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
