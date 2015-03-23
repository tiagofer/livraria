package br.com.cadadocodigo.livraria.produtos;
import br.com.cadadocodigo.livraria.Autor;


public abstract class Livro implements Produto{
	
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	Autor autor;
	
	public Livro(Autor autor){
		//construtor
		this();
		this.autor = autor;
		System.out.println("Novo livro criado");
	}
	
	public Livro(){
		this.isbn = "000-00-00000-00-0";
	}
	
	
	public void mostrarDetalhes(){
		
		String mensagem = "Monstrando detalhes do livro";
		
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		
		if(this.temAutor()){
			autor.mostrarDetalhes();	
		}		
		
		System.out.println("--");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

//	public abstract boolean aplicaDesconto(double porcentagem);
	
	boolean temAutor(){
		return this.autor != null;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public double getValor(){
		return this.valor;
	}
}
