/*2- Faça um programa que entre com 
 * três números e coloque em ordem crescente.*/
package Lista2;

import java.util.Scanner;

public class Ex2 {

public static void main (String[] Args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int n1, n2, n3;
		System.out.println("Digite o primeiro valor:");
		n1 = leitor.nextInt();

		System.out.println("Digite o primeiro valor:");
		n2 = leitor.nextInt();

		System.out.println("Digite o primeiro valor:");
		n3 = leitor.nextInt();

		if (n1 > n2)
        {
            n2 = n1 - n2;
            n1 = n1 - n2;
            n2 = n1 + n2;
        }
        if (n1 > n3)
        {
            n3 = n1 - n3;
            n1 = n1 - n3;
            n3 = n1 + n3;
        }
        if (n2 > n3)
        {
            n3 = n2 - n3;
            n2 = n2 - n3;
            n3 = n2 + n3;
        }
        System.out.println("Os número digitados em ordem crescente são " + n1 + ", " + n2 + ", " + n3);
	}
}

