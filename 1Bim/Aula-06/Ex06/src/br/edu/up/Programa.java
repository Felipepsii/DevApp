package br.edu.up;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Scanner;

import br.edu.up.modelo.Grupo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leitor = getLeitor();
		if (leitor == null) {
			System.out.println("N�o foi possivel executar o programa");
		}else {

			Grupo[] grupos = carregarDados(leitor);
			
			gravarRelatorio(grupos);
		


				} //else
				
		System.out.println("AEAEAAEAE");
			} //main
		
			
	public static void gravarRelatorio(Grupo[] grupos) {
		try {
			Formatter gravador = new Formatter("C:\\Users\\Aluno\\Desktop\\Aula-06\\Ex06\\src\\relatorios-de-grupos.txt");
			
			int vlrTotal = 0;
			for (int i = 0; i < grupos.length; i++) {
				Grupo grp = grupos[i];
				gravador.format("valor do grupo" + grp.letra + ": " + grp.getValor());
				vlrTotal += grp.getValor();
			}
			gravador.format("Valor total: " + vlrTotal);			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Scanner getLeitor() {
		File arquivo = new File("C:\\Users\\Aluno\\Desktop\\Aula-06\\Ex06\\src\\grupos-tabulados.txt");
		
		Scanner leitor = null;
		try {
			leitor = new Scanner(arquivo);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Arquivo n�o encontrado");
		}
		return leitor;

	}
	
	public static Grupo[] carregarDados(Scanner leitor) {
		
		Grupo grupoA = new Grupo("A");
		Grupo grupoB = new Grupo("B");
		Grupo grupoC = new Grupo("C");
		Grupo grupoD = new Grupo("D");
		Grupo grupoE = new Grupo("E");
		Grupo grupoF = new Grupo("F");
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] dadosLinha = linha.split("\t");
			switch (dadosLinha[0]) {
			case "A":
				grupoA.addValor(dadosLinha[1]);
				break;
			case "B":
				grupoB.addValor(dadosLinha[1]);
				break;
			case "C":
				grupoC.addValor(dadosLinha[1]);
				break;
			case "D":
				grupoD.addValor(dadosLinha[1]);
				break;
			case "E":
				grupoE.addValor(dadosLinha[1]);
				break;
			case "F":
				grupoF.addValor(dadosLinha[1]);
				break;
	
			} // Switch case
		} //while
		
		Grupo[] grupos = new Grupo[6];
		
		grupos[0] = grupoA;
		grupos[1] = grupoB;
		grupos[2] = grupoC;
		grupos[3] = grupoD;
		grupos[4] = grupoE;
		grupos[5] = grupoF;
		
		return grupos;
	
	}
} //class Programa