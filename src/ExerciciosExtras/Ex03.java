package ExerciciosExtras;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//Solicite ao usu�rio a digita��o de 2 n�meros inteiros, nas vari�veis A e B. 
		//Sem usar uma terceira vari�vel, troque os valores de A e B entre si.

		int varA;
		int varB;
		
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero para a v�riavel A: " );
		varA = leitor.nextInt();
		
		System.out.println("Digite o segundo para a v�riavel B: ");
		varB = leitor.nextInt();
		
		varA =  varA + varB;
		varB =  varA - varB;
		varA =  varA - varB;
		
		System.out.println("\nAgora vamos trocar os valores das variaveis");
		System.out.println("Valor de A passa a valer: " + varA + "\n" + "Valor de B passa a valer: " + varB);
		
		leitor.close();
	}

}
