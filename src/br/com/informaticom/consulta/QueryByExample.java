package br.com.informaticom.consulta;

import br.com.informaticom.modelo.Aluno;
import br.com.informaticom.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class QueryByExample {

    public static void main(String[] args) {
        try {

            Session sessao = HibernateUtil.getSessao();
            Aluno aluno = new Aluno();
            aluno.setAlu_cidade("Nova Iguaçu");
            Criteria criteria = sessao.createCriteria(Aluno.class);
            criteria.add(Example.create(aluno));

            List<Aluno> lista_alunos = criteria.list();
            int tamanho_lista = lista_alunos.size();
            String dados = "";

            for (int i = 0; i < tamanho_lista; i++) {
                aluno = lista_alunos.get(i);
                System.out.println("Codigo :" + aluno.getAlu_codigo() + "-" + "Nome :" + aluno.getAlu_nome() + "|" + "Curso : " + aluno.getAlu_fone() + "Fone :" + "Cidade :" + aluno.getAlu_cidade());
                dados = dados + "\n" + "Codigo : " + aluno.getAlu_codigo() + "-" + " Nome : " + aluno.getAlu_nome() + "|" + " Curso : " + aluno.getAlu_curso() + " Fone : " + aluno.getAlu_fone() + " Cidade : " + aluno.getAlu_cidade();

            }
            JOptionPane.showMessageDialog(null, dados);
            sessao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos :" + e);

        }

    }
}
