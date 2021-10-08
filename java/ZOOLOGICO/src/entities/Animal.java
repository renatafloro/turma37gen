package entities;

public class Animal {

	private String nome;
	private int idade;
	private boolean emiteSons;
	private boolean correr;

	public Animal(String nome, int idade, boolean emiteSons, boolean correr) {

		this.nome = nome;
		this.idade = idade;
		this.emiteSons = emiteSons;
		this.correr = correr;

	}

	public void emiteSons() {
		this.emiteSons = true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isEmiteSons() {
		return emiteSons;
	}

	public void setEmiteSons(boolean emiteSons) {
		this.emiteSons = emiteSons;
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
}
