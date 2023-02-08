
package co.aluraHotel.Util;

import co.aluraHotel.controller.BookingController;
import co.aluraHotel.controller.GuestsController;
import com.github.lgooddatepicker.components.DatePicker;
import java.sql.Date;
import java.util.Optional;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author JC
 */

public class Validations {
    
    //---------------------------------------
    PageSwitch pageSwitch = new PageSwitch();
    ViewSearchMethods viewSearchMethods = new ViewSearchMethods();
    ViewSaveMethods viewSaveMethods = new ViewSaveMethods();
    OptionMessages om = new OptionMessages();
    BookingController bookingController = new BookingController();
    GuestsController guestsController = new GuestsController();
    Calculations calculations = new Calculations();
    RegExPack regExPack = new RegExPack();
    //---------------------------------------
    int accU;
    int accD = 3;
    //---------------------------------------
    
    public void loginDbValidation(JTextField txt, JPasswordField pass, JFrame frame) {
                
        if(viewSearchMethods.checkUserAndPass(txt, pass)){
            om.launchMessage("You are logged now!!!");
            txt.setText("");
            pass.setText("");
            pageSwitch.logingForward(frame);
        }
        else if(accU == 2) {
            om.launchWarning("Max attempts allowed: " + (accU+1) + "\nPlease contact the Admin");            
            System.exit(0);
        }else{
            om.launchWarning("Something went wrong!!!\n\nNum of attempts left: " + (accD-1));
            txt.setText("");
            pass.setText("");
            accU ++;
            accD --;
        }
    }
    
    //--------------------------------------------------------------------------
      
    public void bookingValidation(DatePicker dateCheckIn, DatePicker dateCheckOut, JSpinner spinnerQty, JTextField textPrice, JComboBox comboPay, JFrame frame) {      
        boolean ci = dateCheckIn.getDate() == null; 
        boolean co = dateCheckOut.getDate()== null;
        boolean cb = comboPay.getSelectedItem() == null;
        
        if(ci || co || cb){
            om.launchWarning("Fields should not be empty");
        } else if (calculations.priceCalculation(dateCheckIn, dateCheckOut, spinnerQty, textPrice)){         
            viewSaveMethods.saveDataBkW(dateCheckIn, dateCheckOut, spinnerQty, textPrice, comboPay);
            pageSwitch.bookingForward(frame);
        } else {
            om.launchWarning("Now you can edit and try again!\nOr go back");
        }
    }
      
    public void registrationValidation(JTextField txtName,
                                       JTextField txtSurname,
                                       DatePicker dateBirth,
                                       JComboBox comboPlace,
                                       JTextField txtPhone, 
                                       JTextField txtEamil,
                                       JTextField bkId,
                                       JFrame frame) {
        
        boolean nm = txtName.getText().trim().equals("") || txtName.getText() == null;
        boolean sn = txtSurname.getText().trim().equals("") || txtSurname.getText() == null;
        boolean db = dateBirth.getDate() == null;
        boolean cp = comboPlace.getSelectedItem() == null;
        boolean ph = txtPhone.getText().trim().equals("") || txtPhone.getText() == null;
        boolean em = txtEamil.getText().trim().equals("") || txtEamil.getText() == null;
        
        //viewSearchMethods.createTextFieldBookingId(bkId);
        
        if(nm || sn || db || cp || ph || em){
            om.launchWarning("Fields should not be empty");
        }
        else if(calculations.ageCalculation(dateBirth) &&
                regExPack.textRegEx(txtName, txtSurname) &&
                regExPack.phoneRegEx(txtPhone) && regExPack.emailRegEx(txtEamil)){
            om.launchMessage("saved");
            viewSaveMethods.saveDataGtW(txtName, txtSurname, dateBirth, comboPlace, txtPhone, txtEamil, bkId);
            pageSwitch.registrationForward(frame);
        } else {
            om.launchMessage("try again");
        }
    }
    
    //--------------------------------------------------------------------------
    public void tableSearchCompoundValidation(JTextField text, JTable table) {
        viewSearchMethods.cleanTableVSM(table);
        if (text.getText().equals("")) {
            viewSearchMethods.createTableJoin(table);
            //om.launchWarning("Please enter an Id number!");
        } else {
            viewSearchMethods.createTableJoinById(text, table);
        }
    }
    
    public void tableSearchByIdValidation(JTextField text, JTable table) {
        viewSearchMethods.cleanTableVSM(table);
        if (text.getText().equals("")) {
            viewSearchMethods.createTableBooking(table); 
            //om.launchWarning("Please enter an Id number!");
        } else {           
            viewSearchMethods.createTableBookingById(text, table);
        }
    }
    
    public void tableSearchByNameValidation(JTextField text, JTable table) {
        viewSearchMethods.cleanTableVSM(table);
        if (text.getText().equals("")) {
            viewSearchMethods.createTableGuests(table); 
            //om.launchWarning("Please enter a Name!");
        } else {           
            viewSearchMethods.createTableGuestsByName(text, table);
        }
    }
    //--------------------------------------------------------------------------
    
