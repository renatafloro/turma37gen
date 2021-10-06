package vetorEmatriz;

import java.util.Scanner;

public class ListaJavaVetoreMatrizQuestao4 {
	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

	    int [][] matriz= new int [3][3];
		int somaTotal=0, somaDiagonal=0;

		for (int l=0; l<3; l++){
			for (int c=0; c<3; c++){
				System.out.println("Digite o valor: ");
				(matriz[l][c])= leia.nextInt();
			}
		}
          
		for(int l=0; l<3; l++){
              for(int c=0; c<3; c++){
          		somaTotal= somaTotal+matriz[l][c];
          	}
          }
          
		for(int x=0; x<3; x++){
          	somaDiagonal= somaDiagonal+ matriz[x][x];
          }

		System.out.println("\n A soma total da matriz foi: "+somaTotal);
		System.out.println("\n A soma da diagonal principal é: "+somaDiagonal);
	}
}
	
	
