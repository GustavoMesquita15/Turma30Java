package entities;

public class Ave extends Pet{

	private boolean voaAllto;

	public Ave(String raca, boolean voaAllto) {
		super(raca);
		this.voaAllto = voaAllto;
	}

	public Ave(String raca, int anoNascimento, boolean voaAllto) {
		super(raca, anoNascimento);
		this.voaAllto = voaAllto;
	}

	public boolean isVoaAllto() {
		return voaAllto;
	}

	public void setVoaAllto(boolean voaAllto) {
		this.voaAllto = voaAllto;
	}
	
}
