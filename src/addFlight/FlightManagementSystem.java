package addFlight;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class FlightManagementSystem {

    public boolean addFlight(Flight flightObj) throws Exception {
        String query = "INSERT INTO flight VALUES (?, ?, ?, ?, ?)";
        try (
            Connection con = DB.getConnections();
            PreparedStatement ps = con.prepareStatement(query)
        ) {
            ps.setInt(1, flightObj.getFlightId());
            ps.setString(2, flightObj.getSource());
            ps.setString(3, flightObj.getDestination());
            ps.setInt(4, flightObj.getNoOfSeats());
            ps.setDouble(5, flightObj.getFlightFare());

            int check = ps.executeUpdate();
            return check > 0;
        }
    }

    public ArrayList<Flight> viewFlightBySourceAndDestination(String source, String destination)
            throws ClassNotFoundException, SQLException, IOException {

        ArrayList<Flight> flightList = new ArrayList<>();
        String query = "SELECT * FROM flight WHERE source = ? AND destination = ?";

        try (
            Connection con = DB.getConnections();
            PreparedStatement ps = con.prepareStatement(query)
        ) {
            ps.setString(1, source);
            ps.setString(2, destination);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int fId = rs.getInt("flightId");
                    String src = rs.getString("source");
                    String des = rs.getString("destination");
                    int seats = rs.getInt("noOfSeats");
                    double fare = rs.getDouble("flightFare");

                    Flight f = new Flight(fId, src, des, seats, fare);
                    flightList.add(f);
                }
            }
        }

        return flightList;
    }

    public boolean updateFlightFare(int flightId, double flightFare)
            throws ClassNotFoundException, SQLException, IOException {
        String query = "UPDATE flight SET flightFare = ? WHERE flightId = ?";

        try (
            Connection con = DB.getConnections();
            PreparedStatement ps = con.prepareStatement(query)
        ) {
            ps.setDouble(1, flightFare);
            ps.setInt(2, flightId);

            int toCheck = ps.executeUpdate();
            return toCheck > 0;
        }
    }

    public boolean deleteFlight(int flightId) throws ClassNotFoundException, SQLException, IOException {
        String query = "DELETE FROM flight WHERE flightId = ?";

        try (
            Connection con = DB.getConnections();
            PreparedStatement ps = con.prepareStatement(query)
        ) {
            ps.setInt(1, flightId);
            int toCheck = ps.executeUpdate();
            return toCheck > 0;
        }
    }

    public ArrayList<Flight> viewFullTable() throws ClassNotFoundException, SQLException, IOException {
        ArrayList<Flight> flightTable = new ArrayList<>();
        String query = "SELECT * FROM flight";

        try (
            Connection con = DB.getConnections();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                int fId = rs.getInt("flightId");
                String src = rs.getString("source");
                String des = rs.getString("destination");
                int seats = rs.getInt("noOfSeats");
                double fare = rs.getDouble("flightFare");

                Flight f = new Flight(fId, src, des, seats, fare);
                flightTable.add(f);
            }
        }

        return flightTable;
    }
}
