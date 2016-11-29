package br.com.marcelosantos.padroesdeprojeto;

public abstract class TemplateDeImpostoCondicional extends Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		if(deveMaxTaxacao(orcamento)){
			return maxTaxacao(orcamento) + calculaComOutroImposto(orcamento);
		}else{
			return minTaxacao(orcamento) + calculaComOutroImposto(orcamento);
		}
	}

	public abstract double minTaxacao(Orcamento orcamento);

	public abstract double maxTaxacao(Orcamento orcamento);

	public abstract boolean deveMaxTaxacao(Orcamento orcamento);	
	
}
