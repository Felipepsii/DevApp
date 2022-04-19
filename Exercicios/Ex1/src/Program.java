
public class Program {

	public static void main(String[] args) {
		
		String m = "326598";
		String n = "Marquinhos";
		double n1 = 2.5;
		double n2 = 10;
		
		double NF = (n1 + n2) / 2;
		
		System.out.println("Matrícula: " + m);
		System.out.println("Nome: " + n);
		
		if(NF >= 6) {
			System.out.println("Aprovado: ( x ) Sim ( ) Não");	
		}if(NF < 6) {
			System.out.println("Aprovado: (  ) Sim ( x ) Não");	

		}
		
		System.out.println("Nota final:" + NF);
	
		
		
		
		
		
	}

}
