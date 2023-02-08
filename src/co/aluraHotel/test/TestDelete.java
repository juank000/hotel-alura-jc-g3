
package co.aluraHotel.test;

import co.aluraHotel.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JC
 */
public class TestDelete {
    public static void main(String... args) {
        try {
            Connection connection = new ConnectionFactory().recoverConnection();
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM guests WHERE guest_id = 99");
            System.out.println(statement.getUpdateCount());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
