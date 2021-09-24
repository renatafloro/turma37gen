programa
{
	
	funcao inicio()
	{
		inteiro num

		escreva("Digite um número inteiro:  ")
		leia(num)

          se (num == 0){
			escreva("Seu número é neutro")
			}
			
		senao se (num < 0){
			escreva("Esse é um número negativo")
			}	
		
		senao se (num % 2 == 0){
			escreva("Seu número é par e positivo")
			}
			
          senao se (num % 2 == 1){
			escreva("Seu número é impar e positivo")
			}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */