/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
package lista4;

public class Ex1 {

	public String nome, email;
	private String senha;
	public String cpf;
	
	public void Cliente (String nome, String email, String senha, String cpf) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
	}
	
	public void mudarSenha(String novaSenha) {
		senha = novaSenha;
	}
	
	public String informacoes() {
		return "Nome: " + nome + "\nEmail: " + email + "\nCPF: " + cpf;
	}
}
