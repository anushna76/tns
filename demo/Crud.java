package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Crud {
	private static String DRIVERNAME="org.postgresql.Driver";
	private static String Username="postgres";
	private static String Password="Anush@123";
	private static String url="jdbc:postgresql://localhost:5432/sriindu";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DRIVERNAME);
		Connection con=DriverManager.getConnection(url,Username,Password);
		Statement stmt=con.createStatement();
		stmt.executeUpdate("create table stud(rollno int,name varchar(20),branch varchar(10))");
		stmt.close();
		con.close();
		



	}

}
