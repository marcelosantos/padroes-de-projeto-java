package br.com.marcelosantos.padroesdeprojeto;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// nada para fazer, sem continuidade
	}	
	
}
