package entities;

public class Terceiro extends Funcionario {

	private double adicional;
	
	public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		this.setAdicional(adicional);
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	@override
	public double calcularSalario() {
		return(super.getHorasTrabalhadas()*super.getValorHora()+this.adicional)
	}

}
