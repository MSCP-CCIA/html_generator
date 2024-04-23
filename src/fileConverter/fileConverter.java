package fileConverter;
import structure.Image;
import structure.Text;
import structure.Title;
import structure.Video;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
public class fileConverter {
    public static Text crearTextoDesdeArchivo(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        HashMap<String, String> datos = new HashMap<>();
        while ((line = reader.readLine()) != null) {
            String[] partes = line.split(":");
            datos.put(partes[0].trim(), partes[1].trim());
        }
        reader.close();
        return new Text(datos.get("contenido"), datos.get("color"), datos.get("font_size"), datos.get("text_align"),
                datos.get("font_style"), datos.get("margin"), datos.get("padding"), datos.get("background"));
    }
    public static Image crearImagenDesdeArchivo(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        HashMap<String, String> datos = new HashMap<>();
        while ((line = reader.readLine()) != null) {
            String[] partes = line.split(":");
            datos.put(partes[0].trim(), partes[1].trim());
        }
        reader.close();
        return new Image(datos.get("contenido"), datos.get("width"), datos.get("height"),
                datos.get("margin"), datos.get("padding"), datos.get("border"), datos.get("display"));
    }
    public static Title crearTituloDesdeArchivo(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        HashMap<String, String> datos = new HashMap<>();
        while ((line = reader.readLine()) != null) {
            String[] partes = line.split(":");
            datos.put(partes[0].trim(), partes[1].trim());
        }
        reader.close();
        return new Title(datos.get("contenido"));
    }
    public static Video crearVideoDesdeArchivo(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        HashMap<String, String> datos = new HashMap<>();
        while ((line = reader.readLine()) != null) {
            String[] partes = line.split(":");
            datos.put(partes[0].trim(), partes[1].trim());
        }
        reader.close();
        return new Video(datos.get("contenido"), datos.get("width"), datos.get("height"),
                datos.get("border"), datos.get("background_color"), datos.get("padding"), datos.get("opacity"));
    }
}
