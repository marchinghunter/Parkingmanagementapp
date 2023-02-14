
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deepak
 */
public class AddVehicle extends javax.swing.JFrame {

    
    private String categorydataString;
    private String vehiclecompanyString;
    private String registrationString;
    private String ownernameString;
    private String ownernumberString;
    
    public AddVehicle() {
        initComponents();
        setVisible(rootPaneCheckingEnabled);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        adminText = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        addVehicle = new javax.swing.JLabel();
        unpark = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        category = new javax.swing.JLabel();
        vcompany = new javax.swing.JLabel();
        registration = new javax.swing.JLabel();
        ownername = new javax.swing.JLabel();
        ownermobileno = new javax.swing.JLabel();
        ownermobilenofield = new javax.swing.JTextField();
        vcompanyfield = new javax.swing.JTextField();
        registrationfield = new javax.swing.JTextField();
        ownernamefield = new javax.swing.JTextField();
        addVehiclebtn = new javax.swing.JButton();
        categoryBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Vehicle");
        setMinimumSize(new java.awt.Dimension(1110, 814));
        setResizable(false);
        getContentPane().setLayout(null);

        topPanel.setBackground(new java.awt.Color(29, 92, 150));
        topPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 92, 150)));
        topPanel.setForeground(new java.awt.Color(29, 92, 150));

        adminText.setFont(new java.awt.Font("Consolas", 1, 45)); // NOI18N
        adminText.setForeground(new java.awt.Color(255, 255, 255));
        adminText.setText("Admin");

        sidePanel.setBackground(new java.awt.Color(29, 92, 150));
        sidePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 92, 150)));
        sidePanel.setForeground(new java.awt.Color(29, 92, 150));

        addVehicle.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        addVehicle.setForeground(new java.awt.Color(51, 51, 51));
        addVehicle.setText("Add Vehicle");

        unpark.setFont(new java.awt.Font("Consolas", 0, 23)); // NOI18N
        unpark.setForeground(new java.awt.Color(255, 255, 255));
        unpark.setText("Unpark Vehicle");
        unpark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unparkMouseClicked(evt);
            }
        });

        dashboard.setFont(new java.awt.Font("Consolas", 0, 28)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setText("Dashboard");
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Consolas", 0, 32)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addVehicle)
                    .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout))
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(unpark, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(dashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unpark)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 467, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(35, 35, 35))
        );

        centerPanel.setBackground(new java.awt.Color(255, 255, 255));
        centerPanel.setForeground(new java.awt.Color(0, 204, 102));

        category.setBackground(new java.awt.Color(255, 255, 255));
        category.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        category.setText("Category");

        vcompany.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        vcompany.setText("Vehicle Company");

        registration.setFont(new java.awt.Font("Consolas", 0, 28)); // NOI18N
        registration.setText("Registration No.");

        ownername.setFont(new java.awt.Font("Consolas", 0, 28)); // NOI18N
        ownername.setText("Owner Name");

        ownermobileno.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        ownermobileno.setText("Owner Mobile No.");

        ownermobilenofield.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        vcompanyfield.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        registrationfield.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        ownernamefield.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        addVehiclebtn.setBackground(new java.awt.Color(29, 92, 150));
        addVehiclebtn.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        addVehiclebtn.setForeground(new java.awt.Color(255, 255, 255));
        addVehiclebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        addVehiclebtn.setText("Add Vehicle");
        addVehiclebtn.setBorderPainted(false);
        addVehiclebtn.setVerifyInputWhenFocusTarget(false);
        addVehiclebtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addVehiclebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehiclebtnActionPerformed(evt);
            }
        });

        categoryBox.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        categoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Two Wheeler", "Four Wheeler" }));

        javax.swing.GroupLayout centerPanelLayout = new javax.swing.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerPanelLayout.createSequentialGroup()
                                .addComponent(addVehiclebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerPanelLayout.createSequentialGroup()
                                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vcompany)
                                    .addComponent(ownername, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ownermobileno))
                                .addGap(45, 45, 45)
                                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(vcompanyfield)
                                    .addComponent(registrationfield)
                                    .addComponent(categoryBox, 0, 441, Short.MAX_VALUE)))))
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ownermobilenofield, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ownernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(category, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(categoryBox))
                .addGap(42, 42, 42)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vcompanyfield, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vcompany))
                .addGap(39, 39, 39)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrationfield, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ownernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ownername, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ownermobilenofield, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ownermobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(addVehiclebtn)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(adminText, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(centerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(adminText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(centerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(topPanel);
        topPanel.setBounds(0, 12, 1112, 798);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        dispose();
        Dashboard dashboard = new Dashboard();

    }//GEN-LAST:event_dashboardMouseClicked

    private void unparkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unparkMouseClicked
        dispose();
        Unpark unpark = new Unpark();
    }//GEN-LAST:event_unparkMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        dispose();
        Login login = new Login();
    }//GEN-LAST:event_logoutMouseClicked

    private void addVehiclebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehiclebtnActionPerformed
            if(vcompanyfield.getText().isEmpty()||registrationfield.getText().isEmpty()||ownernamefield.getText().isEmpty()||ownermobilenofield.getText().isEmpty()||registrationfield.getText().isEmpty()){
                ParkVehicleDialog pvd = new ParkVehicleDialog();
            }
            else{
            fetchFormData();
            ParkVehicleDialog pvd = new ParkVehicleDialog(ownernameString,ownernumberString,registrationString,categorydataString,vehiclecompanyString);
            }
    }//GEN-LAST:event_addVehiclebtnActionPerformed

    private void fetchFormData(){
        categorydataString = (String)categoryBox.getSelectedItem();
        vehiclecompanyString = vcompanyfield.getText();
        registrationString = registrationfield.getText();
        ownernameString = ownernamefield.getText();
        ownernumberString = ownermobilenofield.getText();
    }
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
            java.util.logging.Logger.getLogger(AddVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addVehicle;
    private javax.swing.JButton addVehiclebtn;
    private javax.swing.JLabel adminText;
    private javax.swing.JLabel category;
    private javax.swing.JComboBox<String> categoryBox;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel ownermobileno;
    private javax.swing.JTextField ownermobilenofield;
    private javax.swing.JLabel ownername;
    private javax.swing.JTextField ownernamefield;
    private javax.swing.JLabel registration;
    private javax.swing.JTextField registrationfield;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel unpark;
    private javax.swing.JLabel vcompany;
    private javax.swing.JTextField vcompanyfield;
    // End of variables declaration//GEN-END:variables
}
