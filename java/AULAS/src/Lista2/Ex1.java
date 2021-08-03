/*1- Faça um programa que 
 * receba três inteiros e diga qual deles é o maior.*/
package Lista2;

import java.util.Scanner;

public class Ex1 {

public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int numero1, numero2, numero3, maior = 0;
		
		
		System.out.println("Digite o primeiro valor:");
		numero1 = leitor.nextInt();
		if (numero1 > maior) {
			maior = numero1;
		}
		System.out.println("Digite o primeiro valor:");
		numero2 = leitor.nextInt();
		if (numero2 > maior) {
			maior = numero2;
		}
		System.out.println("Digite o primeiro valor:");
		numero3 = leitor.nextInt();
		if (numero3 > maior) {
			maior = numero3;
		}
		
		System.out.println("Dos número digitados o maior é " + maior);
	}
}

