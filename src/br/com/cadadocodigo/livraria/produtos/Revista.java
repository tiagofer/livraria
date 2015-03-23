package br.com.cadadocodigo.livraria.produtos;
import br.com.cadadocodigo.livraria.Editora;


public class Revista implements Produto,Promocional{
	private String nome;
	private String descricao;
	private Editora editora;
	private double valor;
	
	
	public boolean aplicaDesconto(double porcentagem){
		if (porcentagem>0.05){
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
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
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
