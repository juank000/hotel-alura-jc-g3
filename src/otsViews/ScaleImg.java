
package otsViews;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author JC
 */
public class ScaleImg {
      
    
    // Scaled Image Label ------------------------------------------------------
    public void scaleImageBg(String imgPath, JLabel jLabel) {
        ImageIcon img = new ImageIcon(getClass().getResource(imgPath));
        Image img2 = img.getImage();
        Image imgScale = img2.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel.setIcon(scaledIcon);
    }
    
    // Scale Image Label Buttons ----------------------------------------------
    public void insertImageBtnClose(String imgPath, JLabel jLabel) {
        ImageIcon img = new ImageIcon(getClass().getResource(imgPath));
        Image img2 = img.getImage();
        Image imgScale = img2.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel.setIcon(scaledIcon);
    }
    public void scaleImageBtnCloseEnlarge(String imgPath, JLabel jLabel) {
        ImageIcon img = new ImageIcon(getClass().getResource(imgPath));
        Image img2 = img.getImage();
        Image imgScale = img2.getScaledInstance(jLabel.getWidth()+2, jLabel.getHeight()+2, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel.setIcon(scaledIcon);
    }
    public void scaleImageBtnCloseReduce(String imgPath, JLabel jLabel) {
        ImageIcon img = new ImageIcon(getClass().getResource(imgPath));
        Image img2 = img.getImage();
        Image imgScale = img2.getScaledInstance(jLabel.getWidth()-2, jLabel.getHeight()-2, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel.setIcon(scaledIcon);
    }
    
    public void insertImageBtnMin(String imgPath, JLabel jLabel) {
        ImageIcon img = new ImageIcon(getClass().getResource(imgPath));
        Image img2 = img.getImage();
        Image imgScale = img2.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel.setIcon(scaledIcon);
    }
    public void scaleImageBtnMinEnlarge(String imgPath, JLabel jLabel) {
        ImageIcon img = new ImageIcon(getClass().getResource(imgPath));
        Image img2 = img.getImage();
        Image imgScale = img2.getScaledInstance(jLabel.getWidth()+2, jLabel.getHeight()+2, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel.setIcon(scaledIcon);
    }
    public void scaleImageBtnMinReduce(String imgPath, JLabel jLabel) {
        ImageIcon img = new ImageIcon(getClass().getResource(imgPath));
        Image img2 = img.getImage();
        Image imgScale = img2.getScaledInstance(jLabel.getWidth()-2, jLabel.getHeight()-2, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel.setIcon(scaledIcon);
    }
    
    public void scaleImageIconJBtn(String imgPath, JButton btn) {
        ImageIcon img = new ImageIcon(getClass().getResource(imgPath));
        Image img2 = img.getImage();
        Image imgScale = img2.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        btn.setIcon(scaledIcon);
    }
    
}
