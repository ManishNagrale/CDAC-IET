package com.demo.beans;

public class MyUser {
    private String uname;
    private String pwd;
    private String role;
	public MyUser() {
		super();
	}
	public MyUser(String uname, String pwd, String role) {
		super();
		this.uname = uname;
		this.pwd = pwd;
		this.role = role;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPasswd(String pwd) {
		this.pwd = pwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MyUser [uname=" + uname + ", pwd=" + pwd + ", role=" + role + "]";
	}
	
	
	
	
	
	
	
}
