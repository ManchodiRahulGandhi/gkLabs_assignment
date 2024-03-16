package com.nt;

import java.io.*;

@SuppressWarnings("serial")
public class DetailsBean implements Serializable{
	private String uName,uEmail,uDOB;
	private int age,id;
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuDOB() {
		return uDOB;
	}
	public void setuDOB(String uDOB) {
		this.uDOB = uDOB;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
