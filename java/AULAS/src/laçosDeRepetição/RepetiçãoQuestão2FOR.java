package la�osDeRepeti��o;

import java.util.Scanner;

public class Repeti��oQuest�o2FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		
		int numeroTemporario = 0, qtdPares = 0, qtdImpares = 0;
		
		for (int x=0; x<10; x++) {
			System.out.printf("Escreva o n�mero %d: \n", x+1);
			numeroTemporario = leia.nextInt();
			
			if(numeroTemporario % 2 == 0) {
				qtdPares++;
			}else {
				qtdImpares++;
			}
		
		}
		
		System.out.printf("Quantidade de pares = %d \n", qtdPares);
		System.out.printf("Quantidade de impares = %d \n", qtdImpares);

	}

}

