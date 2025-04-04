package addFlight;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightManagementSystem {
	
	public boolean addFlight(Flight flightObj) throws Exception {
		
		Connection con=DB.getConnections();
	
		
		PreparedStatement ps=con.prepareStatement("insert into flight values(?,?,?,?,?)");
		ps.setInt(1,flightObj.getFlightId());
		ps.setString(2, flightObj.getSource());
		ps.setString(3, flightObj.getDestination());
		ps.setInt(4,flightObj.getNoOfSeats());
		ps.setDouble(5, flightObj.getFlightFare());
		int check=ps.executeUpdate();	
		
		if(check>0) {
			return true;
		}
		
		return false;
		
		
	}
}
