package br.com.marcelosantos.padroesdeprojeto;

public abstract class TemplateDeImpostoCondicional implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		if(deveMaxTaxacao(orcamento)){
			return maxTaxacao(orcamento);
		}else{
			return minTaxacao(orcamento);
		}
	}

	public abstract double minTaxacao(Orcamento orcamento);

	public abstract double maxTaxacao(Orcamento orcamento);

	public abstract boolean deveMaxTaxacao(Orcamento orcamento);	
	
}
