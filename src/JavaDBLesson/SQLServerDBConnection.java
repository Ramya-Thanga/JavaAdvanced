package JavaDBLesson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLServerDBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//Java Connect to Microsoft SQL Server

		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

		//#Java Connect to Microsoft SQL Server
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		 String connectionUrl =
	                "jdbc:sqlserver://localhost:1433;"
	                        + "database=AdventureWorks2017;"
	                        + "user=Ramypk\\RAMYAXPS;"
	                        + "trustServerCertificate=true;"
	                        + "loginTimeout=30;integratedSecurity=true;";
	                  
		//DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SocialFamilyTree;integratedSecurity=true;");

		Connection connection = DriverManager.getConnection(connectionUrl);
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("Select * from employee");
		
		while(resultset.next()) {
			System.out.println("EmployeeID " + resultset.getString(1) + " Employee fname :" + resultset.getString(2));
		}
				
		
		
		
	}

}
