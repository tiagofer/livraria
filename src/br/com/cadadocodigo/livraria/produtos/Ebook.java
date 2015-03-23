package br.com.cadadocodigo.livraria.produtos;
import br.com.cadadocodigo.livraria.Autor;


public class Ebook extends Livro implements Promocional{
	
	private String waterMark;
	
	public Ebook(Autor autor){
		super(autor);
	}

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	@Override
	public boolean aplicaDesconto(double porcentagem){
		
		if (porcentagem > 0.15){
			return false;
		}else {
			double desconto = this.getValor() * porcentagem;
			setValor(this.getValor() - desconto);
//			super.aplicaDesconto(porcentagem);
			return true;
		}
	}

//	@Override
//	public double getValor() {
//		return getValor();
//	}

	
	
}
