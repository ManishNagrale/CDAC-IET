package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestPreparedStatement {
    public static void main(String args[]) {
    	Connection con = null;
    	try {  //mysql --host=192.168.10.117 --port=3306 
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url ="jdbc:mysql://192.168.10.117:3306/dac40?useSSL=false";
			con = DriverManager.getConnection(url,"dac40" ,"welcome");
			if(con!=null) {
				System.out.println("True");
			}
			else {
				System.out.println("false");
			}
//			PreparedStatement pst = con.prepareStatement("select * from books");
//			ResultSet rs = pst.executeQuery();
//			while(rs.next()) {
//				System.out.println("id :"+rs.getInt("id"));
//				System.out.println("BookName: "+rs.getString("BookName"));
//				System.out.println("Type: "+rs.getString("Type"));
//				System.out.println("Cost: "+rs.getString("Cost"));
//			}
//			 PreparedStatement pst1 = con.prepareStatement("insert into books(id,bookname,type,cost)values(?,?,?,?)");
//			 pst1.setInt(1,10);
//			 pst1.setString(2,"python");
//			 pst1.setString(3,"paperback");
//			 pst1.setInt(4,570);
			 
			 PreparedStatement pst2 = con.prepareStatement("insert into books values(?,?,?,?)");
			 int id = 11;
			 String bname = "Math";
			 String type = "hardcover";
			 int cost = 600;
			 pst2.setInt(1, id);
			 pst2.setString(2, bname);
			 pst2.setString(3, type);
			 pst2.setInt(4, cost);
			 int n = pst2.executeUpdate();
			 if(n>0) {
				 System.out.println("insertion succesful");
			 }else {
				 System.out.println("not successful");
			 }
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    }
    
}
