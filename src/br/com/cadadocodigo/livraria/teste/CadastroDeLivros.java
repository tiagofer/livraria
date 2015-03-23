package br.com.cadadocodigo.livraria.teste;
import br.com.cadadocodigo.livraria.Autor;
import br.com.cadadocodigo.livraria.produtos.Ebook;
import br.com.cadadocodigo.livraria.produtos.Livro;
import br.com.cadadocodigo.livraria.produtos.LivroFisico;


public class CadastroDeLivros {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodigo.turini@caelum.com.br");
		autor.setCpf("123.456.789-10"); 
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos do Java");
		livro.setValor(59.90);
		livro.setIsbn("978-85-2563-35-6");
		//livro.setAutor(autor);
		
		livro.mostrarDetalhes();
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Paulo Silveira");
		outroAutor.setEmail("paulo.silveira@caelum.com.br");
		outroAutor.setCpf("123.456.789-10");
		
		
		Livro outroLivro = new Ebook(outroAutor);
		outroLivro.setNome("Lógica de Programação");
		outroLivro.setDescricao("Crie seus próprios programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-22-0");
		outroLivro.setAutor(outroAutor);
		
		outroLivro.mostrarDetalhes();
		
		
		
	}
	
}
