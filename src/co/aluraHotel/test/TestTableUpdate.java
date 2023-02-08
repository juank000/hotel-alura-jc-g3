
package co.aluraHotel.test;

import java.math.RoundingMode;
import java.sql.Date;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.swing.JTable;
import co.aluraHotel.Util.Calculations;
import co.aluraHotel.Util.OptionMessages;
import co.aluraHotel.Util.ViewSearchMethods;

/**
 *
 * @author JC
 */
public class TestTableUpdate extends javax.swing.JFrame {

    /**
     * Creates new form TestTableUpdate
     */
    
    private static final DecimalFormat dec2 = new DecimalFormat("0.00");
    private ViewSearchMethods vsm;
    private OptionMessages om;
    private Calculations calc;
    
    public TestTableUpdate() {
        this.vsm = new ViewSearchMethods();
        this.om = new OptionMessages();
        this.calc = new Calculations();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "bk id", "checkin", "checkout", "qty gts", "price", "payment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id G", "name", "surname", "Birth", "Nationality", "Phone", "Email", "Id B"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jTextField2.setEditable(false);

        jButton3.setText("show");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Calculate");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("RegEx");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(271, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        vsm.cleanTableVSM(jTable1);      
        if (jTextField1.getText().equals("")) {
            vsm.createTableBooking(jTable1);          
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO calculation:
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate today = LocalDate.now( zoneId);
        Date today_ = Date.valueOf(today);
                      
        Date checkIn = Date.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        Date checkout = Date.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        Integer qtyGuests = Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        //Double price = Double.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        
        System.out.println("check in: " + checkIn);
        System.out.println("check out: " + checkout);
        //System.out.println("price: " + price);
        
        System.out.println("new date ntoday: " + today_);
        System.out.println("new date ntoday: " + today_.getClass());
            
        dec2.setRoundingMode(RoundingMode.DOWN);
        
        if(checkIn.compareTo(today_) < 0)  {
            om.launchWarning("Please enter a valid check-in date");     
        } else if(checkout.compareTo(checkIn) <= 0) {
            om.launchWarning("Please enter a valid check-out date");
        } else {
            Double priceDay = 456.789;
            //int days = checkout.compareTo(checkIn);
            int days = Period.between(checkIn.toLocalDate(), checkout.toLocalDate()).getDays();
            int daysInv = Period.between(checkout.toLocalDate(), checkIn.toLocalDate()).getDays();
            /*Double nPrice = (days * priceDay) * qtyGuests;
            jTable1.setValueAt(dec2.format(nPrice), jTable1.getSelectedRow(), 4);
            
            System.out.println("days: " + days);
            om.launchMessage("new price: " + dec2.format(nPrice)); */
                        
            /*int priceConfirm = om.launchConfirmation("Total price:\n$" + dec2.format(nPrice));
            if(priceConfirm == 0) {
                //return true;
                om.launchMessage("new price: " + dec2.format(nPrice));
            }*/
            //return false;
            System.out.println("days: " + days);
            System.out.println("days inv: " + daysInv);
        }  
               
        
        if(checkout.compareTo(today_) == -1){
            System.out.println("The date can no longer be edited");
        }else{
            System.out.println("The date can be edited");
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        vsm.cleanTableVSM(jTable3);      
        if (jTextField2.getText().equals("")) {
            vsm.createTableGuests(jTable3);          
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO:
        try{ 
        Date dateBirth = Date.valueOf(jTable3.getValueAt(jTable3.getSelectedRow(), 3).toString());
        LocalDate dbirth = dateBirth.toLocalDate();
        
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate today = LocalDate.now( zoneId);
        
        System.out.println("get date: " + dateBirth);
        System.out.println("set date: " + dbirth);
        
        if(Period.between(dbirth, today).getYears() < 18){
            om.launchWarning("It seems you are not an adult");
            //vsm.cleanTableVSM(jTable3);
            //vsm.createTableGuests(jTable3);
        } else {
            om.launchMessage("Everything seems OK");
            jTable3.setValueAt(dbirth, jTable3.getSelectedRow(), 3);
            //return true;
        }  
        //return false;
        }catch(Exception e){
            om.launchWarning("Ivalid date");
        } finally{
            vsm.cleanTableVSM(jTable3);
            vsm.createTableGuests(jTable3);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String mRgx = jTextField3.getText();
                
        // \(\d{3}\)\-\d{3}\-\d{4} matches (555)-555-5555.
        String rgx = "\\(\\d{3}\\)\\-\\d{3}\\-\\d{4}";       
        System.out.println(Pattern.matches("\\(\\d{3}\\)\\-\\d{3}\\-\\d{4}", "(555)-555-5555"));
        
        // (rgx == mRgx) -> error
        if(Pattern.matches(rgx, mRgx)){
            System.out.println("ok: " + mRgx);
        }else{
            System.out.println("not ok");
        }
        
        System.out.println("----------");      
        String rextx = "^[a-zA-Z\\''()\\s]+";
        System.out.println("text: " + mRgx);
        System.out.println("Def: " + Pattern.matches(rextx, mRgx));
        System.out.println("----------");
        String rexem = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        System.out.println("mail: " + mRgx);
        System.out.println("Def: " + Pattern.matches(rexem, mRgx));
        
    }//GEN-LAST:event_jButton5ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(TestTableUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestTableUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestTableUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestTableUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestTableUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
