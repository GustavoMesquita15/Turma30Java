  /*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
package Lista2;

import java.util.Scanner;

public class Ex4 {

public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);

		
		double numero = 0, calculo = 0;
		
		System.out.println("Digite um n�mero, \nse for par farei a raiz quadrada, \nse for impar elevarei ao quadrado");
		numero = leitor.nextDouble();
		
		
		
		if (numero % 2 == 0) {
			calculo = Math.sqrt(numero);
			System.out.printf("N�mero %.2f � par, sua raiz quadrada � %.2f\n", numero, calculo);
		}else {
			calculo = Math.pow(numero, 2);
			System.out.printf("N�mero %.2f � par, elevado a 2 � %.2f\n", numero, calculo);
		}
		
	}
}
	
