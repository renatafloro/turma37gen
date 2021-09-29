programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro nota=0, total=0
		real media=0.00
		inteiro notas[4]

		escreva ("Digite o nome do aluno: ")
		leia(nome)

		para (inteiro x=0 x<=3; x++){
			escreva ("Digite sua nota: ")
			leia(nota[x])
			total= total +nota[x]
		}
		
		media= total/4.00
		escreva("Media notas: ",media)
		escreva("Total das notas: ",total)
		escreva ("Boletim")
		para (inteiro i=0; i<4; i++){
			escreva("Nota ",notas[i])
			se (nota[i]<=5){
				
			}
		}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 193; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */