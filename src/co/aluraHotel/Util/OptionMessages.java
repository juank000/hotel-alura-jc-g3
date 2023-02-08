
package co.aluraHotel.Util;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author JC
 */
public class OptionMessages {
    
    public Icon insertImgJOption (String imgPath, int width, int height) {
        Icon imgIcon = new ImageIcon(new ImageIcon(getClass().getResource(imgPath)).getImage()
        .getScaledInstance(width, height, Image.SCALE_SMOOTH));
        return imgIcon;
    }
    
    public int launchConfirmation(String mssg) {
        int output = JOptionPane.showConfirmDialog(null,
                                                   mssg,
                                                   "",
                                                   JOptionPane.YES_NO_OPTION,
                                                   JOptionPane.PLAIN_MESSAGE,
                                                   insertImgJOption("/otsImages/img-hotel_alura_4.png", 90, 90));
        
            if(output == 1){
                System.out.println("output option No: " + output);
            } else {
                System.out.println("output option Yes: " + output);
            }
        
        return output;
    }
    
    public void launchMessage(String mssg) {
        JOptionPane.showMessageDialog(null,
                                            mssg,
                                            "",
                                            JOptionPane.PLAIN_MESSAGE,
                                            insertImgJOption("/otsImages/img-hotel_alura_4.png", 90, 90));
    }
       
    public void launchWarning(String mssg){
        JOptionPane.showMessageDialog(null,
                                                   mssg,
                                                   "",
                                                   JOptionPane.WARNING_MESSAGE,
                                                   insertImgJOption("/otsImages/icon-error.png", 70, 70));
    }
    
    
}