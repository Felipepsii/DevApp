package br.eu.up;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.eu.up.model.Animal;
import br.eu.up.model.Cachorro;
import br.eu.up.model.Gato;
import br.eu.up.model.Homem;
import br.eu.up.model.Humano;
import br.eu.up.model.Mulher;



public class Program {

	public static void main(String[] args) throws Exception{
		

			
			List listaDeObjetos = new ArrayList();
			List<Animal> listaDeAnimais = new ArrayList();
			
			Homem george = new Homem();
			george.calvo = true;
			
			Cachorro dog1 = new Cachorro();
			dog1.marca = "HotWheels";
			dog1.tamanho = "Grande";
			dog1.nome = "Pichichichun";
			dog1.vivo = false;
			
			listaDeAnimais.add(dog1);
			
			Gato cat1 = new Gato();
			cat1.marca = "HotWheels";
			cat1.tamanho = "Grande";
			cat1.nome = "Pichichichun";
			cat1.vivo = false;
			
			Humano humano = new Humano();
			humano.setIdade(10);
			humano.nome = "Whatzap";
			
			Mulher mulher = new Mulher();
			mulher.setIdade(53);
			
			listaDeAnimais.add(cat1);
			
			for (Animal animal : listaDeAnimais) {
				System.out.println(animal.nome);
			}
			

	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


