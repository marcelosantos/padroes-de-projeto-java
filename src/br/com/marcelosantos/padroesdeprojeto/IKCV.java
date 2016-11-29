package br.com.marcelosantos.padroesdeprojeto;

public class IKCV extends TemplateDeImpostoCondicional{

	private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
		for(Item item : orcamento.getItens()){
			if(item.getValor() > 100){
				return true;
			}
		}		
		return false;
	}

	@Override
	public double minTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maxTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public boolean deveMaxTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
	}	
	
}
