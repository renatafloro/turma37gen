package laçosDeRepetição;

import java.util.Scanner;

public class RepetiçãoQuestão4WHILE {
//Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos
//de uma região. Para tanto, a cada uma das pessoas era perguntado: idade, 
//sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
//Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: 
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade;
		char sexo;
		char opcoes;
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int nervososMais40 = 0;
		int calmosMenos18 = 0;
		char op = 'S';
		int contadorHabitantes = 0;

		while (op == 'S' && contadorHabitantes <= 150) {
			System.out.println("Habitante número " + contadorHabitantes);
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Escolha:\n 1-feminino\n2-masculino\n3-Outros");
			sexo = leia.next().charAt(0);
			System.out.println("Escolha: /n1-Pessoa calma\n2-Pessoa nervosa\n3-Pessoa agressiva");
			opcoes = leia.next().charAt(0);
			System.out.println("Continuar S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			contadorHabitantes++;
			if(opcoes=='1') {
				pessoasCalmas++;
			}
			if(sexo=='1' && opcoes=='2') {
				mulheresNervosas++;
			}
			if(sexo=='2' && opcoes=='3') {
				homensAgressivos++;
			}
			if(sexo=='3'&& opcoes=='1') {
				outrosCalmos++;				
			}
			if(opcoes=='2'&& idade>=40) {
				nervososMais40++;
			}
			if(opcoes=='1' && idade<=18) {
			    calmosMenos18++; 	
			}
		}
		System.out.println("Habitantes entrevistados: "+contadorHabitantes);
		System.out.println("Pessoas calmas: "+pessoasCalmas);
		System.out.println("Mulheres nervosas: "+mulheresNervosas);
		System.out.println("Homens agressivos: "+homensAgressivos);
		System.out.println("Outros calmos: "+outrosCalmos);
		System.out.println("Pessoas nervosas acima de 40 anos: "+nervososMais40);
		System.out.println("Pessoas calmas menores de 18 anos: "+calmosMenos18);
	}

}
