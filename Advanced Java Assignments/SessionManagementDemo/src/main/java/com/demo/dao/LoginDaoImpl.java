package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

import com.demo.beans.MyUser;

public class LoginDaoImpl implements LoginDao{
	static Connection conn;
	static PreparedStatement reguser,seluser;
	static {
		conn=DBUtil.getMyConnection();
		try {
			 reguser=conn.prepareStatement("insert into myuser values(?,?,?,?)");
			 seluser=conn.prepareStatement("select uname,email,role,password from myuser where uname=? and password=?");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	@Override
	public MyUser checkUser(String uname, String pass) {
		try {
			seluser.setString(1, uname);
			seluser.setString(2, pass);
			ResultSet rs=seluser.executeQuery();
			if(rs.next())
			{
				MyUser u=new MyUser(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			    return u;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean addUser(MyUser m) {
		   try {
			reguser.setString(1,m.getUname());
			reguser.setString(2,m.getEmail());
			reguser.setString(3,m.getRole());
			reguser.setString(4,m.getPass());
			int n = reguser.executeUpdate();
			return n>0;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		   
	}

}
