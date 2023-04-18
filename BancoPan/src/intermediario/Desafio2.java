//Quitanda do seu Zé

package intermediario;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		    
        Scanner input = new Scanner(System.in);
            int morangos = input.nextInt();
            int macas = input.nextInt();

            
            Double precoMorango = 2.50;
            Double precoMaca = 1.80;
            
            if(morangos>5){
                precoMorango = 2.20;
            }
            if (macas>5){
                precoMaca = 1.50;
            }
            
            Double valorCompra = morangos*precoMorango + macas*precoMaca;
            
            if(morangos+macas>8 || precoMorango+precoMaca>25) {
            	System.out.println(valorCompra*0.9);
            }else
            System.out.println(valorCompra);            
            input.close();  
    }
	
}