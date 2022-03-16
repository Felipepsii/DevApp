public class Exercicio1{

    public static void main(String[] args) {
        
        double nota1 = 7.5;
        double nota2 = 1.2;
        String matricula = "147258";
        String nome = "Marquinhos da Silva";
        double notafinal = nota1 + nota2;

   
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota Final: " + notafinal);
    
        if (((nota1 + nota2) / 2) >= 7) {
            System.out.println("Aprovado (X)Sim ()Não");
        }else{
            System.out.println("Aprovado ()Sim (X)Não");
        }



    }

}
