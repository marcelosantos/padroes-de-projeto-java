package br.com.marcelosantos.padroesdeprojeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	private final Double valor;
	private final List<Item> itens;

	public Orcamento(Double valor){
		this.valor = valor;
		itens = new ArrayList<Item>();
	}

	public void adicionaItem(Item item){
		itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public Double getValor() {
		return valor;
	}
	
}
