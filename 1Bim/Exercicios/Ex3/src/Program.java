import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

	Scanner leitor = new Scanner(System.in);
		
		
	String[] m = new String [5];
	String[] n = new String [5];
	double[] n1 = new double [5];
	double[] n2 = new double [5];
	double[] n3 = new double [5];
	double[] n4 = new double [5];
	double[] n5 = new double [5];
	
	double[] nf = new double [5];
	
		
		for (int i = 0; i < 5; i++) {
			
			
			System.out.println("Informe o nome do " + (i+1) + "o aluno");
			n[i] = leitor.nextLine();

			System.out.println("Informe a matricula do aluno");
			m[i] = leitor.nextLine();
			
			System.out.println("Informe a primeira nota do aluno");
			n1[i] = leitor.nextDouble();
			
			if(n1[i] > 10 || n1[i] < 0){
				System.out.println("NOTA INVALIDA TONTO");
				break;
			}
			
			System.out.println("Informe a segunda nota do aluno");
			n2[i] = leitor.nextDouble();
			if(n2[i] > 10 || n2[i] < 0){
				System.out.println("NOTA INVALIDA TONTO");
				break;
			}
			
			System.out.println("Informe a segunda nota do aluno");
			n3[i] = leitor.nextDouble();
			if(n3[i] > 10 || n3[i] < 0){
				System.out.println("NOTA INVALIDA TONTO");
				break;
			}
			
			System.out.println("Informe a segunda nota do aluno");
			n4[i] = leitor.nextDouble();
			if(n4[i] > 10 || n4[i] < 0){
				System.out.println("NOTA INVALIDA TONTO");
				break;
			}
			
			System.out.println("Informe a segunda nota do aluno");
			n5[i] = leitor.nextDouble();
				if(n5[i] > 10){
				System.out.println("NÃO TEM NOTA MAIOR QUE 10 NÃO TONTO");
				break;
			}
			
			nf[i] = (n1[i] + n2[i] + n3[i] + n4[i] + n5[i] ) / 5;
			
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
