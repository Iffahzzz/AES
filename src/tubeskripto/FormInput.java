/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskripto;

/**
 *
 * @author Iffah zzzzz
 */
public class FormInput extends javax.swing.JFrame {

    /**
     * Creates new form FormInput
     */
    public FormInput() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputText = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputKey = new javax.swing.JTextPane();
        buttonEncrypt = new javax.swing.JToggleButton();
        buttonDecrypt = new javax.swing.JToggleButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        textResult = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(525, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(242, 240, 240));
        jScrollPane1.setBorder(null);

        inputText.setBackground(new java.awt.Color(242, 240, 240));
        inputText.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(inputText);
        inputText.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 480, 170));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel2.setText("Input text");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel3.setText("Key");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        jScrollPane3.setBorder(null);

        inputKey.setBackground(new java.awt.Color(242, 240, 240));
        inputKey.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(inputKey);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 480, 80));

        buttonEncrypt.setBackground(new java.awt.Color(171, 6, 6));
        buttonEncrypt.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        buttonEncrypt.setForeground(new java.awt.Color(255, 255, 255));
        buttonEncrypt.setText("encrypt");
        buttonEncrypt.setBorder(null);
        buttonEncrypt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                buttonEncryptStateChanged(evt);
            }
        });
        buttonEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEncryptActionPerformed(evt);
            }
        });
        buttonEncrypt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                buttonEncryptPropertyChange(evt);
            }
        });
        jPanel1.add(buttonEncrypt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 231, 40));

        buttonDecrypt.setBackground(new java.awt.Color(0, 0, 0));
        buttonDecrypt.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        buttonDecrypt.setForeground(new java.awt.Color(255, 255, 255));
        buttonDecrypt.setBorder(null);
        buttonDecrypt.setLabel("decrypt");
        buttonDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDecryptActionPerformed(evt);
            }
        });
        jPanel1.add(buttonDecrypt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 231, 40));

        jScrollPane4.setBorder(null);

        textResult.setBackground(new java.awt.Color(242, 240, 240));
        textResult.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(textResult);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 480, 170));

        jLabel4.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel4.setText("Result");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEncryptActionPerformed
        // TODO add your handling code here:
        String text;
        String key;
        
        
        text = inputText.getText();
        key = inputKey.getText();
        
        String result;
        result = text + " " + key;
        
        textResult.setText(result);
        
    }//GEN-LAST:event_buttonEncryptActionPerformed

    private void buttonDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDecryptActionPerformed
        // TODO add your handling code here:
        String text;
        String key;
        
        
        text = inputText.getText();
        key = inputKey.getText();
        
        String result;
        result = key + " " + text;
        
        textResult.setText(result);
    }//GEN-LAST:event_buttonDecryptActionPerformed

    private void buttonEncryptStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_buttonEncryptStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEncryptStateChanged

    private void buttonEncryptPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_buttonEncryptPropertyChange
        // TODO add your handling code here
    }//GEN-LAST:event_buttonEncryptPropertyChange

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
            java.util.logging.Logger.getLogger(FormInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInput().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonDecrypt;
    private javax.swing.JToggleButton buttonEncrypt;
    private javax.swing.JTextPane inputKey;
    private javax.swing.JTextPane inputText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane textResult;
    // End of variables declaration//GEN-END:variables
}
