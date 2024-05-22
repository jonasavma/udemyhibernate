package br.com.informaticom.DAOgenerico;

import br.com.informaticom.DAO.*;
import br.com.informaticom.modelo.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ListarAlunosDAOGenerico {

    public static void main(String[] args) {

        try {

            Aluno aluno = new Aluno();
            DAOGenerico obj_aluno_daoG= new DAOGenerico(aluno);
            List<Aluno> lista_aluno = new ArrayList<>();
            lista_aluno = obj_aluno_daoG.lista_todos("Aluno");
            int tamanho_lista = lista_aluno.size();
            String dados = "";

            for (int i = 0; i < tamanho_lista; i++) {
                aluno = lista_aluno.get(i);
                System.out.println("Codigo :" + aluno.getAlu_codigo() + "Nome :" + aluno.getAlu_nome() + "Curso :" + aluno.getAlu_fone() + "Fone :" + "Cidade :" + aluno.getAlu_cidade());
                dados = dados + "\n" + "Codigo : " + aluno.getAlu_codigo() + " Nome : " + aluno.getAlu_nome() + " Curso : " + aluno.getAlu_curso() + " Fone : " + aluno.getAlu_fone() + " Cidade : " + aluno.getAlu_cidade();

            }
            JOptionPane.showMessageDialog(null, dados);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos :" + e);

        }

    }

}
