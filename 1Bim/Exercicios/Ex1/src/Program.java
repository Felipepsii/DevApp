
public class Program {

	public static void main(String[] args) {
		
		String m = "326598";
		String n = "Marquinhos";
		double n1 = 2.5;
		double n2 = 10;
		
		double NF = (n1 + n2) / 2;
		
		System.out.println("Matr�cula: " + m);
		System.out.println("Nome: " + n);
		
		if(NF >= 6) {
			System.out.println("Aprovado: ( x ) Sim ( ) N�o");	
		}if(NF < 6) {
			System.out.println("Aprovado: (  ) Sim ( x ) N�o");	

		}
		
		System.out.println("Nota final:" + NF);
	
		
		
		
		
		
	}

}
