import java.sql.*;
import javax.swing.*;
import Project.ConnectionProvide;

public class UpdateQuestion extends javax.swing.JFrame {
    ConnectionProvide connection = new ConnectionProvide();
    public UpdateQuestion() {
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

        panelHome = new javax.swing.JPanel();
        labelHome = new javax.swing.JLabel();
        labelUpdateQ = new javax.swing.JLabel();
        btnAddExit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        labelUpdQID = new javax.swing.JLabel();
        labelUpdOpt4 = new javax.swing.JLabel();
        labelUpdOpt3 = new javax.swing.JLabel();
        labelUpdQ = new javax.swing.JLabel();
        labelUpdOpt2 = new javax.swing.JLabel();
        labelUpdOpt1 = new javax.swing.JLabel();
        labelUpdAns = new javax.swing.JLabel();
        txtfieldUpdQ = new javax.swing.JTextField();
        txtfieldUpdOpt3 = new javax.swing.JTextField();
        txtfieldUpdOpt2 = new javax.swing.JTextField();
        txtfieldUpdOpt1 = new javax.swing.JTextField();
        txtfieldUpdOpt4 = new javax.swing.JTextField();
        txtfieldUpdAns = new javax.swing.JTextField();
        btnUpdateQ = new javax.swing.JButton();
        btnUpdClear = new javax.swing.JButton();
        txtfieldUpdQID = new javax.swing.JTextField();
        btnSearchQ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(150, 155));
        setUndecorated(true);

        panelHome.setBackground(new java.awt.Color(113, 141, 140));
        panelHome.setForeground(new java.awt.Color(76, 106, 114));
        panelHome.setPreferredSize(new java.awt.Dimension(1084, 555));

        labelHome.setBackground(new java.awt.Color(201, 212, 199));
        labelHome.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelHome.setForeground(new java.awt.Color(248, 249, 236));
        labelHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHome.setText("GhostDevs Quiz System");

        labelUpdateQ.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelUpdateQ.setForeground(new java.awt.Color(248, 249, 236));
        labelUpdateQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new question.png"))); // NOI18N
        labelUpdateQ.setText("Update Questions");

        btnAddExit.setBackground(new java.awt.Color(113, 141, 140));
        btnAddExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        btnAddExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExitActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(248, 249, 236));

        jSeparator2.setBackground(new java.awt.Color(248, 249, 236));

        labelUpdQID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelUpdQID.setForeground(new java.awt.Color(248, 249, 236));
        labelUpdQID.setText("Question ID: ");

        labelUpdOpt4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelUpdOpt4.setForeground(new java.awt.Color(248, 249, 236));
        labelUpdOpt4.setText("Option 4:");

        labelUpdOpt3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelUpdOpt3.setForeground(new java.awt.Color(248, 249, 236));
        labelUpdOpt3.setText("Option 3:");

        labelUpdQ.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelUpdQ.setForeground(new java.awt.Color(248, 249, 236));
        labelUpdQ.setText("Question:");

        labelUpdOpt2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelUpdOpt2.setForeground(new java.awt.Color(248, 249, 236));
        labelUpdOpt2.setText("Option 2:");

        labelUpdOpt1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelUpdOpt1.setForeground(new java.awt.Color(248, 249, 236));
        labelUpdOpt1.setText("Option 1:");

        labelUpdAns.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelUpdAns.setForeground(new java.awt.Color(248, 249, 236));
        labelUpdAns.setText("Result:");

        txtfieldUpdQ.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfieldUpdQ.setForeground(new java.awt.Color(76, 106, 114));
        txtfieldUpdQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldUpdQActionPerformed(evt);
            }
        });

        txtfieldUpdOpt3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfieldUpdOpt3.setForeground(new java.awt.Color(76, 106, 114));

        txtfieldUpdOpt2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfieldUpdOpt2.setForeground(new java.awt.Color(76, 106, 114));

        txtfieldUpdOpt1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfieldUpdOpt1.setForeground(new java.awt.Color(76, 106, 114));

        txtfieldUpdOpt4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfieldUpdOpt4.setForeground(new java.awt.Color(76, 106, 114));

        txtfieldUpdAns.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfieldUpdAns.setForeground(new java.awt.Color(76, 106, 114));

        btnUpdateQ.setBackground(new java.awt.Color(201, 212, 199));
        btnUpdateQ.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUpdateQ.setForeground(new java.awt.Color(76, 106, 114));
        btnUpdateQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btnUpdateQ.setText("Update");
        btnUpdateQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateQActionPerformed(evt);
            }
        });

        btnUpdClear.setBackground(new java.awt.Color(201, 212, 199));
        btnUpdClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUpdClear.setForeground(new java.awt.Color(76, 106, 114));
        btnUpdClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        btnUpdClear.setText("Clear");
        btnUpdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdClearActionPerformed(evt);
            }
        });

        txtfieldUpdQID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfieldUpdQID.setForeground(new java.awt.Color(76, 106, 114));
        txtfieldUpdQID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldUpdQIDActionPerformed(evt);
            }
        });

        btnSearchQ.setBackground(new java.awt.Color(201, 212, 199));
        btnSearchQ.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSearchQ.setForeground(new java.awt.Color(76, 106, 114));
        btnSearchQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        btnSearchQ.setText("Search");
        btnSearchQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchQMouseClicked(evt);
            }
        });
        btnSearchQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchQActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 560, Short.MAX_VALUE)
                .addComponent(btnAddExit))
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUpdOpt1)
                            .addComponent(labelUpdOpt2)
                            .addComponent(labelUpdQ)
                            .addComponent(labelUpdOpt3)
                            .addComponent(labelUpdOpt4)
                            .addComponent(labelUpdAns)
                            .addComponent(labelUpdQID))
                        .addGap(39, 39, 39)
                        .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtfieldUpdAns, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                                .addComponent(txtfieldUpdOpt4)
                                .addComponent(txtfieldUpdOpt3)
                                .addComponent(txtfieldUpdQ)
                                .addComponent(txtfieldUpdOpt2)
                                .addComponent(txtfieldUpdOpt1)
                                .addGroup(panelHomeLayout.createSequentialGroup()
                                    .addComponent(txtfieldUpdQID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSearchQ)))
                            .addGroup(panelHomeLayout.createSequentialGroup()
                                .addComponent(btnUpdateQ)
                                .addGap(64, 64, 64)
                                .addComponent(btnUpdClear))))
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(labelUpdateQ)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddExit)
                    .addComponent(labelHome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(labelUpdateQ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchQ)
                    .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelUpdQID)
                        .addComponent(txtfieldUpdQID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUpdQ)
                    .addComponent(txtfieldUpdQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUpdOpt1)
                    .addComponent(txtfieldUpdOpt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUpdOpt2)
                    .addComponent(txtfieldUpdOpt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUpdOpt3)
                    .addComponent(txtfieldUpdOpt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUpdOpt4)
                    .addComponent(txtfieldUpdOpt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUpdAns)
                    .addComponent(txtfieldUpdAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateQ)
                    .addComponent(btnUpdClear))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchQActionPerformed
        String id = txtfieldUpdQID.getText();
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qems", "root", "Dn@0021113");
            if (con != null) {
                Statement statement = con.createStatement();
                String query = "SELECT * FROM question WHERE id = ?";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                preparedStatement.setString(1, id);

                ResultSet rs = preparedStatement.executeQuery();

                if (rs.next()) {
                    txtfieldUpdQ.setText(rs.getString(2));
                    txtfieldUpdOpt1.setText(rs.getString(3));
                    txtfieldUpdOpt2.setText(rs.getString(4));
                    txtfieldUpdOpt3.setText(rs.getString(5));
                    txtfieldUpdOpt4.setText(rs.getString(6));
                    txtfieldUpdAns.setText(rs.getString(7));
                    txtfieldUpdQ.setEditable(false);
                } else {
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf, "Question ID does not exist!");
                }

                rs.close();
                preparedStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    System.out.println("Database Disconnected");
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSearchQActionPerformed

    /**
     * @param evt
     */
    private void btnSearchQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchQMouseClicked

        }
