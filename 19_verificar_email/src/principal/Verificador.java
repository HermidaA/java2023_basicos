package principal;

import java.util.Scanner;

public class Verificador {

	public static void main(String[] args) {
		// Realizar un programa que solicite la introducción 
		// de una dirección de email y nos indique si es o no válida
		// dirección validad: contiene al menos un punto y una @

		

		Scanner sc=new Scanner (System.in);
		String email;
		sc.close(); //cierra scaner

		System.out.println("Introduce una email");
		email=sc.nexByte();
		sc.close();

		int posarroba=email.indexOf("@");
		int pospunto=email.indexOf(".");
				
				//solución alternativa
				
			if (email.contains ("@") && email.contains(".")) {
					System.out.println("Dirección válidad");
					
			}else { System.out.println( "Dirección no válida");
			}
				
				
			}
		
		
	}
		
		
	


