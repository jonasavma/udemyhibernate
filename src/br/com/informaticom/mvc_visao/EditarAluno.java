package br.com.informaticom.mvc_visao;


import br.com.informaticom.modelo.Aluno;
import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class EditarAluno {

    public static void main(String[] args) {

        try {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();
            Aluno aluno = new Aluno();
            aluno.setAlu_codigo(2);
            aluno.setAlu_nome("Jonas avelino");
            aluno.setAlu_curso("hibernate");
            aluno.setAlu_fone("969403632");
            aluno.setAlu_cidade("Nova Iguaçu");

            Transaction tx_aluno = sessao.beginTransaction();

            sessao.saveOrUpdate(aluno);

            tx_aluno.commit();
            sessao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de insersção :" + e);

        }

    }

}
