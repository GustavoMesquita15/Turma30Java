programa {

	funcao inicio(){

	real porcDist=28, impo = 45, custoFa, custoCons,info,retorna,custoComimpost, 
	custoComdistri

     escreva("Qual o custo do carro da fabrica")
     leia (custoFa)
     custoComimpost=custoFa*(impo/100) 
     custoComdistri= custoFa* (porcDist/100)
     custoCons = custoComimpost + custoComdistri + custoFa
     escreva("Qual o valor final?",custoCons)
		 
	
	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */