package br.com.marcelosantos.padroesdeprojeto;

public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		
		Imposto iss = new ISS( new ICMS( new ICPP() ) );
		
		Orcamento orcamento = new Orcamento(600.0);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);

	}

}