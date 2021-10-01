package Lista1;
import java.util.Scanner;
import java.lang.Math;

public class atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		
		double d;
		double x2, x1, y2, y1;

		System.out.println ("digite o valor de x1: ");
		x1= leia.nextDouble();
		System.out.println ("digite o valor de x2: ");
		x2= leia.nextDouble();
		System.out.println ("digite o valor de y1: ");
		y1= leia.nextDouble();
		System.out.println ("digite o valor de y2: ");
		y2= leia.nextDouble();
        
		//processamentos
		d =Math.sqrt (Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2));
		
		System.out.printf("O valor de d é: %.2f ",d);
	}
	
	

}
