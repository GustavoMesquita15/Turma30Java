package lista4;

public class ProdutoEletronico {

	public String fabricante, tipo, fonteDeAlimentacao;
	public boolean movel, ligado;
	public Double usoDeEnergiaPorhora;
	
	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("ligando...");
		}
	}
	
	public void desligar() {
		if (ligado) {
			ligado = false;
			System.out.println("desligando...");
		}
	}
}
