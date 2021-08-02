programa
{
	
	funcao inicio()
	{
		cadeia C
		inteiro N=0
		inteiro E=0
		real salarioTotal=0.00
		real salarioExcedente=0.00
		
		escreva("Digite o codigo do funcionario :")
		leia(C)
		escreva("Digite o numero de horas trabalhadas :")
		leia(N)

		se(N<=50){
			salarioTotal=N*10.00
			}
			senao{
				E = N-50
				salarioExcedente = E * 20.00
				salarioTotal = salarioExcedente + 500.00
				}

			escreva("\nSalario total : R$",salarioTotal)
			escreva("\nSalario excedente :R$ ",salarioExcedente)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */