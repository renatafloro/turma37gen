programa
{
	
	funcao inicio()
	{
		real indice=0.00

	escreva("Digite o índice de poluição atual: ")
	leia(indice)

	se(indice<=0.29){
		escreva("O índice é aceitável")
	}
	senao se(indice<=0.4){
		escreva("GRUPO 1- PAREM AS SUAS ATIVIDADES")
	}
     senao se(indice<0.5){
     	escreva("GRUPO 1 E GRUPO 2- PAREM AS SUAS ATIVIDADES")
     }
     senao {
	     escreva("GRUPO 1, GRUPO 2 E GRUPO 3- PAREM AS SUAS ATIVIDADES")
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */