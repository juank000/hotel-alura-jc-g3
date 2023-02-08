
package co.aluraHotel.Util;

import com.github.lgooddatepicker.components.DatePicker;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author JC
 */
public class ClearFields {
    
    public void clearRegistrationPage(JTextField fieldName,
                                 JTextField fieldSurname,
                                 DatePicker fieldBirth,
                                 JComboBox fieldNationality,
                                 JTextField fieldPhone,
                                 JTextField fieldEmail){
        
        fieldName.setText("");
        fieldSurname.setText("");
        fieldBirth.setText("");
        fieldNationality.setSelectedIndex(-1);
        fieldPhone.setText("");
        fieldEmail.setText("");
    }
    
    public void clearBookingPage(DatePicker fieldCheckin,
                                      DatePicker fieldCheckout,
                                      JSpinner fieldQty,
                                      JTextField fieldPrice,
                                      JComboBox fieldPayment){
        
        fieldCheckin.setText("");
        fieldCheckout.setText("");
        fieldQty.setValue(1);
        fieldPrice.setText("");
        fieldPayment.setSelectedIndex(-1);
        
    }
    
}
