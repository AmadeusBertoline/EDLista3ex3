package view;
import controller.InverteController;
import java.util.Scanner;

public class InverteMain {
	
	public static void main(String[] args) {
		
		InverteController inverte = new InverteController();
		Scanner scanner = new Scanner(System.in);
		
		String palavra;
		String inversa = "";
		
		System.out.println("Digite uma palavra");
		palavra = scanner.next();
		
		inversa = inverte.Inverte(palavra);
		
		System.out.println("Palavra inversa: " +inversa);
		
	}

}
