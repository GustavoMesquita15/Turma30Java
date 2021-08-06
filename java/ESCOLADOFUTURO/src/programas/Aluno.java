package programas;

public class Aluno {

	//atributos
	public String nome;
	public String matricula;
	public boolean ativo;
	public int nota;
	public int anoNascimento;
	
	//metodos
	public void mostraIdade() {
		System.out.println("a idade é "+(2021-anoNascimento));
	}
	public void mostraIdade(int anoAtual) {
		System.out.println("a idade é "+(anoAtual-anoNascimento));
	}
}
