
package co.aluraHotel.Util;

import com.github.lgooddatepicker.components.DatePicker;
import java.math.RoundingMode;
import java.sql.Date;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author JC
 */
public class Calculations {
    
    private static final DecimalFormat dec2 = new DecimalFormat("0.00");
    OptionMessages om = new OptionMessages();
    ViewSearchMethods viewSearchMethods = new ViewSearchMethods();
    
    public boolean ageCalculation(DatePicker dateBirth) {
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate today = LocalDate.now( zoneId);
        LocalDate dbirth = dateBirth.getDate();
        
        if(Period.between(dateBirth.getDate(), today).getYears() < 18){
            om.launchWarning("It seems you are not an adult");
        } else {
            om.launchMessage("Date of birth seems OK");
            return true;
        }
        return false;
    }
    
    public boolean ageTableCalculation(JTable tb) {
        try {
            ZoneId zoneId = ZoneId.systemDefault();
            LocalDate today = LocalDate.now( zoneId);
            Date dbirth = Date.valueOf(tb.getValueAt(tb.getSelectedRow(), 3).toString());
            LocalDate dbirth_ = dbirth.toLocalDate();
                        
            boolean nm = tb.getValueAt(tb.getSelectedRow(), 1) == null || tb.getValueAt(tb.getSelectedRow(), 1).equals("");
            boolean sn = tb.getValueAt(tb.getSelectedRow(), 2) == null || tb.getValueAt(tb.getSelectedRow(), 2).equals("");
            boolean nt = tb.getValueAt(tb.getSelectedRow(), 4) == null || tb.getValueAt(tb.getSelectedRow(), 4).equals("");
            boolean ph = tb.getValueAt(tb.getSelectedRow(), 5) == null || tb.getValueAt(tb.getSelectedRow(), 5).equals("");

            if(Period.between(dbirth_, today).getYears() < 18){
                om.launchWarning("It seems you are not an adult");
            }    
            else if (nm || sn || nt || ph){
                om.launchWarning("Fields should not be empty");
            } else {
                //om.launchMessage("Everything seems OK");
                return true;
            }
        } catch (Exception e) {
            om.launchWarning("You need:\n- Valid date format! YYYY-MM-DD");
        }
        return false;
    }
    
    public boolean priceCalculation(DatePicker checkIn, DatePicker checkOut, JSpinner spinnerQty, JTextField txtPrice){
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate today = LocalDate.now( zoneId);
        LocalDate dateCi = checkIn.getDate();
        LocalDate dateCo = checkOut.getDate();
                
        dec2.setRoundingMode(RoundingMode.DOWN);
        
        if(dateCi.compareTo(today) < 0)  {
            om.launchWarning("Please enter a valid check-in date");     
        } 
        else if(dateCo.compareTo(dateCi) <= 0) {
            om.launchWarning("Please enter a valid check-out date");     
        }
        else {
            int qty = (int) spinnerQty.getValue();
            Double priceDay = 456.789;
            int days = Period.between(dateCi, dateCo).getDays();
            Double totalPrice = (priceDay * days) * qty;
            txtPrice.setText("" + dec2.format(totalPrice));
            
            int priceConfirm = om.launchConfirmation("Total price:\n$" + dec2.format(totalPrice));
            
            if(priceConfirm == 0) {
                return true;
            }
        }
        return false;
    }
    
    public boolean priceTableCalculation(JTable tb){        
        try{
            dec2.setRoundingMode(RoundingMode.DOWN);
            
            ZoneId zoneId = ZoneId.systemDefault();
            LocalDate today = LocalDate.now( zoneId);
            Date today_ = Date.valueOf(today);
            
            Date checkin = Date.valueOf(tb.getValueAt(tb.getSelectedRow(), 1).toString());
            Date checkout = Date.valueOf(tb.getValueAt(tb.getSelectedRow(), 2).toString());
            Integer qtyGuests = Integer.valueOf(tb.getValueAt(tb.getSelectedRow(), 3).toString());
            //Double price = Double.valueOf(tb.getValueAt(tb.getSelectedRow(), 4).toString());
            String paymentMethod = (String) tb.getValueAt(tb.getSelectedRow(), 5);
            
            boolean pm = paymentMethod == null || paymentMethod.trim().equals("");
                                    
            if(checkin.compareTo(today_) < 0 || checkout.compareTo(checkin) <= 0)  {
                om.launchWarning("You need a valid check-in and check-out date.");     
            }
            else if(pm || checkPaymentMethod(tb)){             
                om.launchWarning("Payment Method only accepts:\nCash, Credit Card, Debit Card or Bank e-Transfer");
            }
            else if(qtyGuests <1 || qtyGuests > 10) {
                om.launchWarning("Please enter a valid number of guests (1-10)");
            }
            else {
                Double priceDay = 456.789;
                int days = Period.between(checkin.toLocalDate(), checkout.toLocalDate()).getDays();
                Double price_ = (priceDay * days) * qtyGuests;
                tb.setValueAt(dec2.format(price_), tb.getSelectedRow(), 4);
                //--------------------------------------------------------------
                int priceConfirm = om.launchConfirmation("Total price:\n$" + dec2.format(price_));
                if(priceConfirm == 0) {
                    return true;
                }else{
                    viewSearchMethods.cleanTableVSM(tb);
                    viewSearchMethods.createTableBooking(tb);
                }
                //--------------------------------------------------------------
            }
        }
        //------------------ IllegalArgumentException
        catch(Exception ex){
            om.launchWarning("You need:\n- Valid date format! YYYY-MM-DD\n- Valid Number of guests");
        }
        return false;
    }
    
    public boolean checkPaymentMethod(JTable tb){
        String [] paymentOptions = {"Cash", "Credit Card", "Debit Card", "Bank e-Transfer"};
        String option = (String)tb.getValueAt(tb.getSelectedRow(), 5);
        boolean notFound = true;
        //Arrays.toString(paymentOptions);
        for(String p : paymentOptions){
            if(p.contentEquals(option)){
                //om.launchWarning("Payment Method only accepts:\nCash, Credit Card, Debit Card or Bank e-Transfer");
                notFound = false;
                break;
            }
        }
        return notFound;
    }
    
}
