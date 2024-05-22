package br.com.informaticom.DAO;

import br.com.informaticom.modelo.Aluno;
import java.util.List;

public interface InterfaceAlunoDAO {

    public void insereAluno(Aluno aluno);

    public void excluirAluno(Aluno aluno);

    public void autalizaAluno(Aluno aluno);
    public List todos_alunos();

}
