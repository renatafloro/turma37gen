package app;

import java.util.Scanner;

import entities.Pessoa;
import entities.Produto;

public class CadProduto {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
	        Pessoa cad1 = new Pessoa();
	        Produto prod1= new Produto();
	        int estoque=0;
	        		
	     System.out.println("Digite o nome: ");
	     cad1.nome= leia.next();
	     System.out.println("Digite 1-masculino, 2-feminina, 3-neutre :");
	     char op= leia.next().charAt(0);
	     
	     if (op=='1') {
	    	 cad1.pronome='o';  	 
	     }else if(op=='2') {
	    	 cad1.pronome='a';	 
	     }else {
	    	 cad1.pronome='e';
	     }
	     System.out.printf("Bom dia Sr%c. %s ",cad1.pronome,cad1.nome);
	     
	     System.out.println("Digite o nome do produto: ");
	     prod1.nomeProduto= leia.next();
	     System.out.println("Digite a quantidade do produto: ");
	     estoque= leia.nextInt();
	    
	        System.out.println(prod1.toString());

	        System.out.print("\nDigite a retirada: ");
	        estoque = leia.nextInt();

	        prod1.tirarEstoque(estoque);

	        System.out.println("\nNOVA QUANTIDADE DO ESTOQUE");
	        System.out.println(prod1.toString());

	        System.out.print("\nDigite a quantidade para colocar no estoque: ");
	        estoque = leia.nextInt();

	        prod1.addEstoque(estoque);

	        System.out.println("\nNOVA QUANTIDADE DO ESTOQUE");
	        System.out.println(prod1.toString());


	    }
	}