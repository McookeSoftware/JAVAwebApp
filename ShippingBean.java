



import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

import javax.inject.Named;

/**
 *
 * @author matty
 */
@Named(value = "shippingBean")
@ApplicationScoped

//when you want to have only one instance of some object you use @ApplicationScoped
public class ShippingBean implements Serializable {
//serialize an object means to convert its state to a byte stream
    /**
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public List<ShippingInfo> getShippingInfo() throws ClassNotFoundException, SQLException {

		Connection connect = null;

		String url = "jdbc:mysql://localhost:3306/shipping";
                //connection to the database
		String username = "matt";
		String password = "M@tty121";

		try {

			Class.forName("com.mysql.jdbc.Driver");
                           //JDBC Driver enables java application to interact with the database
			connect = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established"+connect);

		} catch (SQLException ex) {
			System.out.println("in exec");
			System.out.println(ex.getMessage());
		}

		List<ShippingInfo> shippingInfo = new ArrayList<ShippingInfo>();
		PreparedStatement pstmt = connect
				.prepareStatement("select ID, Stock, DateDeparture, Origin, Destination, DateArrival FROM customers");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
                    //array list that uses the setters from the Shippinginfo class, and above to the connection to the database table.
			ShippingInfo ship = new ShippingInfo();
			ship.setCid(rs.getInt("ID"));
			ship.setStock(rs.getString("Stock"));
			ship.setDateDeparture(rs.getDate("DateDeparture"));
			ship.setOrigin(rs.getString("Origin"));
			ship.setDestination(rs.getString("Destination"));
                        ship.setDateArrival(rs.getDate("DateArrival"));
			shippingInfo.add(ship);

		}

		// close resources
		rs.close();
		pstmt.close();
		connect.close();

		return shippingInfo;

	}

}