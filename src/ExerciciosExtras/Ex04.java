package ExerciciosExtras;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Um robô de combate só deve ativar sua arma principal quando o inimigo está a
		// menos de 70cm de distância. Faça um programa onde o usuário informe a
		// distância do
		// inimigo e sejam exibidas as mensagens “ATIVADO” ou “DESATIVADO” dependendo do
		// status da arma.

		int informeDistancia;
		

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informa a distância do inimigo: ");
		informeDistancia = leitor.nextInt();

		if (informeDistancia < 70) {

			System.out.println("\nDistância do inimigo é de: " + informeDistancia);
			System.out.println("Robô foi Ativado");

		} else {
			System.out.println("\nDistância do inimigo é de: " + informeDistancia);
			System.out.println("Robô está Desativado");
		}

		leitor.close();

	}

}
