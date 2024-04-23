package fileConverter;

import structure.Text;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class fileConverter {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\cracm\\IdeaProjects\\html_generator\\src\\metaData\\texts\\text1.txt"; // Ruta del archivo de texto

        // Intentar leer el archivo y crear el objeto text
        try {
            Text text = crearTextoDesdeArchivo(filePath);
            System.out.println("Objeto text creado con éxito:");
            System.out.println(text);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static Text crearTextoDesdeArchivo(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        HashMap<String, String> datos = new HashMap<>();

        // Leer cada línea del archivo y guardar los datos en el HashMap
        while ((line = reader.readLine()) != null) {
            String[] partes = line.split(":");
            datos.put(partes[0].trim(), partes[1].trim());
        }
        reader.close();

        // Crear el objeto text con los datos del HashMap
        return new Text(datos.get("contenido"), datos.get("font_size"), datos.get("text_align"),
                datos.get("font_style"), datos.get("margin"), datos.get("padding"), datos.get("background"));
    }
}
