package cursojava.execrcicios;

import java.util.Scanner;

public class AskOneNumber {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int num = scan.nextInt();
		
		System.out.println("O n�mero dogitado foi "+ num );
	}

}
