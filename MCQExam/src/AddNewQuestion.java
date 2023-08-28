import java.sql.*;
import Project.ConnectionProvide;
import javax.swing.*;

public class AddNewQuestion extends javax.swing.JFrame {
    ConnectionProvide connection = new ConnectionProvide();
    public AddNewQuestion() {   
        initComponents();
        try {
            Connection con = connection.getCon();
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery("SELECT COUNT(id) FROM question");
                if (rs.next()) {
                    int count = rs.getInt(1);
                    int nextId = count + 1;
                    String nextIdStr = String.valueOf(nextId);
                    labelAddQIDNum.setText(nextIdStr);
                } 
                else {
                    labelAddQIDNum.setText("1");
                }
                statement.close();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHome = new javax.swing.JPanel();
        labelHome = new javax.swing.JLabel();
        labelAddNewQ = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        labelAddOpt4 = new javax.swing.JLabel();
        labelAddOpt3 = new javax.swing.JLabel();
        labelAddQ = new javax.swing.JLabel();
        labelAddOpt2 = new javax.swing.JLabel();
        labelAddOpt1 = new javax.swing.JLabel();
        labelAddAns = new javax.swing.JLabel();
        txtfieldAddQ = new javax.swing.JTextField();
        txtfieldAddOpt3 = new javax.swing.JTextField();
        txtfieldAddOpt2 = new javax.swing.JTextField();
        txtfieldAddOpt1 = new javax.swing.JTextField();
        txtfieldAddOpt4 = new javax.swing.JTextField();
        txtfieldAddAns = new javax.swing.JTextField();
        btnAddSave = new javax.swing.JButton();
        btnAddClear = new javax.swing.JButton();
        btnAddExit = new javax.swing.JButton();
        labelAddQID = new javax.swing.JLabel();
        labelAddQIDNum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(150, 155));
        setUndecorated(true);

        panelHome.setBackground(new java.awt.Color(113, 141, 140));
        panelHome.setForeground(new java.awt.Color(76, 106, 114));

        labelHome.setBackground(new java.awt.Color(201, 212, 199));
        labelHome.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        labelHome.setForeground(new java.awt.Color(248, 249, 236));
        labelHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHome.setText("GhosDevs Quiz System");

        labelAddNewQ.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelAddNewQ.setForeground(new java.awt.Color(248, 249, 236));
        labelAddNewQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new question.png"))); // NOI18N
        labelAddNewQ.setText("Add New Questions");

        jSeparator1.setBackground(new java.awt.Color(248, 249, 236));

        jSeparator2.setBackground(new java.awt.Color(248, 249, 236));

        labelAddOpt4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAddOpt4.setForeground(new java.awt.Color(248, 249, 236));
        labelAddOpt4.setText("Option 4:");

        labelAddOpt3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAddOpt3.setForeground(new java.awt.Color(248, 249, 236));
        labelAddOpt3.setText("Option 3:");

        labelAddQ.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAddQ.setForeground(new java.awt.Color(248, 249, 236));
        labelAddQ.setText("Question:");

        labelAddOpt2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAddOpt2.setForeground(new java.awt.Color(248, 249, 236));
        labelAddOpt2.setText("Option 2:");

        labelAddOpt1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAddOpt1.setForeground(new java.awt.Color(248, 249, 236));
        labelAddOpt1.setText("Option 1:");

        labelAddAns.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAddAns.setForeground(new java.awt.Color(248, 249, 236));
        labelAddAns.setText("Result:");

        txtfieldAddQ.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfieldAddQ.setForeground(new java.awt.Color(76, 106, 114));
        
        txtfieldAddOpt3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfieldAddOpt3.setForeground(new java.awt.Color(76, 106, 114));

        txtfieldAddOpt2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfieldAddOpt2.setForeground(new java.awt.Color(76, 106, 114));

        txtfieldAddOpt1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfieldAddOpt1.setForeground(new java.awt.Color(76, 106, 114));

        txtfieldAddOpt4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfieldAddOpt4.setForeground(new java.awt.Color(76, 106, 114));

        txtfieldAddAns.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtfieldAddAns.setForeground(new java.awt.Color(76, 106, 114));

        btnAddSave.setBackground(new java.awt.Color(201, 212, 199));
        btnAddSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddSave.setForeground(new java.awt.Color(76, 106, 114));
        btnAddSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btnAddSave.setText("Save");
        btnAddSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSaveActionPerformed(evt);
            }
        });

        btnAddClear.setBackground(new java.awt.Color(201, 212, 199));
        btnAddClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddClear.setForeground(new java.awt.Color(76, 106, 114));
        btnAddClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        btnAddClear.setText("Clear");
        btnAddClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClearActionPerformed(evt);
            }
        });

        btnAddExit.setBackground(new java.awt.Color(113, 141, 140));
        btnAddExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        btnAddExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExitActionPerformed(evt);
            }
        });

        labelAddQID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAddQID.setForeground(new java.awt.Color(248, 249, 236));
        labelAddQID.setText("Question ID:");

        labelAddQIDNum.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelAddQIDNum.setForeground(new java.awt.Color(248, 249, 236));
        labelAddQIDNum.setText("00");

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddExit))
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(labelAddNewQ))
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAddOpt1)
                            .addComponent(labelAddOpt2)
                            .addComponent(labelAddQ)
                            .addComponent(labelAddOpt3)
                            .addComponent(labelAddOpt4)
                            .addComponent(labelAddAns)
                            .addComponent(labelAddQID))
                        .addGap(67, 67, 67)
                        .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHomeLayout.createSequentialGroup()
                                .addComponent(btnAddSave)
                                .addGap(64, 64, 64)
                                .addComponent(btnAddClear))
                            .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtfieldAddAns, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                                .addComponent(txtfieldAddOpt4)
                                .addComponent(txtfieldAddOpt3)
                                .addComponent(txtfieldAddQ)
                                .addComponent(txtfieldAddOpt2)
                                .addComponent(txtfieldAddOpt1))
                            .addComponent(labelAddQIDNum))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelHome)
                    .addComponent(btnAddExit))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(labelAddNewQ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 4, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddQID)
                    .addComponent(labelAddQIDNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddQ)
                    .addComponent(txtfieldAddQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddOpt1)
                    .addComponent(txtfieldAddOpt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddOpt2)
                    .addComponent(txtfieldAddOpt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddOpt3)
                    .addComponent(txtfieldAddOpt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddOpt4)
                    .addComponent(txtfieldAddOpt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddAns)
                    .addComponent(txtfieldAddAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSave)
                    .addComponent(btnAddClear))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSaveActionPerformed
        String name = txtfieldAddQ.getText();
        String opt1 = txtfieldAddOpt1.getText();
        String opt2 = txtfieldAddOpt2.getText();
        String opt3 = txtfieldAddOpt3.getText();
        String opt4 = txtfieldAddOpt4.getText();
        String answer = txtfieldAddAns.getText();
        if (name.isEmpty() || opt1.isEmpty() || opt2.isEmpty() || opt3.isEmpty() || opt4.isEmpty() || answer.isEmpty()){
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(jf, "Please Enter all the fields", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else{
            connection.addQuestions(name, opt1, opt2, opt3, opt4, answer);
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "Successfully Added");
            setVisible(false);
            new AddNewQuestion().setVisible(true);
        }
    }//GEN-LAST:event_btnAddSaveActionPerformed

    private void btnAddClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClearActionPerformed
        setVisible(false);
        new AddNewQuestion().setVisible(true);
    }//GEN-LAST:event_btnAddClearActionPerformed

    private void btnAddExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExitActionPerformed
        AdminHome.open = 0;
        setVisible(false);
    }//GEN-LAST:event_btnAddExitActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClear;
    private javax.swing.JButton btnAddExit;
    private javax.swing.JButton btnAddSave;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAddAns;
    private javax.swing.JLabel labelAddNewQ;
    private javax.swing.JLabel labelAddOpt1;
    private javax.swing.JLabel labelAddOpt2;
    private javax.swing.JLabel labelAddOpt3;
    private javax.swing.JLabel labelAddOpt4;
    private javax.swing.JLabel labelAddQ;
    private javax.swing.JLabel labelAddQID;
    private javax.swing.JLabel labelAddQIDNum;
    private javax.swing.JLabel labelHome;
    private javax.swing.JPanel panelHome;
    private javax.swing.JTextField txtfieldAddAns;
    private javax.swing.JTextField txtfieldAddOpt1;
    private javax.swing.JTextField txtfieldAddOpt2;
    private javax.swing.JTextField txtfieldAddOpt3;
    private javax.swing.JTextField txtfieldAddOpt4;
    private javax.swing.JTextField txtfieldAddQ;
    // End of variables declaration//GEN-END:variables
}
