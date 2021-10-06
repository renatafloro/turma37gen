package laçosDeRepetição;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
	
	Scanner leia= new Scanner(System.in);
	
	String nome[]=new String[4];
	int nota[]= {0,0,0,0};
    String disciplina[]= {"MATEMATICA","PORTUGUES","CIENCIAS","ARTES"};
	
	for (int x=0; x<4; x++) {
		System.out.println(nome[x]+" "+disciplina[x]);
	}
	}

}
