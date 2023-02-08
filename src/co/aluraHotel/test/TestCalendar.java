
package co.aluraHotel.test;

import com.github.lgooddatepicker.components.DatePickerSettings.DateArea;
import java.awt.Color;
import java.awt.Font;

import java.time.LocalDate;
import java.time.ZoneId;
import java.math.RoundingMode;  
import java.text.DecimalFormat;  
import java.time.Period;
import javax.swing.JButton;
import otsViews.SampleCalendarDesign;
import otsViews.SampleDateVetoPolicy;
import otsViews.SampleHighlightPolicy;
import otsViews.ScaleImg;
/**
 *
 * @author JC
 */
public class TestCalendar extends javax.swing.JFrame {

    /**
     * Creates new form TestCalendar
     */
    
    ScaleImg scaleImg = new ScaleImg();
    SampleCalendarDesign scd = new SampleCalendarDesign();
       
    private static final DecimalFormat dec2 = new DecimalFormat("0.00");
            
    public TestCalendar() {
        
        initComponents();
        
        //------------------------------------------------------------------------
        
        JButton datePickerButton = datePicker1.getComponentToggleCalendarButton();
        datePickerButton.setText("");
        scaleImg.scaleImageIconJBtn("/otsImages/icon-booking.png", datePickerButton);
        datePicker1.getSettings().setVetoPolicy(new SampleDateVetoPolicy());
        
        //------------------------------------------------------------------------
        
        datePicker2.getSettings().setHighlightPolicy(new SampleHighlightPolicy());
        
        //------------------------------------------------------------------------
        
        datePicker3.getSettings().setAllowKeyboardEditing(false);
        datePicker3.getSettings().setFontValidDate(new Font(Font.DIALOG, Font.BOLD, 11));
        
        datePicker3.getSettings().setColor(DateArea.BackgroundOverallCalendarPanel, Color.GRAY);
        datePicker3.getSettings().setColor(DateArea.CalendarTextNormalDates, new Color(70,70,70));
        datePicker3.getSettings().setColor(DateArea.CalendarTextWeekdays, new Color(60,60,60));
        datePicker3.getSettings().setColor(DateArea.BackgroundMonthAndYearNavigationButtons, Color.CYAN);
        datePicker3.getSettings().setColor(DateArea.BackgroundMonthAndYearMenuLabels, Color.LIGHT_GRAY);        
        datePicker3.getSettings().setColor(DateArea.BackgroundTodayLabel, Color.LIGHT_GRAY);
        datePicker3.getSettings().setColor(DateArea.BackgroundClearLabel, Color.MAGENTA);     
        
        //------------------------------------------------------------------------
        
        datePicker4.getSettings().setColor(DateArea.BackgroundOverallCalendarPanel, Color.BLACK);
        
        datePicker4.getSettings().setColor(DateArea.DatePickerTextValidDate, Color.MAGENTA);
        datePicker4.getSettings().setFontValidDate(new Font("Monospaced", Font.ITALIC | Font.BOLD, 14));
        datePicker4.setDateToToday();
        
        datePicker4.getSettings().setColor(DateArea.CalendarTextWeekdays, Color.WHITE);
        
        datePicker4.getSettings().setColor(DateArea.CalendarBackgroundNormalDates, new Color(48, 48, 74));  
        
        datePicker4.getSettings().setColor(DateArea.BackgroundMonthAndYearMenuLabels, Color.WHITE);
        
        datePicker4.getSettings().setColor(DateArea.BackgroundMonthAndYearNavigationButtons, Color.BLACK);
        datePicker4.getSettings().setColor(DateArea.TextMonthAndYearNavigationButtons, Color.WHITE);
                
        datePicker4.getSettings().setColor(DateArea.BackgroundCalendarPanelLabelsOnHover, Color.MAGENTA);
        datePicker4.getSettings().setColor(DateArea.TextCalendarPanelLabelsOnHover, Color.DARK_GRAY);         
        
        datePicker4.getSettings().setColor(DateArea.TextMonthAndYearMenuLabels, new Color(28, 0, 132));
        datePicker4.getSettings().setColor(DateArea.CalendarTextNormalDates, Color.GRAY);
        
        datePicker4.getSettings().setColor(DateArea.BackgroundTodayLabel, Color.DARK_GRAY);
        datePicker4.getSettings().setColor(DateArea.TextTodayLabel, Color.LIGHT_GRAY);
        datePicker4.getSettings().setColor(DateArea.BackgroundClearLabel, Color.LIGHT_GRAY);
        datePicker4.getSettings().setColor(DateArea.TextClearLabel, Color.DARK_GRAY);
        
        datePicker4.getSettings().setColor(DateArea.CalendarBackgroundSelectedDate, Color.PINK);
        datePicker4.getSettings().setColor(DateArea.CalendarBorderSelectedDate, new Color(238, 221, 255));
        
        datePicker4.getSettings().setColorBackgroundWeekdayLabels(new Color(187, 119, 255), true);
        datePicker4.getSettings().setColorBackgroundWeekNumberLabels(Color.WHITE, true);
        
        Font randomFont = new Font("Monospaced", Font.ITALIC | Font.BOLD, 12);
        Font smallerFont = new Font("Serif", Font.BOLD, 10);
        datePicker4.getSettings().setFontMonthAndYearMenuLabels(randomFont);
        datePicker4.getSettings().setFontMonthAndYearNavigationButtons(randomFont);
        datePicker4.getSettings().setFontTodayLabel(randomFont);
        datePicker4.getSettings().setFontClearLabel(randomFont);
        datePicker4.getSettings().setFontCalendarDateLabels(randomFont);
        datePicker4.getSettings().setFontCalendarWeekdayLabels(smallerFont);
        datePicker4.getSettings().setFontCalendarWeekNumberLabels(smallerFont);
        
        //------------------------------------------------------------------------
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        datePicker3 = new com.github.lgooddatepicker.components.DatePicker();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        datePicker4 = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(datePicker4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))
                            .addComponent(datePicker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(datePicker2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(datePicker4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO
        //ZoneId zoneId = ZoneId.of( "America/New_York" );
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate today = LocalDate.now( zoneId);
        
        System.out.println("today: " + today);
        //System.out.println("today: " + today.getClass());
        LocalDate datePk = datePicker1.getDate();
        System.out.println("date: " + datePk);
        //System.out.println("date: " + datePk.getClass());
        
        System.out.println(datePk.compareTo(today));
        
        if(datePk.compareTo(today) < 0)  {
            System.out.println("It's not possible, please enter a valid date");         
        }
        
        LocalDate datePk2 = datePicker2.getDate();
        System.out.println("date: " + datePk2);
        
        System.out.println("dates chk: " + datePk2.compareTo(datePk));
        
        int qty = 3;
        Double priceDay = 456.7754684;
        int days = datePk2.compareTo(datePk);
        Double price = days * priceDay * qty;
                
        System.out.println("days: " + days);
        //System.out.println("days rev: " + datePk.compareTo(datePk2));
        
        dec2.setRoundingMode(RoundingMode.DOWN);  
        System.out.println("total: " + dec2.format(price));
        
        System.out.println("years: " + Period.between(datePicker3.getDate(), today).getYears());
         
        if(Period.between(datePicker3.getDate(), today).getYears() < 18){
            System.out.println("It seems you are not an adult");
        } else {
            System.out.println("You are an adult");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(TestCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestCalendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker3;
    private com.github.lgooddatepicker.components.DatePicker datePicker4;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
