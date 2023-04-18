/*
 * Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível. 
 * Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.
 */

package intermediario;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {

//		String[] aguia = {"vertebrado", "ave", "carnivoro"};
//		String[] pomba = {"vertebrado", "ave", "onivoro"};
//		String[] homem = {"vertebrado", "mamifero", "onivoro"};
//		String[] vaca = {"vertebrado", "mamifero", "herbivoro"};
//		String[] pulga = {"invertebrado", "inseto", "hematofago"};
//		String[] lagarta = {"invertebrado", "inseto", "herbivoro"};
//		String[] sanguessuga = {"invertebrado", "anelideo", "hematofago"};
//		String[] minhoca = {"invertebrado", "anelideo", "onivoro"};

		Scanner sc = new Scanner(System.in);

		String AN1, AN2, AN3;

		System.out.println("1 - ");
		AN1 = sc.nextLine();
		System.out.println("2 - ");
		AN2 = sc.nextLine();
		System.out.println("3 - ");
		AN3 = sc.nextLine();

		if ((AN1.equals("vertebrado") || AN2.equals("vertebrado") || AN3.equals("vertebrado"))
			&& (AN1.equals("ave") || AN2.equals("ave") || AN3.equals("ave"))
			&& (AN1.equals("carnivoro") || AN2.equals("carnivoro") || AN3.equals("carnivoro"))) {
			System.out.println("aguia");
		}

		if ((AN1.equals("vertebrado") || AN2.equals("vertebrado") || AN3.equals("vertebrado"))
			&& (AN1.equals("ave") || AN2.equals("ave") || AN3.equals("ave"))
			&& (AN1.equals("onivoro") || AN2.equals("onivoro") || AN3.equals("onivoro"))) {
			System.out.println("pomba");
		}

		if ((AN1.equals("vertebrado") || AN2.equals("vertebrado") || AN3.equals("vertebrado"))
			&& (AN1.equals("mamifero") || AN2.equals("mamifero") || AN3.equals("mamifero"))
			&& (AN1.equals("onivoro") || AN2.equals("onivoro") || AN3.equals("onivoro"))) {
			System.out.println("homem");
		}

		if ((AN1.equals("vertebrado") || AN2.equals("vertebrado") || AN3.equals("vertebrado"))
			&& (AN1.equals("mamifero") || AN2.equals("mamifero") || AN3.equals("mamifero"))
			&& (AN1.equals("herbivoro") || AN2.equals("herbivoro") || AN3.equals("herbivoro"))) {
			System.out.println("vaca");
		}

		if ((AN1.equals("invertebrado") || AN2.equals("invertebrado") || AN3.equals("invertebrado"))
			&& (AN1.equals("inseto") || AN2.equals("inseto") || AN3.equals("inseto"))
			&& (AN1.equals("hematofago") || AN2.equals("hematofago") || AN3.equals("hematofago"))) {
			System.out.println("pulga");
		}

		if ((AN1.equals("invertebrado") || AN2.equals("invertebrado") || AN3.equals("invertebrado"))
			&& (AN1.equals("inseto") || AN2.equals("inseto") || AN3.equals("inseto"))
			&& (AN1.equals("herbivoro") || AN2.equals("herbivoro") || AN3.equals("herbivoro"))) {
			System.out.println("lagarta");
		}

		if ((AN1.equals("invertebrado") || AN2.equals("invertebrado") || AN3.equals("invertebrado"))
			&& (AN1.equals("anelideo") || AN2.equals("anelideo") || AN3.equals("anelideo"))
			&& (AN1.equals("hematofago") || AN2.equals("hematofago") || AN3.equals("hematofago"))) {
			System.out.println("sanguessuga");
		}

		if ((AN1.equals("invertebrado") || AN2.equals("invertebrado") || AN3.equals("invertebrado"))
			&& (AN1.equals("anelideo") || AN2.equals("anelideo") || AN3.equals("anelideo"))
			&& (AN1.equals("onivoro") || AN2.equals("onivoro") || AN3.equals("onivoro"))) {
			System.out.println("minhoca");
		}

		sc.close();
	}
}
