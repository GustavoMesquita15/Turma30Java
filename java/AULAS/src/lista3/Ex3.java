/*3- Solicitar a idade de v�rias pessoas e 
 * imprimir: Total de pessoas com menos de
 * 21 anos. Total de pessoas com mais de 50 anos. 
 * *O programa termina quando
 * idade for =-99. (WHILE)*/
package lista3;

import java.util.Scanner;

public class Ex3 {

public static void main (String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int idade = 0, jovens = 0, idosos = 0, adultos = 0;
		
		while (idade != -99) {
			System.out.println("Digite a idade: ");
			idade = leitor.nextInt();
			if (idade < 21 && idade >= 0) {
				jovens++; 
			} else if (idade > 50) {
				idosos++;
			} else if (idade < 0 && idade != -99) {
				System.out.println("Valor inv�lido");
			} else if (idade >= 21 && idade <= 50){
				adultos++;
			}
		}
		System.out.println("Quantidade de pessoas menores que 21 anos: " + 
		jovens + "\nQuantidade de pessoas entre 21 e 50 anos : " + 
				adultos + "\nQuantidade de pessoas maiores de 50 anos: "+ idosos);
	}

}
