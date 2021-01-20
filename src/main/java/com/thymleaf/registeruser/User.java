package com.thymleaf.registeruser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	
	private String name;
	private String email;
	private String password;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	
	private String gender;
	private String profession;
	private boolean married;
	private String note;
	//DateFormat formatter = new SimpleDateFormat("yyy-dd-mm");
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public boolean getMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", birthday=" + birthday
				+ ", gender=" + gender + ", profession=" + profession + ", married=" + married + ", note=" + note + "]";
	}
	
	
	

}
