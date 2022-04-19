import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

	Scanner leitor = new Scanner(System.in);
		
		
	String[] m = new String [5];
	String[] n = new String [5];
	double[] n1 = new double [5];
	double[] n2 = new double [5];
	double[] nf = new double [5];
	
		
		for (int i = 0; i < 5; i++) {
			
			
			System.out.println("Informe o nome do " + (i+1) + "o aluno");
			n[i] = leitor.nextLine();

			System.out.println("Informe a matricula do aluno");
			m[i] = leitor.nextLine();
			
			System.out.println("Informe a primeira nota do aluno");
			n1[i] = leitor.nextDouble();
			
			System.out.println("Informe a segunda nota do aluno");
			n2[i] = leitor.nextDouble();
			
			nf[i] = (n1[i] + n2[i]) / 2;
			
			System.out.println("Matrícula:" + m[i] +  "\r\n"
					+ "Nome:" + n[i] + "\r\n");		
					if(nf[i] >= 6) {
						System.out.println("Aprovado: ( x ) Sim ( ) Não");	
					}if(nf[i] < 6) {
						System.out.println("Aprovado: (  ) Sim ( x ) Não");	
					}						
					System.out.println("Nota final: " + nf[i]);
			System.out.println("------------------");
			leitor.nextLine();
		

		}
		
		
		
	
		
		
		
	leitor.close();

	}
}
