package br.com.informaticom.DAO;

import br.com.informaticom.modelo.Aluno;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class EditaAlunoDAO {

    public static void main(String[] args) {
        try {

            Aluno aluno = new Aluno();
            aluno.setAlu_codigo(11);
            aluno.setAlu_nome("Jonas alterado  ");
            aluno.setAlu_curso("hibernate");
            aluno.setAlu_fone("969403632");
            aluno.setAlu_cidade("Nova Iguaçu");

            Set<String> telefones_alunos = new HashSet<String>();

            telefones_alunos.add("89645248");
            telefones_alunos.add("89645249");
            telefones_alunos.add("896452411");
            aluno.setTelefones_alunos(telefones_alunos);

            AlunoDAO obj_aluno = new AlunoDAO();
            obj_aluno.autalizaAluno(aluno);

            JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso: " + aluno.getAlu_codigo());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }
    }

}
