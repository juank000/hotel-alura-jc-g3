
package co.aluraHotel.controller;

import java.sql.Connection;
import co.aluraHotel.factory.ConnectionFactory;
import co.aluraHotel.model.Users;
import co.aluraHotel.persistence.UsersDAO;
import java.util.List;
import javax.swing.JPasswordField;

/**
 *
 * @author JC
 */
public class UsersController {
    
    private UsersDAO udao;

    public UsersController() {
        Connection conn = new ConnectionFactory().recoverConnection();
        this.udao = new UsersDAO(conn);
    }
    
    public List<Users> searchUsr() {
        return this.udao.searchUser();
    }
    
    public List<Users> searchUsrByPass(String usr, String pass){
        return this.udao.searchByPass(usr, pass);
    }
    
    public List<Users> searchUsrByType(String type){
        return this.udao.searchByType(type);
    }
    
    public List<Users> searchUsrTypeByPass(String usr, String pass){
        return this.udao.searchTypeByPass(usr, pass);
    }
    
    public List<Users> searchUsrByStatus(String usr){
        return this.udao.searchByStatus(usr);
    }
    
    public void updateUsrStatus(String user) {
        this.udao.updateStatus(user);
    }
    //--------------------------------------------------------------------------
    
}
