package la�osDeRepeti��o;

import java.util.Scanner;

public class Repeti��oQuest�o5DOWHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia=new Scanner(System.in);
		
		int num, soma=0;
				
		do {
			System.out.printf("Digite o numero: \n");
			num= leia.nextInt();
			soma=soma+num;
			
		   } while(num !=0);  
	     
		System.out.println("O resultado da soma dos valores �: "+soma);
	 }
}

