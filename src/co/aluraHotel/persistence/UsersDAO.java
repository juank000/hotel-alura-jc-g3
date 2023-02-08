
package co.aluraHotel.persistence;

import co.aluraHotel.model.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import co.aluraHotel.Util.AuthLevels;

/**
 *
 * @author JC
 */
public class UsersDAO {
    
    final private Connection conn;

    public UsersDAO(Connection conn) {
        this.conn = conn;
    }
    
    public List<Users> searchUser() {
        List<Users> users = new ArrayList<>();
        try {
            String sql = "SELECT user_id, user_name, user_pass FROM users";
            
            System.out.println("Query in Users SEARCH: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.execute();
                
                transformResultSetIntoUsers(users, ps);
                
            }
            
            return users;
            
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    
    public List<Users> searchByType(String type) {
        List<Users> users = new ArrayList<>();
        try {
            String sql = "SELECT user_name, user_pass, user_type FROM users WHERE user_type =  ?";
            System.out.println("Query in Users SEARCH BY TYPE: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, type);
                ps.execute();
                
                transformResultSetIntoUsrType(users, ps);
                
            }
            
            return users;
            
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    public List<Users> searchTypeByPass(String usr, String pass) {
        List<Users> users = new ArrayList<>();
        try {
            String sql = "SELECT user_name, user_pass, user_type FROM users WHERE user_name = BINARY ? AND user_pass = SHA1(?)";
            
            System.out.println("Query in Users SEARCH TYPE BY PASS: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, usr);
                ps.setString(2, pass);
                ps.execute();
                
                transformResultSetIntoUsrType(users, ps);
                
            }
            
            return users;
            
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    public List<Users> searchByPass(String usr, String pass) {
        List<Users> users = new ArrayList<>();
        try {
            //String sql = "SELECT user_name, user_pass FROM users WHERE user_name = ? AND user_pass = ?";
            String sql = "SELECT user_name, user_pass FROM users WHERE user_name = BINARY ? AND user_pass = SHA1(?)";
            
            System.out.println("Query in Users SEARCH BY PASS: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, usr);
                ps.setString(2, pass);
                ps.execute();
                
                transformResultSetIntoUsrPass(users, ps);
                
            }
            
            return users;
            
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    //--------------------------------------------------------------------------
    public List<Users> searchByStatus(String usr) {
        List<Users> users = new ArrayList<>();
        try {
            //String sql = "SELECT user_name, user_pass, user_status FROM users WHERE user_name = BINARY ? AND user_pass = SHA1(?)";
            String sql = "SELECT user_name, user_pass, user_status FROM users WHERE user_name = BINARY ?";
            System.out.println("Query in Users SEARCH BY STATUS: " + sql);
            
            try(PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, usr);
                ps.execute();
                
                transformResultSetIntoUsrStatus(users, ps);
                
            }
            
            return users;
            
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    
    public void updateStatus(String user) {
        String sql = "UPDATE users SET user_status = ? WHERE user_name = BINARY ?";
        
        System.out.println("Query in Users UPDATE STATUS: " + sql);
        
        try(PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "inactive");
            ps.setString(2, user);
            ps.execute();
            
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    //--------------------------------------------------------------------------    
    
    // Resultset----------------------------------------------------------------
    private void transformResultSetIntoUsers(List<Users> users, PreparedStatement ps) throws SQLException {
        try (ResultSet resultSet = ps.getResultSet()) {
            while (resultSet.next()) {
                Users users_ = new Users(resultSet.getInt(1),                                    
                                         resultSet.getString(2),
                                         resultSet.getString(3));
                users.add(users_);
            }
        }
    }
    
    private void transformResultSetIntoUsrType(List<Users> users, PreparedStatement ps) throws SQLException {
        try (ResultSet resultSet = ps.getResultSet()) {
            while (resultSet.next()) {
                Users users_ = new Users(resultSet.getString(1),
                                         resultSet.getString(2),
                                         resultSet.getInt(3));
                users.add(users_);
            }
        }
    }
    
    private void transformResultSetIntoUsrPass(List<Users> users, PreparedStatement ps) throws SQLException {
        try (ResultSet resultSet = ps.getResultSet()) {
            while (resultSet.next()) {
                Users users_ = new Users(resultSet.getString(1),
                                         resultSet.getString(2));
                users.add(users_);                
            }
        }
    }
    
    private void transformResultSetIntoUsrStatus(List<Users> users, PreparedStatement ps) throws SQLException {
        try (ResultSet resultSet = ps.getResultSet()) {
            while (resultSet.next()) {
                Users users_ = new Users(resultSet.getString(1),
                                         resultSet.getString(2),
                                         resultSet.getString(3));
                users.add(users_);
            }
        }
    }
    
    //--------------------------------------------------------------------------
        
}
