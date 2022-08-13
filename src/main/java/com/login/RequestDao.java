package com.login;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;




public class RequestDao {
	
	public int registerContact(ContactPojo contact) throws ClassNotFoundException {
		
		String sql = "INSERT INTO public.contacts" + " (name, email, message) VALUES " + "(?, ?, ?)";
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String uname = "postgres";
		String password = "Dhoni@007";
		int result = 0;
		
		try {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, contact.getName());
		ps.setString(2, contact.getEmail());
		ps.setString(3, contact.getMessage());
		
	   result = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
		
     public List<ContactPojo> getRequestData(){
    	 List<ContactPojo> req = new ArrayList<>();
    	 
    	 
    	 String sql = "SELECT * FROM public.contacts";
    	 String url = "jdbc:postgresql://localhost:5432/postgres";
    	 String uname = "postgres";
    	 String password = "Dhoni@007";

    	 try {
    	 Class.forName("org.postgresql.Driver");
    	 Connection con = DriverManager.getConnection(url,uname,password);
    	 PreparedStatement ps = con.prepareStatement(sql);
    	 ResultSet rs = ps.executeQuery();
    	 
    	 while(rs.next()) {
    		 
    		 ContactPojo cp = new ContactPojo();
    		 
    		 cp.setName(rs.getString(1));
    		 cp.setEmail(rs.getString(2));
    		 cp.setMessage(rs.getString(3));
    		 cp.setStatus(rs.getString(4));
    		 req.add(cp);
    	 }
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 return req;
     }
}
