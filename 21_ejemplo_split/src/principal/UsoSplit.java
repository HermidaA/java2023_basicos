package principal;

public class UsoSplit {

	public static void main(String[] args) {
		String datos="Lunes,Sabado,Martes,Miércoles,Jueves";
		
		String[]dias=datos.split(",");
		System.out.println(dias.length);

	}

}