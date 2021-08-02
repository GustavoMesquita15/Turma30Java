import java.util.Scanner;

public class Lista1 {
	public static void main(String[] args) {
		
		int anos = 0, meses = 0, dias = 0;
		
		
		Scanner leitor = new Scanner (System.in);
		
	
		System.out.println("Me diga quantos dias de idade você tem: ");
		dias = leitor.nextInt();
	
		
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = dias % 30;
		
		
		System.out.println("Sua idade é " + anos + " anos, " + meses + " meses e " + dias + " dias.");

}
}


