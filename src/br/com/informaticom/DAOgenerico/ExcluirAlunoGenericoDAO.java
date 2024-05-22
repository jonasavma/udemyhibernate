package br.com.informaticom.DAOgenerico;

import br.com.informaticom.modelo.Aluno;
import javax.swing.JOptionPane;

public class ExcluirAlunoGenericoDAO {

    public static void main(String[] args) {
        try {

            Aluno aluno = new Aluno();
            aluno.setAlu_codigo(7);
            DAOGenerico obj_aluno_dao = new DAOGenerico(aluno);
            obj_aluno_dao.excluir();
            JOptionPane.showMessageDialog(null, "Aluno excluido " + aluno.getAlu_codigo());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de inserssão :" + e);

        }

    }

}
