
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ListarAlunos {

    public static void main(String[] args) {

        try {

            SessionFactory fabrica = new Configuration()
                    .setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
                    .setProperty("hibernate.connection.url","jdbc:postgresql://localhost:5433/javahibernate")
                    .setProperty("hibernate.connection.username", "postgres")
                    .setProperty("hibernate.connection.password", "root")
                    .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect")
                    .setProperty("current_session_context_class", "threa")
                    .setProperty("hbm2ddl.auto", "update")
                    .setProperty("pool_size", "10")
                    .configure().buildSessionFactory();
            Session sessao = fabrica.openSession();
            Aluno obj_aluno = (Aluno) sessao.get(Aluno.class, 3 );
            String dadosn = obj_aluno.getAlu_nome();
            JOptionPane.showMessageDialog(null, "Nova de consultar aluno;\n\n"+dadosn);

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
