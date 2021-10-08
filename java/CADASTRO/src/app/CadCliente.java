package app;

import java.util.Scanner;

import entities.Cliente;

public class CadCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("String Ana","548.587.200-50",'a',25);

		System.out.printf("As informações do cliente são:\n \n Nome: %s\n Cpf: %s\n  Idade: %d\n  Pronome: %c\n",c1.nome,c1.cpf,c1.idade,c1.pronome);
	}

}
