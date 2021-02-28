package ExerciciosExtras;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor
		// peso.
		// Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar
		// qual deles
		// deve ser carregado pelo drone

		int pesolixo1, pesolixo2, pesolixo3;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o peso do primeiro lixo: ");
		pesolixo1 = leitor.nextInt();

		System.out.println("Informe o peso do segundo lixo: ");
		pesolixo2 = leitor.nextInt();

		System.out.println("Informe o peso do terceiro lixo: ");
		pesolixo3 = leitor.nextInt();

		if (pesolixo1 < pesolixo2 && pesolixo1 < pesolixo3) {

			System.out.println("Carregando o menor peso que é o primeiro lixo: " + pesolixo1);
		} else if (pesolixo2 < pesolixo1 && pesolixo2 < pesolixo3) {

			System.out.println("Carregando o menor peso que é o segundo lixo: " + pesolixo2);
		} else if (pesolixo3 < pesolixo1 && pesolixo3 < pesolixo2) {

			System.out.println("Carregando o menor peso que é o terceiro lixo: " + pesolixo3);
		} else {

			System.out
					.println("Todos os pesos são identicos, então o drone irá levar o primeiro da fila que é do peso: "
							+ pesolixo1);
		}

		leitor.close();
	}

}
