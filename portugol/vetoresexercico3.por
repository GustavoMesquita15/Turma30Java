programa
{
	inclua biblioteca Util
	funcao inicio()
	{

		inteiro matriz1[4][6]
		inteiro matriz2[4][6]
		inteiro matrizSoma [4][6]
		inteiro matrizDiferenca[4][6]

		para (inteiro i = 0; i < 4; i++){
			para (inteiro y = 0; y < 6; y++){
				matriz1[i][y] = Util.sorteia(0, 10)
				matriz2[i][y] = Util.sorteia(0, 10)
				
				escreva("\nValor da linha " + (i + 1) + " coluna " + (y + 1) + " da matriz 1: " + matriz1[i][y])
				escreva("\nValor da linha " + (i + 1) + " coluna " + (y + 1) + " da matriz 2: " + matriz2[i][y])
						
				matrizSoma[i][y] = matriz1[i][y] + matriz2[i][y]
				
				se (matriz1[i][y] > matriz2[i][y]){
					matrizDiferenca[i][y] = matriz1[i][y] - matriz2[i][y]
				}
				senao{
					matrizDiferenca[i][y] =  matriz2[i][y] - matriz1[i][y]
				}
			}
			escreva ("\n")
		}
		
		para (inteiro i = 0; i < 4; i++){
			para (inteiro y = 0; y < 6; y++){
				escreva ("\nSoma do valor da linha " + (i + 1) + " coluna " + (y + 1) + ": " + matrizSoma[i][y])		
			}
			escreva ("\n")
		}
		
		para (inteiro i = 0; i < 4; i++){
			para (inteiro y = 0; y < 6; y++){
				escreva ("\nDiferença do valor da linha " + (i + 1) + " coluna " + (y + 1) + ": " + matrizDiferenca[i][y])
			}
			escreva ("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1223; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */