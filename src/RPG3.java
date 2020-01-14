/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ErMcB6406
 */
public class RPG3 extends javax.swing.JFrame {
    int playerHP = 100;
    int monsterHP = 45;
    String playerWeapon = "rusty sword";

    /**
     * Creates new form RPG3
     */
            
            
    public RPG3() {
        
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Image3 = new javax.swing.JLabel();
        GameText = new javax.swing.JLabel();
        PlayerName = new javax.swing.JLabel();
        playerNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        playerHPTxt = new javax.swing.JTextField();
        PlayerWeapon = new javax.swing.JLabel();
        PlayerHP = new javax.swing.JLabel();
        PlayerStats = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        playerWeaponOut = new javax.swing.JLabel();
        playerHPOut = new javax.swing.JLabel();
        GameText1 = new javax.swing.JLabel();
        playerNameTxt = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        talkButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GameText2 = new javax.swing.JLabel();
        attackButton = new javax.swing.JButton();
        leaveButton = new javax.swing.JButton();

        Image3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qixpossm9pw11 (1).jpg"))); // NOI18N

        GameText.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        GameText.setForeground(new java.awt.Color(255, 255, 255));
        GameText.setText("<html> * You approach the gates of Aeriden <br> * You pause to look at the lush forest that <br>    &nbsp;  encompases the small dreary town <br> * Moss coveres the cracked stones of the <br>    &nbsp; gates and a heavy mist rises from the ground <br> * A sudden chill seeps into you're bones <br> * Is it from the weather or the negative feeling <br> &nbsp; that holds the town hostage?<html>");

        PlayerName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PlayerName.setText("Player name: ");

        playerNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        playerNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        playerNameLabel.setText("Player name: ");

        jLabel1.setText("jLabel1");

        playerHPTxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        playerHPTxt.setForeground(new java.awt.Color(238, 19, 19));

        PlayerWeapon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PlayerWeapon.setForeground(new java.awt.Color(255, 255, 255));
        PlayerWeapon.setText("Player weapon: ");

        PlayerHP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PlayerHP.setForeground(new java.awt.Color(255, 255, 255));
        PlayerHP.setText("Player HP: ");

        PlayerStats.setBackground(new java.awt.Color(255, 255, 255));
        PlayerStats.setFont(new java.awt.Font("PMTイントゴ-EB", 0, 18)); // NOI18N
        PlayerStats.setForeground(new java.awt.Color(255, 255, 255));
        PlayerStats.setText("Player Stats:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmall.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        playerWeaponOut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        playerWeaponOut.setForeground(new java.awt.Color(255, 255, 255));
        playerWeaponOut.setText(" ");

        playerHPOut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        playerHPOut.setForeground(new java.awt.Color(204, 0, 51));
        playerHPOut.setText(" ");

        GameText1.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        GameText1.setForeground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        playerNameTxt.setBackground(new java.awt.Color(0, 0, 0));

        Title.setFont(new java.awt.Font("Wet Pet", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("In the mists of aeriden");
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        talkButton.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        talkButton.setText("TALK");
        talkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talkButtonActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel3.setText("jLabel2");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel4.setText("jLabel2");

        GameText2.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        GameText2.setForeground(new java.awt.Color(255, 255, 255));
        GameText2.setText("<html> * You now come to a stop infront <br> &nbsp; of the gates of the town <br> * A guard stands rigid on their surveillance post<br> * You can feel their serious demeanor and wonder <br> &nbsp; if you are able to pass <br> * What do you want to do?  <html>");

        attackButton.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        attackButton.setText("Attack");
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        leaveButton.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        leaveButton.setText("LEAVE");
        leaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout playerNameTxtLayout = new javax.swing.GroupLayout(playerNameTxt);
        playerNameTxt.setLayout(playerNameTxtLayout);
        playerNameTxtLayout.setHorizontalGroup(
            playerNameTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerNameTxtLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(GameText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(playerNameTxtLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(talkButton)
                .addGap(120, 120, 120)
                .addComponent(attackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(leaveButton)
                .addGap(101, 101, 101))
            .addGroup(playerNameTxtLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(playerNameTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(playerNameTxtLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(516, 516, 516)))
        );
        playerNameTxtLayout.setVerticalGroup(
            playerNameTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerNameTxtLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title)
                .addGap(29, 29, 29)
                .addGroup(playerNameTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(GameText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(playerNameTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(talkButton)
                    .addComponent(attackButton)
                    .addComponent(leaveButton))
                .addGap(90, 90, 90))
            .addGroup(playerNameTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(playerNameTxtLayout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jLabel4)
                    .addContainerGap(240, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void talkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talkButtonActionPerformed
        
        this.setVisible(false);
        new RPG4_TALK().setVisible(true);
    }//GEN-LAST:event_talkButtonActionPerformed

    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButtonActionPerformed
        this.setVisible(false);
        new RPG4_ATTACK().setVisible(true);
    }//GEN-LAST:event_attackButtonActionPerformed

    private void leaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveButtonActionPerformed
        this.setVisible(false);
        new RPG4_LEAVE().setVisible(true);
    }//GEN-LAST:event_leaveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RPG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPG3().setVisible(true);
            }
            
           // playerHPOut.setText("" + playerHP + "");
            
        
          });
        
    
    
    }
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GameText;
    private javax.swing.JLabel GameText1;
    private javax.swing.JLabel GameText2;
    private javax.swing.JLabel Image3;
    private javax.swing.JLabel PlayerHP;
    private javax.swing.JLabel PlayerName;
    private javax.swing.JLabel PlayerStats;
    private javax.swing.JLabel PlayerWeapon;
    private javax.swing.JLabel Title;
    private javax.swing.JButton attackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton leaveButton;
    private javax.swing.JLabel playerHPOut;
    private javax.swing.JTextField playerHPTxt;
    private javax.swing.JLabel playerNameLabel;
    private javax.swing.JPanel playerNameTxt;
    private javax.swing.JLabel playerWeaponOut;
    private javax.swing.JButton talkButton;
    // End of variables declaration//GEN-END:variables
}



