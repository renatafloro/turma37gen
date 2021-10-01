package Lista1;

import java.util.Scanner;
import java.lang.Math;

public class atividade4 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		// TODO Auto-generated method stub
		double a,b,c, R, S, D;
		System.out.println ("O valor de a: ");
	    a=leia.nextDouble();
		System.out.println ("O valor de b: ");
		b=leia.nextDouble();
		System.out.println ("O valor de c: ");
		c=leia.nextDouble();
		
		R = Math.pow((a+b), 2);
		S = Math.pow((b+c), 2);
		D= R+S/2;
		System.out.println("O resultado é: "+D);
	}

}

