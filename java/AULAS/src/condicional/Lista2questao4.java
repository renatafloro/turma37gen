package condicional;
import java.util.Scanner;

public class Lista2questao4 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    int numero;
    double raiz;
    double potencia;
    
    System.out.print("Digite seu n�mero: ");
    numero = leia.nextInt();
    
    if (numero<0) {
        System.out.print("Seu n�mero n�o � v�lido"); }
    else if (numero == 0) {
    System.out.print("Seu n�mero � nulo");
    }
    else if (numero % 2 == 0) {
    raiz= Math.sqrt(numero);
    System.out.print("Seu n�mero � par e sua raiz quadrada �: "+raiz);
    }else {
    	potencia= Math.pow(numero, numero);
    System.out.print("Seu n�mero � impar e sua pot�ncia �: "+potencia);
   }
     
     
}
}