package br.com.informaticom.DAOgenerico;

import br.com.informaticom.DAO.*;
import br.com.informaticom.modelo.Aluno;
import br.com.informaticom.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAOGenerico<T> implements InterfaceDAOGenerico {

    private final Session sessao;
    Transaction transacao = null;
    private T t;

    public DAOGenerico(T t) {
        this.sessao = HibernateUtil.getSessao();
        this.t = t;
    }

    @Override
    public void insere() {
        try {
            transacao = sessao.beginTransaction();
            sessao.save(t);
            transacao.commit();
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Erro na inserssão de alunos:");
            transacao.rollback();
        }
    }

    @Override
    public void excluir() {
        try {
            transacao = sessao.beginTransaction();
            sessao.delete(t);
            transacao.commit();

        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão de aluno:");
            transacao.rollback();
        }
    }

    @Override
    public void gravaORatualiza() {
        try {
            transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(t);
            transacao.commit();

        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Erros na ataulização de alunos.");
            transacao.rollback();
        }
    }

    @Override
    public void atualiza() {
        try {
            transacao = sessao.beginTransaction();
            sessao.update(t);
            transacao.commit();

        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Erros na ataulização de alunos.");
            transacao.rollback();
        }
    }

    @Override
    public List lista_todos(String t) {
        List lista = sessao.createQuery("from " + t).list();
        return lista;
    }

}
