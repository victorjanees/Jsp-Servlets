package com.login;

import java.sql.*;

public class LoginDao {
	String sql = "SELECT * FROM public.user1 where uname=? and pass=?";
	String url = "jdbc:postgresql://localhost:5432/postgres";
	String username = "postgres";
	String password = "Dhoni@007";
	
	public boolean check(String uname, String pass) {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement("sql");
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
