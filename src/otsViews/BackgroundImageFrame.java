
package otsViews;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author JC
 */
public class BackgroundImageFrame extends JPanel{
    private Image img;
    public void paint (Graphics g) {
        img = new ImageIcon(getClass().getResource("/otsImages/img-hotel (3).png")).getImage();
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
