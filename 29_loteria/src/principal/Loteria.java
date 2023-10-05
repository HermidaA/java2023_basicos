package principal;

public class Loteria {

	public static void main(String[] args) {
		// generar combinación loteria primitiva
		// mientras haya menos de 6 números generados,
		// generamos un número y comprobamos que no se haya generado antes (repetido)
		// en caso, lo guardamos y sino vamos por el siguiente 
		
		/////////variables
		
		int [] combinacion= new int [6];
		int generados = 0;
		while(generados<6) {
				int n = (int)(Math.random()*49+1);
				if (!repetido(combinacion,n,generados)) {
					combinacion [generados]=n;
					generados++; // incrementamos la variable al haber generado un nuevo número
					
				}
				
		}
		
		ordenar(combinacion);
		mostrar(combinacion);
		
	}
	
	static boolean repetido (int[] numeros, int num, int total) {
		/*boolean res=false;
		for(int i=0;i<total;i++) {
			if(numeros[i]==num) {
				res=true;
				break;
				}
		}
		
		return res;*/
		
		//otra forma:
		for(int i=0;i<total;i++) {
			if(numeros[i]==num) {
				return true;
			}
		}
		
		return false;
	
		}


	static void ordenar (int[] numero) {
		int aux;
		for(int i=0;i<numeros.length;i++) {
			for(int j=i+1;j<numeros.length;j++) {
				if (numeros[j]<numeros[i]) {//sustitución
					aux=numeros [j];
						numeros [j]=numeros[i];
						numeros [i]=aux;
				}
			}
		}
	}
		static void mostrar (int[] numeros) {
			for (int n:numeros) {
				System.out.println(n+",");
			}
		}
}

