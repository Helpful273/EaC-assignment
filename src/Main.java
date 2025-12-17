/**
 *
 * @author helpful
 */
import Objects.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main extends javax.swing.JFrame {
    ArrayList<HashMap<String, Object>> apps = new ArrayList<>();
    
    public Main() {
        initComponents();
        
        HashMap<String, Object> app1Container = new HashMap<>();
        app1Container.put("JFrame", new App1());
        app1Container.put("AppData", App1.app);
        
        HashMap<String, Object> app2Container = new HashMap<>();
        app2Container.put("JFrame", new App2());
        app2Container.put("AppData", App2.app);
        
        HashMap<String, Object> app3Container = new HashMap<>();
        app3Container.put("JFrame", new App3());
        app3Container.put("AppData", App3.app);
        
        apps.add(app1Container);
        apps.add(app2Container);
        apps.add(app3Container);
        
        for (HashMap<String, Object> appHash: apps) {
            App app = (App) appHash.get("AppData");
            AppsList.addItem(app);
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpenApp = new javax.swing.JButton();
        AppsList = new javax.swing.JComboBox<>();
        label1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        privacy = new javax.swing.JLabel();
        utility = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        OpenApp.setText("Go 2 App");
        OpenApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenAppActionPerformed(evt);
            }
        });

        AppsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppsListActionPerformed(evt);
            }
        });

        label1.setText("Total Score");

        jButton1.setText("Calculate Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        privacy.setText("Privacy");

        utility.setText("Utility");

        jLabel1.setText("Privacy Score");

        jLabel2.setText("Utility Score");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(AppsList, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(privacy, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(utility, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(OpenApp))
                .addGap(238, 238, 238))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(OpenApp))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AppsList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(privacy)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(utility)
                    .addComponent(jLabel2))
                .addContainerGap(327, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenAppActionPerformed
        App selectedApp = (App) AppsList.getSelectedItem();
        
        for (HashMap<String, Object> appHash: apps) {
            App app = (App) appHash.get("AppData");
            if (app.GetAppName().equals(selectedApp.GetAppName())) {
                javax.swing.JFrame appFrame = (javax.swing.JFrame) appHash.get("JFrame");
                appFrame.setVisible(true);
            }
            
        }
    }//GEN-LAST:event_OpenAppActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*
        DEPRECATE.
        
        make it so when JComboBox selects a new target use App.java methods to update information instead of a manual button click
        
        Label1.setText(app1.GetTotalPrivacyScore());
        Label1.setText(app1.GetTotalUXScore());
        Label2.setText(app2.GetTotalPrivacyScore());
        Label2.setText(app2.GetTotalUXScore());
        Label3.setText(app3.GetTotalPrivacyScore());
        Label3.setText(app3.GetTotalUXScore());
        */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AppsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppsListActionPerformed

    }//GEN-LAST:event_AppsListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // calculates total scores across all three apps
        double pm = App1.app.GetTotalUXScore() + App2.app.GetTotalUXScore() + App3.app.GetTotalUXScore();
        double um = App1.app.GetTotalPrivacyScore() + App2.app.GetTotalPrivacyScore() + App3.app.GetTotalPrivacyScore();      
        privacy.setText(String.valueOf(pm));
        utility.setText(String.valueOf(um));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<App> AppsList;
    private javax.swing.JButton OpenApp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel privacy;
    private javax.swing.JLabel utility;
    // End of variables declaration//GEN-END:variables
}
