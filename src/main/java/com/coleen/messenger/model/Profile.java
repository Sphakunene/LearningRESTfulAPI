package com.coleen.messenger.model;

import java.util.Date;

public class Profile {

	private int id;
	private String profileName;
	private String fisrName;
	private String lastName;
	
	
	public Profile() {
		
	}
	public Profile(int id, String profileName, String fisrName, String lastName) {
		super();
		this.id = id;
		this.profileName = profileName;
		this.fisrName = fisrName;
		this.lastName = lastName;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getFisrName() {
		return fisrName;
	}
	public void setFisrName(String fisrName) {
		this.fisrName = fisrName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private Date created;
}
