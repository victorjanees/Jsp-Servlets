package com.login;
import java.sql.*;

public class ContactDao {
	
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
		

}
