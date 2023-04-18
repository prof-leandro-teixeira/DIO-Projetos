package basico;

public class Operadores {

	public static void main(String[] args) {

	int teste = 10;
	System.out.println("Imprimindo teste = " + teste);
	
	teste ++;
	System.out.println("Imprimindo teste++ = " + teste);
	
	teste = - teste;
	System.out.println("Imprimindo -teste = " + teste);
	
	teste = - teste;
	System.out.println("Imprimindo +teste = " + teste);
	
	boolean b = false;
	b = !b;
	System.out.println(b);
	
	int a = 0;
	
	while(a<10) {
		System.out.println("O valor de a é = " + a);
		a++;
		if (a==5) {
			System.out.println("Olha o continue aqui!");
			a++;
			continue;
			
			
		}
		
	}

		
	}
}


