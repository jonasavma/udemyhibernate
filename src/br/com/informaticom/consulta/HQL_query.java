/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.informaticom.consulta;

import br.com.informaticom.modelo.Aluno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author jonas
 */
public class HQL_query {
     public static void main(String[] args) {

        try {

            SessionFactory fabrica = new Configuration()
                    .setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
                    .setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5433/javahibernate")
                    .setProperty("hibernate.connection.username", "postgres")
                    .setProperty("hibernate.connection.password", "root")
                    .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect")
                    .setProperty("hibernate.show_sql", "true")
                    .setProperty("hibernate.format_sql", "true")
                    .setProperty("current_session_context_class", "threa")
                    .setProperty("hbm2ddl.auto", "update")
                    .setProperty("pool_size", "10")
                    .configure().buildSessionFactory();

            Session sessao = fabrica.openSession();

            Aluno obj_aluno = (Aluno) sessao.get(Aluno.class, 26);
            String dadosn = obj_aluno.getAlu_nome();
            Set<String> telefones_alunos = obj_aluno.getTelefones_alunos();

            int quantidade_fones_alunos = telefones_alunos.size();
            Iterator it_fones_aluno = telefones_alunos.iterator();
            String fones_deste_aluno = "";
            for (int i = 0; i < quantidade_fones_alunos; i++) {
                fones_deste_aluno = fones_deste_aluno + "\n Fone  " + (i + 1) + "." + it_fones_aluno.next();
            }
            JOptionPane.showMessageDialog(null, "Nova forma de consultar aluno;\n\n" + "Nome do Aluno.:" + dadosn + "\n\n" + "Fones deste aluno " + quantidade_fones_alunos + "\n" + fones_deste_aluno);

            List<Aluno> lista_aluno = new ArrayList();

            lista_aluno = sessao.createQuery("from Aluno").list();
            int tamanho_lista = lista_aluno.size();
            String dados = "";

            for (int i = 0; i < tamanho_lista; i++) {
                Aluno aluno = lista_aluno.get(i);
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
