import java.util.Scanner;

public class Lista2 {
	public static void main(String[] args) {
		
		
		int segundos = 0, horas = 0, minutos = 0;
				
		
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("Digite o tempo do evento em segundos: ");
		segundos = leitor.nextInt();
		
		horas = segundos / 60 / 60;
		minutos = (segundos / 60) % 60;
		segundos = (segundos % 60) % 60;
		
		System.out.println("O evento irá durar " + horas + " horas, " + minutos + " minutos e " + segundos + " segundo");
}

}
