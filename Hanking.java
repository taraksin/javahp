package jogo;

import java.io.BufferedReader;
import java.io.FileReader;

public class Hanking extends javax.swing.JFrame {
    int acerto;
    String nome;
    public Hanking(int acert, String nome) {
       this.acerto=acert;
       this.nome=nome;
       initComponents();
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblhank = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(406, 305));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        lblhank.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblhank.setText("Hanking");
        getContentPane().add(lblhank);
        lblhank.setBounds(160, 240, 102, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pgold.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 10, 109, 104);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/brum.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 10, 127, 170);

        lbl1.setText("1º Hermione Granger 20 pts");
        getContentPane().add(lbl1);
        lbl1.setBounds(84, 116, 160, 26);

        lbl2.setText("2º lugar");
        getContentPane().add(lbl2);
        lbl2.setBounds(84, 150, 180, 26);

        lbl4.setText("3º Draco Malfoy            1 pts");
        getContentPane().add(lbl4);
        lbl4.setBounds(84, 188, 160, 26);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bvb.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 280);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       lbl2.setText("2º "+nome+"                  "+acerto+"pts");
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
            java.util.logging.Logger.getLogger(Hanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hanking(0,"").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lblhank;
    // End of variables declaration//GEN-END:variables
}
