import java.util.Scanner;

public class ProgramaCerto {

	public static void main(String[] args) {
	
	
		Scanner leitor = new Scanner(System.in);
	
		
		System.out.println("Informe o nome: ");		
		String nome = leitor.nextLine();	
		
		System.out.println("Informe a matricula: ");		
		String matricula = leitor.nextLine();
		
		double[] peso = {0.05 , 0.05, 0.2, 0.2, 0.5};
		

		
		double nf = 0;
		
		double[] notas = new double [5];
			
		System.out.println("Informar somente notas entre 0 e 10");

		
		int contador = 0;
		do {
			System.out.println("Digite a " + (contador + 1) + " nota:");
			double temp = leitor.nextDouble();
			if (temp >= 0 && temp <= 10) {
				notas[contador] = temp;
				contador++;
			}else {
				System.out.println("Valor invalido");
				System.out.println("Tente novamente");
			}
			
					
			
		} while(contador < 5);
			System.out.println();
			System.out.println("--RELATÓRIO--");
			System.out.println("Matricula:" + matricula);
			System.out.println("Nome " + nome);
			
			for(int i = 0; i < notas.length; i++) {
						
				nf = nf + (notas[i] * peso[i]);				
				System.out.println("Nota " + (i + 1) + ": " + notas[i]);			
			}
			
			if (nf >= 6) {
				System.out.println("Aluno Aprovado");
			}else {
				System.out.println("Aluno Reprovado");
			}
			
		    System.out.println("A nota final do Aluno é :" + (String.format("%.2f", nf)));

			leitor.close();

			

					
	}
}
	

		
	
		
 	
