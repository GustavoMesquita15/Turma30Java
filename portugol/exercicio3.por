programa
{
	
	funcao inicio()
	{
		real numero = 0.0, contador = 0.0, soma = 0.0
		enquanto (numero >= 0){
			
			escreva("Digite um número positivo para ser somado ou um negativo para parar: ")
			leia (numero)
			se (numero >= 0){
				soma += numero
				contador++
			}
		}

		escreva("Soma total: " + soma)
		escreva("\nMédia: " + (soma / contador))
		escreva("\nTotal de valores lidos: " + contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */