programa
{//PARA
//Desenvolver um sistema que efetue a soma de todos os números ímpares que 
//são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
	
	funcao inicio()
	{
		inteiro soma=0, contador=0

		para (contador=1;contador<=500;contador++){
			
			se (contador%2==1 e contador%3==0){
			 
			 soma+=contador
				
			} 
		}
	escreva("Seu resultado é: ",soma)
	

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */