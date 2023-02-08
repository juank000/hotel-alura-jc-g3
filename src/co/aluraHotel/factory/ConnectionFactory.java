
package co.aluraHotel.factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author JC
 */
public class ConnectionFactory {
    
    private DataSource dataSource;

    public ConnectionFactory() {
        
        String url_ = "jdbc:mysql://localhost/...";
        String user_ = "user";
        String pass_ = "password";
        
        var poolDataSource = new ComboPooledDataSource();
        
        poolDataSource.setJdbcUrl(url_);
        poolDataSource.setUser(user_);
        poolDataSource.setPassword(pass_);
        
        /*poolDataSource.setMinPoolSize(15);
        poolDataSource.setMaxPoolSize(100);
        poolDataSource.setMaxIdleTime(5);
        poolDataSource.setMaxIdleTimeExcessConnections(10000);
        poolDataSource.setMaxStatements(1000);
        poolDataSource.setMaxStatementsPerConnection(100);
        poolDataSource.setAcquireIncrement(5);
        poolDataSource.setAcquireRetryAttempts(30);
        poolDataSource.setNumHelperThreads(5);
        poolDataSource.setTestConnectionOnCheckout( true );*/
        
        /*
        maxIdleTime is the main point. It defines how many seconds this will release unused connection.   
        */
        
        this.dataSource = poolDataSource;
    }
    
    public Connection recoverConnection() {
        try {
            return this.dataSource.getConnection();
        } catch (SQLException sqe) {
            throw new RuntimeException(sqe);
        }
    }
}
