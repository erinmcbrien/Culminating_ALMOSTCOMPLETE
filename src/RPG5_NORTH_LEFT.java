/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ErMcB6406
 */
public class RPG5_NORTH_LEFT extends javax.swing.JFrame {

    /**
     * Creates new form RPG5_NORTH_LEFT
     */
    public RPG5_NORTH_LEFT() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RPG_NORTH_LEFT = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        GameText3 = new javax.swing.JLabel();
        CONTINUE = new javax.swing.JButton();
        RETURN = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel3.setText("jLabel2");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel4.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RPG_NORTH_LEFT.setBackground(new java.awt.Color(0, 0, 0));

        Title.setFont(new java.awt.Font("Wet Pet", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("In the mists of aeriden");
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        GameText3.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        GameText3.setForeground(new java.awt.Color(255, 255, 255));
        GameText3.setText("<html> * You soon notice that this path is becoming more <br> &nbsp; and more twisted as the forest becomes <br> &nbsp; progressively littered with luscious folliage <br> * A sense of calm surrounds you as you continue <br> &nbsp; to walk\nthe path <br> * However you don't seem to notice the path disappearing <br> &nbsp; the longer you continue to tread the fated trail <br> * It appears that you know where you are going <br> * Or do you? <br> * What would you like to do?");

        CONTINUE.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        CONTINUE.setText("CONTINUE");
        CONTINUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONTINUEActionPerformed(evt);
            }
        });

        RETURN.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        RETURN.setText("RETURN");
        RETURN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RETURNActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel11.setText("jLabel2");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolfsmaller.png"))); // NOI18N
        jLabel12.setText("jLabel2");

        javax.swing.GroupLayout RPG_NORTH_LEFTLayout = new javax.swing.GroupLayout(RPG_NORTH_LEFT);
        RPG_NORTH_LEFT.setLayout(RPG_NORTH_LEFTLayout);
        RPG_NORTH_LEFTLayout.setHorizontalGroup(
            RPG_NORTH_LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPG_NORTH_LEFTLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(GameText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RPG_NORTH_LEFTLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CONTINUE)
                .addGap(50, 50, 50)
                .addComponent(RETURN)
                .addGap(224, 224, 224))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RPG_NORTH_LEFTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(75, 75, 75))
        );
        RPG_NORTH_LEFTLayout.setVerticalGroup(
            RPG_NORTH_LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPG_NORTH_LEFTLayout.createSequentialGroup()
                .addGroup(RPG_NORTH_LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RPG_NORTH_LEFTLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Title)
                        .addGroup(RPG_NORTH_LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RPG_NORTH_LEFTLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(GameText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RPG_NORTH_LEFTLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel12))))
                    .addGroup(RPG_NORTH_LEFTLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel11)))
                .addGap(48, 48, 48)
                .addGroup(RPG_NORTH_LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RETURN)
                    .addComponent(CONTINUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPG_NORTH_LEFT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RPG_NORTH_LEFT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CONTINUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONTINUEActionPerformed
        this.setVisible(false);
        new RPG5_NORTH_LEFT_CONT1().setVisible(true);

    }//GEN-LAST:event_CONTINUEActionPerformed

    private void RETURNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RETURNActionPerformed
        this.setVisible(false);
        new RPG5_NORTH().setVisible(true);
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
            java.util.logging.Logger.getLogger(RPG5_NORTH_LEFT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPG5_NORTH_LEFT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPG5_NORTH_LEFT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPG5_NORTH_LEFT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPG5_NORTH_LEFT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CONTINUE;
    private javax.swing.JLabel GameText3;
    private javax.swing.JButton RETURN;
    private javax.swing.JPanel RPG_NORTH_LEFT;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}