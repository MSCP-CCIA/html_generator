package grammar;

import structure.Image;
import structure.Text;
import structure.Title;
import structure.Video;

import java.io.IOException;
import java.util.*;
public class Grammar {
    public Map<String, List<List<String>>> reglasGramaticales = new HashMap<>();
    public Set<String> cadenasGeneradas = new HashSet<>();
    public Image image;
    public Text text;
    public Title title;
    public Video video;

    public Grammar(Image image, Text text, Title title, Video video) {
        this.image = image;
        this.text = text;
        this.title = title;
        this.video = video;
        this.reglasGramaticales = generateGrammar();
    }

    public Map<String, List<List<String>>> generateGrammar(){
        // Reglas de la gramática
        reglasGramaticales.put("S", Arrays.asList(
                Arrays.asList("DOCTYPE_HTML")
        ));

        reglasGramaticales.put("DOCTYPE_HTML", Arrays.asList(
                Arrays.asList("<!DOCTYPE html>","H")
        ));

        reglasGramaticales.put("H", Arrays.asList(
                Arrays.asList("<html lang=\"en\">", "Q", "</html>")
        ));

        reglasGramaticales.put("Q", Arrays.asList(
                Arrays.asList("<head>","<meta charset=\"UTF-8\">", "<title>", "T", "</title>", "</head>", "<body>", "B", "</body>")
        ));

        reglasGramaticales.put("T", Arrays.asList(
                Arrays.asList(title.getContenido())
        ));

        reglasGramaticales.put("B", Arrays.asList(
                Arrays.asList("ETIQUETA")
        ));

        reglasGramaticales.put("ETIQUETA", Arrays.asList(
                Arrays.asList("DIV"),
                Arrays.asList("P"),
                Arrays.asList("SPAN"),
                Arrays.asList("A"),
                Arrays.asList("IMG"),
                Arrays.asList("UL"),
                Arrays.asList("OL"),
                Arrays.asList("LI"),
                Arrays.asList("TABLE"),
                Arrays.asList("TR"),
                Arrays.asList("TD"),
                Arrays.asList("TH"),
                Arrays.asList("VIDEO"),
                Arrays.asList("H1"),
                Arrays.asList("H2"),
                Arrays.asList("H3"),
                Arrays.asList("H3"),
                Arrays.asList("H4"),
                Arrays.asList("H5")
        ));
        reglasGramaticales.put("DIV", Arrays.asList(
                Arrays.asList("<div>", "CONTENIDO","</div>")
        ));
        reglasGramaticales.put("P", Arrays.asList(
                Arrays.asList("<p>", "CONTENIDO","</p>")
        ));
        reglasGramaticales.put("SPAN", Arrays.asList(
                Arrays.asList("<span>", "CONTENIDO","</span>")
        ));
        reglasGramaticales.put("A", Arrays.asList(
                Arrays.asList("<a>", "CONTENIDO","</a>")
        ));
        reglasGramaticales.put("IMG", Arrays.asList(
                Arrays.asList("<img>", "CONTENIDO","</img>")
        ));
        reglasGramaticales.put("UL", Arrays.asList(
                Arrays.asList("<ul>", "CONTENIDO","</ul>")
        ));
        reglasGramaticales.put("OL", Arrays.asList(
                Arrays.asList("<ol>", "CONTENIDO","</ol>")
        ));
        reglasGramaticales.put("LI", Arrays.asList(
                Arrays.asList("<li>", "CONTENIDO","</li>")
        ));
        reglasGramaticales.put("TABLE", Arrays.asList(
                Arrays.asList("<table>", "CONTENIDO","</table>")
        ));
        reglasGramaticales.put("TR", Arrays.asList(
                Arrays.asList("<tr>", "CONTENIDO","</tr>")
        ));
        reglasGramaticales.put("TD", Arrays.asList(
                Arrays.asList("<td>", "CONTENIDO","</td>")
        ));
        reglasGramaticales.put("TH", Arrays.asList(
                Arrays.asList("<th>", "CONTENIDO","</th>")
        ));
        reglasGramaticales.put("VIDEO", Arrays.asList(
                Arrays.asList("<video","src=",video.getContenido(),">", "CONTENIDO","</video>")
        ));
        reglasGramaticales.put("H1", Arrays.asList(
                Arrays.asList("<h1>", "CONTENIDO","</h1>")
        ));
        reglasGramaticales.put("H2", Arrays.asList(
                Arrays.asList("<h2>", "CONTENIDO","</h2>")
        ));
        reglasGramaticales.put("H3", Arrays.asList(
                Arrays.asList("<h3>", "CONTENIDO","</h3>")
        ));
        reglasGramaticales.put("H4", Arrays.asList(
                Arrays.asList("<h4>", "CONTENIDO","</h4>")
        ));
        reglasGramaticales.put("H5", Arrays.asList(
                Arrays.asList("<h5>", "CONTENIDO","</h5>")
        ));
        reglasGramaticales.put("H6", Arrays.asList(
                Arrays.asList("<h6>", "CONTENIDO","</h6>")
        ));


        reglasGramaticales.put("CONTENIDO", Arrays.asList(
                Arrays.asList("ETIQUETA"),
                Arrays.asList("TEXTO")
        ));

        reglasGramaticales.put("TEXTO", Arrays.asList(
                Arrays.asList(text.getContenido())
        ));


        return reglasGramaticales;
    }
    public String stringGenerator(String symbol){
        if (symbol=="</html>") {
            return symbol;
        }
        List<List<String>> reglas = reglasGramaticales.get(symbol);
        List<String> regla = reglas.get(new Random().nextInt(reglas.size()));
        StringBuilder sb = new StringBuilder();
        for (String c : regla) {
            if (!reglasGramaticales.containsKey(c)) {
                sb.append(c);
            }
            else{
                sb.append(stringGenerator(c));
            }

        }
        return sb.toString();
    }

    public Map<String, List<List<String>>> getReglasGramaticales() {
        return reglasGramaticales;
    }

    public void setReglasGramaticales(Map<String, List<List<String>>> reglasGramaticales) {
        this.reglasGramaticales = reglasGramaticales;
    }

    public Set<String> getCadenasGeneradas() {
        return cadenasGeneradas;
    }

    public void setCadenasGeneradas(Set<String> cadenasGeneradas) {
        this.cadenasGeneradas = cadenasGeneradas;
    }

    @Override
    public String toString() {
        return "grammar{" +
                "reglasGramaticales=" + reglasGramaticales +
                ", cadenasGeneradas=" + cadenasGeneradas +
                '}';
    }
}
