package intermediario;

import java.util.Scanner;

public class PesquisaNoArray {

	public static void main(String[] args) {

		int total = 0;
		int vogais = 0;
		int espacos = 0;
		char[] arrVogais = { 'a', 'e', 'i', 'o', 'u' };

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strSplit = str.split(" ");

		// System.out.println("Quantidade de caracteres da str é: " + str.length());
		// System.out.println("Quantidade de espaços de str é : " +
		// (strSplit.length-1));

		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				vogais++;
		}
		System.out.println("Espacos em branco: " + (strSplit.length - 1) + " Vogais: " + vogais);
		// System.out.println("A quantidade de vogais na str é: " + vogais);
		sc.close();
	}
}
