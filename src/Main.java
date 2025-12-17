/**
 *
 * @author helpful
 */
import Objects.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main extends javax.swing.JFrame {
    ArrayList<HashMap<String, Object>> apps = new ArrayList<>();
    
    public Main() {
        initComponents();
        
        // create hash ref for app1 (UI and object)
        HashMap<String, Object> app1Container = new HashMap<>();
        app1Container.put("JFrame", new App1());
        app1Container.put("AppData", App1.app);
        
        // create hash ref for app2 (UI and object)
        HashMap<String, Object> app2Container = new HashMap<>();
        app2Container.put("JFrame", new App2());
        app2Container.put("AppData", App2.app);
        
        // create hash ref for app3 (UI and object)
        HashMap<String, Object> app3Container = new HashMap<>();
        app3Container.put("JFrame", new App3());
        app3Container.put("AppData", App3.app);
        
        // add hash to arrays
        apps.add(app1Container);
        apps.add(app2Container);
        apps.add(app3Container);
        
        // loop through all hash in array to get object and insert to jcombo box
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
        AddBoard = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scoreBoard = new javax.swing.JTextPane();
        display = new javax.swing.JButton();
        clear = new javax.swing.JButton();

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

        AddBoard.setText("Add to board");
        AddBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBoardActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(scoreBoard);

        display.setText("Display Scores");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        clear.setText("Clear scores");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(AppsList, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OpenApp)
                .addGap(267, 267, 267))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddBoard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(display)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(privacy, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(utility, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jButton1)
                    .addComponent(AddBoard)
                    .addComponent(display)
                    .addComponent(clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(privacy)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(utility)
                            .addComponent(jLabel2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void OpenAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenAppActionPerformed
        App selectedApp = (App) AppsList.getSelectedItem();
        
        
        /*
        gets array of options from selected app
        loops through to find maillinglist
        makes maillinglist object
        checks if on
        if yes, calls method to show mail
        */
        Option[] optionArray = selectedApp.GetOption();
        for (int a=0;a<optionArray.length; a++){
            if(optionArray[a] instanceof MaillingList){
                System.out.print("abc");
                MaillingList selectedMail = (MaillingList) optionArray[a];
                if(selectedMail.GetSelectedEntry().GetName().equals("On")){
                    selectedMail.showMail();
               }
            }
        }

        
        for (HashMap<String, Object> appHash: apps) {
            App app = (App) appHash.get("AppData");
            if (app.GetAppName().equals(selectedApp.GetAppName())) {
                javax.swing.JFrame appFrame = (javax.swing.JFrame) appHash.get("JFrame");
                appFrame.setVisible(true);
            }
            
        }
    }//GEN-LAST:event_OpenAppActionPerformed

    private void AddBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBoardActionPerformed
        //gets the util score and privacy score
        double um = App1.app.GetTotalUXScore() + App2.app.GetTotalUXScore() + App3.app.GetTotalUXScore();
        double pm = App1.app.GetTotalPrivacyScore() + App2.app.GetTotalPrivacyScore() + App3.app.GetTotalPrivacyScore();
        //init a string to store all of the scores and a counter
        int counter = 0;
        String displayText = "";
        //stores the score inside of a flat file
        try{
        FileWriter writer = new FileWriter ("fileData.txt",true);
        PrintWriter output = new PrintWriter (writer);
        //prints out the scores into the flat file
        output.println("UserScore: " + um + "," + "Privacy Score: " + pm );
        output.close();
        }catch(IOException e){
            System.out.print(e);
        }
        //Store whats inside of the flat file into scores
        //displays the score from the flat file with formatting
        try{
            Scanner fileInput = new Scanner (new File ("fileData.txt"));
            while (fileInput.hasNextLine()){
                displayText += counter+1 + ". " + fileInput.nextLine() + "\n";
                //Stores what is inside of the flat file in one large string that gets broken in each line of the flat file
                counter++;
            }
        }catch(IOException e){
            System.out.print(e);
        }finally{
        scoreBoard.setText(displayText);
        }
    }//GEN-LAST:event_AddBoardActionPerformed

    private void AppsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppsListActionPerformed

    }//GEN-LAST:event_AppsListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // calculates total scores across all three apps
        double um = App1.app.GetTotalUXScore() + App2.app.GetTotalUXScore() + App3.app.GetTotalUXScore();
        double pm = App1.app.GetTotalPrivacyScore() + App2.app.GetTotalPrivacyScore() + App3.app.GetTotalPrivacyScore();   
        //sets them as the privacy and utility array
        privacy.setText(String.valueOf(pm));
        utility.setText(String.valueOf(um));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        String scores = "";
        int counter = 0;
        //displays the score from the flat file with formatting
        try{
            Scanner fileInput = new Scanner (new File ("fileData.txt"));
            while (fileInput.hasNextLine()){
                scores += counter+1 + ". " + fileInput.nextLine() + "\n";
                counter++;
                //Stores what is inside of the flat file in one large string that gets broken in each line of the flat file
            }
        }catch(IOException e){
            System.out.print(e);
        }finally{
        scoreBoard.setText(scores);
        }
    }//GEN-LAST:event_displayActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        //clears the score by overriding all of the info with ""
        try{
        FileWriter writer = new FileWriter ("fileData.txt",false);
        PrintWriter output = new PrintWriter (writer);
        output.println("");
        }catch(IOException e){
            System.out.print(e);
        }
        //Sets the scoreboard to what is in the flat file (nothing)
        String scores = "";
        int counter = 0;
        try{
            Scanner fileInput = new Scanner (new File ("fileData.txt"));
            while (fileInput.hasNextLine()){
                //from previous code, wont actually run because flat file has no lines
                scores = counter+1 + ". " + fileInput.nextLine() + "\n";
                counter++;
            }
        }catch(IOException e){
            System.out.print(e);
        }finally{
        scoreBoard.setText(scores);
        }
    }//GEN-LAST:event_clearActionPerformed

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
    private javax.swing.JButton AddBoard;
    private javax.swing.JComboBox<App> AppsList;
    private javax.swing.JButton OpenApp;
    private javax.swing.JButton clear;
    private javax.swing.JButton display;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel privacy;
    private javax.swing.JTextPane scoreBoard;
    private javax.swing.JLabel utility;
    // End of variables declaration//GEN-END:variables
}
