package principal;

public class Notas {

	public static void main(String[] args) {
		opcion=sc.nextlnt();//lee la opción elegida
		switch(opcion) {//evaluamos
		
		case 1:
			System.out.println("Introduce nota");
			notas.add(sc.nextDouble ());
			break;
		
		case 2:
			System.out.println("Introduce posicion");
			notas.remove(sc.nextInt ());
			break;
			
		case 3: System.out.println("La nota media es : " +media(notas));	
			break;
			
		case 4;
			System.out.println();

		case 5;
		System.out.println("Adios");
		
		}while(opcion!=5);
		
	}
	static void mostrarMenu() {
		System.out.println("1. Añadir nota");
		System.out.println("2. Eliminar nota por posicion");
		System.out.println("3. Nota media");
		System.out.println("4. Total de aprobados");
		System.out.println("5. Salir");
		
	}

		static double

	}

	}
}
