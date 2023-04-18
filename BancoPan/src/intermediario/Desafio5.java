/*Calculo de impostos
 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00,
 *  pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. 
 *  No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. 
 *  O valor deve ser impresso com duas casas decimais.
 */
package intermediario;

import java.io.IOException;
import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto = 0.08;
                  
        if(renda<=2000.00){
            System.out.printf("Isento");
            
        }else {
        	if(renda<3000.01) {
        		System.out.printf("R$ %.2f", ((1000)*(imposto)));
        	}
        	else if(renda<4500.0) {
            System.out.printf("R$ %.2f", ((renda-3000.01)*(imposto+0.1))
            								+((1000)*(imposto)));
            }else {
            System.out.printf("R$ %.2f", ((renda-4500)*(imposto+0.2))
            								+((1500)*(imposto+0.1))
               								+((1000)*(imposto)));
                       }
            }
        leitor.close();
    }
}