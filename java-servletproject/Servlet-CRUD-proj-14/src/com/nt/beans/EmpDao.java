package com.nt.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	
	public static Connection getConnection() {
		
	Connection	 con=null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			
		}catch (Exception e) {
			
			System.out.println(e);
		}
		
               return con;
		
	}
	
	 public static int save(Emp e) {
		 int status=0;
		 
		 try {
			 
			Connection con=EmpDao.getConnection();
			 
			 PreparedStatement ps=con.prepareStatement("insert into user905 values(?,?,?,?)");
			 
			 ps.setString(1,e.getName());
			 ps.setString(2,e.getPasssword());
			 ps.setString(3,e.getEmail());
			 ps.setString(4,e.getCountry());
			 
			 status=ps.executeUpdate();
			 
			 con.close();
		 }
		 catch (Exception ex) {
			 
			 ex.printStackTrace();
			 
		 }
		 
		 return status;
	 }
	 
	 public static int update(Emp e) {
		 
		 int status=0;
		 
		 try {
			 
			 Connection con=EmpDao.getConnection();
			 
			 PreparedStatement ps=con.prepareStatement("update user905 set name=?,password=?,email=?,country=? where id=?");
			 
			 ps.setString(1,e.getName());
			 ps.setString(2,e.getPasssword());
			 ps.setString(3,e.getEmail());
			 ps.setString(4,e.getCountry());
			 ps.setInt(5,e.getId());
			 status=ps.executeUpdate();
			 
			 con.close();
			 
		 }
		 
		 catch (Exception ex) {
			 
	        ex.printStackTrace();
		 
		 }
		 
		 return status;
	 }
	 
	 public static int delete(int id) {
		 
		 int status=0;
		 try {
		 Connection con=EmpDao.getConnection();
		 
		 PreparedStatement ps=con.prepareStatement("delete from user905 where id=?");
		 
		 ps.setInt(1,id);
		 
		 status=ps.executeUpdate();
		 
		 con.close();
	 }
       catch (Exception ex) {
	ex.printStackTrace();
	
    	  }
		 return status;
	 }
		 
		 public static List<Emp> getEmployeeByid(int id) {
			 
			Emp e=new Emp();
			 try {
							 
		   Connection con=EmpDao.getConnection();
		   
		  PreparedStatement ps=con.prepareStatement("select * from user905 where id=?");
			
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			
			if (rs.next()) {
			  e.setId(rs.getInt(1));
			  e.setName(rs.getString(2));
			  e.setPasssword(rs.getString(3));
			  e.setEmail(rs.getString(4));
			  e.setCountry(rs.getString(5));
			  
			}
			
			con.close();
				
			}
			 catch (Exception ex) {
				 
			ex.printStackTrace();	 
				 
				 return e;
			
			 }
			 
			 public static List<Emp> getAllEmployee(){
				 
				 List<Emp> list=new ArrayList<Emp>();
				 
				 try {
					 
					 Connection con=EmpDao.getConnection();
					 
					 PreparedStatement ps=con.prepareStatement("select * from user905");
					 
					 ResultSet rs=ps.executeQuery();
					 
					 while (rs.next()) {
						 
						 Emp e1=new Emp();
						 
						 e1.setId(rs.getInt(1));
						 e1.setName(rs.getString(2));
						 e1.setPasssword(rs.getString(3));
						 e1.setEmail(rs.getString(4));
						 e1.setCountry(rs.getString(5));
						 
						list.add(e1);
					}
					 con.close();
				 }
				 catch (Exception ex) {
				
					 ex.printStackTrace();
				 
			 }
			 return list;
			 }
			 
		 }
}
