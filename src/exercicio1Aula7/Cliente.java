package exercicio1Aula7;

public class Cliente {
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String cartao;

    // Construtor
    public Cliente(String nome, String email, String senha, String telefone, String cartao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.cartao = cartao;
    }
    public Cliente(){}
    
    // Getters
    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
 }  public String getNome() {
     return nome;}
 public String getTelefone() {
     return telefone;}
 public String getCartao() {
     return cartao;}



}