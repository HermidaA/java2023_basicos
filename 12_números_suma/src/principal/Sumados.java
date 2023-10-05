package principal;

public class Sumados {

	public static void main(String[] args) {
		//¿Cuántos números, empezando por 1, tenemos que sumar
		//hasta alcanzar o superar 1000?

		int suma=0;
		var n=0;
		while(suma<1000) {
			n++;
			suma+=n;
		}
				
		System.out.println("Hay que sumar hasta: "+n);			
				}
	}


