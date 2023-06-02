package exercicio2Aula7;;

public class Funcionario {
    private String nome;
    private String CPF;
    private String senha;
    private String PIS;
    private String setor;

    // Construtor
    public Funcionario(String nome, String CPF, String senha, String PIS, String setor) {
        this.nome = nome;
        this.CPF = CPF;
        this.senha = senha;
        this.PIS = PIS;
        this.setor = setor;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getSenha() {
        return senha;
    }

    public String getPIS() {
        return PIS;
    }

    public String getSetor() {
        return setor;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPIS(String PIS) {
        this.PIS = PIS;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Senha: " + senha);
        System.out.println("PIS: " + PIS);
        System.out.println("Setor: " + setor);
    }
}

