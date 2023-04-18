//Imprimindo Positivos e Média
package basico;

import java.io.IOException;
import java.util.Scanner;

public class Desafio02 {
	
  public static void main(String[] args) throws IOException {
	 
     Scanner leitor = new Scanner(System.in);
     int cont = 0;
     double media = 0;
     double x;
     
     for (int i=0; i<6;i++) {
    	 System.out.println("Entre um valor: ");
    	 x = leitor.nextDouble();
    	 if(x>0){
    		 cont++;
    		 media += x;
        	}
    	}
    System.out.println(cont + " valores positivos");
    System.out.println(String.format("Média %.1f", media/cont));
    leitor.close();
	}
}