import java.util.Scanner;

public class ProgramaCerto {

	public static void main(String[] args) {
	
	
		Scanner leitor = new Scanner(System.in);
	
		
		System.out.println("Informe o nome: ");		
		String nome = leitor.nextLine();	
		
		System.out.println("Informe a matricula: ");		
		String matricula = leitor.nextLine();
		
		double [] notas = new double [5];
		
		int contador = 0;
		do {
			System.out.println("Informar somente notas entre 0 e 10");
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
				System.out.println("Nota " + (i + 1) + ": " + notas[i]);
			}
			leitor.close();

			
			/*
			Matrícula: xxxxx
			Nome: xxxxx xxxxx
			Nota (x) : xxxxx
			Nota (y) : yyyyy

			 */
					
	}
}
	

		
	
		
 	
