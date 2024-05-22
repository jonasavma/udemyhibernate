package br.com.informaticom.DAOgenerico;

import br.com.informaticom.modelo.Endereco;
import br.com.informaticom.modelo.Pessoa;
import javax.swing.JOptionPane;

public class GravarPessoaDAOGenerico {

    public static void main(String[] args) {

        try {
            Pessoa obj_pessoa = new Pessoa();
            obj_pessoa.setPes_nome("Jonas Dao novo de novo ");
            obj_pessoa.setPes_email("jonas@gmail.com");
            obj_pessoa.setPes_fone("969403632");
            obj_pessoa.setPes_cpf("85888710768");
            obj_pessoa.setPes_idade(59);
            obj_pessoa.setPes_sexo('M');

            Endereco obj_endereco = new Endereco();

            obj_endereco.setPes_cidade("Rio de Janeiro");
            obj_endereco.setPes_bairro("Campo Grande");
            obj_endereco.setPes_complemento("AP 202");
            obj_endereco.setPes_logradouro("Rua Amazonas");
            obj_endereco.setPes_numero(60);
            obj_pessoa.setObj_endereco(obj_endereco);
            DAOGenerico obj_pessoa1_dao = new DAOGenerico(obj_pessoa);
            obj_pessoa1_dao.insere();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
