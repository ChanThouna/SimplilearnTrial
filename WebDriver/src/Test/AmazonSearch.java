package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AmazonSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce1","root","root");
			
			Statement stmt =  con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from eproduct");
			
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}