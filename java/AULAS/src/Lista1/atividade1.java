package Lista1;
import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in); 
		// TODO Auto-generated method stub
		int anos, totalDias;
		System.out.println("Quantos anos você tem: ");
		anos = leia.nextInt();
		totalDias = anos*365;
		System.out.println("Sua idade em dias é "+totalDias+" dias");
	

	}

}