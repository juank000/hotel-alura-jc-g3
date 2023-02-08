
package otsAlternativeForm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.plaf.metal.MetalTabbedPaneUI;

/**
 *
 * @author JC
 */
public class CustomTabbedPaneSimple extends JTabbedPane {

    public CustomTabbedPaneSimple() {
        setUI(new SimpleTabbedUI());
    }
        
    public class SimpleTabbedUI extends MetalTabbedPaneUI {
        
        private Rectangle currentRectangle;
        
        public SimpleTabbedUI(){
                        
        }

        public void setCurrentRectangle(Rectangle currentRectangle) {
            this.currentRectangle = currentRectangle;
            repaint();
        }
        
        @Override
        public void installUI(JComponent c) {
            super.installUI(c);                      
        }

        @Override
        protected Insets getTabInsets(int tabPlacement, int tabIndex) {
            return new Insets(10, 15, 10, 15);
        }
        
        @Override
        protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
            //super.paintTabBorder(g, tabPlacement, tabIndex, x, y, w, h, isSelected);
        }

        /*@Override
        protected void paintContentBorder(Graphics g, int tabPlacement, int selectedIndex) {
            Graphics2D g2d = (Graphics2D)g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(new Color(200, 200, 200));
            Insets insets = getTabAreaInsets(tabPlacement);
            int width = tabPane.getWidth();
            int height = tabPane.getHeight();
            if(tabPlacement==TOP){
                int tabHeight = height - calculateTabAreaHeight(tabPlacement, runCount, maxTabHeight);
                g2d.drawLine(insets.left, tabHeight, width-insets.right-1, tabHeight);
            }
            else if(tabPlacement==BOTTOM){
                int tabHeight = calculateTabAreaHeight(tabPlacement, runCount, maxTabHeight);
                g2d.drawLine(insets.left, tabHeight, width - insets.right-1, tabHeight);
            }
            else if(tabPlacement==LEFT) {
                int tabWidth = calculateTabAreaWidth(tabPlacement, runCount, maxTabWidth);
                g2d.drawLine(tabWidth, insets.top, tabWidth, height - insets.bottom-1);
            }
            else if(tabPlacement==RIGHT){
                int tabWidth = width - calculateTabAreaWidth(tabPlacement, runCount, maxTabWidth) - 1;
                g2d.drawLine(tabWidth, insets.top, tabWidth, height - insets.bottom-1);
            }
            g2d.dispose();
        }*/   

        @Override
        protected void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex, Rectangle iconRect, Rectangle textRect, boolean isSelected) {
            //super.paintFocusIndicator(g, tabPlacement, rects, tabIndex, iconRect, textRect, isSelected);
        }

        @Override
        protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
            //super.paintTabBackground(g, tabPlacement, tabIndex, x, y, w, h, isSelected);
        }
    }
    
}
