package laçosDeRepetição;

import java.util.Locale;
import java.util.Scanner;

public class Subprograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Locale.setDefault(Locale.US);
    Scanner leia=new Scanner(System.in);
    
    System.out.println("Digite o tamanho da linha: ");
    int tamanho= leia.nextInt();
    
    for(int x=1; x<=tamanho; x++) {
    	if(x)
    	System.out.printIn(" ");
    	System.out.printIn(" ");
    	System.out.printIn(" ");
    }
	}
}
