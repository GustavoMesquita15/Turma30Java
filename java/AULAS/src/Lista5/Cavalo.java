package Lista5;

public class Cavalo extends Animal {
	public String raca;
	public final String alimentacao = "Herbívoro";
	
	public Cavalo(String nome, String sexo, int idade, boolean domestico, String raca) {
		super(nome, sexo, idade, domestico);
		this.raca = raca;
	}
}