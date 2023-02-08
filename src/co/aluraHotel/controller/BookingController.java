
package co.aluraHotel.controller;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import co.aluraHotel.factory.ConnectionFactory;
import co.aluraHotel.model.Booking;
import co.aluraHotel.persistence.BookingDAO;

/**
 *
 * @author JC
 */
public class BookingController {
    
    private BookingDAO bdao;

    public BookingController() {
        Connection conn = new ConnectionFactory().recoverConnection();
        this.bdao = new BookingDAO(conn);
    }
    
    public void saveBk(Booking bk) {
        this.bdao.saveBooking(bk);
    }
    
    public List<Booking> searchBk() {
        return this.bdao.searchBooking();
    }
    
    public List<Booking> searchByIdBk(String id) {
        return this.bdao.searchByIdBooking(id);
    }
    
    //----------------------------------------------
    public List<Booking> searchJoinBk() {
        return this.bdao.SearchJoin();
    }
    
    public List<Booking> searchJoinByIdBk(String id) {
        return this.bdao.SearchJoinById(id);
    }
    
    public Integer searchLastIdBk(){
        return this.bdao.searchLastId();
    }
    
    //----------------------------------------------
    
    public void updateBk(Date checkIn, Date checkOut, Integer qtyGuests, Double price, String paymentMethod, Integer bookingId) {
        this.bdao.updateBooking(checkIn, checkOut, qtyGuests, price, paymentMethod, bookingId);
    }
               
    public void deleteBk(Integer id) {
        this.bdao.deleteBooking(id);
    }
}
