package br.eu.up.model;

public class Pedal {

	public int numeroDePedais;
	
	
	public void setNumeroDePedais(int numeroDePadais) throws Exception {
		if(numeroDePedais < 1 || numeroDePedais > 4) {
			throw new Exception();
		}this.numeroDePedais = numeroDePedais;
	}
}
