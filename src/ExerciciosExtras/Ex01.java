package ExerciciosExtras;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//Para um ano de nascimento fornecido pelo usuário, informe a idade que ele terá no dia 31 de dezembro de 2021.

		Scanner leitor = new Scanner(System.in);
		int anoDeNasc, anoAtual = 2021, idade;
		
		System.out.println("Por favor, digite o ano de nascimento");
		anoDeNasc = leitor.nextInt();
		
		idade = anoAtual - anoDeNasc; 
		
		System.out.println("No dia 31 de dezembro de 2021, você terá: " + idade);
		
		leitor.close();
		
		
	}

}
