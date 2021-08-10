package Lista5;

public class Cavalo extends Animal {
	public String raca;
	public final String alimentacao = "Herb�voro";
	
	public void correr() {
		System.out.println("P�coto, p�coto, p�coto... ");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("iiirrrr�");
	}

	public Cavalo(String nome, String sexo, int idade, boolean domestico, String raca) {
		super(nome, sexo, idade, domestico);
		this.raca = raca;
	}
	
	
	
}