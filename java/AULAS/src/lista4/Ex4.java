/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/
package lista4;

public class Ex4 {

	String nome, funcao;
	int matricula, cargaDiaria;
	double salario;
	
	public void Funcionario (String nome, String funcao, int matricula, int cargaDiaria) {
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
