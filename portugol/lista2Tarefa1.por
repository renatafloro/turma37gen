programa
{
	
	funcao inicio()
	{
		inteiro p, excesso, m
		escreva ("Digite o peso da caixa de tomate em kg:")
		leia (p)
		se (p<0) {
			escreva ("O peso informado é inválido")
		}
		senao se (p<=50) {
			escreva ("Sua caixa tem o peso ideal") 
		}
		senao {
			excesso= p-50
			m= ((p-50)*4)
			escreva ("\n Peso:",p,"\n Excesso:",excesso,"\n Multa:",m)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */