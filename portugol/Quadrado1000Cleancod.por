programa
{
	inclua biblioteca Matematica -->Mat
	
	funcao inicio()
	{
		real valor1, valor2, valor3, valor4
		

		escreva("Digite o valor 1 :")
		leia(valor1)
		escreva("Digite o valor 2 :")
		leia(valor2)
		escreva("Digite o valor 3 :")
		leia(valor3)
		escreva("Digite o valor 4 :")
		leia(valor4)

		

		se( (Mat.potencia(valor3,2)) >= 1000){
			escreva("\nValor do 3 foi ",valor3,"e seu quadrado é ",(Mat.potencia(valor3,2)))
			}senao{
				escreva("\nValor do 1 foi ",valor1,"e seu quadrado é ",(Mat.potencia(valor1,2)))
				escreva("\nValor do 2 foi ",valor3,"e seu quadrado é ",(Mat.potencia(valor2,2)))
				escreva("\nValor do 3 foi ",valor3,"e seu quadrado é ",(Mat.potencia(valor3,2)))
				escreva("\nValor do 4 foi ",valor4,"e seu quadrado é ",(Mat.potencia(valor4,2)))
				}
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 778; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */