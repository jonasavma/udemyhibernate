
import javax.swing.JOptionPane;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class GravarPessoa {

    public static void main(String[] args) {

        try {
            SessionFactory fabrica = new Configuration().configure().buildSessionFactory();
            Session sessao = fabrica.openSession();
            Pessoa obj_pessoa = new Pessoa();
            
            obj_pessoa.setPes_nome("Jonas 5");
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

            Transaction tx_pessoa = sessao.beginTransaction();

            sessao.save(obj_pessoa);

            tx_pessoa.commit();
            sessao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
