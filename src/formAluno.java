
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import javax.swing.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Transaction;

public class formAluno extends javax.swing.JFrame {

    /**
     * Creates new form formAluno
     */
    public formAluno() {
        initComponents();
        preencher_jtable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro de Aluno");

        jLabel2.setText(" Codigo :");

        tf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Curso :");

        tf_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cursoActionPerformed(evt);
            }
        });

        jLabel5.setText("Fone:");

        tf_fone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_foneActionPerformed(evt);
            }
        });

        jLabel6.setText("Cidade: ");

        tf_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cidadeActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null}
                },
                new String[]{
                    "Codigo", "Nome", "Curso", "Fone", "Cidade"
                }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Novo ");
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

        jButton3.setText("Alterar ");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton4))
                                                .addComponent(jLabel1)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(tf_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jLabel3))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(tf_fone, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(tf_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(tf_fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4))
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_codigoActionPerformed

    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeActionPerformed

    private void tf_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cursoActionPerformed

    private void tf_foneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_foneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_foneActionPerformed

    private void tf_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cidadeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha = jTable1.getSelectedRow();
        //JOptionPane.showMessageDialog(null, "linha = " + linha);
        // o toString é para converter para string
        //Forma  1º direto do jTable para os textFields
        /*tf_codigo.setText(jTable1.getValueAt(linha, 0).toString());
        tf_nome.setText(jTable1.getValueAt(linha, 1).toString());
        tf_curso.setText(jTable1.getValueAt(linha, 2).toString());
        tf_fone.setText(jTable1.getValueAt(linha, 3).toString());
        tf_cidade.setText(jTable1.getValueAt(linha, 4).toString());
         */
        //Forma 2º usando a classe Aluno
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
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de insers�o :" + e);

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String excluir = "Tem certeza de que deseja excluir o Aluno" + tf_nome.getText() + "?";
        int opcao_escolhiha = JOptionPane.showConfirmDialog(null, excluir, "Exclusão", JOptionPane.YES_OPTION);
        if (opcao_escolhiha == JOptionPane.YES_OPTION) {
            try {
                SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
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
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();

            List<Aluno> lista_aluno = new ArrayList<>();
            lista_aluno = sessao.createQuery("from Aluno").list();
            int tamanho_lista = lista_aluno.size();

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
