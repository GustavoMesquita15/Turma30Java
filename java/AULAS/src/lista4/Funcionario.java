package lista4;

public class Funcionario {

	String nome, funcao;
	int matricula, cargaDiaria;
	double salario;
	
	public Funcionario (String nome, String funcao, int matricula, int cargaDiaria) {
		this.nome = nome;
		this.funcao = funcao;
		this.matricula = matricula;
		this.cargaDiaria = cargaDiaria;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void darAumento(double aumento) {
		this.salario += aumento;
	}
	
	public void promover(String novaFuncao, double aumento) {
		this.funcao = novaFuncao;
		this.salario += aumento;
	}
	
	public double impostoSobreSalario() {
		return salario * 0.9;
	}
	
}
