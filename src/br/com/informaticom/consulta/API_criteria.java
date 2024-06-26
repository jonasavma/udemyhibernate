package br.com.informaticom.consulta;

import br.com.informaticom.modelo.Aluno;
import br.com.informaticom.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.hql.ast.tree.RestrictableStatement;

public class API_criteria {

    public static void main(String[] args) {
        try {

            Session sessao = HibernateUtil.getSessao();
            Criteria listagem_criteria = sessao.createCriteria(Aluno.class);
            listagem_criteria.setMaxResults(10);
            listagem_criteria.setFirstResult(0);
            listagem_criteria.addOrder(Order.asc("alu_nome"));
            //Forma de pesquisa tres ao todo.
            //forma 1
            // listagem_criteria.add(Expression.eq("alu_nome", "Jonas Martins"));
            listagem_criteria.add(Restrictions.between("alu_codigo", 1, 9));
            //Forma 2
            // String[] cidades = {"Nova Iguaçu", "Niteroi"};
            // listagem_criteria.add(Restrictions.in("alu_cidade", cidades));
            //Forma 3
            listagem_criteria.add(Restrictions.like("alu_cidade", "Niteroi"));
            List<Aluno> lista_alunos = listagem_criteria.list();
            int tamanho_lista = lista_alunos.size();
            String dados = "";

            for (int i = 0; i < tamanho_lista; i++) {
                Aluno aluno = lista_alunos.get(i);
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
