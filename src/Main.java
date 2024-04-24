import grammar.Grammar;
import structure.Image;
import structure.Text;
import structure.Title;
import structure.Video;

import java.io.IOException;
import java.util.Arrays;

import static fileConverter.fileConverter.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePathText = "\\Users\\cracm\\IdeaProjects\\html_generator\\src\\metaData\\texts\\text1.txt"; // Ruta del archivo de texto
        String filePathImage = "\\Users\\cracm\\IdeaProjects\\html_generator\\src\\metaData\\images\\image1.txt";
        String filePathTitle = "\\Users\\cracm\\IdeaProjects\\html_generator\\src\\metaData\\titles\\title1.txt";
        String filePathVideo = "\\Users\\cracm\\IdeaProjects\\html_generator\\src\\metaData\\videos\\video1.txt";
        // Intentar leer el archivo y crear el objeto text

        Text text = crearTextoDesdeArchivo(filePathText);
        System.out.println("Objeto text creado con éxito:");
        System.out.println(text);
        Image image = crearImagenDesdeArchivo(filePathImage);
        System.out.println("Objeto image creado con éxito:");
        System.out.println(image);
        Title title = crearTituloDesdeArchivo(filePathTitle);
        System.out.println("Objeto titulo creado con éxito:");
        System.out.println(title);
        Video video = crearVideoDesdeArchivo(filePathVideo);
        System.out.println("Objeto video creado con éxito:");
        System.out.println(video);

        Grammar grammar = new Grammar(image,text,title,video);
        System.out.println(grammar.stringGenerator("S"));
    }
}