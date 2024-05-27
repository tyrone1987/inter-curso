package ec.com.banco.internacional.archivos;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class mainFileLibrerias {

	public static void main(String[] args) {

		String pathArchivo = "C:\\Users\\Tyrone Lopez\\OneDrive\\Documentos\\GitHub\\inter-curso\\Archivos\\Prueba-archivos.txt";

		File f = new File(pathArchivo);
		// TODO Auto-generated method stub
		try {
			String content = FileUtils.readFileToString(f, "UTF-8");
			System.out.println(content);
			System.out.println();
			List<String> lineas = FileUtils.readLines(f, "UTF-8");
			for (String string : lineas) {
				System.out.println(string);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
