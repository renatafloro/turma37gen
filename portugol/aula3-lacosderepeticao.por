programa
{
	
	funcao inicio()
	{
		//SPORT, SANTA CRUZ, NAUTICO
		cadeia time1="Sport     "
		cadeia time2="Santa cruz"
		cadeia time3="Nautico   "
          caracter op
		inteiro pontos1=0,pontos2=0,pontos3=0

          para (inteiro y=1; y<=3; y++){
          escreva("RODADA "+y+"\n")
          linha()
          escreva(time1+ "Digite g-ganhou, e-empatou, p-perdeu: ")
		leia (op)
			se(op=='g'){
				pontos1 +=3
			}
			senao se (op=='e'){
				pontos1 +=1
			}
			senao {
				pontos1 +=0
			}
	
			escreva(time2+ "Digite g-ganhou, e-empatou, p-perdeu: ")
			leia (op)
			se(op=='g'){
				pontos2 +=3
			}
			senao se (op=='e'){
				pontos2 +=1
			}
			senao {
				pontos2 +=0
			}
	
			escreva(time3+ "Digite g-ganhou, e-empatou, p-perdeu: ")
			leia (op)
			se(op=='g'){
				pontos3 +=3
			}
			senao se (op=='e'){
				pontos3 +=1
			}
			senao {
				pontos3 +=0
				//pontos3= pontos3 + 0
			}
			
			
	          }
          escreva("Tabela\n")
		escreva(time1+"\t\t"+pontos1+"\n")
		escreva(time2+"\t\t"+pontos2+"\n")
		escreva(time3+"\t\t"+pontos3+"\n")	
		
	}
	
	funcao linha(){
		escreva ("----------------------------\n")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 913; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */