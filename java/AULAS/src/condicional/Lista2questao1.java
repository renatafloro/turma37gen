package condicional;
import java.util.Scanner;

public class Lista2questao1 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		
	    int num1;
		int num2;
		int num3;
		
		int local;
		int numero3 = 0;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = leia.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		num2 = leia.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		num3 = leia.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.print("O maior n�mero � "+num1);		
		} else if (num2>num1 && num2>num3) {
			System.out.print("O maior n�mero � "+num2);
		}else {
			System.out.print("O maior n�mero � "+num3);
		}
	}

}
