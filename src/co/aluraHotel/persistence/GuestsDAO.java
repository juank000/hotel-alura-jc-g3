
package co.aluraHotel.persistence;

import co.aluraHotel.model.Guests;
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
public class GuestsDAO {
    
    final private Connection conn;
    //private Connection conn;

    public GuestsDAO(Connection conn) {
        this.conn = conn;
    }
    
    //Save Data-----------------------------------------------------------------
    public void saveGuest(Guests gs) {
        try {
            String sql = "INSERT INTO guests (name, surname, date_of_birth, nationality, phone, email, booking_ID) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            System.out.println("Query in guests SAVE: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                ps.setString(1, gs.getName());
                ps.setString(2, gs.getSurname());
                ps.setDate(3, gs.getDateOfBirth());
                ps.setString(4, gs.getNationality());
                ps.setString(5, gs.getPhone());
                ps.setString(6, gs.getEmail());
                ps.setInt(7, gs.getBookingID());

                ps.execute();
                
                try (ResultSet resultSet = ps.getGeneratedKeys()) {
                    while (resultSet.next()) {
                            gs.setBookingID(resultSet.getInt(1));
                    }
                }
                
            }       
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    //Search Data---------------------------------------------------------------
    public List<Guests> searchGuests() {
        List<Guests> guests = new ArrayList<>();
        try {
            //String sql = "SELECT guest_id, name, surname, date_of_birth, nationality, phone, email, booking_ID FROM guests";
            String sql = "SELECT * FROM guests";
            
            System.out.println("Query in guests SEARCH: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql)){
                ps.execute();
                
                transformResultSetIntoGuests(guests, ps);
            }
            return guests;
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    public List<Guests> searchByIdGuest(String id) {
        List<Guests> guests = new ArrayList<>();
        try {
            //String sql = "SELECT guest_id, name, surname, date_of_birth, nationality, phone, email, booking_ID FROM guests WHERE booking_ID = ?";
            String sql = "SELECT * FROM guests WHERE booking_ID = ?";
            
            System.out.println("Query in guests SEARCH BY ID: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, id);
                ps.execute();
                
                transformResultSetIntoGuests(guests, ps);
                
            }
            return guests;
            
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    public List<Guests> searchByNameGuest(String name) {
        List<Guests> guests = new ArrayList<>();
        try {
            //String sql = "SELECT guest_id, name, surname, date_of_birth, nationality, phone, email, booking_ID FROM guests WHERE name = ?";
            String sql = "SELECT * FROM guests WHERE name = ?";
            
            System.out.println("Query in guests SEARCH BY NAME: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, name);
                ps.execute();
                
                transformResultSetIntoGuests(guests, ps);
                
            }
            return guests;
            
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    // Delete Data--------------------------------------------------------------
    public void deleteGuest(Integer id) {
        String sql = "DELETE g.*, b.* FROM guests g JOIN booking b ON g.booking_ID = b.booking_id AND g.booking_ID = ?";
        //String sql = "DELETE FROM guests WHERE guest_id = ?";
        
        System.out.println("Query in guests DELETE: " + sql);
        
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    // Update Data--------------------------------------------------------------
    public void updateGuest(String name, String surname, Date dateOfBirth, String nationality, String phone, String email, Integer bookingID, Integer guestId) {
        String sql = "UPDATE guests SET name = ?, surname = ?, date_of_birth = ?, nationality = ?, phone = ?, email = ?, booking_ID = ? WHERE guest_id = ?";
        
        System.out.println("Query in guests UPDATE: " + sql);
        
        try(PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setDate(3, dateOfBirth);
            ps.setString(4, nationality);
            ps.setString(5, phone);
            ps.setString(6, email);
            ps.setInt(7, bookingID);
            ps.setInt(8, guestId);
            
            ps.execute();
            
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    // Resultset----------------------------------------------------------------
    private void transformResultSetIntoGuests(List<Guests> guests, PreparedStatement ps) throws SQLException {
        try (ResultSet resultSet = ps.getResultSet()) {
            while (resultSet.next()) {
                    Guests user = new Guests(resultSet.getInt(1),
                                               resultSet.getString(2),
                                             resultSet.getString(3),
                                          resultSet.getDate(4),
                                          resultSet.getString(5),
                                               resultSet.getString(6),
                                               resultSet.getString(7),
                                            resultSet.getInt(8));
                    guests.add(user);
            }
        }
    }
    //--------------------------------------------------------------------------
}
