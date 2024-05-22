package br.com.informaticom.DAO;

import br.com.informaticom.modelo.Aluno;
import br.com.informaticom.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlunoDAO implements InterfaceAlunoDAO {

    private final Session sessao;
    Transaction tx_aluno = null;

    public AlunoDAO() {
        this.sessao = HibernateUtil.getSessao();
    }

    @Override
    public void insereAluno(Aluno aluno) {
        try {
            tx_aluno = sessao.beginTransaction();
            sessao.save(aluno);
            tx_aluno.commit();
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Erro na inserssão de alunos:");
            tx_aluno.rollback();
        }
    }

    @Override
    public void excluirAluno(Aluno aluno) {
        try {
            tx_aluno = sessao.beginTransaction();
            sessao.delete(aluno);
            tx_aluno.commit();

        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão de aluno:");
            tx_aluno.rollback();
        }

    }

    @Override
    public void autalizaAluno(Aluno aluno) {
        try {
            tx_aluno = sessao.beginTransaction();
            sessao.saveOrUpdate(aluno);
            tx_aluno.commit();

        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Erros na ataulização de alunos.");
            tx_aluno.rollback();
        }

    }

    @Override
    public List todos_alunos() {
        tx_aluno = sessao.beginTransaction();
        List lista_alunos = sessao.createQuery("from Aluno").list();
        return lista_alunos;
    }

}
