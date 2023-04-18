// Soma de H com N Termos
//Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N...
package basico;

public class Desafio03 {

	public static void main(String[] Args) {

		double h = 0;
		double n = 5;

		for (float i = 1; i < n; i++) {
			
			h = h + (1/i);
		}
		System.out.println(Math.round(h) );

	}
}