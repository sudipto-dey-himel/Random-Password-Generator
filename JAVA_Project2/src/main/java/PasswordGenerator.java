
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JOptionPane;


public class PasswordGenerator extends javax.swing.JFrame {

    public PasswordGenerator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jDialog1 = new javax.swing.JDialog();
        msg = new javax.swing.JTextField();
        bt1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bt2 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        msg.setBackground(new java.awt.Color(204, 204, 204));
        msg.setFont(new java.awt.Font("Georgia Pro", 0, 24)); // NOI18N
        msg.setForeground(new java.awt.Color(0, 0, 0));
        msg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        msg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgActionPerformed(evt);
            }
        });

        bt1.setBackground(new java.awt.Color(0, 51, 51));
        bt1.setFont(new java.awt.Font("Arial Nova Light", 3, 14)); // NOI18N
        bt1.setForeground(new java.awt.Color(255, 255, 255));
        bt1.setText("Generate Password");
        bt1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Georgia Pro", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("    Random Password Generator");

        bt2.setBackground(new java.awt.Color(0, 51, 51));
        bt2.setFont(new java.awt.Font("Arial Nova Light", 3, 14)); // NOI18N
        bt2.setForeground(new java.awt.Color(255, 255, 255));
        bt2.setText("Copy");
        bt2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(153, 153, 153), null, null));
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed

        int len = 12;
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890abcdefghijklmnopqrstuvwxyz,.~!@#$%^&*<?/>(){}[]";
        String password = new String();
        for(int i=0; i<len; i++) {
            int rendom = (int)(Math.random()*s.length());
            password += s.substring(rendom, rendom+1);  
        }
        msg.setText(password);
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed

        String pass = msg.getText();
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection strSel = new StringSelection(pass);
        clipboard.setContents(strSel, strSel);
        if(!pass.isEmpty())
        JOptionPane.showMessageDialog(null, "Text is copied!");
        else JOptionPane.showMessageDialog(null, "Error!");
        
    }//GEN-LAST:event_bt2ActionPerformed

    private void msgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msgActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField msg;
    // End of variables declaration//GEN-END:variables
}
