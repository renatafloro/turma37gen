package vetorEmatriz;

import java.util.Scanner;

public class ListaJavaVetoreMatrizQuestao1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
//VETOR
//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o 
//de uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 

		float maior = 0;
		float[] pontos = new float[5];

		for (int d = 0; d < 5; d++) {
			System.out.print("Digite sua pontua��o: ");
			pontos[d] = leia.nextFloat();
			if (maior < pontos[d]) {

				maior =  pontos[d];
			}
		}

		System.out.println("\nSeus pontos s�o: ");

		for (int i = 0; i < 5; i++) {
			System.out.println(pontos[i] + "\n");
		}
		System.out.println("O maior numero � " + maior);

	}

}
