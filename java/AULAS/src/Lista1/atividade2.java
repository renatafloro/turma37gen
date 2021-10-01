package Lista1;
import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);		
		int  dias, totalMeses, totalAnos;
		System.out.println("dias: ");
		dias = leia.nextInt();
		totalMeses = dias/30;
		totalAnos = dias/360;
		System.out.println ("Sua idade em meses é: "+totalMeses+"\nSua idade em anos é: "+totalAnos+"\n"+ "Sua idade em dias é: "+dias);

	}

}
