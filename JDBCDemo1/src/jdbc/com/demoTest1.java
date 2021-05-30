package jdbc.com;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class demoTest1 {

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
			
		//	stmt.executeUpdate("insert into eproduct (name, price,date_added) values ('Modem',20000,now())");
		//	stmt.executeUpdate("update eproduct set price = 3000 where name = 'Laptop'");
		//	stmt.executeUpdate("delete from eproduct where name = 'Speaker'");
		
		//stmt.executeUpdate("drop database db2");	
			
			CallableStatement stmt1 = con.prepareCall("{call add_product(?,?)}");
			
			for(int n = 0;n<3;n++) {
			stmt1.setString(1, "Iphone 12" + n);
			
			BigDecimal obj = new BigDecimal(1900.50);
			stmt1.setBigDecimal(2, obj);
			
			//stmt1.setBigDecimal(2, new BigDecimal(1900.50));
			stmt1.execute();
		
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
