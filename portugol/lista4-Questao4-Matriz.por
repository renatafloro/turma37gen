programa
{
//MATRIZ
//Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
//ou seja, diagonal principal.

	funcao inicio()
	{
		inteiro matriz[3][3]
		inteiro somaTotal=0, somaDiagonal=0

		para (inteiro l=0; l<3; l++){
			para (inteiro c=0; c<3; c++){
				escreva("Digite o valor: ")
				leia(matriz[l][c]) 
			}
		}
          para(inteiro l=0; l<3; l++){
          	para(inteiro c=0; c<3; c++){
          		somaTotal= somaTotal+matriz[l][c]
          	}
          }
          para(inteiro x=0; x<3; x++){
          	somaDiagonal= somaDiagonal+ matriz[x][x]
          }

		escreva("\n A soma total da matriz foi: "+somaTotal)
		escreva("\n A soma da diagonal principal é: "+somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 10, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */