package SqlExercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlPractise {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/saradb", "root", "Mysql@123");
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("SELECT * FROM Persons");
		
		while(result.next())
		{
			System.out.println(result.getString(3));
		}
		
	}

}
