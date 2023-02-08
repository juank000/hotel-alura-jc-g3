
package co.aluraHotel.Util;

import co.aluraHotel.controller.BookingController;
import co.aluraHotel.controller.GuestsController;
import co.aluraHotel.model.Booking;
import co.aluraHotel.model.Guests;
import com.github.lgooddatepicker.components.DatePicker;
import java.time.format.DateTimeFormatter;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;  

/**
 *
 * @author JC
 */
public class ViewSaveMethods {
    
    BookingController bc = new BookingController();
    GuestsController gc = new GuestsController();
    
    public void saveDataBkW(DatePicker datePicker1,
                            DatePicker datePicker2,
                            JSpinner spinner,
                            JTextField textField,
                            JComboBox comboBox){
        
        String checkin = datePicker1.getDate().toString();
        String checkout = datePicker2.getDate().format(DateTimeFormatter.ISO_LOCAL_DATE);
        Booking booking = new Booking(java.sql.Date.valueOf(checkin),
                                      java.sql.Date.valueOf(checkout),
                                      (Integer)spinner.getValue(),
                                      Double.parseDouble(textField.getText().trim()),
                                      (String)comboBox.getSelectedItem());
        bc.saveBk(booking);
    }
    
    public void saveDataGtW(JTextField textField1,
                            JTextField textField2,
                            DatePicker datePicker,
                            JComboBox comboBox,
                            JTextField textField3,
                            JTextField textField4,
                            JTextField textField5) {
        
        String dBirth = datePicker.getDate().toString();
        //String dBirth = datePickerBirth.getDate().format(DateTimeFormatter.ISO_LOCAL_DATE);
        Guests guests = new Guests(textField1.getText(),
                                 textField2.getText(),
                              java.sql.Date.valueOf(dBirth),
                              (String)comboBox.getSelectedItem(),
                                   textField3.getText().trim(),
                                   textField4.getText().trim(),
                                Integer.parseInt(textField5.getText().trim()));
        gc.saveGt(guests);
    }
    
        
}
