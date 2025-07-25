package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc {
	//1.importing the packages
			private static String DRIVERNAME="org.postgresql.Driver";
			private static String Username="postgres";
			private static String Password="Anush@123";
			private static String url="jdbc:postgresql://localhost:5432/sriindu";
			

			public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//2.load the driver
				Class.forName(DRIVERNAME);
				System.out.println("driver loaded");
		//3.establish the connection
				Connection con=DriverManager.getConnection(url,Username,Password);
				System.out.println("connection established");
		//4. create statement
				Statement stmt=con.createStatement();
		//5.execute query
				String query="select * from Student1";
				ResultSet rs=stmt.executeQuery(query);
		//6.retrieving data
				while(rs.next()) {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
				}
				
				
			}

		

}
