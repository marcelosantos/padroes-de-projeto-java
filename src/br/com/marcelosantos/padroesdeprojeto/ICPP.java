package br.com.marcelosantos.padroesdeprojeto;

public class ICPP extends TemplateDeImpostoCondicional{

	@Override
	public double minTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double maxTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveMaxTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}	

}
