package br.com.marcelosantos.padroesdeprojeto;

public class ISS extends Imposto{
	
	public ISS(Imposto outroImposto){
		super(outroImposto);
	}
	
	public ISS(){}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaComOutroImposto(orcamento);
	}		
	
}
