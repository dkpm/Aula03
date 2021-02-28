package ExerciciosExtras;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
		//solicite ao usuário que digite o tempo de um filme em minutos e informe a duração
		//desse filme em horas e em segundos.
		
		
		int tempoMinutos; 
		int hora, segundos;
	
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o tempo de um filme em minutos: ");
		tempoMinutos = leitor.nextInt();
		
		hora =  tempoMinutos / 60 ;
		segundos =  tempoMinutos * 60;
	
 
		System.out.println("A duração do filme é de: \n " + hora +  " Horas " +   "e " +  segundos + " Segundos");
		
		leitor.close();
		

	}

}
