package principal;

import java.util.HashMap;

public class AgendaContactos {

	public static void main(String[] args) {
		

		/*Un contacto tiene como valor el nombre y clave su email.
		//1.- Se pide el nombre y el email. Si no existe un contacto
		//con ese email, se guarda, si ya existe, mensaje de error
		//2.- Se pide el email del contacto y se muestra el nombre
		//correspondiente. Si no hay contacto con ese email, mensaje
		//3.-Se pide el email y se elimina el contacto. Si no existe, mensaje
		//4. Muestra todos los nombres de contactos*/
		
		HashMap<String,String> agenda=new HashMap<String,String>();
		
			public boolean agregar(String email,String nombre) {
		
			//Si el email no esta, añadimos contacto
			//y devolvemos true
			if (agenda.containsKey(email)) {
				agenda.put(email, nombre);
				return true;
			}
			
			return false;
			
		}
			
			public boolean eliminar(String email,String nombre) {
				//Si el email esta, aparece mensaje de error
				//y devolvemos false
				if (agenda.containsKey(email)) {
					agenda.put(email, nombre);
					return true;
				}
				
				return false;
			}
			
			public String buscar(String email) {
				//a partir de la clave, devuelve el nombre,
				//si no existiera, devuelve directamente null
				return agenda.get(email);
				
			}
					
			public String[] nombre( ) {
				String[] datos=new String [agenda.size()];
				var nombres=agenda.values();
				int cont=0;
				for(String n:nombre) {
					datos[cont]=n;
					cont++;
				}
				return datos;
			
			}
			
			public String []name() {
				return agenda.values().toArrays(new String[0]);
				
				
			}
	
	
			
}
}
