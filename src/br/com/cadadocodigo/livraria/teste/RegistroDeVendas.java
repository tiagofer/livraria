package br.com.cadadocodigo.livraria.teste;
import br.com.cadadocodigo.livraria.Autor;
import br.com.cadadocodigo.livraria.produtos.Ebook;
import br.com.cadadocodigo.livraria.produtos.LivroFisico;
import br.com.cadadocodigo.livraria.produtos.Produto;


public class RegistroDeVendas {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-driven Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		//System.out.println("Total no carrinho: R$ " + carrinho.getTotal());
		carrinho.getProduto();
		System.out.println(carrinho.getTotal());
	}


	
}