    public void editByIdValidation(JTable tb) {
        int bookingRow = tb.getSelectedRow();           
        if(bookingRow>=0){        
            if(calculations.priceTableCalculation(tb)){
                Optional.ofNullable(tb.getValueAt(tb.getSelectedRow(), tb.getSelectedColumn())).ifPresentOrElse(row -> {
                    Date checkIn = Date.valueOf(tb.getValueAt(tb.getSelectedRow(), 1).toString());		
                    Date checkOut = Date.valueOf(tb.getValueAt(tb.getSelectedRow(), 2).toString());
                    Integer qtyGuests = Integer.valueOf(tb.getValueAt(tb.getSelectedRow(), 3).toString());
                    Double price = Double.valueOf(tb.getValueAt(tb.getSelectedRow(), 4).toString());
                    String paymentMethod = (String) tb.getValueAt(tb.getSelectedRow(), 5);
                    Integer bookingId = Integer.valueOf(tb.getValueAt(tb.getSelectedRow(), 0).toString());
                   
                    this.bookingController.updateBk(checkIn, checkOut, qtyGuests, price, paymentMethod, bookingId);
                    om.launchMessage("Booking record was edited!");
                    viewSearchMethods.cleanTableVSM(tb);
                    viewSearchMethods.createTableBooking(tb);

                }, () -> om.launchWarning("Not selected row!"));
            }
        }else{
            om.launchWarning("Not selected row!");
        }
    }
    
    public void editByNameValidation(JTable tb) {
        int guestsRow = tb.getSelectedRow();
        if(guestsRow>=0){
            if(calculations.ageTableCalculation(tb) && regExPack.textTableRegEx(tb) && regExPack.phoneTableRegEx(tb) && regExPack.emailTableRegEx(tb)){
                Optional.ofNullable(tb.getValueAt(tb.getSelectedRow(), tb.getSelectedColumn())).ifPresentOrElse(row -> {
                    String name = (String) tb.getValueAt(tb.getSelectedRow(), 1);
                    String surname = (String) tb.getValueAt(tb.getSelectedRow(), 2);
                    Date dateBirth = Date.valueOf(tb.getValueAt(tb.getSelectedRow(), 3).toString());
                    String nationality = (String) tb.getValueAt(tb.getSelectedRow(), 4);
                    String phone = (String) tb.getValueAt(tb.getSelectedRow(), 5);
                    String email = (String) tb.getValueAt(tb.getSelectedRow(), 6);
                    Integer bookingId = Integer.valueOf(tb.getValueAt(tb.getSelectedRow(), 7).toString());
                    Integer guestId = Integer.valueOf(tb.getValueAt(tb.getSelectedRow(), 0).toString());

                    this.guestsController.updateGt(name, surname, dateBirth, nationality, phone, email, bookingId, guestId);
                    om.launchMessage("Guest record was edited!");
                    viewSearchMethods.cleanTableVSM(tb);
                    viewSearchMethods.createTableGuests(tb);
                }, () -> om.launchWarning("Not selected row!"));
            } else {
                om.launchMessage("try again");
            }
        }else{
            om.launchWarning("Not selected row!");
        }
    }
    
    public void deleteByIdValidation(JTable tb) {
        int bookingRow = tb.getSelectedRow();        
        if(bookingRow >= 0){
            String booking = tb.getValueAt(bookingRow, 0).toString();
            int confirmBk = om.launchConfirmation("You are about to delete a booking. \nAre you sure?");
            if(confirmBk == 0) {
                String valueBk = tb.getValueAt(bookingRow, 0).toString();
                this.bookingController.deleteBk(Integer.valueOf(valueBk));
                om.launchMessage("Booking deleted!");
                viewSearchMethods.cleanTableVSM(tb);
                viewSearchMethods.createTableBooking(tb);
            }
        }   
    }
    
    public void deleteByNameValidations(JTable tb) {
        int guestsRow = tb.getSelectedRow();
        if(guestsRow >= 0) {
            String guest = tb.getValueAt(guestsRow, 0).toString();
            int confirmGt = om.launchConfirmation("You are about to delete a guest. \nAre you sure?");
            if(confirmGt == 0) {
                String valueGt = tb.getValueAt(guestsRow, 0).toString();
                this.guestsController.deleteGt(Integer.valueOf(valueGt));
                om.launchMessage("Guest deleted!");
                viewSearchMethods.cleanTableVSM(tb);
                viewSearchMethods.createTableGuests(tb);
            }
        } else {
            om.launchWarning("Not selected row!");
        }
    }
    
    public void exitValidation(){
        int confirmExit = om.launchConfirmation("You are about to leave 'Hotel Alura'.\nAre you sure?");
        if(confirmExit == 0) {
            System.exit(0);
        }
    }
    
    public void logoutValidation(JFrame frame){
        int confirmLogout = om.launchConfirmation("Do you really want to log-out?");
        if(confirmLogout == 0) {
            pageSwitch.menuLogout(frame);
        }
    }
    //--------------------------------------------------------------------------
}
