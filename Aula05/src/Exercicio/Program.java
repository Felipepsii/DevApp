package Exercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Users\\Aluno\\Desktop\\Aula05\\Aula05\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		double totalA = 0;
		double totalB = 0;
		double totalC = 0;
		double totalD = 0;
		double totalE = 0;
		double totalF = 0;
		
		double total = 0;
		
		while(leitor.hasNext()) {
			
			String linha = leitor.nextLine();
			String[] dadoslinha = linha.split("\t");
		/*	System.out.println("Grupo: " + dadoslinha[0]);
			System.out.println("Valor: " + dadoslinha[1]);
			System.out.println("--------------"); */

			
			
			if(
					
				dadoslinha[0].equals("A")){
					String gA = dadoslinha[1];
				totalA = totalA + Double.parseDouble(dadoslinha[1]);
			}if(
					
				dadoslinha[0].equals("B")){
					String gB = dadoslinha[1];
				totalB = totalB + Double.parseDouble(dadoslinha[1]);
			}if(
					
				dadoslinha[0].equals("C")){
					String gC = dadoslinha[1];
				totalC = totalC + Double.parseDouble(dadoslinha[1]);
			}if(
					
				dadoslinha[0].equals("D")){
					String gD = dadoslinha[1];
				totalD = totalD + Double.parseDouble(dadoslinha[1]);
			}if(
					
				dadoslinha[0].equals("E")){
					String gE = dadoslinha[1];
				totalE = totalE + Double.parseDouble(dadoslinha[1]);
			}if(
					
				dadoslinha[0].equals("F")){
					String gF = dadoslinha[1];
				totalF = totalF + Double.parseDouble(dadoslinha[1]);
			}
	
		}
		
		
		System.out.println("Total Grupo A: " + totalA);
		System.out.println("Total Grupo B: " + totalB);
		System.out.println("Total Grupo C: " + totalC);
		System.out.println("Total Grupo D: " + totalD);
		System.out.println("Total Grupo E: " + totalE);
		System.out.println("Total Grupo F: " + totalF);
		
		total = totalA + totalB + totalC + totalD + totalE + totalF;
		
		System.out.println("Total Geral: " + total);
		
		
			leitor.close();		

	}}
