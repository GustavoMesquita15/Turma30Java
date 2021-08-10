package entities;

public class Cachorro extends Pet{

	private boolean lateAlto;

	public Cachorro(String raca, boolean lateAlto) {
		super(raca);
		this.lateAlto = lateAlto;
	}

	public Cachorro(String raca, int anoNascimento, boolean lateAlto) {
		super(raca, anoNascimento);
		this.lateAlto = lateAlto;
	}

	public boolean isLateAlto() {
		return lateAlto;
	}

	public void setLateAlto(boolean lateAlto) {
		this.lateAlto = lateAlto;
	}
	
}
