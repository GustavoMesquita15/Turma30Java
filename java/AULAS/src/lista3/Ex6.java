/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. 
E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
package lista3;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		int numero = 0, media = 0, contador = 0;
		
		do {
			System.out.println("Digite um n�mero, para parar e exibir o resultado digite \"0\"");
			numero = leitor.nextInt();
			if (numero % 3 == 0) {
				media += numero;
				contador++;
			}
		} while (numero != 0);
		
		media = media / contador;
		
		System.out.println("M�dia de todos os n�meros m�ltiplos de 3 digitados: " + media);
	}
}
