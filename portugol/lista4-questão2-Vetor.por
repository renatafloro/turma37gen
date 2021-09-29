programa
{
	inclua biblioteca Util
//VETOR
//Um dado é lançado 10 vezes e o valor correspondente é anotado. 
//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
//A seguir determine e imprima a média aritmética dos lançamentos, 
//contabilize e apresente também quantas foram as ocorrências da maior pontuação.

	
	funcao inicio()
	{
		inteiro lancamentos[10]
		real media=0.00
	     inteiro maiorValor=0
	     inteiro soma=0
	     inteiro quantasVezesMaiorValor=0
	     
	     para (inteiro x=0; x<10; x++){
          	lancamentos[x]=Util.sorteia(1,6)
          	escreva ("Lançamento "+(x+1)+"= ",lancamentos[x]+"\n")
          	soma= soma+lancamentos[x]
          	se(lancamentos[x]>=maiorValor){
		         se(lancamentos[x]==maiorValor){
		             quantasVezesMaiorValor++	
		         }
		     senao se(lancamentos[x]>maiorValor){
		     	quantasVezesMaiorValor= 1
		     }
		         maiorValor=lancamentos[x]
	}
	}         
	     media= soma/10.00
	     escreva("\nSoma dos valores: "+soma)
		escreva("\nMedia: "+media)
		escreva("\nMaior Valor: "+maiorValor)
	     escreva("\nO maior valor aparece: "+quantasVezesMaiorValor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 622; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */