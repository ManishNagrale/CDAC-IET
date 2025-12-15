package com.demo.test;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestCreateStatement {
	public static void main(String args[]) {
		Connection con = null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://192.168.10.117:3306/dac40?useSSl=false";
			con = DriverManager.getConnection(url,"dac40", "welcome");
			if(con!=null) {
				System.out.println("True");
			}
			else {
				System.out.println("false");
			}
//			 Statement st = con.createStatement();
//			 ResultSet rs = st.executeQuery("select * from books");
//			 while(rs.next()) {
//				 System.out.println("id: "+rs.getInt(1));
//				 System.out.println("bookname: "+rs.getString(2));
//				 System.out.println("type: "+rs.getString(3));
//				 System.out.println("cost: "+rs.getInt(4));
//				 System.out.println("----------------------");
//			 }
			 int id = 13;
			 String bname = "MongoDB";
			 String type = "softcopy";
			 int cost = 850;
			 String query = "insert into books values("+id+bname+type+ cost+")";
			 Statement st1 = con.createStatement();
			 int n = st1.executeUpdate(query);
			 
			 if(n>0) {
				 System.out.println("data inserted successfully");
			 }else {
				 System.out.println("not successful");
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
