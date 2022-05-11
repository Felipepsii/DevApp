import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File ("C:\\Users\\Aluno\\Desktop\\java\\Ex5\\src\\grupos-tabulados.txt");
		Scanner leitor = new Scanner (arquivo);
		leitor.nextLine();
		
	int ga = 0;
	int gb = 0;
	int gc = 0;
	int gd = 0;
	int ge = 0;
	int gf = 0;
	
	while (leitor.hasNext()) {
		String l = leitor.nextLine();
		String[] dl = l.split("\t");
		
	switch (dl[0]) {
	case "A":
		ga += getValor(dl[1]);
		break;
	case "B":
		gb += getValor(dl[1]);
		break;
	case "C":
		gc += getValor(dl[1]);
		break;
	case "D":
		gd += getValor(dl[1]);
		break;
	case "E":
		ge += getValor(dl[1]);
		break;
	case "F":
		gf += getValor(dl[1]);
		break;
		
		
	}
	
	}	
	
	setGrupo("A", ga);
	setGrupo("B", gb);
	setGrupo("C", gc);
	setGrupo("D", gd);
	setGrupo("E", ge);
	setGrupo("F", gf);
	
	int gt = ga + gb + gc + gd+ ge + gf;
	System.out.println("Valor de todos os grupos somados é: " + gt);
			
	
}

	
	public static void setGrupo(String l, int vlr) {
		System.out.println("Valor total do grupo " + l + ": " + vlr);
	}
	
	public static int getValor(String vlr) {
		return Integer.parseInt(vlr);

}
	
}