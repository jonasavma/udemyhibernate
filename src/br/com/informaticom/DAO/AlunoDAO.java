package br.com.informaticom.DAO;

import br.com.informaticom.modelo.Aluno;
import br.com.informaticom.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlunoDAO implements InterfaceAlunoDAO {

    private final Session sessao;
    public AlunoDAO() {
      this.sessao= HibernateUtil.getSessao();
    }

    
    
    @Override
    public void insereAluno(Aluno aluno) {
        Transaction tx_aluno= sessao.beginTransaction();
        sessao.save(aluno);
        tx_aluno.commit();
    }

    @Override
    public void excluirAluno(Aluno aluno) {
         Transaction tx_aluno= sessao.beginTransaction();
         sessao.delete(aluno);
         tx_aluno.commit();
        
        
    }

    @Override
    public void autalizaAluno(Aluno aluno) {
         Transaction tx_aluno= sessao.beginTransaction();
         sessao.saveOrUpdate(aluno);
         tx_aluno.commit();
        
        
    }

}
