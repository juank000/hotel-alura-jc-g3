
package co.aluraHotel.test;

import co.aluraHotel.factory.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author JC
 */
public class TestConnectionPool {
    public static void main(String... args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        for(int c=0; c<7; c++){
            Connection connection = connectionFactory.recoverConnection();
            System.out.println("Opening connection number: " + (c+1));
        }
    }
}
