package principal;

public class Verificar_Datos {

	public static void main(String[] args) {
		//prueba para github
		String cursos="Ofimática,Java básico,JavaEE,Spring Boot,Angular,Programación avanzada en Java";
		
		
		
		String [] nombres = cursos.split (",");
		int contador =0;
		for (String n:nombres) {
			
		if(n.contains("Java")) {
				contador++;
			}
		}
		System.out.println("Cursos de Java: "+contador);

	}

}
