package condicional;

import java.util.Scanner;

public class Lista2questao3 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
			
		int idade;
		String nome;
		
		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 & idade<=14) {
			System.out.println("Olá "+nome+ ", você faz parte do grupo infantil.");
			
		} else if (idade>15 & idade<=17) {
			System.out.println("Olá "+nome+ ", você faz parte do grupo juvenil.");
			
		}else if (idade>18 & idade<=25) {
			System.out.println("Olá "+nome+ ", você faz parte do grupo adulto.");
			
		} else {
			System.out.println("Olá "+nome+ ", você não faz parte de nenhum grupo.");
		}
	}
}