
public class Programa {

public static void main(String[] args) {
	        
	        double nota1 = 7.5;
	        double nota2 = 8.2;
	        String matricula = "147258";
	        String nome = "Marquinhos da Silva";
	        double notafinal = (nota1 + nota2) / 2;

	   
	        System.out.println("Nome: " + nome);
	        System.out.println("Matricula: " + matricula);
	        System.out.println("Nota Final: " + notafinal);
	        
	        
	        System.out.println((notafinal >= 6)? "Aprovado (X)Sim ()N�o" : "Aprovado ()Sim (X)N�o");
	        
	    /*
	     *	O que � o c�dio inteiro da linha 18
	     *	
	        if (notafinal >= 6) {
	            System.out.println("Aprovado (X)Sim ()N�o");
	        }else{
	            System.out.println("Aprovado ()Sim (X)N�o");
	        }
	     */

	    
	}

}
