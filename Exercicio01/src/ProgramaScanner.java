import java.util.Scanner;

public class ProgramaScanner {

public static void main(String[] args) {
	        
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite o nome do aluno");
			String nome = leitor.nextLine();
			
			System.out.println("Digite a matrícula do aluno");
			String matricula = leitor.nextLine();
			
			System.out.println("Digite a nota do primeiro bimestre");
			double nota1 = leitor.nextDouble();
			
			System.out.println("Digite a nota do segundo bimestre");
			double nota2 = leitor.nextDouble();

	        double notafinal = (nota1 + nota2) / 2;
	        
	    
	   
	        System.out.println("Nome: " + nome);
	        System.out.println("Matricula: " + matricula);
	        System.out.println("Nota Final: " + notafinal);
	        
	        
	        System.out.println((notafinal >= 6)? "Aprovado (X)Sim ()Não" : "Aprovado ()Sim (X)Não");
	        
	    /*
	     *	O que é o códio inteiro da linha 18
	     *	
	        if (notafinal >= 6) {
	            System.out.println("Aprovado (X)Sim ()Não");
	        }else{
	            System.out.println("Aprovado ()Sim (X)Não");
	        }
	     */

	    
	}

}
