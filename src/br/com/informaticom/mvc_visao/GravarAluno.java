package br.com.informaticom.mvc_visao;


import br.com.informaticom.modelo.Aluno;
import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.Set;
import java.util.HashSet;

public class GravarAluno {

    public static void main(String[] args) {

        try {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();
            Aluno aluno = new Aluno();
            // aluno.setAlu_codigo(11);
            aluno.setAlu_nome("Jonas com telefone ");
            aluno.setAlu_curso("hibernate");
            aluno.setAlu_fone("969403632");
            aluno.setAlu_cidade("Nova Iguaçu");

            Set<String> telefones_alunos = new HashSet<String>();

            telefones_alunos.add("89645248");
            telefones_alunos.add("89645249");
            telefones_alunos.add("896452411");
            aluno.setTelefones_alunos(telefones_alunos);


            Transaction tx_aluno = sessao.beginTransaction();

            sessao.save(aluno);

            tx_aluno.commit();
            sessao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
