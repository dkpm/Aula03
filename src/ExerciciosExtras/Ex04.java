package ExerciciosExtras;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Um rob� de combate s� deve ativar sua arma principal quando o inimigo est� a
		// menos de 70cm de dist�ncia. Fa�a um programa onde o usu�rio informe a
		// dist�ncia do
		// inimigo e sejam exibidas as mensagens �ATIVADO� ou �DESATIVADO� dependendo do
		// status da arma.

		int informeDistancia;
		

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informa a dist�ncia do inimigo: ");
		informeDistancia = leitor.nextInt();

		if (informeDistancia < 70) {

			System.out.println("\nDist�ncia do inimigo � de: " + informeDistancia);
			System.out.println("Rob� foi Ativado");

		} else {
			System.out.println("\nDist�ncia do inimigo � de: " + informeDistancia);
			System.out.println("Rob� est� Desativado");
		}

		leitor.close();

	}

}
