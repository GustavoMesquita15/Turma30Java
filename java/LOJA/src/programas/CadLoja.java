package programas;

import entidades.Produto;

public class CadLoja {

	public static void main(String[] args) {
		
		
		Produto prod1 = new Produto("001","Camisa");
		Produto prod2 = new Produto("002","Calça",100.50,10);
		
		prod2.retiraEstoque(5);
		prod1.incluirEstoque(10);
		
		System.out.println(prod1.getNome()+" qtde "+prod1.getEstoque());
		
	
	}

}
