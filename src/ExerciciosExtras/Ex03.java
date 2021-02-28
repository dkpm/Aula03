package ExerciciosExtras;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//Solicite ao usuário a digitação de 2 números inteiros, nas variáveis A e B. 
		//Sem usar uma terceira variável, troque os valores de A e B entre si.

		int varA;
		int varB;
		
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro número para a váriavel A: " );
		varA = leitor.nextInt();
		
		System.out.println("Digite o segundo para a váriavel B: ");
		varB = leitor.nextInt();
		
		varA =  varA + varB;
		varB =  varA - varB;
		varA =  varA - varB;
		
		System.out.println("\nAgora vamos trocar os valores das variaveis");
		System.out.println("Valor de A passa a valer: " + varA + "\n" + "Valor de B passa a valer: " + varB);
		
		leitor.close();
	}

}
