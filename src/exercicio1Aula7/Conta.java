package exercicio1Aula7;

public class Conta  {
	    private Cliente cliente;
	    private double saldo;

	    // Construtor
	    public Conta(Cliente cliente) {
	        this.cliente = cliente;
	        this.saldo = 0.0;
	    }  public Conta(){}

	    // Método visualizar
	    public void visualizar() {
	        System.out.println("Nome: " + cliente.getNome());
	        System.out.println("Email: " + cliente.getEmail());
	        System.out.println("Telefone: " + cliente.getTelefone());
	        System.out.println("Cartão: " + cliente.getCartao());
	        System.out.println("Saldo: " + saldo);
	    }
	    

	    // Método para sacar
	    public void sacar(double valor) {
	        if (valor <= saldo) {
	            saldo -= valor;
	            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
	        } else {
	            System.out.println("Saldo insuficiente.");
	        }
	    }

	    // Método para realizar PIX
	    public void realizarPix(String destino, double valor) {
	        if (valor <= saldo) {
	            saldo -= valor;
	            System.out.println("PIX no valor de " + valor + " para " + destino + " realizado com sucesso. Saldo atual: " + saldo);
	        } else {
	            System.out.println("Saldo insuficiente.");
	        }
	    }

	    // Método para pagar conta
	    public void pagarConta(String beneficiario, double valor) {
	        if (valor <= saldo) {
	            saldo -= valor;
	            System.out.println("Pagamento de conta no valor de " + valor + " para " + beneficiario + " realizado com sucesso. Saldo atual: " + saldo);
	        } else {
	            System.out.println("Saldo insuficiente.");
	        }
	    }
	    
	    // Método para realizar depósito
	    public void depositar(double valor) {
	        saldo += valor;
	        System.out.println("Depósito de " + valor + " realizado com sucesso. Saldo atual: " + saldo);
	    }
	}

