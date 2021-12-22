package it.akademija.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Entity
@Table(name = "klientas")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	@NotNull
	@Length(min = 1, max = 30)
	private String userName;
	@Column
	@NotNull
	@Length(min = 1, max = 30)
	private String firstName;
	@Column
	@NotNull
	@Length(min = 1, max = 30)
	private String lastName;

	
	public User() {
	}
	
	public User(String userName) {
		super();
		this.userName = userName;
	}

	public User(String userName, String firstName, String lastName) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	@Qualifier("itemUserName")
	@Autowired
	public void setUserName(String title) {
		this.userName = title;
	}

	public String getFirstName() {
		return firstName;
	}

	@Qualifier("itemFirstName")
	@Autowired
	public void setFirstName(String price) {
		this.firstName = price;
	}

	public String getLastName() {
		return lastName;
	}

	@Qualifier("itemLastName")
	@Autowired
	public void setLastName(String quantity) {
		this.lastName = quantity;
	};
}
