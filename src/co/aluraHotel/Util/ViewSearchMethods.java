
package co.aluraHotel.Util;

import co.aluraHotel.controller.BookingController;
import co.aluraHotel.controller.GuestsController;
import co.aluraHotel.controller.UsersController;
import co.aluraHotel.model.Booking;
import co.aluraHotel.model.Guests;
import co.aluraHotel.model.Users;
import java.util.List;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JC
 */
public class ViewSearchMethods {
    
    BookingController bc = new BookingController();
    GuestsController gc = new GuestsController();
    private UsersController usr = new UsersController();
    //---------------------------------------------   
    
    private List<Booking> searchBookingVSM() {
        return this.bc.searchBk();
    }
    
    private List<Booking> searchBookingByIdVSM(JTextField txtField) {
        return this.bc.searchByIdBk(txtField.getText().trim());
    }
    
    //--------------------------------------------------------------------------
    private List<Booking> searchBookingJoinVSM() {
        return this.bc.searchJoinBk();
    }
    
    private List<Booking> searchBookingJoinByIdVSM(JTextField txtField){
        return this.bc.searchJoinByIdBk(txtField.getText().trim());
    }
    
    private Integer searchLastIdVSM() {
        return this.bc.searchLastIdBk();
    }
    //--------------------------------------------------------------------------
    
    private List<Guests> searchGuestsVSM(){
        return this.gc.searchGt();
    }
    
    private List<Guests> searchGuestsByIdVSM(JTextField txtField) {
        return this.gc.searchByIdGt(txtField.getText().trim());
    }
    
    private List<Guests> searchGuestsByNameVSM(JTextField txtField) {
        return this.gc.searchByNameGt(txtField.getText());
    }
    
    public void cleanTableVSM(JTable table) {
        ((DefaultTableModel) table.getModel()).setRowCount(0);
    }
    //-----------------------------------------------------------------
    private List<Users> searchUserVSM() {
            return this.usr.searchUsr();
    }
        
    private List<Users> searchUserByTypeVSM(JTextField txt) {
        return this.usr.searchUsrByType(txt.getText().trim());
    }
    
    private List<Users> searchUserByPassVSM(JTextField txtUsr, JPasswordField txt) {
        return this.usr.searchUsrByPass(txtUsr.getText(), String.valueOf(txt.getPassword()));
    }   
    
    private List<Users> searchUserTypeByPassVSM(JTextField txtUsr, JPasswordField txt) {
        return this.usr.searchUsrTypeByPass(txtUsr.getText(), String.valueOf(txt.getPassword()));
    } 
    //--------------------------------------------------------------------------
     private List<Users> searchUserByStatusVSM(JTextField txtUsr) {
        return this.usr.searchUsrByStatus(txtUsr.getText());
    }
    //--------------------------------------------------------------------------
    
