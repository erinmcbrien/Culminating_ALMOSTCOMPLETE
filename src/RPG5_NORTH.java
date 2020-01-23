/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ErMcB6406
 */
public class RPG5_NORTH extends javax.swing.JFrame {

    /**
     * Creates new form RPG5_NORTH
     */
    public RPG5_NORTH() {
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

        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        RPG5_NORTH = new javax.swing.JPanel();
        Title12 = new javax.swing.JLabel();
        GameText14 = new javax.swing.JLabel();
        LEFT = new javax.swing.JButton();
        RIGHT = new javax.swing.JButton();
        RETURN = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel28.setText("jLabel2");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel27.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RPG5_NORTH.setBackground(new java.awt.Color(0, 0, 0));

        Title12.setFont(new java.awt.Font("Wet Pet", 0, 48)); // NOI18N
        Title12.setForeground(new java.awt.Color(255, 255, 255));
        Title12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title12.setText("In the mists of aeriden");
        Title12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title12.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Title12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        GameText14.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        GameText14.setForeground(new java.awt.Color(255, 255, 255));
        GameText14.setText("<html> * You walked into the eastbound <br> &nbsp lush forest that encompases the town <br> * As you walk\nfurther into the thicket, <br> &nbsp you notice that the path begins to <br> &nbsp split in two directions");

        LEFT.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        LEFT.setText("LEFT");
        LEFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LEFTActionPerformed(evt);
            }
        });

        RIGHT.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        RIGHT.setText("RIGHT");
        RIGHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RIGHTActionPerformed(evt);
            }
        });

        RETURN.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        RETURN.setText("RETURN");
        RETURN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RETURNActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel10.setText("jLabel2");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel11.setText("jLabel2");

        javax.swing.GroupLayout RPG5_NORTHLayout = new javax.swing.GroupLayout(RPG5_NORTH);
        RPG5_NORTH.setLayout(RPG5_NORTHLayout);
        RPG5_NORTHLayout.setHorizontalGroup(
            RPG5_NORTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RPG5_NORTHLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(Title12)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RPG5_NORTHLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(GameText14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(RPG5_NORTHLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(LEFT)
                .addGap(32, 32, 32)
                .addComponent(RETURN)
                .addGap(31, 31, 31)
                .addComponent(RIGHT)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RPG5_NORTHLayout.setVerticalGroup(
            RPG5_NORTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPG5_NORTHLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title12)
                .addGroup(RPG5_NORTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RPG5_NORTHLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(GameText14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RPG5_NORTHLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(RPG5_NORTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))))
                .addGap(62, 62, 62)
                .addGroup(RPG5_NORTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RETURN)
                    .addComponent(LEFT)
                    .addComponent(RIGHT))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPG5_NORTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPG5_NORTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LEFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LEFTActionPerformed
        this.setVisible(false);
        new RPG5_NORTH_LEFT().setVisible(true);
    }//GEN-LAST:event_LEFTActionPerformed

    private void RIGHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RIGHTActionPerformed
        this.setVisible(false);
        new RPG5_NORTH_RIGHT().setVisible(true);
    }//GEN-LAST:event_RIGHTActionPerformed

    private void RETURNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RETURNActionPerformed
        this.setVisible(false);
        new RPG4_LEAVE_ALT().setVisible(true);
    }//GEN-LAST:event_RETURNActionPerformed

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
            java.util.logging.Logger.getLogger(RPG5_NORTH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPG5_NORTH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPG5_NORTH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPG5_NORTH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPG5_NORTH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GameText14;
    private javax.swing.JButton LEFT;
    private javax.swing.JButton RETURN;
    private javax.swing.JButton RIGHT;
    private javax.swing.JPanel RPG5_NORTH;
    private javax.swing.JLabel Title12;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    // End of variables declaration//GEN-END:variables
}