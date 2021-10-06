package laçosDeRepetição;

import java.util.Scanner;

public class RepetiçãoQuestão6DOWHILE {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		int num;
		double media=0.00, soma=0.00, totalMultiplos=0.00;
		
       do {
    	   System.out.printf("Digite um número inteiro ou 0 para encerrar:  ");
    	   num= leia.nextInt();
           if(num %3==0 && num!=0)
        	   soma=soma+num;
               totalMultiplos++;
               
		}while(num!=0);

         media=soma/totalMultiplos;
		 System.out.printf("\n\n A media dos numeros é: %3.2f ",media);
		
		 

		}
}