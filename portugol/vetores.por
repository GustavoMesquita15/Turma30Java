programa
{
	
	funcao inicio()
	{


		cadeia times [4]
		inteiro pontos[] = {10,20,15,7}

		times[3] = "Santos"
		times[0] = "PALMEIRAS"
		times[1] = "SPFC"
		times[2] = "CORINTHIANS"

		escreva("NOME DOS TIMES \n")
		para(inteiro indice=0; indice<4; indice++){
			escreva(times[indice]+"\n")
			}

			escreva("PONTOS DOS TIMES \n")
			para(inteiro indice =0; indice<4; indice++){
				escreva(pontos[indice]+"\n")
				}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */