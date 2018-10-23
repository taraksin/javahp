package jogo;

import java.applet.Applet;
import java.applet.AudioClip;


public class quiz extends javax.swing.JFrame {
    engineGame Engine = new engineGame();
    int ram,acertos,erros;
    boolean acertou;
    boolean controlejanela;
    public quiz() {
        initComponents();
        
    }
    
    void verifica() {
        acertou = false;
        if ("A".equals(Engine.perguntas[1][ram]) && rdoA.isSelected()){
            acertos++;
            acertou = true;
        }
        if ("B".equals(Engine.perguntas[1][ram]) && rdoB.isSelected()){
            acertos++;
            acertou = true;
        }
        if ("C".equals(Engine.perguntas[1][ram]) && rdoC.isSelected()){
            acertos++;
            acertou = true;
        }
        if ("D".equals(Engine.perguntas[1][ram]) && rdoD.isSelected()){
            acertos++;
            acertou = true;
        }
        if(!acertou){
            erros++;
        }
        System.out.println(acertou?"acertou ":"errou");
    }

    void pergunta() {

        ram = Engine.randomic();
        if (ram != 999) {
            String pergunta = Engine.perguntas[0][ram];
            pergunta = pergunta.replace(";", "\n");
            lblPergunta.setText(pergunta);
            rdoA.setText("a) "+Engine.perguntas[2][ram]);
            rdoB.setText("b) "+Engine.perguntas[3][ram]);
            rdoC.setText("c) "+Engine.perguntas[4][ram]);
            rdoD.setText("d) "+Engine.perguntas[5][ram]);
            rdoA.setSelected(false);
             rdoB.setSelected(false);
             rdoC.setSelected(false);
             rdoD.setSelected(false);
        } else {
            this.dispose();
            score Score = new score(acertos, erros);
            Score.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rdoA = new javax.swing.JRadioButton();
        rdoB = new javax.swing.JRadioButton();
        rdoC = new javax.swing.JRadioButton();
        rdoD = new javax.swing.JRadioButton();
        lblPergunta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("melhor quiz do mundo trouxa sobre Harry Potter");
        setBackground(new java.awt.Color(255, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        btn.setText("Próxima Pergunta");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn);
        btn.setBounds(210, 260, 126, 28);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(rdoA);
        rdoA.setText("a)");

        buttonGroup1.add(rdoB);
        rdoB.setText("b)");
        rdoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoC);
        rdoC.setText("c)");
        rdoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoD);
        rdoD.setText("d)");
        rdoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDActionPerformed(evt);
            }
        });

        lblPergunta.setFont(new java.awt.Font("Georgia", 2, 15)); // NOI18N
        lblPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPergunta.setText("Pergunta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoB, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rdoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdoD, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rdoA, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdoA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoD)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 40, 500, 190);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dfa.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 560, 350);

        setSize(new java.awt.Dimension(556, 381));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoBActionPerformed

    private void rdoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoCActionPerformed

    private void rdoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoDActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        
        
         if (rdoA.isSelected() || rdoB.isSelected() || rdoC.isSelected() || rdoD.isSelected() ) {
             verifica();
             pergunta();
             
         }
           
    }//GEN-LAST:event_btnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (!controlejanela){
        controlejanela = true;
        AudioClip musica = Applet.newAudioClip(getClass().getResource("/icons/HarryPotter.mid"));
        musica.loop();
        pergunta();
        }
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
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JRadioButton rdoA;
    private javax.swing.JRadioButton rdoB;
    private javax.swing.JRadioButton rdoC;
    private javax.swing.JRadioButton rdoD;
    // End of variables declaration//GEN-END:variables
}
