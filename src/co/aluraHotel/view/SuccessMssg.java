
package co.aluraHotel.view;

import co.aluraHotel.Util.PageSwitch;

/**
 *
 * @author JC
 */
public class SuccessMssg extends javax.swing.JFrame {

    /**
     * Creates new form SuccessMssg
    */
    
    private PageSwitch pageSwitch;
    
    public SuccessMssg() {
        this.pageSwitch = new PageSwitch();
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBG = new otsViews.PanelRoundBorderGradientColor();
        jLabelSuccess = new javax.swing.JLabel();
        panelBgPanel = new otsViews.PanelRoundBorderGradientColor();
        jLabelSuccessTxt2 = new javax.swing.JLabel();
        jLabelSuccessTxt3 = new javax.swing.JLabel();
        buttonOk = new otsViews.ButtonCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBG.setColor1(new java.awt.Color(255, 255, 255));
        panelBG.setColor2(new java.awt.Color(255, 255, 255));

        jLabelSuccess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSuccess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otsImages/gif-verified.gif"))); // NOI18N
        jLabelSuccess.setPreferredSize(new java.awt.Dimension(200, 200));

        panelBgPanel.setColor1(new java.awt.Color(233, 253, 255));
        panelBgPanel.setColor2(new java.awt.Color(255, 255, 255));

        jLabelSuccessTxt2.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 22)); // NOI18N
        jLabelSuccessTxt2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSuccessTxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSuccessTxt2.setText("Your data has been ");
        jLabelSuccessTxt2.setPreferredSize(new java.awt.Dimension(230, 30));

        jLabelSuccessTxt3.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 22)); // NOI18N
        jLabelSuccessTxt3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSuccessTxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSuccessTxt3.setText("successfully saved...");
        jLabelSuccessTxt3.setPreferredSize(new java.awt.Dimension(230, 30));

        buttonOk.setForeground(new java.awt.Color(51, 51, 51));
        buttonOk.setText("Accept");
        buttonOk.setColorBorder(new java.awt.Color(178, 208, 211));
        buttonOk.setColorClick(new java.awt.Color(102, 206, 204));
        buttonOk.setColorOver(new java.awt.Color(113, 190, 199));
        buttonOk.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        buttonOk.setPreferredSize(new java.awt.Dimension(100, 40));
        buttonOk.setRadius(25);
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBgPanelLayout = new javax.swing.GroupLayout(panelBgPanel);
        panelBgPanel.setLayout(panelBgPanelLayout);
        panelBgPanelLayout.setHorizontalGroup(
            panelBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgPanelLayout.createSequentialGroup()
                .addGroup(panelBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBgPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSuccessTxt3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSuccessTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBgPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(buttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelBgPanelLayout.setVerticalGroup(
            panelBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabelSuccessTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSuccessTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(buttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBGLayout = new javax.swing.GroupLayout(panelBG);
        panelBG.setLayout(panelBGLayout);
        panelBGLayout.setHorizontalGroup(
            panelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBGLayout.setVerticalGroup(
            panelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBgPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
        pageSwitch.successOk(this);
    }//GEN-LAST:event_buttonOkActionPerformed

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
            java.util.logging.Logger.getLogger(SuccessMssg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuccessMssg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuccessMssg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuccessMssg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuccessMssg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private otsViews.ButtonCustom buttonOk;
    private javax.swing.JLabel jLabelSuccess;
    private javax.swing.JLabel jLabelSuccessTxt2;
    private javax.swing.JLabel jLabelSuccessTxt3;
    private otsViews.PanelRoundBorderGradientColor panelBG;
    private otsViews.PanelRoundBorderGradientColor panelBgPanel;
    // End of variables declaration//GEN-END:variables
}
