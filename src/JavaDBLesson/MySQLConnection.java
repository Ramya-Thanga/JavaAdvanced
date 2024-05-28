package JavaDBLesson;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class MySQLConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/ rt_mysql_test");
		java.sql.Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from Employees");
		
		while(resultset.next()) {
			System.out.println("Employee Number: " +resultset.getString(1)+ " First_Name " +resultset.getString(2));
		}
	}
	

}
