package app;

import java.util.Scanner;

import entities.Aviao;


public class CadAviao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        Aviao av1= new Aviao();
        
        System.out.println("Digite a empresa a�rea: ");
	    av1.empresa= leia.next();
	    System.out.println("Digite quantos funcion�rios ter� no avi�o: ");
	    av1.funcionarios= leia.nextInt();
	    System.out.println("Digite quantos passageiros ir�o no voo:  ");
	    av1.passageiros= leia.nextInt();
	    
	    System.out.println(
	    		"Seu voo ser� pela empresa "+av1.empresa
	    		+" e ter� "+av1.funcionarios
	    		+" funcion�rios e "+av1.passageiros
	    		+" passageiros, totalizando "+av1.totalVoo()
	    		+" tripulantes e sobrando "+av1.assentosVazios()
	    		+" assentos vazios. Boa viagem!"
	    		);

	}

}
