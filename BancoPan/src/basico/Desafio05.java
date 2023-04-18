// Fibonacci


package basico;

import java.io.IOException;
import java.util.Scanner;

public class Desafio05 {

	 public static void main(String[] args) throws IOException {
	        Scanner leitor = new Scanner(System.in);
	        int N = leitor.nextInt();
	        int proximo = 0;
	        int anterior = 0;
	        int atual = 1;
	        for (int i = 1; i <= N; i++) {
	            if (i == N) System.out.println(anterior);
	       
	        	else System.out.print(anterior + " ");
	        	proximo = anterior + atual;
	        	anterior = atual; 
	        	atual = proximo; 
	        }
	        leitor.close();
	    }
		
	}
