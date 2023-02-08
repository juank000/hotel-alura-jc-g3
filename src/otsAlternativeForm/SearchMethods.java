
package otsAlternativeForm;

import co.aluraHotel.controller.BookingController;
import co.aluraHotel.controller.GuestsController;
import co.aluraHotel.model.Booking;
import co.aluraHotel.model.Guests;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JC
 */
public class SearchMethods {
    
    BookingController bc = new BookingController();
    GuestsController gc = new GuestsController();
    //-------------------------------------------------
    
    private List<Booking> searchBookingVSM() {
        return this.bc.searchBk();
    }
    
    private List<Guests> searchGuestsVSM(){
        return this.gc.searchGt();
    }
    
    private List<Booking> searchBookingJoinVSM() {
        return this.bc.searchJoinBk();
    }
    
    public void createTableBooking(DefaultTableModel tb) {
        List<Booking> bookingVSM = searchBookingVSM();
        try {
            for(Booking b : bookingVSM) {
                tb.addRow(new Object[] {b.getBookingId(),
                                        b.getCheckIn(),
                                        b.getCheckOut(), 
                                        b.getQtyGuests(),
                                        b.getPrice(),
                                        b.getPaymentMethod()});
            }
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void createTableGuests(DefaultTableModel tb) {
        List<Guests> guestsSVM = searchGuestsVSM();
        try {
            for(Guests g : guestsSVM) {
                tb.addRow(new Object[] {g.getGuestId(),
                                        g.getName(),
                                        g.getSurname(),
                                        g.getDateOfBirth(),
                                        g.getNationality(),
                                        g.getPhone(),
                                        g.getEmail(),
                                        g.getBookingID()});
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void createTableJoin(JTable tb) {
        List<Booking> bookingJoinSVM = searchBookingJoinVSM();
        DefaultTableModel BookingTableModel = (DefaultTableModel) tb.getModel();
        try {
            for(Booking b : bookingJoinSVM) {
                BookingTableModel.addRow(new Object[] {b.getName(),
                                                       b.getSurname(),
                                                       b.getBookingId(),
                                                       b.getQtyGuests(),
                                                       b.getPrice()});
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
