package introducao;

import java.util.Scanner;

public class Copinha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String time1="Santos", time2="SPFC", time3="Palmeiras", time4="Corinthians";
		int ponto1=0, ponto2=0, ponto3=0, ponto4=0;
		char op; //G= ganhou-3, P= perdeu-0, E= empatou-1
		
		for (int x=1;x<=4;x++) {
			System.out.print(time1+" G-ganhou, P-perdeu ou E-emapatou : ");
			op = leia.next().toUpperCase().charAt(0);
			if (op == 'G') {
				ponto1 += 3;
			}
			else if (op == 'E') {
				ponto1 += 1;
			}
			else if(op == 'P') {
				ponto1 += 0;
			} else {
				System.out.println("Digitou errado, vai ficar com 0 !!!");
			}
			
		}
		for (int x=1;x<=4;x++) {
			System.out.print(time1+" G-ganhou, P-perdeu ou E-emapatou : ");
			op = leia.next().toUpperCase().charAt(0);
			if (op == 'G') {
				ponto2 += 3;
			}
			else if (op == 'E') {
				ponto2 += 1;
			}
			else if(op == 'P') {
				ponto2 += 0;
			} else {
				System.out.println("Digitou errado, vai ficar com 0 !!!");
			}
			
		}
		for (int x=1;x<=4;x++) {
			System.out.print(time1+" G-ganhou, P-perdeu ou E-emapatou : ");
			op = leia.next().toUpperCase().charAt(0);
			if (op == 'G') {
				ponto3 += 3;
			}
			else if (op == 'E') {
				ponto3 += 1;
			}
			else if(op == 'P') {
				ponto3 += 0;
			} else {
				System.out.println("Digitou errado, vai ficar com 0 !!!");
			}
			
		}
		for (int x=1;x<=4;x++) {
			System.out.print(time1+" G-ganhou, P-perdeu ou E-emapatou : ");
			op = leia.next().toUpperCase().charAt(0);
			if (op == 'G') {
				ponto4 += 3;
			}
			else if (op == 'E') {
				ponto4 += 1;
			}
			else if(op == 'P') {
				ponto4 += 0;
			} else {
				System.out.println("Digitou errado, vai ficar com 0 !!!");
			}
			
		}
		System.out.println();
		System.out.println("Tabela");
		System.out.printf("Time: %s pontos atuais : %d ponto(s)\n", time1, ponto1);
		System.out.printf("Time: %s pontos atuais : %d ponto(s)\n", time2, ponto2);
		System.out.printf("Time: %s pontos atuais : %d ponto(s)\n", time3, ponto3);
		System.out.printf("Time: %s pontos atuais : %d ponto(s)\n", time4, ponto4);

		
	}

}
