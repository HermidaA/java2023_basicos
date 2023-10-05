package principal;

public class MensajePrecio {

	public static void main(String[] args) {
		int precio=7;
		/*El programa comprueba el precio, si es 10 muestra
		 * un mensaje que dice"muy caro", si es 9
		 * el mensaje es "caro", si es 8 "aceptable", si
		 * es 7 "lo compro" , si es 6 "barato" , otro precio
		 * "no vàlido"
		 *
		 */
		
	switch (precio){
		case 10 :
			System.out.println("muy caro");
			break;
			
		case 9 :
		System.out.println("caro");
		break;
		
		case 8 :
			System.out.println("aceptable");
			break;
			
		case 7 :
			System.out.println("lo compro");
			break;
			
		case 6 :
			System.out.println("barato");
			break;
			
			default:
				System.out.println("Precio no vàlido");
	}
	}

}
