import java.util.Iterator;
import java.util.Scanner;

public class ProgramaCerto {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//variaveis
		
		String nome[];
		nome = new String[5];
		
		String matricula[];
		matricula = new String[5];
		
		double mednota[];
		mednota = new double[5];
		
		int cont = 0;
		
		for (int i = 0; i <= 5; i++ ) {
			System.out.println("Informe o nome do aluno");
			nome[i] = leitor.nextLine();
			
			System.out.println("Digite a matricula do aluno");
			matricula[i] = leitor.nextLine();
			
			}
		
	while (cont < 5) {
		System.out.println();
	}
		
		
		
		
 	}
}
