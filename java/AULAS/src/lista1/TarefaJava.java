package lista1;

import java.util.Scanner;

public class TarefaJava {
	public static void main(String[] args) {
		
				Scanner leitor = new Scanner (System.in);
						
				System.out.println("Digite o valor de x1:");
				double x1 = leitor.nextDouble();
				System.out.println("Digite o valor de y1:");
				double y1 = leitor.nextDouble();
				System.out.println("Digite o valor de x2:");
				double x2 = leitor.nextDouble();
				System.out.println("Digite o valor de y2:");
				double y2 = leitor.nextDouble();
				
				double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
				
				System.out.printf("A distancia entre os dois pontos no plano é %.2f", d);

	}
}
