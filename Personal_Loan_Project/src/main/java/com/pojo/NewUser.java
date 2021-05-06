package com.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "newUser")
public class NewUser {
	private String name;
	@Id
	private String userId;
	private String password;
	private String country;
	private String mobileNumber;
	private String panNumber;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		if(country.equalsIgnoreCase("india"))
		{
			System.out.println("you are eligible to obtain loan");
		}
		else
		{
			System.out.println("Not able to obtain loan as if u are not residing in india");
		}
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMobileNumber() {
		String regex = "\\d{10}";
		boolean result = mobileNumber.matches(regex);

		if(result) {
		    System.out.println("Given phone number is valid");
		} else {
		    System.out.println("Given phone number is not valid");
		    System.exit(0);
		}
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	@Override
	public String toString() {
		return "NewUser [name=" + name + ", userId=" + userId + ", password=" + password + ", country=" + country
				+ ", mobileNumber=" + mobileNumber + ", panNumber=" + panNumber + "]";
	}
	public NewUser(String name, String userId, String password, String country, String mobileNumber, String panNumber
			) {
		super();
		this.name = name;
		this.userId = userId;
		this.password = password;
		this.country = country;
		this.mobileNumber = mobileNumber;
		this.panNumber = panNumber;
		
	}
	public NewUser() {
		super();
	}
	
	
	
}
