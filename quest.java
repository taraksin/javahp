package jogo;

import java.applet.Applet;
import java.applet.AudioClip;

public class quest extends javax.swing.JFrame {

    public quest() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcat = new javax.swing.JLabel();
        lblfrufru = new javax.swing.JLabel();
        lblquiz = new javax.swing.JLabel();
        lblfundo = new javax.swing.JLabel();
        btnJogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("melhor quiz do mundo trouxa sobre Harry Potter");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        lblcat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cat.gif"))); // NOI18N
        getContentPane().add(lblcat);
        lblcat.setBounds(290, 20, 180, 100);

        lblfrufru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gfxd.gif"))); // NOI18N
        getContentPane().add(lblfrufru);
        lblfrufru.setBounds(200, 160, 110, 50);

        lblquiz.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        lblquiz.setText("QUIZ");
        getContentPane().add(lblquiz);
        lblquiz.setBounds(180, 80, 70, 30);

        lblfundo.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lblfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inicio1.gif"))); // NOI18N
        getContentPane().add(lblfundo);
        lblfundo.setBounds(0, -10, 510, 360);

        btnJogar.setText("Jogar");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJogar);
        btnJogar.setBounds(180, 150, 140, 90);

        setSize(new java.awt.Dimension(506, 369));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        quiz Quiz = new quiz();
        Quiz.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnJogarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        AudioClip musica = Applet.newAudioClip(getClass().getResource("/icons/HarryPotter.mid"));
        musica.loop();
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(quest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JLabel lblcat;
    private javax.swing.JLabel lblfrufru;
    private javax.swing.JLabel lblfundo;
    private javax.swing.JLabel lblquiz;
    // End of variables declaration//GEN-END:variables
}
