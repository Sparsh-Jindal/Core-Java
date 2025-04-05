package addFlight;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightManagementSystem {

	public boolean addFlight(Flight flightObj) throws Exception {

		Connection con = DB.getConnections();

		PreparedStatement ps = con.prepareStatement("insert into flight values(?,?,?,?,?)");
		ps.setInt(1, flightObj.getFlightId());
		ps.setString(2, flightObj.getSource());
		ps.setString(3, flightObj.getDestination());
		ps.setInt(4, flightObj.getNoOfSeats());
		ps.setDouble(5, flightObj.getFlightFare());
		int check = ps.executeUpdate();

		if (check > 0) {
			return true;
		}

		return false;

	}

	public ArrayList<Flight> viewFlightBySourceAndDestination(String source, String destinaton)
			throws ClassNotFoundException, SQLException, IOException {

		ArrayList<Flight> flightList = new ArrayList<>();

		Connection con = DB.getConnections();

		String query = "select * from flight where source = ? AND destination = ?;";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, source);
		ps.setString(2, destinaton);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			int fId = rs.getInt("flightId");
			String src = rs.getString("source");
			String des = rs.getString("destination");
			int seats = rs.getInt("noOfSeats");
			double fare = rs.getDouble("flightFare");

			Flight f = new Flight(fId, src, des, seats, fare);

			flightList.add(f);
		}

		return flightList;
	}

	public boolean updateFlightFare(int flightId, double flightFare)
			throws ClassNotFoundException, SQLException, IOException {
		Connection con = DB.getConnections();

		String query = "update flight SET flightFare=? where flightId=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setDouble(1, flightFare);
		ps.setInt(2, flightId);

		int toCheck = ps.executeUpdate();

		if (toCheck > 0) {
			return true;
		}

		return false;
	}

	public boolean deleteFlight(int flightId) throws ClassNotFoundException, SQLException, IOException {
		Connection con = DB.getConnections();
		String query = "Delete from flight where flightId=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, flightId);
		int toCheck = ps.executeUpdate();

		if (toCheck > 0) {
			return true;
		}

		return false;
	}

	public ArrayList<Flight> viewFullTable() throws ClassNotFoundException, SQLException, IOException {

		ArrayList<Flight> flightTable = new ArrayList<>();

		Connection con = DB.getConnections();

		String query = "select * from flight";
		PreparedStatement ps = con.prepareStatement(query);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			int fId = rs.getInt("flightId");
			String src = rs.getString("source");
			String des = rs.getString("destination");
			int seats = rs.getInt("noOfSeats");
			double fare = rs.getDouble("flightFare");

			Flight f = new Flight(fId, src, des, seats, fare);

			flightTable.add(f);
		}

		return flightTable;
	}
}
