programa
{
	
	funcao inicio()
	{
		cadeia times[3]
          inteiro pontos[3]
          cadeia time
          
		 times[2]= "NAUTICO"
		 times[1]= "SPORT"
		 times[0]= "SANTA CRUZ"

		 pontos [0]=0
		 

          para (inteiro y=0; y<3; y++){
          	escreva (times[y]+"\n Digite os pontos: \n ")
          	leia(pontos[y])
          }
		escreva ("TABELA PE \n")
		para (inteiro y=0; y<3; y++){
			escreva(times[y]+" - "+pontos[y]+"\n")
		}
		escreva("Escreva o nome do time que você quer ver os pontos: ")
		leia(time)
		para (inteiro y=0; y<3; y++){
			se (time== times[y]){
				escreva("O time escolhido foi "+times[y]+" pontos atuais "+pontos[y]+"\n")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 633; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */