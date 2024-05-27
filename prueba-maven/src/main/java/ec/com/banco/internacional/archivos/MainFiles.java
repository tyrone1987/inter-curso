package ec.com.banco.internacional.archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class MainFiles {

	public static void main(String[] args) {
		try {
			String pathArchivo = "C:\\Users\\Tyrone Lopez\\OneDrive\\Documentos\\GitHub\\inter-curso\\Archivos\\Prueba-archivos.txt";
			// TODO Auto-generated method stub
			File f = new File(pathArchivo);

			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			// f.delete();
			if (!f.exists()) {
				System.out.println("No existe lo creamos");
				f.createNewFile();
			} else {
				System.out.println("Si existe ");

			}
			String textoArchivo = "Este texto sirve para el curso \n\"DEL banco Inter\" \n";
			//escribir(f, textoArchivo);
			leer(f);
			String path = "C:\\Users\\Tyrone Lopez\\OneDrive\\Documentos\\GitHub\\inter-curso\\Archivos";
			File dir = new File(path);
			if(dir.isDirectory()) {
				File[] files = dir.listFiles();
				for (File file : files) {
					System.out.println("El archivo del directorio es: " + file.getName());
					System.out.println("De la carepta: " + dir.getAbsolutePath());
					escribir(file, textoArchivo);
					//leer(file);
				}
			}
			
			for (int i = 1; i < 100; i++) {
				path = path + File.separator + i;
				//System.out.println(path);
				File newdir = new File(path);
				newdir.mkdir();
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void escribir(File f, String texto) throws Exception {
		FileWriter fileWriter = new FileWriter(f, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(texto);
		bufferedWriter.close();
		fileWriter.close();

	}

	public static void leer(File f) throws Exception {
		FileReader fileReader = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		List<String> lista;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
			String[] valores = line.split(",");
			System.out.println("Cuenta nro" + valores[0]);
			System.out.println("Valor nro" + valores[1]);
		}
		bufferedReader.close();
		fileReader.close();
		
	}

}
