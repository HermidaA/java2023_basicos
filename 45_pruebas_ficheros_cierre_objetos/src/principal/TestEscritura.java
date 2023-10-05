package principal;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestEscritura {

	public static void main(String[] args) {
		
		try (PrintStream out=new PrintStream("c:\\temp\\dias.txt")){
			
			out.println("lunes");
			out.println("martes");
			out.println("miércoles");
			
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		

	}

}
