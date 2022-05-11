import java.util.Scanner;


public class ProgramaRepetidor {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String[] matricula = new String[5];
		
		for (int i = 0; i <= 4; i++) {
		    System.out.println("Digite a matricula do aluno " (i + 1) "");
			matricula[i] = leitor.nextLine();
		}
		
		String[] nome = new String[5];
		
		for (int i = 0; i <= 4; i++) {
		    System.out.println("Digite o Nome");
			nome[i] = leitor.nextLine();
		}
		
		double[] nota1 = new double[5];
		
		for (int i = 0; i <= 4; i++) {
		    System.out.println("Digite a matricula");
			nota1[i] = leitor.nextDouble();
			leitor.nextDouble();
		}
		
		double[] nota2 = new double[5];
		
		for (int i = 0; i <= 4; i++) {
		    System.out.println("Digite a matricula");
			nota2[i] = leitor.nextDouble();
			leitor.nextDouble();
		}
		
		

		double[] notafinal = new double [5];
			notafinal[0] = (nota1[0] + nota2[0]) / 2;
			notafinal[1] = (nota1[1] + nota2[1]) / 2;
			notafinal[2] = (nota1[2] + nota2[2]) / 2;
			notafinal[3] = (nota1[3] + nota2[3]) / 2;
			notafinal[4] = (nota1[4] + nota2[4]) / 2;
			
		
			
			for (int i = 0; i < 5; ++ i) {
			     System.out.println("\nnome " + nome[i]);
			     System.out.println("matricula " + matricula[i]);
			     System.out.println("nota final " + notafinal[i]);
			     System.out.println((notafinal[i] >= 6)? "Aprovado (X)Sim ()Não" : "Aprovado ()Sim (X)Não");
			 }


			
			
				leitor.close();
	}
}
