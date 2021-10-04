package condicional;

import java.util.Scanner;

public class Lista2questao2 {
public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);	
	int a;
	int b;
	int c;
	
	System.out.print("Digite o primeiro número: ");
	a = leia.nextInt();
	System.out.print("Digite o segundo número: ");
	b = leia.nextInt();
	System.out.print("Digite o terceiro número: ");
	c = leia.nextInt();
	
	if(a<b) {
	   if(b<c) {
		   System.out.print(a+"-"+b+"-"+c);
	   }
	   else if(a<c) {
		   System.out.print(a+"-"+c+"-"+b);
	   } else {
		   System.out.print(c+"-"+a+"-"+b);
	   }
}
	else if (b<c) {
		if (a<c) {
	    System.out.print(b+"-"+a+"-"+c);	
		}else {
		System.out.print(b+"-"+c+"-"+a);
		}
		}else {
		System.out.print(c+"-"+b+"-"+a);
		}
}
}