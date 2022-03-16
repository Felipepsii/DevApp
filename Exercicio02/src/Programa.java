
public class Programa {

	public static void main(String[] args) {
		

		
		String[] matricula = new String[5];
			matricula[0] = "12345";
			matricula[1] = "23456";
			matricula[2] = "34567";
			matricula[3] = "45678";
			matricula[4] = "56789";
		
		String[] nome = new String[5];
			nome[0] = "Juninho";
			nome[1] = "Marquinho";
			nome[2] = "Bruninha";
			nome[3] = "Luquinhas";
			nome[4] = "Albertinho";
		
		double[] nota1 = new double[5];
			nota1[0] = 5;
			nota1[1] = 6;
			nota1[2] = 8;
			nota1[3] = 1;
			nota1[4] = 3;
		double[] nota2 = new double[5];
			nota2[0] = 6;
			nota2[1] = 8;
			nota2[2] = 5;
			nota2[3] = 3;
			nota2[4] = 2;

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


			
			
      /*
       				O que o código da linha 43 até 47 faz
       
       	System.out.println("Nome: " + nome[0]);
        System.out.println("Matricula: " + matricula[0]);
        System.out.println("Nota Final: " + notafinal[0]); 
        System.out.println((notafinal[0] >= 6)? "Aprovado (X)Sim ()Não" : "Aprovado ()Sim (X)Não");

        
        System.out.println("\nNome: " + nome[1]);
        System.out.println("Matricula: " + matricula[1]);
        System.out.println("Nota Final: " + notafinal[1]);       
        System.out.println((notafinal[1] >= 6)? "Aprovado (X)Sim ()Não" : "Aprovado ()Sim (X)Não");
        
        System.out.println("\nNome: " + nome[2]);
        System.out.println("Matricula: " + matricula[2]);
        System.out.println("Nota Final: " + notafinal[2]);        
        System.out.println((notafinal[2] >= 6)? "Aprovado (X)Sim ()Não" : "Aprovado ()Sim (X)Não")
        ;
        System.out.println("\nNome: " + nome[3]);
        System.out.println("Matricula: " + matricula[3]);
        System.out.println("Nota Final: " + notafinal[3]);        
        System.out.println((notafinal[3] >= 6)? "Aprovado (X)Sim ()Não" : "Aprovado ()Sim (X)Não");
        
        System.out.println("\nNome: " + nome[4]);
        System.out.println("Matricula: " + matricula[4]);
        System.out.println("Nota Final: " + notafinal[4]);        
        System.out.println((notafinal[4] >= 6)? "Aprovado (X)Sim ()Não" : "Aprovado ()Sim (X)Não");	*/
	}
}
