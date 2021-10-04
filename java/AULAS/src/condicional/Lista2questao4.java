package condicional;
import java.util.Scanner;

public class Lista2questao4 {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    int numero;
    double raiz;
    double potencia;
    
    System.out.print("Digite seu número: ");
    numero = leia.nextInt();
    
    if (numero<0) {
        System.out.print("Seu número não é válido"); }
    else if (numero == 0) {
    System.out.print("Seu número é nulo");
    }
    else if (numero % 2 == 0) {
    raiz= Math.sqrt(numero);
    System.out.print("Seu número é par e sua raiz quadrada é: "+raiz);
    }else {
    	potencia= Math.pow(numero, numero);
    System.out.print("Seu número é impar e sua potência é: "+potencia);
   }
     
     
}
}