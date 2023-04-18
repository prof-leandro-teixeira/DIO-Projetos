/*
Desafio
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:
Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a
mensagem: Area = XX.X

Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2
*/

package intermediario;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		leitor.useLocale(Locale.US);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double somaTriangulo;
		double somaTrapezio;
		
		
		if(Math.abs(A-B)<C && A+B>C
			|| Math.abs(A-C)<B && A+C>B   
			|| Math.abs(B-C)<A && B+C>A  ){
			somaTriangulo = A + B + C;
			System.out.println("Perimetro = " + somaTriangulo);
		}
		else {
			somaTrapezio = ((A + B) * C)/2;
			System.out.println("Area = " + somaTrapezio);
		}
		leitor.close();

	}

}
