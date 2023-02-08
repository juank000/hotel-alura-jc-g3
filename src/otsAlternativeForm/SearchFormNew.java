
package otsAlternativeForm;

import co.aluraHotel.controller.BookingController;
import co.aluraHotel.controller.GuestsController;
import java.awt.Color;
import java.awt.Font;
import java.sql.Date;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import otsViews.ScrollbarCustom;

/**
 *
 * @author JC
 */
public class SearchFormNew extends javax.swing.JFrame {

    /**
     * Creates new form SearcFormNew
     */
    
    private SearchMethods searchMethods;
    private SendMethods sendMethods;
    private BookingController bookingController;
    private GuestsController guestsController;
    
    JTable TableBk = new JTable();
    DefaultTableModel jTableModelBooking = (DefaultTableModel) TableBk.getModel();
    JTable TableGt = new JTable();
    DefaultTableModel jTableModelGuest = (DefaultTableModel) TableGt.getModel();
        
    public SearchFormNew() {
        
        this.searchMethods = new SearchMethods();
        this.sendMethods = new SendMethods();
        this.bookingController = new BookingController();
        this.guestsController = new GuestsController();
        
        initComponents();
        
        JScrollPane jpaneBk = new JScrollPane();
        JScrollPane jpaneGt = new JScrollPane();
        
        ScrollbarCustom sbv = new ScrollbarCustom();
        
        customTabbed.setFont(new Font("Roboto", Font.PLAIN, 14));
        customTabbed.setForeground(Color.darkGray);
        
        //----------------------------------------------------------------------        
        tableModelBooking();
        tableModelGuests();
        tableModelJoin();
                
        TableBk.setBackground(Color.DARK_GRAY);
        TableBk.setForeground(Color.LIGHT_GRAY);
        TableBk.getColumnModel().getColumn(2);
        TableBk.setDefaultEditor(Object.class, null);
                
        TableGt.setBackground(Color.BLACK);
        TableGt.setForeground(Color.WHITE);
        TableGt.setDefaultEditor(Object.class, null);
        
        //jTableJoin.getTableHeader().setDefaultRenderer(new TableSimpleHeaderRenderer());
        jTableJoin.getColumnModel().getColumn(0).setHeaderRenderer(new TableSimpleHeaderRenderer());
        jTableJoin.getColumnModel().getColumn(1).setHeaderRenderer(new TableSimpleHeaderRenderer());
        
        jTableJoin.setRowHeight(25);
        jTableJoin.getColumnModel().getColumn(2).setPreferredWidth(15);
        jTableJoin.getColumnModel().getColumn(3).setPreferredWidth(15);
        
        jTableJoin.setDefaultRenderer(Object.class, new TableSimpleCellRender());
        jTableJoin.setDefaultEditor(Object.class, null);
                       
        //----------------------------------------------------------------------
        sbv.setForeground(new Color(151,157,233));
        jScrollPaneJoin.setVerticalScrollBar(sbv);
        //----------------------------------------------------------------------
               
        customTabbedSimple.setEnabled(false);
        
        changeTab();
    
    }
    //--------------------------------------------------------------------------
    public void tableModelBooking() {
        customTabbed.addTab("Booking", new ImageIcon(SearchFormNew.class.getResource("/otsImages/icon-booking.png")), TableBk, null);
        jTableModelBooking.addColumn("Booking Id");
        jTableModelBooking.addColumn("Check In");
        jTableModelBooking.addColumn("Check Out");
        jTableModelBooking.addColumn("Guests Qty");
        jTableModelBooking.addColumn("Price");
        jTableModelBooking.addColumn("Payment Method");       
        searchMethods.createTableBooking(jTableModelBooking);
    }
    
    public void tableModelGuests() {
        customTabbed.addTab("Guests", new ImageIcon(SearchFormNew.class.getResource("/otsImages/icon-booked.png")), TableGt, null);
        jTableModelGuest.addColumn("Guest Id");
        jTableModelGuest.addColumn("Name");
        jTableModelGuest.addColumn("Surname");
        jTableModelGuest.addColumn("Birth Date");
        jTableModelGuest.addColumn("Nationality");
        jTableModelGuest.addColumn("Phone");
        jTableModelGuest.addColumn("Email");
        jTableModelGuest.addColumn("Booking Id");
        searchMethods.createTableGuests(jTableModelGuest);
    }
    
    public void tableModelJoin() {
        DefaultTableModel jTableModelJoin = (DefaultTableModel) jTableJoin.getModel();
        jTableModelJoin.addColumn("Name");
        jTableModelJoin.addColumn("Surname");
        jTableModelJoin.addColumn("Booking Id");
        jTableModelJoin.addColumn("Qty Guests");
        jTableModelJoin.addColumn("Price");
        searchMethods.createTableJoin(jTableJoin);
    }
    //--------------------------------------------------------------------------
    public void changeTab(){    
        customTabbed.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println("Tab db #: " + customTabbed.getSelectedIndex());
                if(customTabbed.getSelectedIndex() == 0){
                    customTabbedSimple.setSelectedIndex(0);
                    System.out.println("open tab blank");
                    clearTabBk();
                    clearTabGT();
                }
                else if(customTabbed.getSelectedIndex() == 1){
                    customTabbedSimple.setSelectedIndex(1);
                    System.out.println("open tab id");
                    clearTabGT();
                }
                else if (customTabbed.getSelectedIndex() == 2){
                    customTabbedSimple.setSelectedIndex(2);
                    System.out.println("open tab name");
                    clearTabBk();   
                }
            }
        });
    }
    
    public void clearTabGT(){
        jTextGtId.setText("");
        jTextName.setText("");
        jTextSurname.setText("");
        datePickerBirth.setDate(null);
        jComboNat.setSelectedIndex(-1);
        jTextPhone.setText("");
        jTextEmail.setText("");
        jTextBkIdFK.setText("");
        TableGt.clearSelection();
    }
    
    public void clearTabBk(){
        dateChkIn.setDate(null);
        dateChkOut.setDate(null);
        jSpinnerQty.setValue(1);
        jTextPrice.setText("");
        jComboPayment.setSelectedIndex(-1);
        jTextBkId.setText("");
        TableBk.clearSelection();
    }
    
    //--------------------------------------------------------------------------

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customTabbed = new otsAlternativeForm.CustomTabbedPaneSimple();
        jPanelJoin = new javax.swing.JPanel();
        jScrollPaneJoin = new javax.swing.JScrollPane();
        jTableJoin = new javax.swing.JTable();
        customTabbedSimple = new otsAlternativeForm.CustomTabbedPaneSimple();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextBkId = new javax.swing.JTextField();
        dateChkIn = new com.github.lgooddatepicker.components.DatePicker();
        dateChkOut = new com.github.lgooddatepicker.components.DatePicker();
        jSpinnerQty = new javax.swing.JSpinner();
        jTextPrice = new javax.swing.JTextField();
        jComboPayment = new javax.swing.JComboBox<>();
        jButtonEditBk = new javax.swing.JButton();
        jButtonGetId = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextGtId = new javax.swing.JTextField();
        jTextName = new javax.swing.JTextField();
        jTextSurname = new javax.swing.JTextField();
        datePickerBirth = new com.github.lgooddatepicker.components.DatePicker();
        jComboNat = new javax.swing.JComboBox<>();
        jTextPhone = new javax.swing.JTextField();
        jTextBkIdFK = new javax.swing.JTextField();
        jButtonEditGt = new javax.swing.JButton();
        jButtonGetNm = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelJoin.setBackground(new java.awt.Color(204, 204, 255));

        jScrollPaneJoin.setViewportView(jTableJoin);

        javax.swing.GroupLayout jPanelJoinLayout = new javax.swing.GroupLayout(jPanelJoin);
        jPanelJoin.setLayout(jPanelJoinLayout);
        jPanelJoinLayout.setHorizontalGroup(
            jPanelJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneJoin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        jPanelJoinLayout.setVerticalGroup(
            jPanelJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneJoin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );

        customTabbed.addTab("JOIN TABLE", jPanelJoin);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("No edit allowed");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel14)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel14)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        customTabbedSimple.addTab("", jPanel3);

        jTextBkId.setEditable(false);
        jTextBkId.setPreferredSize(new java.awt.Dimension(72, 25));

        jTextPrice.setEditable(false);

        jComboPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit Card", "Debit Card", "Bank e-Transfer" }));
        jComboPayment.setSelectedIndex(-1);

        jButtonEditBk.setText("Edit");
        jButtonEditBk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditBkActionPerformed(evt);
            }
        });

        jButtonGetId.setText("Get");
        jButtonGetId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGetIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Booking Id");

        jLabel2.setText("Check In");

        jLabel3.setText("Check Out");

        jLabel4.setText("Qty Guests");

        jLabel5.setText("Price");

        jLabel6.setText("Payment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateChkOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateChkIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addComponent(jComboPayment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextBkId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGetId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditBk)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBkId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateChkIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateChkOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGetId)
                    .addComponent(jButtonEditBk))
                .addGap(21, 21, 21))
        );

        customTabbedSimple.addTab("Edit by Id", jPanel1);

        jTextGtId.setEditable(false);

        jComboNat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andorra", "United Arab Emirates", "Afghanistan", "Antigua and Barbuda", "Anguilla", "Albania", "Armenia", "Netherlands Antilles", "Angola", "Antarctica", "Argentina", "American Samoa", "Austria", "Australia", "Aruba", "Azerbaijan", "Bosnia and Herzegovina", "Barbados", "Bangladesh", "Belgium", "Burkina Faso", "Bahrain", "Burundi", "Benin", "Bermuda", "Bolivia", "Brazil", "Bahamas", "Bhutan", "Bouvet Island", "Bulgaria", "Botswana", "Brunei Darussalam", "Belarus", "Belize", "Canada", "Cocos (Keeling) Islands", "Central African Republic", "Congo", "Switzerland", "Cote D'Ivoire (Ivory Coast)", "Cook Islands", "Chile", "Cameroon", "China", "Colombia", "Costa Rica", "Cuba", "Cape Verde", "Christmas Island", "Cyprus", "Czech Republic", "Germany", "Djibouti", "Denmark", "Dominica", "Dominican Republic", "Algeria", "Ecuador", "Estonia", "Egypt", "Western Sahara", "Eritrea", "Spain", "Ethiopia", "Finland", "Fiji", "Falkland Islands (Malvinas)", "Micronesia", "Faroe Islands", "France", "Gabon", "Great Britain (UK)", "Grenada", "Georgia", "French Guiana", "Ghana", "Gibraltar", "Greenland", "Gambia", "Guinea", "Guadeloupe", "Equatorial Guinea", "Greece", "South Georgia and South Sandwich Islands", "Guatemala", "Guam", "Guinea-Bissau", "Guyana", "Hong Kong", "Heard and McDonald Islands", "Honduras", "Croatia and Hrvatska", "Haiti", "Hungary", "Indonesia", "Ireland", "Israel", "India", "British Indian Ocean Territory", "Iraq", "Iran", "Iceland", "Italy", "Jamaica", "Jordan", "Japan", "Kenya", "Kyrgyzstan", "Cambodia", "Kiribati", "Comoros", "Saint Kitts and Nevis", "Korea North", "Korea South", "Kuwait", "Cayman Islands", "Kazakhstan", "Laos", "Lebanon", "Saint Lucia", "Liechtenstein", "Sri Lanka", "Liberia", "Lesotho", "Lithuania", "Luxembourg", "Latvia", "Libya", "Morocco", "Monaco", "Moldova", "Madagascar", "Marshall Islands", "Macedonia", "Mali", "Myanmar", "Mongolia", "Macau", "Northern Mariana Islands", "Martinique", "Mauritania", "Montserrat", "Malta", "Mauritius", "Maldives", "Malawi", "Mexico", "Malaysia", "Mozambique", "Namibia", "New Caledonia", "Niger", "Norfolk Island", "Nigeria", "Nicaragua", "Netherlands", "Norway", "Nepal", "Nauru", "Niue", "New Zealand", "Oman", "Panama", "Peru", "French Polynesia", "Papua New Guinea", "Philippines", "Pakistan", "Poland", "St. Pierre and Miquelon", "Pitcairn", "Puerto Rico", "Portugal", "Palau", "Paraguay", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saudi Arabia", "Solomon Islands", "Seychelles", "Sudan", "Sweden", "Singapore", "St. Helena", "Slovenia", "Svalbard and Jan Mayen Islands", "Slovak Republic", "Sierra Leone", "San Marino", "Senegal", "Somalia", "Suriname", "Sao Tome and Principe", "El Salvador", "Syria", "Swaziland", "Turks and Caicos Islands", "Chad", "French Southern Territories", "Togo", "Thailand", "Tajikistan", "Tokelau", "Turkmenistan", "Tunisia", "Tonga", "East Timor", "Turkey", "Trinidad and Tobago", "Tuvalu", "Taiwan", "Tanzania", "Ukraine", "Uganda", "United Kingdom", "US Minor Outlying Islands", "United States of America (USA)", "Uruguay", "Uzbekistan", "Vatican City State", "Saint Vincent and the Grenadines", "Venezuela", "Virgin Islands (British)", "Viet Nam", "Vanuatu", "Wallis and Futuna Islands", "Samoa", "Yemen", "Mayotte", "Yugoslavia", "South Africa", "Zambia", "Zaire", "Zimbabwe" }));
        jComboNat.setSelectedIndex(-1);

        jTextBkIdFK.setEditable(false);

        jButtonEditGt.setText("Edit");
        jButtonEditGt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditGtActionPerformed(evt);
            }
        });

        jButtonGetNm.setText("Get");
        jButtonGetNm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGetNmActionPerformed(evt);
            }
        });

        jLabel7.setText("Gt_ Id");

        jLabel8.setText("Name");

        jLabel9.setText("Surname");

        jLabel10.setText("Birth");

        jLabel11.setText("Country");

        jLabel12.setText("Phone");

        jLabel13.setText("Bk_ Id");

        jLabel15.setText("Email");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextName)
                            .addComponent(jTextSurname)
                            .addComponent(datePickerBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboNat, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButtonGetNm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditGt))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextGtId, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextBkIdFK, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextGtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextBkIdFK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datePickerBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(12, 12, 12)
                        .addComponent(jComboNat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGetNm)
                    .addComponent(jButtonEditGt))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        customTabbedSimple.addTab("Edit by Name", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(customTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customTabbedSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customTabbedSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Edit By Booking Id ------------------------------------------------------
    private void jButtonEditBkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditBkActionPerformed
        // TODO EDIT VALIDATION:
    }//GEN-LAST:event_jButtonEditBkActionPerformed

    private void jButtonGetIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGetIdActionPerformed
        sendMethods.fetchDataById(dateChkIn,
                                  dateChkOut,
                              jSpinnerQty,
                              jTextPrice,
                              jComboPayment,
                              jTextBkId,
                                TableBk);    
    }//GEN-LAST:event_jButtonGetIdActionPerformed

    private void jButtonGetNmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGetNmActionPerformed
        sendMethods.fetchDataByName(jTextName,
                                  jTextSurname,
                                    datePickerBirth,
                                   jComboNat,
                                  jTextPhone,
                                      jTextEmail,
                                      jTextBkIdFK,
                                      jTextGtId,
                                        TableGt);
    }//GEN-LAST:event_jButtonGetNmActionPerformed

    // Edit By Guest Name ------------------------------------------------------
    private void jButtonEditGtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditGtActionPerformed
        // TODO EDIT VALIDATION:
    }//GEN-LAST:event_jButtonEditGtActionPerformed
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
            java.util.logging.Logger.getLogger(SearchFormNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFormNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFormNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFormNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFormNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private otsAlternativeForm.CustomTabbedPaneSimple customTabbed;
    private otsAlternativeForm.CustomTabbedPaneSimple customTabbedSimple;
    private com.github.lgooddatepicker.components.DatePicker dateChkIn;
    private com.github.lgooddatepicker.components.DatePicker dateChkOut;
    private com.github.lgooddatepicker.components.DatePicker datePickerBirth;
    private javax.swing.JButton jButtonEditBk;
    private javax.swing.JButton jButtonEditGt;
    private javax.swing.JButton jButtonGetId;
    private javax.swing.JButton jButtonGetNm;
    private javax.swing.JComboBox<String> jComboNat;
    private javax.swing.JComboBox<String> jComboPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelJoin;
    private javax.swing.JScrollPane jScrollPaneJoin;
    private javax.swing.JSpinner jSpinnerQty;
    private javax.swing.JTable jTableJoin;
    private javax.swing.JTextField jTextBkId;
    private javax.swing.JTextField jTextBkIdFK;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextGtId;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextPhone;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JTextField jTextSurname;
    // End of variables declaration//GEN-END:variables
}
