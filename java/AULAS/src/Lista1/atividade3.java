package Lista1;
import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		
		double segundos, totalHoras, totalMinutos;
		System.out.println("segundos: ");
		segundos= leia.nextDouble();
		totalHoras = segundos/3600; 
		totalMinutos = segundos/60;
		System.out.printf("O tempo em segundos é: %.0f \nO tempo em horas é: %.1f \n1O tempo em Minutos é: %.1f",segundos,totalHoras,totalMinutos);

	}
	 

}
