package app;

import entities.Funcionario;
import entities.Terceiro;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("funcionario1", "108", 8, 25);
		Terceiro terceiro1 = new Terceiro("Terceiro1", "205", 8, 25, 10);
		//System.out.print(funcionario1.getNome());
		//System.out.print(funcionario1.getMatricula());
		//System.out.print(funcionario1.getHorasTrabalhadas());
		//System.out.print(funcionario1.getValorHora());
		//System.out.print(terceiro1.getNome());
		//System.out.print(terceiro1.getMatricula());
		//System.out.print(terceiro1.getHorasTrabalhadas());
		//System.out.print(terceiro1.getValorHora());
		//System.out.print(terceiro1.getAdicional());

		funcionario1.setHorasTrabalhadas(80);
		funcionario1.setValorHora(10.00);
		System.out.print("Salario do funcionario é R$"+funcionario1.calcularSalario());
	
		terceiro1.
	}
	
	

}
