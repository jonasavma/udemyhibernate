package br.com.informaticom.DAOgenerico;

import br.com.informaticom.DAO.*;
import br.com.informaticom.modelo.Aluno;
import java.util.List;

public interface InterfaceDAOGenerico {

    public void insere();

    public void excluir();

    public void atualiza();
    
    public void gravaORatualiza();

    public List lista_todos(String classe);

}
