
package co.aluraHotel.view;

import java.awt.Cursor;
import co.aluraHotel.Util.OptionMessages;
import otsViews.BackgroundImageFrame;
import otsViews.ScaleImg;
import co.aluraHotel.Util.Validations;

/**
 *
 * @author JC
 */
public class PageLogin extends javax.swing.JFrame {
 
    /**
     * Creates new form StartPage
     */
    
    // Background Image Frame
    BackgroundImageFrame bgImg = new BackgroundImageFrame();
    // Scaled Image Label
    ScaleImg scaleImg = new ScaleImg();
    //--------------------------------
    private OptionMessages om;
    private Validations validations;
            
    public PageLogin() {        
        // No Default Frame (before initComponents)
        this.setUndecorated(true);
        
        // Background Image Frame
        this.setContentPane(bgImg);
        
        //----------------------------------- 
        this.om = new OptionMessages();
        this.validations = new Validations();
        
        initComponents();
        
        // Center JFrame
        this.setLocationRelativeTo(null);
        
        // Scaled Image Label
        scaleImg.scaleImageBg("/otsImages/img-hotel_alura_1.png", jLabelImageHotel);
        
        // Scaled Image Label Buttons
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

        jLabelImageHotel = new javax.swing.JLabel();
        jPanelComponents = new javax.swing.JPanel();
        jLabelUser = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jLabelKey = new javax.swing.JLabel();
        jPasswordFieldKey = new javax.swing.JPasswordField();
        buttonLogIn = new otsViews.ButtonCustom();
        jPanelButtons = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelComponents.setOpaque(false);

        jLabelUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otsImages/icon-user.png"))); // NOI18N

        jLabelKey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otsImages/icon-key.png"))); // NOI18N

        buttonLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otsImages/icon-log_in.png"))); // NOI18N
        buttonLogIn.setToolTipText("Enter");
        buttonLogIn.setColor(new java.awt.Color(51, 51, 51));
        buttonLogIn.setColorBorder(new java.awt.Color(204, 255, 204));
        buttonLogIn.setColorClick(new java.awt.Color(65, 65, 65));
        buttonLogIn.setColorOver(new java.awt.Color(35, 35, 35));
        buttonLogIn.setRadius(40);
        buttonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelComponentsLayout = new javax.swing.GroupLayout(jPanelComponents);
        jPanelComponents.setLayout(jPanelComponentsLayout);
        jPanelComponentsLayout.setHorizontalGroup(
            jPanelComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelComponentsLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelComponentsLayout.createSequentialGroup()
                        .addGroup(jPanelComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUser)
                            .addComponent(jLabelKey))
                        .addGap(41, 41, 41)
                        .addGroup(jPanelComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUser)
                            .addComponent(jPasswordFieldKey, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        jPanelComponentsLayout.setVerticalGroup(
            jPanelComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComponentsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelKey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldKey, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanelButtons.setOpaque(false);
        jPanelButtons.setPreferredSize(new java.awt.Dimension(200, 90));

        jLabelClose.setForeground(new java.awt.Color(157, 157, 157));
        jLabelClose.setToolTipText("Close");
        jLabelClose.setMaximumSize(new java.awt.Dimension(65, 65));
        jLabelClose.setMinimumSize(new java.awt.Dimension(60, 60));
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
        jLabelMinimize.setMaximumSize(new java.awt.Dimension(65, 65));
        jLabelMinimize.setMinimumSize(new java.awt.Dimension(60, 60));
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMinimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabelImageHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanelComponents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImageHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(65, 65, 65)
                        .addComponent(jPanelComponents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // -------------------------------------------------------------------------
    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        //System.exit(0);
        validations.exitValidation();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        //Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
        //jLabelClose.setBorder(border);
        scaleImg.scaleImageBtnCloseEnlarge("/otsImages/icon-close.png", jLabelClose);
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        //jLabelClose.setBorder(new EmptyBorder(0, 0, 0, 0));
        scaleImg.insertImageBtnClose("/otsImages/icon-close.png", jLabelClose);
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jLabelCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMousePressed
        //scaleImageBtnCloseReduce();
        scaleImg.scaleImageBtnCloseReduce("/otsImages/icon-close.png", jLabelClose);
    }//GEN-LAST:event_jLabelCloseMousePressed

    private void jLabelCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseReleased
        scaleImg.scaleImageBtnCloseEnlarge("/otsImages/icon-close.png", jLabelClose);
        //jLabelClose.setBorder(new EmptyBorder(0, 0, 0, 0));
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

    private void buttonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogInActionPerformed
        validations.loginDbValidation(jTextFieldUser, jPasswordFieldKey, this);        
    }//GEN-LAST:event_buttonLogInActionPerformed
    // -------------------------------------------------------------------------
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feejLabelClose.setPreferredSize(new Dimension(63, 63));l */
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
            java.util.logging.Logger.getLogger(PageLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private otsViews.ButtonCustom buttonLogIn;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelImageHotel;
    private javax.swing.JLabel jLabelKey;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelComponents;
    private javax.swing.JPasswordField jPasswordFieldKey;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
