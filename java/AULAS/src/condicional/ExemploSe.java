package condicional;

import java.util.Scanner;

public class ExemploSe {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		final int ANO_ATUAL = 2021;
		String nome;
		int anoNascimento;
		int idade;

		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.println()
		idade = ANO_ATUAL - anoNascimento;

		if (idade >= 40) {
			System.out.println("Você é cringe!");
		} else if (idade >= 18) {
			System.out.println("Você é adulto!");

		} else {
			System.out.println("Você é jovem!");
		}

	}
}