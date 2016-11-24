package br.com.marcelosantos.padroesdeprojeto;

public class CalculadorDeImposto {
		
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		double valor = imposto.calcula(orcamento);
		System.out.println(valor);		
	}	
	
	/*public void realizaCalculoICMS(Orcamento orcamento, String imposto){
		double icms = new ICMS().calculaICMS(orcamento);
		System.out.println(icms);		
	}
	
	public void realizaCalculoISS(Orcamento orcamento, String imposto){
		double iss = new ISS().calculaISS(orcamento);
		System.out.println(iss);
	}*/
	
}