    public void createTableBooking(JTable tb) {
        List<Booking> bookingVSM = searchBookingVSM();
        DefaultTableModel BookingTableModel = (DefaultTableModel) tb.getModel();
        try {
            for(Booking b : bookingVSM) {
                BookingTableModel.addRow(new Object[] {b.getBookingId(),
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
    
    //-----------------------------------------------------------------
    public void createTableBookingById(JTextField txtField, JTable tb) {
        List<Booking> bookingByIdVSM = searchBookingByIdVSM(txtField);
        DefaultTableModel BookingTableModel = (DefaultTableModel) tb.getModel();
        try {
            for(Booking b : bookingByIdVSM) {
                BookingTableModel.addRow(new Object[] {b.getBookingId(),
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
    
    //-----------------------------------------------------------------
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
    
    public void createTableJoinById(JTextField txtField, JTable tb) {
        List<Booking> bookingJoinByIdSVM = searchBookingJoinByIdVSM(txtField);
        DefaultTableModel BookingTableModel = (DefaultTableModel) tb.getModel();
        try {
            for(Booking b : bookingJoinByIdSVM) {
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
    
    //-----------------------------------------------------------------
    public void createTableGuests(JTable tb) {
        List<Guests> guestsSVM = searchGuestsVSM();
        DefaultTableModel GuestsTableModel = (DefaultTableModel) tb.getModel();
        try {
            for(Guests g : guestsSVM) {
                GuestsTableModel.addRow(new Object[] {g.getGuestId(),
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
    
    //-----------------------------------------------------------------
    public void createTableGuestsById(JTextField txtField, JTable tb) {
        List<Guests> guestsByIdSVM = searchGuestsByIdVSM(txtField);
        DefaultTableModel GuestsTableModel = (DefaultTableModel) tb.getModel();
        try {
            for(Guests g : guestsByIdSVM) {
                GuestsTableModel.addRow(new Object[] {g.getGuestId(),
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
    
    public void createTableGuestsByName(JTextField txtField, JTable tb) {
        List<Guests> guestsByNameSVM = searchGuestsByNameVSM(txtField);
        DefaultTableModel GuestsTableModel = (DefaultTableModel) tb.getModel();
        try {
            for(Guests g : guestsByNameSVM) {
                GuestsTableModel.addRow(new Object[] {g.getGuestId(),
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
    //--------------------------------------------------------------------------
    
    public void createTextFieldBookingId(JTextField txtBk){
        Integer bkId = searchLastIdVSM();
        try {
            txtBk.setText("" + bkId);
        } catch (Exception e) {
            throw e;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public void createTableUsers(JTable tb){
        List<Users> userSVM = searchUserVSM();
        DefaultTableModel UsersTableModel = (DefaultTableModel) tb.getModel();
        
        try {
            userSVM.forEach(u -> {
                UsersTableModel.addRow(new Object[] {
                    u.getUserId(),
                    u.getUserName(),
                    u.getUserPass()
                });
            });
            
        } catch (Exception e) {
            throw e;
        }
        
    }
        
    public void createTableUserByType(JTable tb, JTextField txt){
        List<Users> userSVM = searchUserByTypeVSM(txt);
        DefaultTableModel UsersTableModel = (DefaultTableModel) tb.getModel();
        try {
            userSVM.forEach(u -> {
                UsersTableModel.addRow(new Object[] {
                    u.getUserName(),
                    u.getUserPass(),
                    u.getUserType()
                });
            });
            
        } catch (Exception e) {
            throw e;
        }
        
        // through all users same type
        /*Iterator<Users> it= userType.iterator();
        while(it.hasNext()) {
          System.out.println(it.next());
        }
        
        userType.forEach(System.out::println);
        
        for (Users u : userType) {
            System.out.println(u);
        }*/
    }
    
    public void createTableUserByPass(JTable tb, JTextField txtUsr, JPasswordField txt){
        List<Users> userSVM = searchUserByPassVSM(txtUsr, txt);
        DefaultTableModel UsersTableModel = (DefaultTableModel) tb.getModel();
        try {
            userSVM.forEach(u -> {
                UsersTableModel.addRow(new Object[] {
                    u.getUserName(),
                    u.getUserPass()
                });
            });
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public boolean checkUserAndPass(JTextField txtUsr, JPasswordField txt) {
        List<Users> userSVM = searchUserByPassVSM(txtUsr, txt);
        if(userSVM.isEmpty()){
            System.out.println("Empty List: " + userSVM);  
            return false;
        }else{
            System.out.println("name and pass: " + userSVM);  
        }
        return true;
    }
    
    public Integer checkTypeByUserAndPass(JTextField txt, JPasswordField pass){
        
        List<Users> userType = searchUserTypeByPassVSM(txt, pass);               
        //System.out.println("from vsm: " + userType);
               
        //userType.forEach(u -> System.out.println("type: " + u.getUserType()));
        //userType.forEach(u -> System.out.println("type: " + u.getUserType().getClass()));
        
        int permissionTYpe = 0;
        for (Users u : userType) {
            permissionTYpe = u.getUserType();
        }
        
        //System.out.println("type for: " + permissionTYpe);
        //System.out.println("type for: " + permissionTYpe.getClass());
        
        return permissionTYpe;    
    }
    
    public String checkUsrByStatus(JTextField txt){
        
        List<Users> userStatus = searchUserByStatusVSM(txt);               
        String usrStatus = "";
        if(userStatus.isEmpty()){
            System.out.println("User not found");
            return usrStatus = "";
        }else{
            for (Users s : userStatus) {
                usrStatus = s.getUserStatus();
            }

        }   

        return usrStatus;    
    }
        
    //--------------------------------------------------------------------------
    
}
