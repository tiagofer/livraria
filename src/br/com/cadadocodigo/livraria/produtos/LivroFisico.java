package br.com.cadadocodigo.livraria.produtos;
import br.com.cadadocodigo.livraria.Autor;


public class LivroFisico extends Livro implements Promocional{
	
	public LivroFisico(Autor autor){
		super(autor);
	}
	
	public double getTaxaImpressao(){
		return this.getValor()*0.05;
	}
	
	
	public boolean aplicaDesconto(double porcentagem){
		if (porcentagem > 0.3){
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("Aplicando desconto");
		return true;
		
	}
//
//	@Override
//	public double getValor() {
//		return getValor();
//	}

}
