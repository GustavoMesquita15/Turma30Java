package introducao;

import java.util.Scanner;

public class TesteEnquanto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome="";
		int salario=0;
		int maiorSalario=0;
		String nomeMaiorSalario="";
		
		System.out.println("Digite o nome :");
		nome = leia.next();	
		System.out.println("Digite o salario :");
		salario = leia.nextInt();
		while(salario>0) {
			if(salario > maiorSalario) {
				maiorSalario = salario;
				nomeMaiorSalario = nome;
			}
			System.out.println("Digite o nome :");
			nome = leia.next();	
			System.out.println("Digite o salario :");
			salario = leia.nextInt();
			while(salario>0) {
				if(salario > maiorSalario) {
					maiorSalario = salario;
					nomeMaiorSalario = nome;
				}
			}
			System.out.println();
			System.out.printf("O maior salario é %d da pessoa %s", maiorSalario,nomeMaiorSalario);
		}
		
		
	}

}
