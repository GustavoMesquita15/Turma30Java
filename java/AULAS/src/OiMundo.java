import java.util.Scanner;

public class OiMundo {


public static void main(String[] args) {


	
	Scanner leitor = new Scanner (System.in);
	
	
	System.out.println("Digite a primeira nota");
	double nota1 = leitor.nextDouble();
	System.out.println("Digite a segunda nota");
	double nota2 = leitor.nextDouble();
	System.out.println("Digite a terceira nota");
	double nota3 = leitor.nextDouble();
	
	double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
	
	System.out.println("A media das notas é " + media +"\nPeso das notas:\nPrimeira nota: peso 2\nSegunda nota: peso 3\nTerceira nota: peso 5");
	
	}
}
 