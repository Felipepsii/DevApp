package br.eu.up.model;

public class Animal {
	
	public String tamanho;
	public String nome;
	public boolean vivo;
	private int idade;
	
	
	
	public void setIdade(int idade) throws Exception {
		if(idade< 0 || idade > 150) {
			throw new Exception();
		}this.idade = idade;
	}
	
	

	
	
	
	
	

}
