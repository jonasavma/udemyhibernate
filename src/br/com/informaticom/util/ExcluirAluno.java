package br.com.informaticom.util;

import br.com.informaticom.mvc_visao.*;
import br.com.informaticom.modelo.Aluno;
import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.Set;
import java.util.HashSet;

public class ExcluirAluno {

    public static void main(String[] args) {

        try {
            Session sessao = HibernateUtil.getSessao();//fabrica.openSession();
            Aluno aluno = new Aluno();
            aluno.setAlu_codigo(26);
            Transaction tx_aluno = sessao.beginTransaction();

            sessao.delete(aluno);

            tx_aluno.commit();
            sessao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
