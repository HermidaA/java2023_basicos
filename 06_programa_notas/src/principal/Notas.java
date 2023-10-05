package principal;

public class Notas {

	public static void main(String[] args) {
		int nota = 6;

		        /*En funciòn de la nota muestra calificaciòn: 
		        Entre 1 y 4 : suspenso
				5 y 6: aprobado
				7 y 8: notable
				9 y 10: sobresaliente
				otro valor : nota no vàlido
				*/
		
		
			
			switch(nota) { 
			
			
			case  1,2,3,4:
			System.out.println("suspenso");
			break;
			
			case 5,6:
				System.out.println("aprobado");
			break;
			
			case 7,8:
				System.out.println("notable");
			break;
			
			case 9,10:
				System.out.println("sobresaliente");
			break;
			
			default:
				System.out.println("nota no valido");
			
		}
	}

