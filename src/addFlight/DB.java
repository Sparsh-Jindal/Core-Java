package addFlight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

	private static Connection con = null;
	private static Properties props = new Properties();

	public static Connection getConnections()throws SQLException ,ClassNotFoundException,IOException  {
		try(FileInputStream fis=new FileInputStream("database.properties")){
			props.load(fis);
			Class.forName(props.getProperty("DB_DRIVER_CLASS"));
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/myDb1","root","Swati143");
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		return con;
	}
}
