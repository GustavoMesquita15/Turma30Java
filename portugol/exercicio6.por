programa
{
	
	funcao inicio()
	{
		inteiro numero = 0, soma = 0, contador = 0
		escreva("Digite um número: ")
		leia (numero)

		faca {
			contador++
			soma += contador
			escreva (contador)
			se(contador < numero){
				escreva (" + ")
			}
			senao{
				escreva (" = ")
			}
		} enquanto (contador < numero)

		escreva(soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 118; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */