package entities;

public class Cliente {
	public String nome;
	public String cpf;
	public char pronome;
	public int idade;
	
	
	public Cliente (int idade,String cpf) {
		this.idade=idade;
		this.cpf=cpf;
	}

	public Cliente (String nome,  String cpf, char pronome, int idade) { 
		this.nome=nome;
		this.cpf=cpf;
		this.pronome=pronome;
		this.idade=idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getPronome() {
		return pronome;
	}

	public void setPronome(char pronome) {
		this.pronome = pronome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
	
	