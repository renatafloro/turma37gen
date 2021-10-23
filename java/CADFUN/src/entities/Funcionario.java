package entities;

public class Funcionario {

	private String matricula;
	private String nome;
	private int horasTrabalhadas;
	private double valorHora;
	
	public Funcionario(String matricula, String nome, int horasTrabalhadas, double valorHora) {
		super();
		this.matricula=matricula;
		this.nome=nome;
		this.horasTrabalhadas=horasTrabalhadas;
		this.valorHora=valorHora;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double calcularSalario() {
		return (this.horasTrabalhadas*this.valorHora);
	}
	
}
