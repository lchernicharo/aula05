package classes;

public class Pessoas {
    private String nome;
    private String sobrenome;
    private long telefone;


    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setSobreNome(String sn) {
        this.sobrenome = sn;
    }

    public String getSobreNome() {
        return sobrenome;
    }

    public void setTelefone(long tel) {
        this.telefone = tel;
    }

    public long getTelefone() {
        return telefone;
    }
}