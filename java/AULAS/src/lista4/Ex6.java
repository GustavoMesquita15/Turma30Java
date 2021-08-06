  
/*6) Crie uma classe conta bancaria e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informa��es deste objeto no
console.*/
package lista4;

public class Ex6 {

	private double saldo = 0;
	public String tipo;
	public int numeroConta;
	public boolean ativo;
	
	public void ContaBancaria(String tipo, int numeroConta, boolean ativo) {
		this.tipo = tipo;
		this.ativo = ativo;
		this.numeroConta = numeroConta;
	}
	
	public void credito(double valor) {
		if (ativo && valor > 0) {
			saldo += valor;
		}
	}
	
	public void debito(double valor) {
		if (ativo && valor > 0 && valor <= saldo) {
			saldo -= valor;
		}
	}
	
	public double mostrarSaldo() {
		return saldo;
	}
}
