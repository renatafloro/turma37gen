programa
{
	
	funcao inicio()
	{
	const real VALORHORANORMAL=10.00
	const real VALORHORAEXTRA=20.00
	const inteiro HORANORMAL=50
	
	cadeia C
	inteiro N=0
	inteiro E= 0
	real salario=0.00
	real salarioTotal= 0.00
	real salarioExcedente= 0.00

	escreva ("Digite a matrícula do funcionário: ")
	leia(C)

	escreva("Digite o total de horas que você trabalhou: ")
	leia(N)

	se (N>HORANORMAL){
		E= N- HORANORMAL
		salario= HORANORMAL* VALORHORANORMAL
		salarioExcedente= E* VALORHORAEXTRA
		salarioTotal= salario+ salarioExcedente

	}
	senao{
		salario= N* VALORHORANORMAL
		salarioTotal=salario
	
	}
	escreva ("\nSalário: R$",salario)
	escreva ("\nNúmero de horas extras: ", E)
	escreva ("\nSalário Excedente: R$",salarioExcedente)
	escreva ("\nSalário total: R$",salarioTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 530; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */