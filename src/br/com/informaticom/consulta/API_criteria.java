package br.com.informaticom.consulta;

import br.com.informaticom.modelo.Aluno;
import br.com.informaticom.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;

import org.hibernate.criterion.Order;

public class API_criteria {

    public static void main(String[] args) {
        try {

            Session sessao = HibernateUtil.getSessao();
            Criteria listagem_criteria = sessao.createCriteria(Aluno.class);
            listagem_criteria.setMaxResults(6);
            listagem_criteria.setFirstResult(1);
            listagem_criteria.addOrder(Order.asc("alu_codigo"));
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
