package vetorEmatriz;

import java.util.Random;

public class ListaJavaVetoreMatrizQuestao3 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
			int [][] N1= new int [4][6];
			int [][] N2= new int [4][6];
			int [][] M1= new int [4][6];
			int [][] M2= new int [4][6];
			int soma;

			
		for (int l=0; l<4; l++){
			for (int c=0; c<6; c++){
				 N1[l][c]= gerador.nextInt(4)+1;
				 N2[l][c]= gerador.nextInt(1)+1;
			     M1[l][c]=N1[l][c]+N2[l][c];
			     M2[l][c]=N1[l][c]-N2[l][c];
		      } 
		}
		
		System.out.println("\n");
		System.out.println("N1\n");
		for (int l=0; l<4; l++){
			for (int c=0; c<6; c++){
				System.out.print(N1[l][c]+" ");
		      }
			System.out.print("\n");   
		}
		
		System.out.println("\n");
		System.out.println("M1\n");
		for (int l=0; l<4; l++){
			for (int c=0; c<6; c++){
				System.out.print(M1[l][c]+" "); 
		      } 
			System.out.print("\n");
		}
		System.out.println("\n");
		System.out.println("N2\n");
		for (int l=0; l<4; l++){
			for (int c=0; c<6; c++){
				System.out.print(N2[l][c]+" "); 
		      }       
			System.out.print("\n");
		}
		System.out.println("\n");
		System.out.println("M2\n");
		for (int l=0; l<4; l++){
			for (int c=0; c<6; c++){
				System.out.print(M2[l][c]+" ");
		      } 
			System.out.print("\n");
		      
		}
		}

}
