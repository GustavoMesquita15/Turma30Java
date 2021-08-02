programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anoNascimento
		inteiro idade
		const inteiro ANOATUAL = 2021	
		caracter vocativo

		escreva("Digit o nome :")
		leia(nome)
		escreva("Digite como prefere ser identicade: O/A/E :")
		leia(vocativo)
		escreva("Digite o ano de nascimento :")
		leia(anoNascimento)
		idade = ANOATUAL - anoNascimento
		// SE ACIMA OU IGUAL A 45 CRINGE
		// SE FOR ABAXO DE 16 ADOLESCENTE

		
		se (idade >= 45){
			se(vocativo == 'O' ou vocativo == 'o'){
			escreva("\nOi, ",nome," sua idade é ",idade, " e vc é cringe")
		}
		}
		senao se (idade<=16){
			escreva("\nOi, ",nome," sua idade é ",idade, " e vc não é infanto-juvenil")
			}
		senao se(idade <18){
			escreva("\nOi, ",nome," sua idade é ",idade, " e vc é adoslencente")
			}
		senao{
			escreva("\nOi, ",nome," sua idade é ",idade, " e vc não é cringe")
			}
		


				
			
		
		
		
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 595; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */