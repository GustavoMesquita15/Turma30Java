programa
{
	
	funcao inicio()
	{
		inteiro total=0
		inteiro numero=0
		real media=0
		inteiro maior=0
		
		para(inteiro x=1; x<=5; x++){
			escreva("Digite um numero: ")
			leia(numero)
			total = total + numero		
			se(numero > maior){
				maior = numero
				}
			
			}
			media = total / 5
		escreva("\n O total é ",total)
		escreva("\n a media é ",media)
		escreva("\n Maior valor digitado ",maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */