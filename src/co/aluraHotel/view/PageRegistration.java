
package co.aluraHotel.view;

import co.aluraHotel.Util.ClearFields;
import java.awt.Cursor;
import javax.swing.JTextField;
import co.aluraHotel.Util.PageSwitch;
import co.aluraHotel.Util.Validations;
import co.aluraHotel.Util.ViewSearchMethods;
import otsViews.BackgroundImagePanel;
import otsViews.SampleCalendarDesign;
import otsViews.ScaleImg;

/**
 *
 * @author JC
 */
public class PageRegistration extends javax.swing.JFrame {

    /**
     * Creates new form PageRegistration
     */
    
    BackgroundImagePanel bgImg = new BackgroundImagePanel();
    SampleCalendarDesign scd = new SampleCalendarDesign();
    ScaleImg scaleImg = new ScaleImg();
    ClearFields clearFields = new ClearFields();
    
    private PageSwitch pageSwitch;
    private Validations validations;
    private ViewSearchMethods vsm;
            
    public PageRegistration() {
        this.pageSwitch = new PageSwitch();
        this.validations = new Validations();
        this.vsm = new ViewSearchMethods();
        
        this.setUndecorated(true);
        this.setContentPane(bgImg);
        initComponents();
        this.setLocationRelativeTo(null);
                
        scaleImg.insertImageBtnClose("/otsImages/icon-close.png", jLabelClose);
        scaleImg.insertImageBtnMin("/otsImages/icon-minimize.png", jLabelMinimize);
        
        jLabelClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jLabelMinimize.setCursor(new Cursor(Cursor.HAND_CURSOR));
               
        jTextFieldBookingId.setEditable(false);
        datePickerBirth.getSettings().setAllowKeyboardEditing(false);
        scd.designHighlightPolicy(datePickerBirth);
        vsm.createTextFieldBookingId(jTextFieldBookingId);
                        
    }
    
    //--------------------------------------------------------------------------
    /*private void saveDataGtW() {
        String dBirth = datePickerBirth.getDate().toString();
        //String dBirth = datePickerBirth.getDate().format(DateTimeFormatter.ISO_LOCAL_DATE);
        Guests guests = new Guests(jTextFieldName.getText(),
                                 jTextFieldSurname.getText(),
                              java.sql.Date.valueOf(dBirth),
                              (String)comboBoxNationality.getSelectedItem(),
                                   jTextFieldPhone.getText(),
                                Integer.parseInt(jTextFieldBookingId.getText()));
        guestsController.saveGt(guests);
    }*/
    //--------------------------------------------------------------------------

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelButtons = new javax.swing.JPanel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelSurname = new javax.swing.JLabel();
        jTextFieldSurname = new javax.swing.JTextField();
        jLabelBirth = new javax.swing.JLabel();
        datePickerBirth = new com.github.lgooddatepicker.components.DatePicker();
        jLabelNationality = new javax.swing.JLabel();
        comboBoxNationality = new otsViews.ComboBoxScrollbar();
        jLabelPhone = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabelBookingId = new javax.swing.JLabel();
        jTextFieldBookingId = new javax.swing.JTextField();
        buttonSaveReg = new otsViews.ButtonCustom();
        buttonCancelReg = new otsViews.ButtonCustom();
        buttonCustomBack = new otsViews.ButtonCustom();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelButtons.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanelButtons.setOpaque(false);

        jLabelMinimize.setPreferredSize(new java.awt.Dimension(65, 65));
        jLabelMinimize.setToolTipText("Minimize");
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

        jLabelClose.setPreferredSize(new java.awt.Dimension(65, 65));
        jLabelClose.setToolTipText("Close");
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

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMinimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Guest Registration");
        jLabelTitle.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTitle.setPreferredSize(new java.awt.Dimension(220, 30));

        jLabelName.setText("Name");
        jLabelName.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 15)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(204, 216, 233));
        jLabelName.setPreferredSize(new java.awt.Dimension(100, 30));

        jTextFieldName.setPreferredSize(new java.awt.Dimension(250, 30));
        jTextFieldName.setToolTipText("Don't try numbers or special characters");

        jLabelSurname.setText("Surname");
        jLabelSurname.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 15)); // NOI18N
        jLabelSurname.setForeground(new java.awt.Color(204, 216, 233));
        jLabelSurname.setPreferredSize(new java.awt.Dimension(100, 30));

        jTextFieldSurname.setPreferredSize(new java.awt.Dimension(250, 30));
        jTextFieldSurname.setToolTipText("Don't try numbers or special characters");

        jLabelBirth.setText("Date of Birth");
        jLabelBirth.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 15)); // NOI18N
        jLabelBirth.setForeground(new java.awt.Color(204, 216, 233));
        jLabelBirth.setPreferredSize(new java.awt.Dimension(100, 30));

        datePickerBirth.setOpaque(false);
        datePickerBirth.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabelNationality.setText("Nationality");
        jLabelNationality.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 15)); // NOI18N
        jLabelNationality.setForeground(new java.awt.Color(204, 216, 233));
        jLabelNationality.setPreferredSize(new java.awt.Dimension(100, 30));

        comboBoxNationality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Andorra", "United Arab Emirates", "Afghanistan", "Antigua and Barbuda", "Anguilla", "Albania", "Armenia", "Netherlands Antilles", "Angola", "Antarctica", "Argentina", "American Samoa", "Austria", "Australia", "Aruba", "Azerbaijan", "Bosnia and Herzegovina", "Barbados", "Bangladesh", "Belgium", "Burkina Faso", "Bahrain", "Burundi", "Benin", "Bermuda", "Bolivia", "Brazil", "Bahamas", "Bhutan", "Bouvet Island", "Bulgaria", "Botswana", "Brunei Darussalam", "Belarus", "Belize", "Canada", "Cocos (Keeling) Islands", "Central African Republic", "Congo", "Switzerland", "Cote D'Ivoire (Ivory Coast)", "Cook Islands", "Chile", "Cameroon", "China", "Colombia", "Costa Rica", "Cuba", "Cape Verde", "Christmas Island", "Cyprus", "Czech Republic", "Germany", "Djibouti", "Denmark", "Dominica", "Dominican Republic", "Algeria", "Ecuador", "Estonia", "Egypt", "Western Sahara", "Eritrea", "Spain", "Ethiopia", "Finland", "Fiji", "Falkland Islands (Malvinas)", "Micronesia", "Faroe Islands", "France", "Gabon", "Great Britain (UK)", "Grenada", "Georgia", "French Guiana", "Ghana", "Gibraltar", "Greenland", "Gambia", "Guinea", "Guadeloupe", "Equatorial Guinea", "Greece", "South Georgia and South Sandwich Islands", "Guatemala", "Guam", "Guinea-Bissau", "Guyana", "Hong Kong", "Heard and McDonald Islands", "Honduras", "Croatia and Hrvatska", "Haiti", "Hungary", "Indonesia", "Ireland", "Israel", "India", "British Indian Ocean Territory", "Iraq", "Iran", "Iceland", "Italy", "Jamaica", "Jordan", "Japan", "Kenya", "Kyrgyzstan", "Cambodia", "Kiribati", "Comoros", "Saint Kitts and Nevis", "Korea North", "Korea South", "Kuwait", "Cayman Islands", "Kazakhstan", "Laos", "Lebanon", "Saint Lucia", "Liechtenstein", "Sri Lanka", "Liberia", "Lesotho", "Lithuania", "Luxembourg", "Latvia", "Libya", "Morocco", "Monaco", "Moldova", "Madagascar", "Marshall Islands", "Macedonia", "Mali", "Myanmar", "Mongolia", "Macau", "Northern Mariana Islands", "Martinique", "Mauritania", "Montserrat", "Malta", "Mauritius", "Maldives", "Malawi", "Mexico", "Malaysia", "Mozambique", "Namibia", "New Caledonia", "Niger", "Norfolk Island", "Nigeria", "Nicaragua", "Netherlands", "Norway", "Nepal", "Nauru", "Niue", "New Zealand", "Oman", "Panama", "Peru", "French Polynesia", "Papua New Guinea", "Philippines", "Pakistan", "Poland", "St. Pierre and Miquelon", "Pitcairn", "Puerto Rico", "Portugal", "Palau", "Paraguay", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saudi Arabia", "Solomon Islands", "Seychelles", "Sudan", "Sweden", "Singapore", "St. Helena", "Slovenia", "Svalbard and Jan Mayen Islands", "Slovak Republic", "Sierra Leone", "San Marino", "Senegal", "Somalia", "Suriname", "Sao Tome and Principe", "El Salvador", "Syria", "Swaziland", "Turks and Caicos Islands", "Chad", "French Southern Territories", "Togo", "Thailand", "Tajikistan", "Tokelau", "Turkmenistan", "Tunisia", "Tonga", "East Timor", "Turkey", "Trinidad and Tobago", "Tuvalu", "Taiwan", "Tanzania", "Ukraine", "Uganda", "United Kingdom", "US Minor Outlying Islands", "United States of America (USA)", "Uruguay", "Uzbekistan", "Vatican City State", "Saint Vincent and the Grenadines", "Venezuela", "Virgin Islands (British)", "Viet Nam", "Vanuatu", "Wallis and Futuna Islands", "Samoa", "Yemen", "Mayotte", "Yugoslavia", "South Africa", "Zambia", "Zaire", "Zimbabwe" }));
        comboBoxNationality.setSelectedIndex(-1);
        comboBoxNationality.setOpaque(false);
        comboBoxNationality.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabelPhone.setText("Phone");
        jLabelPhone.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 15)); // NOI18N
        jLabelPhone.setForeground(new java.awt.Color(204, 216, 233));
        jLabelPhone.setPreferredSize(new java.awt.Dimension(100, 30));

        jTextFieldPhone.setPreferredSize(new java.awt.Dimension(250, 30));
        jTextFieldPhone.setToolTipText("Please follow the structure: (123)-456-7890");

        jLabelBookingId.setText("Booking ID");
        jLabelBookingId.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 15)); // NOI18N
        jLabelBookingId.setForeground(new java.awt.Color(204, 216, 233));
        jLabelBookingId.setPreferredSize(new java.awt.Dimension(100, 30));

        jTextFieldBookingId.setEditable(false);
        jTextFieldBookingId.setBackground(new java.awt.Color(84, 97, 116));
        jTextFieldBookingId.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldBookingId.setPreferredSize(new java.awt.Dimension(250, 30));

        buttonSaveReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otsImages/icon-save.png"))); // NOI18N
        buttonSaveReg.setColor(new java.awt.Color(74, 78, 83));
        buttonSaveReg.setColorBorder(new java.awt.Color(153, 255, 153));
        buttonSaveReg.setColorClick(new java.awt.Color(204, 212, 231));
        buttonSaveReg.setColorOver(new java.awt.Color(58, 63, 68));
        buttonSaveReg.setPreferredSize(new java.awt.Dimension(65, 65));
        buttonSaveReg.setRadius(25);
        buttonSaveReg.setToolTipText("Save");
        buttonSaveReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveRegActionPerformed(evt);
            }
        });

        buttonCancelReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otsImages/icon-delete-2.png"))); // NOI18N
        buttonCancelReg.setColor(new java.awt.Color(74, 78, 83));
        buttonCancelReg.setColorBorder(new java.awt.Color(255, 153, 153));
        buttonCancelReg.setColorClick(new java.awt.Color(204, 212, 231));
        buttonCancelReg.setColorOver(new java.awt.Color(58, 63, 68));
        buttonCancelReg.setPreferredSize(new java.awt.Dimension(65, 65));
        buttonCancelReg.setRadius(25);
        buttonCancelReg.setToolTipText("Cancel");
        buttonCancelReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelRegActionPerformed(evt);
            }
        });

        buttonCustomBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otsImages/icon-back.png"))); // NOI18N
        buttonCustomBack.setColor(new java.awt.Color(74, 78, 83));
        buttonCustomBack.setColorBorder(new java.awt.Color(153, 204, 255));
        buttonCustomBack.setColorClick(new java.awt.Color(204, 212, 231));
        buttonCustomBack.setColorOver(new java.awt.Color(58, 63, 68));
        buttonCustomBack.setPreferredSize(new java.awt.Dimension(65, 65));
        buttonCustomBack.setRadius(25);
        buttonCustomBack.setToolTipText("Back");
        buttonCustomBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustomBackActionPerformed(evt);
            }
        });

        jLabelEmail.setText("E-Mail");
        jLabelEmail.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 15)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(204, 216, 233));
        jLabelEmail.setPreferredSize(new java.awt.Dimension(100, 30));

        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(250, 30));
        jTextFieldEmail.setToolTipText("Plese lead by: example@email.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(339, Short.MAX_VALUE)
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelNationality, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBookingId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datePickerBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldBookingId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSaveReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancelReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCustomBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonCancelReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCustomBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSaveReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePickerBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBookingId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBookingId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // -------------------------------------------------------------------------
    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        //System.exit(0);
        validations.exitValidation();
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

    private void buttonCustomBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustomBackActionPerformed
        pageSwitch.registrationBack(this);
    }//GEN-LAST:event_buttonCustomBackActionPerformed

    private void buttonSaveRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveRegActionPerformed
        validations.registrationValidation(jTextFieldName,
                                         jTextFieldSurname,
                                          datePickerBirth,
                                         comboBoxNationality,
                                           jTextFieldPhone,
                                           jTextFieldEmail,
                                              jTextFieldBookingId,
                                              this);
    }//GEN-LAST:event_buttonSaveRegActionPerformed

    private void buttonCancelRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelRegActionPerformed
        clearFields.clearRegistrationPage(jTextFieldName, jTextFieldSurname, datePickerBirth, comboBoxNationality, jTextFieldPhone, jTextFieldEmail);
    }//GEN-LAST:event_buttonCancelRegActionPerformed
    // -------------------------------------------------------------------------
    
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
            java.util.logging.Logger.getLogger(PageRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private otsViews.ButtonCustom buttonCancelReg;
    private otsViews.ButtonCustom buttonCustomBack;
    private otsViews.ButtonCustom buttonSaveReg;
    private otsViews.ComboBoxScrollbar comboBoxNationality;
    private com.github.lgooddatepicker.components.DatePicker datePickerBirth;
    private javax.swing.JLabel jLabelBirth;
    private javax.swing.JLabel jLabelBookingId;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNationality;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JTextField jTextFieldBookingId;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldSurname;
    // End of variables declaration//GEN-END:variables
}