//GEN-LAST:event_btnSearchQMouseClicked

    private void txtfieldUpdQIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldUpdQIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldUpdQIDActionPerformed

    private void btnUpdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdClearActionPerformed
        setVisible(false);
        new UpdateQuestion().setVisible(true);
    }//GEN-LAST:event_btnUpdClearActionPerformed

    private void btnUpdateQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateQActionPerformed
        String id = txtfieldUpdQID.getText();
        String name = txtfieldUpdQ.getText();
        String opt1 = txtfieldUpdOpt1.getText();
        String opt2 = txtfieldUpdOpt2.getText();
        String opt3 = txtfieldUpdOpt3.getText();
        String opt4 = txtfieldUpdOpt4.getText();
        String answer = txtfieldUpdAns.getText();
        connection.updateQuestion(id, name, opt1, opt2, opt3, opt4, answer);
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(jf, "Question Updated Successfully!");
        setVisible(false);
        new UpdateQuestion().setVisible(true);
    }//GEN-LAST:event_btnUpdateQActionPerformed

    private void txtfieldUpdQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldUpdQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldUpdQActionPerformed

    private void btnAddExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExitActionPerformed
        AdminHome.open = 0;
        setVisible(false);
    }//GEN-LAST:event_btnAddExitActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddExit;
    private javax.swing.JButton btnSearchQ;
    private javax.swing.JButton btnUpdClear;
    private javax.swing.JButton btnUpdateQ;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelUpdAns;
    private javax.swing.JLabel labelUpdOpt1;
    private javax.swing.JLabel labelUpdOpt2;
    private javax.swing.JLabel labelUpdOpt3;
    private javax.swing.JLabel labelUpdOpt4;
    private javax.swing.JLabel labelUpdQ;
    private javax.swing.JLabel labelUpdQID;
    private javax.swing.JLabel labelUpdateQ;
    private javax.swing.JPanel panelHome;
    private javax.swing.JTextField txtfieldUpdAns;
    private javax.swing.JTextField txtfieldUpdOpt1;
    private javax.swing.JTextField txtfieldUpdOpt2;
    private javax.swing.JTextField txtfieldUpdOpt3;
    private javax.swing.JTextField txtfieldUpdOpt4;
    private javax.swing.JTextField txtfieldUpdQ;
    private javax.swing.JTextField txtfieldUpdQID;
    // End of variables declaration//GEN-END:variables
}
