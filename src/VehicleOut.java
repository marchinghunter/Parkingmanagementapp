import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Deepak
 */
public class VehicleOut extends javax.swing.JFrame {

    private String url = "jdbc:mysql://localhost:3306/vpmsdb";
    private String username = "root";
    private String password = "4213";
    
    
    public VehicleOut() {
        initComponents();
        try {
           entryinDb();
       } catch (Exception ex) {
           Logger.getLogger(VehicleIn.class.getName()).log(Level.SEVERE, null, ex);
       }
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
        centerPanel = new javax.swing.JPanel();
        vehicleOutbtn = new javax.swing.JButton();
        vehicleInbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehicleTable = new javax.swing.JTable();
        sidePanel = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        addVehicle = new javax.swing.JLabel();
        unpark = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setMinimumSize(new java.awt.Dimension(1110, 828));
        setResizable(false);

        topPanel.setBackground(new java.awt.Color(29, 92, 150));
        topPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 92, 150)));
        topPanel.setForeground(new java.awt.Color(29, 92, 150));

        adminText.setFont(new java.awt.Font("Consolas", 1, 45)); // NOI18N
        adminText.setForeground(new java.awt.Color(255, 255, 255));
        adminText.setText("Admin");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(adminText, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(adminText)
                .addContainerGap())
        );

        centerPanel.setBackground(new java.awt.Color(255, 255, 255));
        centerPanel.setForeground(new java.awt.Color(0, 204, 102));

        vehicleOutbtn.setBackground(new java.awt.Color(246, 246, 246));
        vehicleOutbtn.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        vehicleOutbtn.setText("Vehicle Out");
        vehicleOutbtn.setBorder(null);

        vehicleInbtn.setBackground(new java.awt.Color(246, 246, 246));
        vehicleInbtn.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        vehicleInbtn.setText("Vehicle In");
        vehicleInbtn.setBorder(null);
        vehicleInbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehicleInbtnMouseClicked(evt);
            }
        });

        vehicleTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vehicleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.NO", "Parking No.", "Owner Name", "Vehicle Company", "Registration Number", "Owner Contact no.", "Parking Time", "Unparking Time", "Charges"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vehicleTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(vehicleTable);
        vehicleTable.getColumnModel().getColumn(0).setMaxWidth(40);
        vehicleTable.getColumnModel().getColumn(1).setMaxWidth(100);
        vehicleTable.getColumnModel().getColumn(8).setMaxWidth(70);

        javax.swing.GroupLayout centerPanelLayout = new javax.swing.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(vehicleInbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vehicleOutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleOutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicleInbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidePanel.setBackground(new java.awt.Color(29, 92, 150));
        sidePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 92, 150)));
        sidePanel.setForeground(new java.awt.Color(29, 92, 150));

        dashboard.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        dashboard.setForeground(new java.awt.Color(51, 51, 51));
        dashboard.setText("Dashboard");

        addVehicle.setFont(new java.awt.Font("Consolas", 0, 28)); // NOI18N
        addVehicle.setForeground(new java.awt.Color(255, 255, 255));
        addVehicle.setText("Add Vehicle");
        addVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addVehicleMouseClicked(evt);
            }
        });

        unpark.setFont(new java.awt.Font("Consolas", 0, 23)); // NOI18N
        unpark.setForeground(new java.awt.Color(255, 255, 255));
        unpark.setText("Unpark Vehicle");
        unpark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unparkMouseClicked(evt);
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
                    .addComponent(unpark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addVehicle)
                            .addComponent(logout))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(dashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unpark)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 462, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(centerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(centerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleMouseClicked
        dispose();
        AddVehicle addVehicle = new AddVehicle();
    }//GEN-LAST:event_addVehicleMouseClicked

    private void vehicleInbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehicleInbtnMouseClicked
        dispose();
        VehicleIn vehicleIn = new VehicleIn();
    }//GEN-LAST:event_vehicleInbtnMouseClicked

    private void unparkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unparkMouseClicked
        dispose();
        Unpark unpark = new Unpark();
    }//GEN-LAST:event_unparkMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        dispose();
        Login login = new Login();
    }//GEN-LAST:event_logoutMouseClicked

    private void entryinDb() throws Exception{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        CallableStatement stmt = con.prepareCall("{call getData()}");
        ResultSet set =  stmt.executeQuery();
        DefaultTableModel dtm = (DefaultTableModel) vehicleTable.getModel();
        
          int i=1;
        while(set.next()){
            if(set.getString("Status")==null){
                continue;
            }
            Object [] data = {i,set.getInt(1),set.getString(5),set.getString(3),set.getString(4),set.getString(6),set.getString(7),set.getString(8),set.getString(9)};
        dtm.addRow(data);
        i++;
       }
    }
    
    
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
            java.util.logging.Logger.getLogger(VehicleOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addVehicle;
    private javax.swing.JLabel adminText;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JLabel dashboard;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel unpark;
    private javax.swing.JButton vehicleInbtn;
    private javax.swing.JButton vehicleOutbtn;
    private javax.swing.JTable vehicleTable;
    // End of variables declaration//GEN-END:variables
}
