
package otsAlternativeForm;

import com.github.lgooddatepicker.components.DatePicker;
import java.sql.Date;
import java.util.Optional;
import javax.swing.JTable;
import javax.swing.JTextField;
import co.aluraHotel.Util.OptionMessages;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

/**
 *
 * @author JC
 */
public class SendMethods {
    
    OptionMessages om = new OptionMessages();
      
    public void fetchDataById(DatePicker dateChkIn,
                              DatePicker dateChkOut,
                              JSpinner qty,
                              JTextField prc,
                              JComboBox pay,
                              JTextField bkId,
                              JTable tb){
                
        /*Optional.ofNullable(tb.getValueAt(tb.getSelectedRow(), tb.getSelectedColumn()))
            .ifPresentOrElse(row -> {
                om.launchWarning("Row Selected");
            }, () -> om.launchWarning("Not selected row!"));*/
        
        int bookingRow = tb.getSelectedRow();           
        if(bookingRow>0){
            
            Date checkIn = Date.valueOf(tb.getValueAt(tb.getSelectedRow(), 1).toString());		
            Date checkOut = Date.valueOf(tb.getValueAt(tb.getSelectedRow(), 2).toString());
            Integer qtyGuests = Integer.valueOf(tb.getValueAt(tb.getSelectedRow(), 3).toString());
            Double price = Double.valueOf(tb.getValueAt(tb.getSelectedRow(), 4).toString());
            String paymentMethod = (String) tb.getValueAt(tb.getSelectedRow(), 5);
            Integer bookingId = Integer.valueOf(tb.getValueAt(tb.getSelectedRow(), 0).toString());

            System.out.println("In:    " + checkIn);
            System.out.println("Out:   " + checkOut);
            System.out.println("qty:   " + qtyGuests);
            System.out.println("pr:    " + price);
            System.out.println("pay:   " + paymentMethod);
            System.out.println("bK Id: " + bookingId);

            //dateChkIn.setDateToToday();
            dateChkIn.setDate(checkIn.toLocalDate());
            dateChkOut.setDate(checkOut.toLocalDate());
            qty.setValue(qtyGuests);
            prc.setText(""+price);
            pay.setSelectedItem(paymentMethod);
            bkId.setText(""+bookingId);
            
        } else {
            om.launchWarning("Not selected row!");
        }
                
    }
    
    public void fetchDataByName(JTextField nameG,
                                JTextField surnameG,
                                DatePicker birth,
                                JComboBox country,
                                JTextField phonenum,
                                JTextField mail,
                                JTextField bkId,
                                JTextField gtId,
                                JTable tb){
        
        int bookingRow = tb.getSelectedRow();           
        if(bookingRow>0){
        
            String name = (String) tb.getValueAt(tb.getSelectedRow(), 1);
            String surname = (String) tb.getValueAt(tb.getSelectedRow(), 2);
            Date dateBirth = Date.valueOf(tb.getValueAt(tb.getSelectedRow(), 3).toString());
            String nationality = (String) tb.getValueAt(tb.getSelectedRow(), 4);
            String phone = (String) tb.getValueAt(tb.getSelectedRow(), 5);
            String email = (String) tb.getValueAt(tb.getSelectedRow(), 6);
            Integer bookingId = Integer.valueOf(tb.getValueAt(tb.getSelectedRow(), 7).toString());
            Integer guestId = Integer.valueOf(tb.getValueAt(tb.getSelectedRow(), 0).toString());

            System.out.println("name:    " + name);
            System.out.println("sname:   " + surname);
            System.out.println("birth:   " + dateBirth);
            System.out.println("nat:     " + nationality);
            System.out.println("phone:   " + phone);
            System.out.println("email:   " + email);
            System.out.println("bK Id:   " + bookingId);
            System.out.println("gt Id:   " + guestId);

            nameG.setText(name);
            surnameG.setText(surname);
            birth.setDate(dateBirth.toLocalDate());
            country.setSelectedItem(nationality);
            phonenum.setText(phone);
            mail.setText(email);
            bkId.setText(""+bookingId);
            gtId.setText(""+guestId);
            
        }else{
            om.launchWarning("Not selected row!");
        }
    }
}
