/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
package lista4;

public class Ex2 {

	boolean ligado, tremDePousoAtivo = true, voando;
	int turbinas, velocidade;
	String modelo;
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo () {
		return modelo;
	}
	
	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("Ligando avi�o...");
		}
	}
	
	public void desligar() {
		if (ligado && !voando && velocidade == 0) {
			ligado = false;
			System.out.println("Desligando avi�o...");
		}
	}
	
	public void abrirTremDePouso() {
		
		if (!tremDePousoAtivo) {
			tremDePousoAtivo = true;
			System.out.println("Abrindo trem de pouso...");
		}
	}
	
	public void fecharTremDePouso() {
		
		if (tremDePousoAtivo) {
			tremDePousoAtivo = false;
			System.out.println("Fechando trem de pouso...");
		}
	}
	
	public void acelerar (int velocidade) {
		if (this.velocidade < velocidade) {
			this.velocidade = velocidade;
			System.out.println("Acelerando at� velocidade: " + velocidade);
		}
	}
	
	public void desacelerar (int velocidade) {
		if (this.velocidade > velocidade) {
			this.velocidade = velocidade;
			System.out.println("Desacelerando at� velocidade: " + velocidade);
		}
	}
	
	public void voar () {
		
		if (ligado) {
			
			if (velocidade < 100) {
				acelerar(100);
			}
			System.out.println("Decolando...");
			voando = true;
			fecharTremDePouso();
		}
	}
	
	public void pousar () {
		if (velocidade > 100) {
			desacelerar(100);
		}
		if (!tremDePousoAtivo) {
			abrirTremDePouso();
		}
		System.out.println("Pousando avi�o...");
		voando = false;
		
	}
}
