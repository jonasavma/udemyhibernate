
import java.io.Serializable;

public class Pessoa implements Serializable {

    private int pes_codigo;
    private String pes_nome;
    private String pes_email;
    private char pes_sexo;
    private int pes_idade;
    private String pes_fone;
    private String pes_cpf;
    private Endereco obj_endereco;
    

    public int getPes_codigo() {
        return pes_codigo;
    }

    public void setPes_codigo(int pes_codigo) {
        this.pes_codigo = pes_codigo;
    }

    public String getPes_nome() {
        return pes_nome;
    }

    public void setPes_nome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    public String getPes_email() {
        return pes_email;
    }

    public void setPes_email(String pes_email) {
        this.pes_email = pes_email;
    }

    public char getPes_sexo() {
        return pes_sexo;
    }

    public void setPes_sexo(char pes_sexo) {
        this.pes_sexo = pes_sexo;
    }

    public int getPes_idade() {
        return pes_idade;
    }

    public void setPes_idade(int pes_idade) {
        this.pes_idade = pes_idade;
    }

    public String getPes_fone() {
        return pes_fone;
    }

    public void setPes_fone(String pes_fone) {
        this.pes_fone = pes_fone;
    }

    public String getPes_cpf() {
        return pes_cpf;
    }

    public void setPes_cpf(String pes_cpf) {
        this.pes_cpf = pes_cpf;
    }

    public Endereco getObj_endereco() {
        return obj_endereco;
    }

    public void setObj_endereco(Endereco obj_endereco) {
        this.obj_endereco = obj_endereco;
    }

  
}
