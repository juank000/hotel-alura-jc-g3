
package otsAlternativeLogin;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import co.aluraHotel.controller.UsersController;
import co.aluraHotel.Util.AuthLevels;
import co.aluraHotel.Util.OptionMessages;
import co.aluraHotel.Util.ViewSearchMethods;

/**
 *
 * @author JC
 */
public class LoginValidations {
    
    ViewSearchMethods viewSearchMethods = new ViewSearchMethods();
    OptionMessages om = new OptionMessages();
    UsersController usersController = new UsersController();
    AuthLevels authLevels;
        
    int accU;
    int accD = 3;
    
    public void loginValidation(JTextField txt, JPasswordField pass, JFrame frame) {
        String user = txt.getText();
        String key = String.valueOf(pass.getPassword());
        if(user.equals("user_Admin") && key.equals("123@abc")){
            om.launchMessage("Logged!!!\nWelcome " + user);
            //pageSwitch.logingForward(frame);
        }else {
            om.launchWarning("Login Error");
        }
    }
        
    public void loginByTypeValidation(JTextField txt, JPasswordField pass){      
        
        //checkEnum();
        
        Integer permissionType = viewSearchMethods.checkTypeByUserAndPass(txt, pass);     
                
        switch (permissionType) {
            case 1:
                System.out.println("Switch user type level = " + permissionType);
                om.launchMessage("User type level " +permissionType+ ".\nAuth Level: " + authLevels.valueOf(permissionType));
                break;
            case 2:
                System.out.println("Switch user type level = " + permissionType);
                om.launchMessage("User type level " +permissionType+ ".\nAuth Level: " + authLevels.valueOf(permissionType));
                break;
            case 3:
                System.out.println("Switch user type level = " + permissionType);
                om.launchMessage("User type level " +permissionType+ ".\nAuth Level: " + authLevels.valueOf(permissionType));
                break;
            case 4:
                System.out.println("Switch user type level = " + permissionType);
                om.launchMessage("User type level " +permissionType+ ".\nAuth Level: " + authLevels.valueOf(permissionType));
                break;
            default:
                om.launchWarning("Something went wrong\nTry again");
        }
    }
    
    public void loginDbStatusValidation(JTextField txt,JPasswordField pass, JFrame frame) {
        
        String usr = txt.getText();
        
        if(viewSearchMethods.checkUserAndPass(txt, pass)){
            System.out.println("hello");
            om.launchMessage("You are logged now!!!");
            txt.setText("");
            pass.setText("");
            //pageSwitch.logingForward(frame);    
        }else if(accU == 2) {
            om.launchWarning("Max attempts allowed: " + (accU+1) + "\nBlocked user...\nPlease contact the admin");
            this.usersController.updateUsrStatus(usr);
            System.exit(0);
        }else{
            om.launchWarning("Something went wrong!!!\n\nRemaining attempts: " + (accD-1));
            pass.setText("");
            accU += 1;
            accD -= 1;
        }
        
               
    }
    
    public void changeStateComponents(JTextField txt,
                                        JButton btn1,
                                        JPasswordField pass,
                                        JLabel label,
                                        JButton btn2){
        
        String usrStatus = viewSearchMethods.checkUsrByStatus(txt).trim();
        
        if(usrStatus.equals("active")){
            //String pass_ = om.launchInputPass(frame);
            //System.out.println("pass: " + pass);
            System.out.println("I'm active");
            
            txt.setEditable(false);
            //btn1.setVisible(false);
            btn1.setEnabled(false);
            label.setVisible(true);
            pass.setVisible(true); 
            btn2.setVisible(true);
        }else if(usrStatus.equals("inactive")){
            om.launchWarning("Inactive or Blocked user...\nPlease contact the admin");
            System.exit(0);
        }else{
            om.launchWarning("User not found");
            txt.setText("");
            //System.exit(0);
        }
    }
    
    public void checkEnum() {
        for(AuthLevels al : AuthLevels.values()){
            System.out.println("Level Name: " + al + " | Level Value: " + al.getValue());
            System.out.println("----------------------------------------");
        }
        
        /*AuthLevels typeUsr1 = AuthLevels.EmpAUTH;
        int typeUser1 = typeUsr1.getValue();

        AuthLevels typeUsr2 = AuthLevels.EmpNoAUTH;
        int typeUser2 = typeUsr2.getValue();

        AuthLevels typeUsr3 = AuthLevels.ClientAUTH;
        int typeUser3 = typeUsr3.getValue();

        AuthLevels typeUsr4 = AuthLevels.ClientNoAUTH;
        int typeUser4 = typeUsr4.getValue();*/           
    }
        
}
