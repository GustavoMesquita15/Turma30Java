/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.*/
package lista4;

public class Ex3 {

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
