package Lista5;

public class Cachorro extends Animal {

	private String raca;
	private boolean fofinho;
	private final String alimentacao = "Onívoro";
	
	
	public Cachorro(String nome, String sexo, int idade, boolean domestico, String raca, boolean fofinho) {
		super(nome, sexo, idade, domestico);
		this.raca = raca;
		this.fofinho = fofinho;
	}

		}
