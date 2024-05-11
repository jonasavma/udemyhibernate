
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import javax.swing.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Transaction;

public class formAluno extends javax.swing.JFrame {

    SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
    List<Aluno> lista_aluno = new ArrayList<>();
    int posicao_atual = 0;
    int tamanho_lista = 0;

    public formAluno() {
        initComponents();
        preencher_jtable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_curso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_fone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_cidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo.:");

        tf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Cadastro de Alunos");

        jLabel3.setText("Nome.:");

        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Curso.:");

        jLabel5.setText("Fone.:");

        tf_fone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_foneActionPerformed(evt);
            }
        });

        jLabel6.setText("Cidade.:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Curso", "Fone", "Cidade"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("|<");

        jButton6.setText(">|");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("<");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText(">");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_fone, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(2, 2, 2)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tf_fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_codigoActionPerformed

    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeActionPerformed

    private void tf_foneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_foneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_foneActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha = jTable1.getSelectedRow();
        //JOptionPane.showMessageDialog(null, "linha ="+linha);
        /*tf_codigo.setText(jTable1.getValueAt(linha, 0).toString());
        tf_nome.setText(jTable1.getValueAt(linha, 1).toString());
        tf_curso.setText(jTable1.getValueAt(linha, 2).toString());
        tf_fone.setText(jTable1.getValueAt(linha, 3).toString());
        tf_cidade.setText(jTable1.getValueAt(linha, 4).toString());
         */

        Aluno aluno = new Aluno();
        aluno.setAlu_codigo(Integer.parseInt(jTable1.getValueAt(linha, 0).toString()));
        aluno.setAlu_nome(jTable1.getValueAt(linha, 1).toString());
        aluno.setAlu_curso(jTable1.getValueAt(linha, 2).toString());
        aluno.setAlu_fone(jTable1.getValueAt(linha, 3).toString());
        aluno.setAlu_cidade(jTable1.getValueAt(linha, 4).toString());
        tf_codigo.setText("" + aluno.getAlu_codigo());
        tf_nome.setText("" + aluno.getAlu_nome());
        tf_curso.setText("" + aluno.getAlu_curso());
        tf_fone.setText("" + aluno.getAlu_fone());
        tf_cidade.setText("" + aluno.getAlu_cidade());


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tf_codigo.setText("");
        tf_nome.setText("");
        tf_curso.setText("");
        tf_fone.setText("");
        tf_cidade.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            Session sessao = fabrica.openSession();
            Aluno aluno = new Aluno();
            aluno.setAlu_codigo(Integer.parseInt(tf_codigo.getText().toString()));
            aluno.setAlu_nome(tf_nome.getText());
            aluno.setAlu_curso(tf_curso.getText());
            aluno.setAlu_fone(tf_fone.getText());
            aluno.setAlu_cidade(tf_cidade.getText());

            Transaction tx_aluno = sessao.beginTransaction();
            sessao.save(aluno);
            tx_aluno.commit();
            sessao.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso :");
            preencher_jtable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão os campos não pode ser vazios :" + e);

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {

            Session sessao = fabrica.openSession();
            Aluno aluno = new Aluno();
            aluno.setAlu_codigo(Integer.parseInt(tf_codigo.getText().toString()));
            aluno.setAlu_nome(tf_nome.getText());
            aluno.setAlu_curso(tf_curso.getText());
            aluno.setAlu_fone(tf_fone.getText());
            aluno.setAlu_cidade(tf_cidade.getText());

            Transaction tx_aluno = sessao.beginTransaction();
            sessao.update(aluno);
            tx_aluno.commit();
            sessao.close();
            JOptionPane.showMessageDialog(null, "Aletrado com sucesso :");
            preencher_jtable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String excluir = "Tem certeza de que deseja excluir o Aluno" + tf_nome.getText() + "?";
        int opcao_escolhiha = JOptionPane.showConfirmDialog(null, excluir, "Exclusão", JOptionPane.YES_OPTION);
        if (opcao_escolhiha == JOptionPane.YES_OPTION) {
            try {
                Session sessao = fabrica.openSession();

                Aluno aluno = new Aluno();

                aluno.setAlu_codigo(Integer.parseInt(tf_codigo.getText().toString()));
                Transaction tx_aluno = sessao.beginTransaction();
                sessao.delete(aluno);
                tx_aluno.commit();
                sessao.close();
                JOptionPane.showMessageDialog(null, "Exclusao realizado com sucesso :");
                preencher_jtable();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Listar Alunos :" + e);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Registro não excluido.");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (posicao_atual < (tamanho_lista - 1)) {
            posicao_atual++;
            Aluno aluno = lista_aluno.get(posicao_atual);
            tf_codigo.setText("" + aluno.getAlu_codigo());
            tf_nome.setText(aluno.getAlu_nome());
            tf_curso.setText(aluno.getAlu_curso());
            tf_fone.setText(aluno.getAlu_fone());
            tf_cidade.setText(aluno.getAlu_cidade());
        }


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        /* posicao_atual--;
        Aluno aluno = lista_aluno.get(posicao_atual);
        tf_codigo.setText("" + aluno.getAlu_codigo());
        tf_nome.setText(aluno.getAlu_nome());
        tf_curso.setText(aluno.getAlu_curso());
        tf_fone.setText(aluno.getAlu_fone());
        tf_cidade.setText(aluno.getAlu_cidade());
         */
    }//GEN-LAST:event_jButton7ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tf_cidade;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_curso;
    private javax.swing.JTextField tf_fone;
    private javax.swing.JTextField tf_nome;
    // End of variables declaration//GEN-END:variables

    public void preencher_jtable() {

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(90);

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        try {

            Session sessao = fabrica.openSession();
            lista_aluno = sessao.createQuery("from Aluno").list();
            tamanho_lista = lista_aluno.size();
            for (int i = 0; i < tamanho_lista; i++) {
                Aluno aluno = lista_aluno.get(i);

                /* if (i == 0) {
                    tf_codigo.setText("" + aluno.getAlu_codigo());
                    tf_nome.setText(aluno.getAlu_nome());
                    tf_curso.setText(aluno.getAlu_curso());
                    tf_fone.setText(aluno.getAlu_fone());
                    tf_cidade.setText(aluno.getAlu_cidade());
                }*/
                modelo.addRow(new Object[]{aluno.getAlu_codigo(), aluno.getAlu_nome(), aluno.getAlu_curso(), aluno.getAlu_fone(), aluno.getAlu_cidade()
                });
            }

            if (!lista_aluno.isEmpty()) {

                Aluno aluno = lista_aluno.get(0);

                tf_codigo.setText("" + aluno.getAlu_codigo());
                tf_nome.setText(aluno.getAlu_nome());
                tf_curso.setText(aluno.getAlu_curso());
                tf_fone.setText(aluno.getAlu_fone());
                tf_cidade.setText(aluno.getAlu_cidade());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar " + e);

        }

    }

}
