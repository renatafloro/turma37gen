package laçosDeRepetição;
import java.util.Scanner;
public class RepetiçãoQuestão3WHILE {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		    int menos21=0, mais50=0, idade=0;
		    Scanner leia=new Scanner(System.in);
		    
		    while(idade!=-99) {
		    	
		    	System.out.println("Qual sua idade?");
		    	idade= leia.nextInt();
		    	
		    	if (idade<21 && idade> 0) {
		    		menos21++;
		    	}
		    	
		    	if (idade>50) {
		    		mais50++;
		    	}
		    }
		    System.out.println("O total de pessoas com menos de 21 anos é de "+menos21+" e de mais de 50 anos é de "+mais50);
		    
	}
}

