package principal;
import java.util.Scanner;
public class Sumatorio {

	public static void main(String[] args) {
		//cambiar esto para quee los nùmeros se pidan 
		//por teclado
		
		Scanner sc=new Scanner ( System.in);
		System.out.println("Introduce primer nùmero");
		int a=sc.nextInt();
		System.out.println("Introduce segundo nùmero");
		int b=sc.nextInt();
		
		
		//calcular la suma de todos los números comprendidos entre 
		//eso dos números
		
		int suma=0;
		int mayor = Math.max(a, b);   // a>b?a:b;
		int menor= Math.min (a,b); // a>b?b:a;
		
				for (int i=menor; i<=mayor; i++) {
					suma+=i;
							
				}

				System.out.println("La suma es: "+suma);
	}

}
