package br.com.informaticom.DAOgenerico;

import br.com.informaticom.DAO.*;
import br.com.informaticom.modelo.Aluno;
import br.com.informaticom.modelo.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ListarPessoaDAOGenerico {

    public static void main(String[] args) {

        try {

            Pessoa pessoa = new Pessoa();
            DAOGenerico obj_pessoa_daoG = new DAOGenerico(pessoa);
            List<Pessoa> lista_pessoa = new ArrayList<>();
            lista_pessoa = obj_pessoa_daoG.lista_todos("Pessoa");
            int tamanho_lista = lista_pessoa.size();
            String dados = "";

            for (int i = 0; i < tamanho_lista; i++) {
                pessoa = lista_pessoa.get(i);
                System.out.println("Codigo :" + pessoa.getPes_codigo() + "Nome :" + pessoa.getPes_nome() + "Cpf :" + pessoa.getPes_cpf() + "Fone :" + pessoa.getPes_fone() + "Email :" + pessoa.getPes_email() + "-" + "Endereço :" + pessoa.getObj_endereco().getPes_cidade());
                dados = dados + "\n" + "Codigo : " + pessoa.getPes_codigo() + " Nome : " + pessoa.getPes_nome() + " CPF: : " + pessoa.getPes_cpf() + " Fone : " + pessoa.getPes_fone() + " e-mail : " + pessoa.getPes_email();

            }
            JOptionPane.showMessageDialog(null, dados);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos :" + e);

        }

    }

}
