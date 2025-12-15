package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyNewUser")
public class MyNewUser {
    @Id
	private int uid;
    private String uname;
    private String email;
	public MyNewUser() {
		super();
	}
	public MyNewUser(int uid, String uname, String email) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MyNewUser [uid=" + uid + ", uname=" + uname + ", email=" + email + "]";
	}
    
	
	
	
	
	
	
	
	
}
