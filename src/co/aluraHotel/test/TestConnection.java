
package co.aluraHotel.test;

import co.aluraHotel.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author JC
 */
public class TestConnection {
    
    public static void main(String... args) {
        Connection conn = new ConnectionFactory().recoverConnection();
        System.out.println(conn);
        System.out.println("Connection Testing...");
        try {
            conn.close();
            System.out.println("Closing Connection Testing...");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
        //----------------------------------------------------------------------        
        
        //----------------------------------------------------------------------
        
    }
}
