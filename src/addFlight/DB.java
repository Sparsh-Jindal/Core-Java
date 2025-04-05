package addFlight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
	
	static String url="";
	static String userName="";
	static String password="";

	private static Connection con = null;
	private static Properties props = new Properties();

	public static Connection getConnections()throws SQLException ,ClassNotFoundException,IOException  {
		try(FileInputStream fis=new FileInputStream("database.properties")){
			props.load(fis);
			Class.forName(props.getProperty("DB_DRIVER_CLASS"));
			url=props.getProperty("DB_URL");
			userName=props.getProperty("DB_USERNAME");
			password=props.getProperty("DB_PASSWORD");
			con= DriverManager.getConnection(url,userName,password);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found"); 
		}
		
		return con;
	}
}
