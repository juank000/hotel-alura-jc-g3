
package co.aluraHotel.persistence;

import co.aluraHotel.model.Booking;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JC
 */
public class BookingDAO {
    
    final private Connection conn;
    //private Connection conn;

    public BookingDAO(Connection conn) {
        this.conn = conn;
    }
    
    // Save data----------------------------------------------------------------
    public void saveBooking(Booking bk) {
        try {
            String sql = "INSERT INTO booking (check_in, check_out, qty_guests, price, payment_method) VALUES (?, ?, ?, ?, ?)";
            
            System.out.println("Query in Booking SAVE: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                ps.setDate(1, bk.getCheckIn());
                ps.setDate(2, bk.getCheckOut());
                ps.setInt(3, bk.getQtyGuests());
                ps.setDouble(4, bk.getPrice());
                ps.setString(5, bk.getPaymentMethod());

                //ps.executeUpdate();
                ps.execute();
                
                try (ResultSet resultSet = ps.getGeneratedKeys()) {
                    while (resultSet.next()) {
                            bk.setBookingId(resultSet.getInt(1));
                    }
                }
                
            }
            
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    // Search Data--------------------------------------------------------------
    public List<Booking> searchBooking() {
        List<Booking> booking = new ArrayList<Booking>();
        try {
            //String sql = "SELECT booking_id, check_in, check_out, qty_guests, price, payment_method FROM booking";
            String sql = "SELECT * FROM booking";
            
            System.out.println("Query in Booking SEARCH: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.execute();
                
                transformResultSetIntoBooking(booking, ps);
                
            }
            return booking;
                       
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    public List<Booking> searchByIdBooking(String id) {
        List<Booking> booking = new ArrayList<Booking>();
        try {
            //String sql = "SELECT booking_id, check_in, check_out, qty_guests, price, payment_method FROM booking WHERE booking_id = ?";
            String sql = "SELECT * FROM booking WHERE booking_id = ?";
            
            System.out.println("Query in Booking SEARCH BY ID: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, id);
                ps.execute();
                
                transformResultSetIntoBooking(booking, ps);
                
            }
            return booking;
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    public List<Booking> SearchJoin() {
        List<Booking> booking = new ArrayList<>();
        try {
            String sql = "SELECT g.name, g.surname, b.booking_id, b.qty_guests, b.price "
                        + "FROM booking b "
                        + "JOIN guests g ON g.booking_ID = b.booking_id";
            
            System.out.println("Query in Booking SEARCH JOIN: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql)) {
                //ps.setString(1, id);
                ps.execute();
                
                transformResultSetIntoBookingJoin(booking, ps);
            }
            return booking;
            
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    public List<Booking> SearchJoinById(String id) {
        List<Booking> booking = new ArrayList<>();
        try {
            String sql = "SELECT g.name, g.surname, b.booking_id, b.qty_guests, b.price "
                        + "FROM booking b "
                        + "JOIN guests g ON b.booking_id = g.booking_ID AND b.booking_id = ?";
            
            System.out.println("Query in Booking SEARCH JOIN BY ID: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, id);
                ps.execute();
                
                transformResultSetIntoBookingJoin(booking, ps);
            }
            return booking;
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    public Integer searchLastId(){
        Integer bkId = 0;
        try {
            String sql = "SELECT booking_id FROM booking ORDER BY booking_id DESC LIMIT 1";
            
            System.out.println("Query in Booking SEARCH LAST ID: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.execute();
                          
                try (ResultSet resultSet = ps.getResultSet()) {
                    if(resultSet.next()){
                        bkId = resultSet.getInt(1);
                   }
                }
            }
            return bkId;
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    // Delete Data--------------------------------------------------------------
    public void deleteBooking(Integer id) {
        String sql = "DELETE b.*, g.* FROM booking b JOIN guests g ON b.booking_id = g.booking_ID AND b.booking_id = ?";
        //String sql = "DELETE FROM booking WHERE booking_id = ?";
        
        System.out.println("Query in Booking DELETE: " + sql);
        
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    // Update Data--------------------------------------------------------------
    public void updateBooking(Date checkIn, Date checkOut, Integer qtyGuests, Double price, String paymentMethod, Integer bookingId) {
        String sql = "UPDATE booking SET check_in = ?, check_out = ?, qty_guests = ?, price = ?, payment_method = ? WHERE booking_id = ?";
        
        System.out.println("Query in Booking UPDATE: " + sql);
        
        try(PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDate(1, checkIn);
            ps.setDate(2, checkOut);
            ps.setInt(3,qtyGuests);
            ps.setDouble(4, price);
            ps.setString(5, paymentMethod);
            ps.setInt(6, bookingId);
                        
            ps.execute();
            
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    // Resultset----------------------------------------------------------------
    private void transformResultSetIntoBooking(List<Booking> booking, PreparedStatement ps) throws SQLException {
        try (ResultSet resultSet = ps.getResultSet()) {
            while (resultSet.next()) {
                Booking service = new Booking(resultSet.getInt(1),
                                               resultSet.getDate(2),
                                               resultSet.getDate(3),
                                              resultSet.getInt(4),
                                                 resultSet.getDouble(5),
                                           resultSet.getString(6));
                booking.add(service);
            }
        }
    }
    
    private void transformResultSetIntoBookingJoin(List<Booking> booking, PreparedStatement ps) throws SQLException {
        try (ResultSet resultSet = ps.getResultSet()) {
            while (resultSet.next()) {
                /*String bookingName = resultSet.getString("g.name");
                String bookingSurname = resultSet.getString("g.surname");
                Integer bookingId = resultSet.getInt("b.booking_id");
                Integer bookingQty = resultSet.getInt("b.qty_guests");
                Integer bookingPrice = resultSet.getInt("b.price");

                Booking service = new Booking(resultSet.getString(bookingName),
                                               resultSet.getString(bookingSurname),
                                                resultSet.getInt(bookingId),
                                                 resultSet.getInt(bookingQty),
                                                    resultSet.getDouble(bookingPrice)
                );*/
                Booking service = new Booking(resultSet.getString(1),
                                               resultSet.getString(2),
                                                resultSet.getInt(3),
                                                 resultSet.getInt(4),
                                                    resultSet.getDouble(5)
                );
                booking.add(service);
            }
        }
    }
    //--------------------------------------------------------------------------
    
}
