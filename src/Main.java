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
        app1Container.put("JFrame", new App2());
        app1Container.put("AppData", App2.app);
        
        HashMap<String, Object> app3Container = new HashMap<>();
        app1Container.put("JFrame", new App3());
        app1Container.put("AppData", App3.app);
        
        apps.add(app1Container);
        apps.add(app2Container);
        apps.add(app3Container);
        
        for (HashMap<String, Object> appHash: apps) {
            App app = (App) appHash.get("AppData");
            AppsList.add(app);
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpenApp = new javax.swing.JButton();
        AppsList = new javax.swing.JComboBox<>();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        Label1.setText("jLabel1");

        Label2.setText("jLabel2");

        Label3.setText("jLabel3");

        Label4.setText("jLabel4");

        Label5.setText("jLabel5");

        Label6.setText("jLabel6");

        jButton2.setText("Update Scores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("App 1");

        jLabel2.setText("App 2");

        jLabel3.setText("App 3");

        jLabel4.setText("Privacy Score");

        jLabel5.setText("Utility Score");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(AppsList, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(OpenApp)
                .addGap(90, 90, 90)
                .addComponent(jButton2)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Label1)
                    .addComponent(Label3)
                    .addComponent(Label5))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label6)
                    .addComponent(Label4)
                    .addComponent(Label2)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OpenApp)
                            .addComponent(jButton2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AppsList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Label1)
                    .addComponent(Label2))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Label3)
                    .addComponent(Label4))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label6)
                    .addComponent(Label5)
                    .addComponent(jLabel3))
                .addGap(198, 198, 198))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenAppActionPerformed
        App selectedApp = (App) AppsList.getSelectedItem();
        
        for (javax.swing.JFrame app: apps) {
            app.
        }
    }//GEN-LAST:event_OpenAppActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Label1.setText(app1.GetTotalPrivacyScore());
    Label1.setText(app1.GetTotalUXScore());
    Label2.setText(app2.GetTotalPrivacyScore());
    Label2.setText(app2.GetTotalUXScore());
    Label3.setText(app3.GetTotalPrivacyScore());
    Label3.setText(app3.GetTotalUXScore());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AppsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppsListActionPerformed

    }//GEN-LAST:event_AppsListActionPerformed

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
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JButton OpenApp;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
