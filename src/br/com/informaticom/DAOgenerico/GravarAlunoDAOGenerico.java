package br.com.informaticom.DAOgenerico;

import br.com.informaticom.DAO.*;
import br.com.informaticom.mvc_visao.*;
import br.com.informaticom.modelo.Aluno;
import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.Set;
import java.util.HashSet;

public class GravarAlunoDAOGenerico {

    public static void main(String[] args) {

        try {

            Aluno aluno = new Aluno();
            // aluno.setAlu_codigo(11);
            aluno.setAlu_nome("Jonas Dao generico ");
            aluno.setAlu_curso("hibernate");
            aluno.setAlu_fone("969403632");
            aluno.setAlu_cidade("Nova Iguaçu");

            Set<String> telefones_alunos = new HashSet<String>();

            telefones_alunos.add("89645248");
            telefones_alunos.add("89645249");
            telefones_alunos.add("896452411");
            aluno.setTelefones_alunos(telefones_alunos);

            DAOGenerico obj_dao_aluno = new DAOGenerico(aluno);
            obj_dao_aluno.insere();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
