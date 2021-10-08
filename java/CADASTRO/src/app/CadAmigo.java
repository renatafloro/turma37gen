package app;

import entities.Pessoa;

public class CadAmigo {

	public static void main(String[] args) {
		
		Pessoa p1= new Pessoa();
        Pessoa p2= new Pessoa();
		
		p1.nome="Ana";
		p1.email="ana@gmail.com";
		p1.pronome='a';
		p1.anoNascimento= 1992;
		
		p2.nome="João";
		p2.anoNascimento= 1998;
		
		System.out.println(p1.nome);
		System.out.println(p1.nome+" Sua idade é "+(2021-p1.anoNascimento));
		System.out.println(p2.nome+" Sua idade é "+(2021-p2.anoNascimento));
	    
		System.out.println(p1.nome+" Sua idade é "+p1.calcularIdade(2030));
	}

}
