
package co.aluraHotel.view;

import java.awt.Cursor;
import co.aluraHotel.Util.PageSwitch;
import co.aluraHotel.Util.Validations;
import otsViews.BackgroundImageFrame;
import otsViews.ScaleImg;

/**
 *
 * @author JC
 */
public class PageStart extends javax.swing.JFrame {

    /**
     * Creates new form PageStart
     */
    
    // Background Image Frame
    BackgroundImageFrame bgImg = new BackgroundImageFrame();
    // Scaled Image Label
    ScaleImg scaleImg = new ScaleImg();
    //---------------------------------
    private PageSwitch pageSwitch;
    private Validations val;
    
    public PageStart() {
        // No Default Frame (before initComponents)
        this.setUndecorated(true);
        // Background Image Frame
        this.setContentPane(bgImg);
        //-----------------------------------
        this.pageSwitch = new PageSwitch();
        this.val = new Validations();
        
        initComponents();
        // Center JFrame
        this.setLocationRelativeTo(null);
        
        scaleImg.scaleImageBg("/otsImages/img-hotel_alura_2.png", jLabelStart);
        
        scaleImg.insertImageBtnClose("/otsImages/icon-close.png", jLabelClose);
        scaleImg.insertImageBtnMin("/otsImages/icon-minimize.png", jLabelMinimize);
        
        jLabelClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jLabelMinimize.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelStart = new javax.swing.JLabel();
        buttonPageLogin = new otsViews.ButtonCustom();
        jPanelButtons = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonPageLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otsImages/icon-login_page.png"))); // NOI18N
        buttonPageLogin.setToolTipText("Log-in page");
        buttonPageLogin.setColor(new java.awt.Color(51, 51, 51));
        buttonPageLogin.setColorBorder(new java.awt.Color(255, 255, 204));
        buttonPageLogin.setColorClick(new java.awt.Color(65, 65, 65));
        buttonPageLogin.setColorOver(new java.awt.Color(35, 35, 35));
        buttonPageLogin.setRadius(40);
        buttonPageLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPageLoginActionPerformed(evt);
            }
        });

        jPanelButtons.setOpaque(false);
        jPanelButtons.setPreferredSize(new java.awt.Dimension(200, 90));

        jLabelClose.setToolTipText("Close");
        jLabelClose.setPreferredSize(new java.awt.Dimension(65, 65));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseReleased(evt);
            }
        });

        jLabelMinimize.setToolTipText("Minimize");
        jLabelMinimize.setPreferredSize(new java.awt.Dimension(65, 65));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createSequentialGroup()
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMinimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabelStart, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonPageLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(buttonPageLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        //System.exit(0);
        val.exitValidation();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        scaleImg.scaleImageBtnCloseEnlarge("/otsImages/icon-close.png", jLabelClose);
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        scaleImg.insertImageBtnClose("/otsImages/icon-close.png", jLabelClose);
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jLabelCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMousePressed
        scaleImg.scaleImageBtnCloseReduce("/otsImages/icon-close.png", jLabelClose);
    }//GEN-LAST:event_jLabelCloseMousePressed

    private void jLabelCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseReleased
        scaleImg.scaleImageBtnCloseEnlarge("/otsImages/icon-close.png", jLabelClose);
    }//GEN-LAST:event_jLabelCloseMouseReleased

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        scaleImg.scaleImageBtnMinEnlarge("/otsImages/icon-minimize.png", jLabelMinimize);
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        scaleImg.insertImageBtnMin("/otsImages/icon-minimize.png", jLabelMinimize);
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jLabelMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMousePressed
        scaleImg.scaleImageBtnMinReduce("/otsImages/icon-minimize.png", jLabelMinimize);
    }//GEN-LAST:event_jLabelMinimizeMousePressed

    private void jLabelMinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseReleased
        scaleImg.scaleImageBtnMinEnlarge("/otsImages/icon-minimize.png", jLabelMinimize);
    }//GEN-LAST:event_jLabelMinimizeMouseReleased

    private void buttonPageLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPageLoginActionPerformed
        pageSwitch.startForward(this);
    }//GEN-LAST:event_buttonPageLoginActionPerformed
    //--------------------------------------------------------------------------

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PageStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private otsViews.ButtonCustom buttonPageLogin;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelStart;
    private javax.swing.JPanel jPanelButtons;
    // End of variables declaration//GEN-END:variables
}
