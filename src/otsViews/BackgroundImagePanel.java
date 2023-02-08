
package otsViews;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author JC
 */
public class BackgroundImagePanel extends JPanel{
    
    // it works as second option bg image frame....

    // Background Image Panel
    /* panel -> Customize code -> Custom creation -> 
    jPanel1 = new javax.swing.JPanel(); -> jPanel1 = new BackgroundImagePanel;*/
    
    private Image img;
    public void paint (Graphics g) {
        img = new ImageIcon(getClass().getResource("/otsImages/img-hotel (2).jpg")).getImage();
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
