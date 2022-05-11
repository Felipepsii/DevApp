

public class Program {
	
	public static void main(String[] args){
		
		Aluno aluno1 = new Aluno();
		aluno1.matricula = "12345";
		aluno1.nome = "Pedro";
		aluno1.nota1 = 8.8;
		aluno1.nota2 = 5.8;
		aluno1.nota3 = 3.8;
		
		Aluno aluno2 = new Aluno();
		aluno2.matricula = "54321";
		aluno2.nome = "Ana";
		aluno2.nota1 = 2.5;
		aluno2.nota2 = 8.5;
		aluno2.nota3 = 9.8;
		
		

		
	
		
		
		
		
/*		String[] alunos = new String[2];
		alunos[0] = "Pedro;12385;8.9;6.9;4.5";
		alunos[1] = "Ana;12596;2.9;9.9;10";
		
		double totalNotas = 0;
		
		for (int i = 0; i < alunos.length; i++) {
			String linha = alunos[i];
			String[] dados = linha.split(";");
			for (int j = 0; j < dados.length; j++) {
				String dado = dados[j];
				if(j > 1) {
					totalNotas = totalNotas + Double.parseDouble(dado);
				}
				System.out.println(dado);
			}
			System.out.println(totalNotas / 3);
			totalNotas = 0;
		}
		*/
		
		
	}
}
