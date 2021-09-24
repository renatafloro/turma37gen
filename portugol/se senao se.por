programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anoNascimento, idade, mes

		   escreva("Digite o nome da pessoa:  ")
		   leia(nome)
		   escreva("Digite o seu ano de nascimento:  ")
		   leia(anoNascimento)

		   idade= (2021-anoNascimento)

		   escreva("Oi " ,nome, " sua idade aprox é ",(2021-anoNascimento),"\n")

		   se (idade>=28){
		   	escreva ("Você é Cringe!\n")
		   }
		   
		   senao se (idade>=15){
		   	escreva("Você é Jovem!")

		   	
		   	}
		   	 senao se (idade>=2){
		   	escreva("Você é Criança!")

		   	
		   	}
		   	senao se (idade<0){
		   	escreva("Você informou um ano de nascimento incorreto, por favor, verifique a resposta")

		   	
		   	}
		   senao {
		   	escreva("Você é bebê!")
		   	}

		   		}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 670; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */