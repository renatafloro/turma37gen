programa
{
//1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
//apresente no final o total do somatório, a média e o total de valores lidos. O programa
//deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
//positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
//negativo.
	funcao inicio()
	{
	inteiro valorDigitado=0
	real media=0.00
	inteiro total=0
	real totalValoresDigitados=0.00

     enquanto(valorDigitado>=0){
	     escreva("Digite um número positivo ou negativo para parar: ")
		leia(valorDigitado) 
          
          se (valorDigitado>=0){
              totalValoresDigitados++
              total+=valorDigitado
          }
          
     }

     media= total/ totalValoresDigitados
	escreva("\nQuantidade de valores digitados: "+totalValoresDigitados)
	escreva("\nSomatório de valores digitados: "+total)
	escreva("\nMedia de valores digitados: "+media)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 713; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */