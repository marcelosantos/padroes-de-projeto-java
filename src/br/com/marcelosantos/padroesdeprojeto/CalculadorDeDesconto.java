package br.com.marcelosantos.padroesdeprojeto;

public class CalculadorDeDesconto {
	
	public double calcula(Orcamento orcamento){
		
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		
		return d1.desconta(orcamento);
		
		/*
		
		double desconto = new DescontoPorCincoItens().desconta(orcamento);
		if(desconto == 0) desconto = new DescontoPorMaisDeQuinhentosReais().desconta(orcamento); 
		
		
		// se possuir mais de 5 itens na lista aplica o desconto
		if(orcamento.getItens().size() > 5){
			return orcamento.getValor() * 0.1;
		}
		
		else if(orcamento.getValor() > 500.00){
			return orcamento.getValor() * 0.07;
		}*/
		
		// caso não aplique desconto anteriores
		//return 0;
	}
	
}
