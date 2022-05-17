package br.eu.up.model;

public class Pqp {
	
	public int quantidade;
	
	public void setQuantidade(int quantidade) throws Exception {
		if(quantidade < 1 || quantidade > 4) {
			throw new Exception();
		}this.quantidade = quantidade;
	}
	
}
