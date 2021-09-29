programa
{
	inclua biblioteca Util
//MATRIZ
//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de 
//mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos 
//elementos de mesma posição das matrizes N1 e N2.

	
	funcao inicio()
	{
		inteiro N1 [4][6]
		inteiro N2 [4][6]
		inteiro M1 [4][6]
		inteiro M2 [4][6]
		inteiro soma

	para (inteiro l=0; l<4; l++){
		para (inteiro c=0; c<6; c++){
		     N1[l][c]= Util.sorteia(4,5)
		     N2[l][c]= Util.sorteia(1,4)
		     M1[l][c]=N1[l][c]+N2[l][c]
		     M2[l][c]=N1[l][c]-N2[l][c]
	      } 
	}
	escreva("\n")
	escreva("N1\n")
	para (inteiro l=0; l<4; l++){
		para (inteiro c=0; c<6; c++){
		     escreva(N1[l][c]+" ")  
	      }
	      escreva("\n")      
	}
	escreva("\n")
	escreva("M1\n")
	para (inteiro l=0; l<4; l++){
		para (inteiro c=0; c<6; c++){
		     escreva(M1[l][c]+" ")  
	      } 
	      escreva("\n")
	}
	escreva("\n")
	escreva("N2\n")
	para (inteiro l=0; l<4; l++){
		para (inteiro c=0; c<6; c++){
		     escreva(N2[l][c]+" ")  
	      }       
	      escreva("\n")
	}
	escreva("\n")
	escreva("M2\n")
	para (inteiro l=0; l<4; l++){
		para (inteiro c=0; c<6; c++){
		     escreva(M2[l][c]+" ")  
	      } 
	      escreva("\n")
	      
	}
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */