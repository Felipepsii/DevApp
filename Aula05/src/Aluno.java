
public class Aluno {
	
	public String matricula;
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	
	public double getNotaFinal() {
		return (nota1 + nota2 + nota3) /3;
	}
}
