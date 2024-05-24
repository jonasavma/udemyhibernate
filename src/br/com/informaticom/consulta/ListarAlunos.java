package br.com.informaticom.consulta;

import br.com.informaticom.modelo.Aluno;
import br.com.informaticom.util.HibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ListarAlunos {

    public static void main(String[] args) {

        try {

            Session sessao = HibernateUtil.getSessao();
            Query  listagem_query = sessao.createQuery("From Aluno");
            List<Aluno> lista_alunos= listagem_query.list();
            int tamanho_lista = lista_alunos.size();
            String dados = "";

            for (int i = 0; i < tamanho_lista; i++) {
                Aluno aluno = lista_alunos.get(i);
                System.out.println("Codigo :" + aluno.getAlu_codigo() + "Nome :" + aluno.getAlu_nome() + "Curso :" + aluno.getAlu_fone() + "Fone :" + "Cidade :" + aluno.getAlu_cidade());
                dados = dados + "\n" + "Codigo : " + aluno.getAlu_codigo() + " Nome : " + aluno.getAlu_nome() + " Curso : " + aluno.getAlu_curso() + " Fone : " + aluno.getAlu_fone() + " Cidade : " + aluno.getAlu_cidade();

            }
            JOptionPane.showMessageDialog(null, dados);
            sessao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos :" + e);

        }

    }

}
