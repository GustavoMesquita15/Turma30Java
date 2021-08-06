package programas;

public class CadNovoAluno {

	public static void main(String[] args) {

		Aluno exemplo1 = new Aluno();
		Aluno exemplo2 = new Aluno();
		exemplo1.nome = "EPAMINONDAS";
		exemplo1.matricula = "MAT-1";
		exemplo1.nota = 5;
		exemplo1.anoNascimento = 2005;
		
		exemplo2.nome = "Maria";
		exemplo2.matricula = "MAT-200";
		exemplo2.nota = 10;
		exemplo2.anoNascimento = 1978;
		
		
		if(exemplo1.nota > exemplo2.nota) {
			System.out.println("A maior nota é do alune "+exemplo1.nome+" e sua idade é "+(2021-exemplo1.anoNascimento));
		}
		else {
			System.out.println("A maior nota é do alune "+exemplo2.nome+" e sua idade é "+(2021-exemplo2.anoNascimento));

		}
	}

}
