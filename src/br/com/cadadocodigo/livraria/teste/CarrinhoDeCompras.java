package br.com.cadadocodigo.livraria.teste;
import br.com.cadadocodigo.livraria.produtos.Produto;


public class CarrinhoDeCompras {
	
	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;
	
	public void adiciona(Produto produto){
		System.out.println("Adicionando Livro " + produto);
//		livro.aplicaDesconto(0.05);
		
		this.produtos[contador] = produto;
		contador ++;
		total += produto.getValor();
	
	}

	public void getProduto(){		
		for (int i = 0;i<=produtos.length; i++){
			try{
				Produto produto = produtos[i];
				if (produto != null){
					System.out.println(produto.getValor());
				}
			} catch (ArrayIndexOutOfBoundsException | NullPointerException e){
				System.out.println("deu exception no indice: " + i);
				e.printStackTrace();
			}
		}
		System.out.println("Fui executado!");
	}
	
	public double getTotal() {
		return total;
	}	
	
	
	
}
