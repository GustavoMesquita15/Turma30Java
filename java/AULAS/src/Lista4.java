import java.util.Scanner;

public class Lista4 {
	public static void main(String[] args) {
		
		double custoTotal, custoFabrica;
		
		
		Scanner leitor = new Scanner (System.in);
				
		
		System.out.println("Digite o custo de fábrica do carro");
		custoFabrica = leitor.nextDouble();
		
		
		custoTotal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
		System.out.printf("Adicionando 28%% de porcentem do distribuidor e 45%% porcento de impostos o custo total ao consumidor será: R$ %.2f ", custoTotal);;
		}

}
