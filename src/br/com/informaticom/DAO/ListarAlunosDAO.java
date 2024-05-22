package br.com.informaticom.DAO;

import br.com.informaticom.mvc_visao.*;
import br.com.informaticom.modelo.Aluno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ListarAlunosDAO {

    public static void main(String[] args) {

        try {

            AlunoDAO obj_alunoDAO = new AlunoDAO();
            List<Aluno> lista_aluno = new ArrayList<>();
            lista_aluno = obj_alunoDAO.todos_alunos();
            int tamanho_lista = lista_aluno.size();
            String dados = "";

            for (int i = 0; i < tamanho_lista; i++) {
                Aluno aluno = lista_aluno.get(i);
                System.out.println("Codigo :" + aluno.getAlu_codigo() + "Nome :" + aluno.getAlu_nome() + "Curso :" + aluno.getAlu_fone() + "Fone :" + "Cidade :" + aluno.getAlu_cidade());
                dados = dados + "\n" + "Codigo : " + aluno.getAlu_codigo() + " Nome : " + aluno.getAlu_nome() + " Curso : " + aluno.getAlu_curso() + " Fone : " + aluno.getAlu_fone() + " Cidade : " + aluno.getAlu_cidade();

            }
            JOptionPane.showMessageDialog(null, dados);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos :" + e);

        }

    }

}
