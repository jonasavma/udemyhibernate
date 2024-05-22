package br.com.informaticom.DAOgenerico;

import br.com.informaticom.modelo.Aluno;
import br.com.informaticom.modelo.Pessoa;
import javax.swing.JOptionPane;

public class ExcluirPessoaGenericoDAO {

    public static void main(String[] args) {
        try {

            Pessoa pessoa = new Pessoa();
            pessoa.setPes_codigo(8);
            DAOGenerico obj_pessoa_dao = new DAOGenerico(pessoa);
            obj_pessoa_dao.excluir();
            JOptionPane.showMessageDialog(null, "Pessoa excluido " + "-" + pessoa.getPes_codigo());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
