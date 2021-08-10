package entities;

public class Gato extends Pet {
 private boolean miaAlto;

public Gato(String raca, boolean miaAlto) {
	super(raca);
	this.miaAlto = miaAlto;
}

public Gato(String raca, int anoNascimento, boolean miaAlto) {
	super(raca, anoNascimento);
	this.miaAlto = miaAlto;
}

public boolean isMiaAlto() {
	return miaAlto;
}

public void setMiaAlto(boolean miaAlto) {
	this.miaAlto = miaAlto;
}
 
}
