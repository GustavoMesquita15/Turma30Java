package Lista5;

public class Preguica extends Animal {

	private final boolean LENTO = true;
	private final boolean FOFINHO = true;
	public final String alimentacao = "Herb�voro";
	
	public Preguica(String nome, String sexo, int idade, boolean domestico) {
		super(nome, sexo, idade, domestico);
		
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Pregui�a faz barulho?");
	}
	
	public void subirEmArvore() {
		if (this.isLento()) {
			System.out.println("Iniciando processo de subir na arvore, conclus�o em 5 anos");
		}
	}

	public boolean isLento() {
		return LENTO;
	}

	public boolean isFofinho() {
		return FOFINHO;
	}

}