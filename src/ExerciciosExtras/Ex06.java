package ExerciciosExtras;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom
		// “DIADEFESTA”. Faça um programa onde o funcionário digite o valor da compra e um
		// cupom, informando o valor final a ser pago.
		
		double valorDaConta;
		String temCupom = "DIADEFESTA";
		double valorComDesconto;
		double resultadoFinal;
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o valor da compra:");
		valorDaConta = leitor.nextInt();
		
		System.out.println("Digita o cupom:");
		temCupom = leitor.next();
		
		
		if(temCupom.equalsIgnoreCase("DIADEFESTA")) {
			valorComDesconto = valorDaConta * 0.03;
			resultadoFinal = valorDaConta - valorComDesconto;

			System.out.println("Valor final a ser pago com desconto: "  + resultadoFinal);
		}
		
		else {
			
			System.out.println("Valor final a ser pago sem desconto: "  + valorDaConta);
			
		}
		
		leitor.close();
		
		
	}

}
