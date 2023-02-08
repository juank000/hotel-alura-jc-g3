
package co.aluraHotel.Util;

import java.util.regex.Pattern;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author JC
 */
public class RegExPack {
    
    OptionMessages om = new OptionMessages();
    
    public boolean emailRegEx(JTextField text){
        String rgx = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String rgxInput = text.getText();
        
        if(Pattern.matches(rgx, rgxInput)){
            om.launchMessage("Email OK");
            return true;
        }else{
            om.launchWarning("Plese lead by example: \nexample@email.com");
        }
        return false;
        
    }
    
    public boolean emailTableRegEx(JTable tb){
        String rgx = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String rgxInput = (String)tb.getValueAt(tb.getSelectedRow(), 6);
        
        if(Pattern.matches(rgx, rgxInput)){
            om.launchMessage("Email OK");
            return true;
        }else{
            om.launchWarning("Plese lead by example: \nexample@email.com");
        }
        return false;
    }
    
    public boolean phoneRegEx(JTextField text){
        String rgx = "\\(\\d{3}\\)\\-\\d{3}\\-\\d{4}";
        String rgxInput = text.getText();
        
        if(Pattern.matches(rgx, rgxInput)){
            om.launchMessage("Phone OK");
            return true;
        }else{
            om.launchWarning("Plese follow the structure: \n(123)-456-7890");
        }
        return false;
    }
    
    public boolean phoneTableRegEx(JTable table){
        String rgx = "\\(\\d{3}\\)\\-\\d{3}\\-\\d{4}";
        String rgxInput = (String)table.getValueAt(table.getSelectedRow(), 5);
        
        if(Pattern.matches(rgx, rgxInput)){
            om.launchMessage("Phone OK");
            return true;
        }else{
            om.launchWarning("Plese follow the structure: \n(123)-456-7890");
        }
        return false;
    }
    
    public boolean textRegEx(JTextField textName, JTextField textSurname){
        String regx = "^[a-zA-Z\\''\\s]+";
        String rxgInputName = textName.getText();
        String rxgInputSurName = textSurname.getText();
        
        if(Pattern.matches(regx, rxgInputName) &&
           Pattern.matches(regx, rxgInputSurName)){            
            om.launchMessage("Name and Surname OK");
            return true;
        }else{
            om.launchWarning("Plese enter valid text.\nNeither special characters nor numbers are allowed");
        }
        return false;
        
    }
    
    public boolean textTableRegEx(JTable table){    
        String regx = "^[a-zA-Z\\''()\\s]+";
        String rxgInputName = (String)table.getValueAt(table.getSelectedRow(), 1);
        String rxgInputSurName = (String)table.getValueAt(table.getSelectedRow(), 2);
        String rxgInputNationality = (String)table.getValueAt(table.getSelectedRow(), 4);
        
        if(Pattern.matches(regx, rxgInputName) &&
           Pattern.matches(regx, rxgInputSurName) &&
           Pattern.matches(regx, rxgInputNationality)){
            
            om.launchMessage("Text OK");
            return true;
        }else{
            om.launchWarning("Plese enter valid text.\nSpecial characters or numbers are not allowed");
        }
        return false;
        
    }
        
}
