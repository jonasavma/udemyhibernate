/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.informaticom.DAO;

import br.com.informaticom.modelo.Aluno;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import org.hibernate.Transaction;

public class ExcluirAlunoDAO {

    public static void main(String[] args) {
        try {

            Aluno aluno = new Aluno();
            aluno.setAlu_codigo(6);
            AlunoDAO obj_aluno_dao = new AlunoDAO();
            obj_aluno_dao.excluirAluno(aluno);
            JOptionPane.showMessageDialog(null, "Aluno excluido " + aluno.getAlu_codigo() );
           

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
