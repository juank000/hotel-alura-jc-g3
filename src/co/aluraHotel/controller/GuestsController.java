
package co.aluraHotel.controller;

import co.aluraHotel.factory.ConnectionFactory;
import co.aluraHotel.model.Guests;
import co.aluraHotel.persistence.GuestsDAO;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author JC
 */
public class GuestsController {
    
    private GuestsDAO gdao;

    public GuestsController() {
        Connection conn = new ConnectionFactory().recoverConnection();
        this.gdao = new GuestsDAO(conn);
    }
    
    public void saveGt(Guests gt) {
        this.gdao.saveGuest(gt);
    }
    
    public List<Guests> searchGt(){
        return this.gdao.searchGuests();
    }
    
    public List<Guests> searchByIdGt(String id) {
        return this.gdao.searchByIdGuest(id);
    }
    
    public List<Guests> searchByNameGt(String name) {
        return this.gdao.searchByNameGuest(name);
    }
    
    public void updateGt(String name, String surname, Date dateOfBirth, String nationality, String phone, String email, Integer bookingID, Integer guestId) {
        this.gdao.updateGuest(name, surname, dateOfBirth, nationality, phone, email, bookingID, guestId);
    }
    
    public void deleteGt(Integer id) {
        this.gdao.deleteGuest(id);
    }
    
}
