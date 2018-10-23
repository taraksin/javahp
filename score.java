package jogo;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class score extends javax.swing.JFrame {

    int acert, erro;

    public score(int acertos, int erros) {
        acert = acertos;
        erro = erros;
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRein = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblPontosneg = new javax.swing.JLabel();
        lblacertos = new javax.swing.JLabel();
        lblerros = new javax.swing.JLabel();
        lblPontos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnhank = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("melhor quiz do mundo trouxa sobre Harry Potter");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        btnRein.setText("Reiniciar");
        btnRein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReinActionPerformed(evt);
            }
        });
        getContentPane().add(btnRein);
        btnRein.setBounds(60, 240, 100, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPontosneg.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblPontosneg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPontosneg.setText("0");

        lblacertos.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        lblacertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblacertos.setText("Acertos");

        lblerros.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        lblerros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblerros.setText("Erros");

        lblPontos.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblPontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPontos.setText("0");

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setText("Score Final");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblacertos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblerros, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPontosneg, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblacertos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPontosneg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblerros, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(80, 50, 300, 160);

        btnhank.setText("Hanking");
        btnhank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhankActionPerformed(evt);
            }
        });
        getContentPane().add(btnhank);
        btnhank.setBounds(300, 240, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/asdas.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1, -4, 460, 320);

        setSize(new java.awt.Dimension(479, 352));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        lblPontosneg.setText(Integer.toString(erro));
        lblPontos.setText(Integer.toString(acert));
    }//GEN-LAST:event_formWindowActivated

    private void btnReinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReinActionPerformed
        dispose();
        quest Quest = new quest();
        Quest.setVisible(true);
    }//GEN-LAST:event_btnReinActionPerformed

    private void btnhankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhankActionPerformed
        String nome;
        nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        Hanking blabla = new  Hanking(acert,nome);
        blabla.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnhankActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new score(0, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRein;
    private javax.swing.JButton btnhank;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPontos;
    private javax.swing.JLabel lblPontosneg;
    private javax.swing.JLabel lblacertos;
    private javax.swing.JLabel lblerros;
    // End of variables declaration//GEN-END:variables
}
