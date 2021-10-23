package entities;

public abstract class Conta {

	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativo;

	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	// metodos

	public void ativarConta() {
		this.ativo = true;
	}

	public double debito(double valorDebito) {

		if (valorDebito <= 0) {
			System.out.println("Impossível realizar...");
		} else if (valorDebito > saldo) {
			System.out.println("Saldo indisponível...");
		} else if (valorDebito <= this.saldo) {
			this.saldo = this.saldo - valorDebito;
			System.out.println("Operação realizada com sucesso!");
		}
		return valorDebito;
	}

	public void credito(double valorCredito) {

		this.saldo = this.saldo + valorCredito;
	}

}
