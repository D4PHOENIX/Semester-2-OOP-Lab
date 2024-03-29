/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JFrame;
/**
 *
 * @author daudn
 */
public class AdminHome extends javax.swing.JFrame {
    public static int open = 0;
    /**
     * Creates new form AdminHome
     */
    public AdminHome() {
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
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAddQ = new javax.swing.JMenu();
        menuUpdateQ = new javax.swing.JMenu();
        menuDelQ = new javax.swing.JMenu();
        menuAllQ = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHome.setBackground(new java.awt.Color(113, 141, 140));

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(113, 141, 140));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GhostDevs Admin Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 36), new java.awt.Color(113, 141, 140))); // NOI18N

        menuAddQ.setBackground(new java.awt.Color(201, 212, 199));
        menuAddQ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 141, 140)));
        menuAddQ.setForeground(new java.awt.Color(76, 106, 114));
        menuAddQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new question.png"))); // NOI18N
        menuAddQ.setText("Add Questions");
        menuAddQ.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuAddQ.setMargin(new java.awt.Insets(0, 5, 0, 30));
        menuAddQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAddQMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuAddQ);

        menuUpdateQ.setBackground(new java.awt.Color(201, 212, 199));
        menuUpdateQ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 141, 140)));
        menuUpdateQ.setForeground(new java.awt.Color(76, 106, 114));
        menuUpdateQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update Question.png"))); // NOI18N
        menuUpdateQ.setText("Update Question");
        menuUpdateQ.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuUpdateQ.setMargin(new java.awt.Insets(0, 5, 0, 30));
        menuUpdateQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUpdateQMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuUpdateQ);

        menuDelQ.setBackground(new java.awt.Color(201, 212, 199));
        menuDelQ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 141, 140)));
        menuDelQ.setForeground(new java.awt.Color(76, 106, 114));
        menuDelQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete Question.png"))); // NOI18N
        menuDelQ.setText("Delete Questions");
        menuDelQ.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuDelQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDelQMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuDelQ);

        menuAllQ.setBackground(new java.awt.Color(201, 212, 199));
        menuAllQ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 141, 140)));
        menuAllQ.setForeground(new java.awt.Color(76, 106, 114));
        menuAllQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all questions.png"))); // NOI18N
        menuAllQ.setText("All Questions");
        menuAllQ.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuAllQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAllQMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuAllQ);

        menuLogout.setBackground(new java.awt.Color(201, 212, 199));
        menuLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 141, 140)));
        menuLogout.setForeground(new java.awt.Color(76, 106, 114));
        menuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout.png"))); // NOI18N
        menuLogout.setText("Logout");
        menuLogout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuLogout.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuLogout);

        menuExit.setBackground(new java.awt.Color(201, 212, 199));
        menuExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(113, 141, 140), 1, true));
        menuExit.setForeground(new java.awt.Color(76, 106, 114));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        menuExit.setText("Exit");
        menuExit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMouseClicked
        JFrame jf = new JFrame("Logout");
        if(javax.swing.JOptionPane.showConfirmDialog(jf, "Are you sure you want to logout?", "Logout", javax.swing.JOptionPane.YES_NO_OPTION) == 0){
            this.dispose();
            new LoginPage().setVisible(true);
        }

    }//GEN-LAST:event_menuLogoutMouseClicked

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        JFrame jf = new JFrame("Exit");
        if(javax.swing.JOptionPane.showConfirmDialog(jf, "Are you sure you want to exit?", "Exit", javax.swing.JOptionPane.YES_NO_OPTION) == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_menuExitMouseClicked

    private void menuAddQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAddQMouseClicked
        if (open == 0){
            new AddNewQuestion().setVisible(true);
            open = 1;
        }
        else{
            JFrame jf = new JFrame("Add New Question");
            jf.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(jf, "One form is already open!");
        }
    }//GEN-LAST:event_menuAddQMouseClicked

    private void menuUpdateQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUpdateQMouseClicked
        if (open == 0){
            new UpdateQuestion().setVisible(true);
            open = 1;
        }
        else{
            JFrame jf = new JFrame("Update Question");
            jf.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(jf, "One form is already open!");
        }
    }//GEN-LAST:event_menuUpdateQMouseClicked

    private void menuDelQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDelQMouseClicked
        if (open == 0){
            new DeleteQuestion().setVisible(true);
            open = 1;
        }
        else{
            JFrame jf = new JFrame("Delete Question");
            jf.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(jf, "One form is already open!");
        }
    //GEN-LAST:event_menuDelQMouseClicked
    }//GEN-LAST:event_menuDelQMouseClicked

    private void menuAllQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAllQMouseClicked
        if (open == 0){
            new AllQuestions().setVisible(true);
            open = 1;
        }
        else{
            JFrame jf = new JFrame("All Questions");
            jf.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(jf, "One form is already open!");
        }
    }//GEN-LAST:event_menuAllQMouseClicked

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAddQ;
    private javax.swing.JMenu menuAllQ;
    private javax.swing.JMenu menuDelQ;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuUpdateQ;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables
}
