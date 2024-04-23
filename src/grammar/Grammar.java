package grammar;

import java.io.IOException;
import java.util.*;
public class Grammar {
    public Map<String, List<String>> reglasGramaticales = new HashMap<>();
    public Set<String> cadenasGeneradas = new HashSet<>();

    public Grammar() {
        this.reglasGramaticales = generateGrammar();
    }
    public Map<String, List<String>> generateGrammar(){
        reglasGramaticales.put("P", Arrays.asList("DOCTYPE_HTML"));
        reglasGramaticales.put("DOCTYPE_HTML", Arrays.asList("<!DOCTYPE html>"));
        reglasGramaticales.put("H", Arrays.asList("<html> Q </html>"));
        reglasGramaticales.put("Q", Arrays.asList("<head> <title> T </title> </head> S <body> B </body> S"));
        reglasGramaticales.put("T", Arrays.asList("_titulo", ""));
        reglasGramaticales.put("B", Arrays.asList("ETIQUETA", ""));
        reglasGramaticales.put("ETIQUETA", Arrays.asList("< NOMBRETAG > CONTENIDO </ NOMBRETAG >"));
        reglasGramaticales.put("NOMBRETAG", Arrays.asList("html", "head", "title", "body", "div", "p", "span", "a", "img", "ul", "ol", "li", "table", "tr", "td", "th", "form", "input", "button", "textarea", "label", "select", "option"));
        reglasGramaticales.put("CONTENIDO", Arrays.asList("ETIQUETA", "TEXTO"));
        reglasGramaticales.put("TEXTO", Arrays.asList("texto", ""));
        reglasGramaticales.put("S", Arrays.asList("", "S"));
        return reglasGramaticales;
    }
    public String stringGenerator(){

        return null;
    }
    public Map<String, List<String>> getReglasGramaticales() {
        return reglasGramaticales;
    }

    public void setReglasGramaticales(Map<String, List<String>> reglasGramaticales) {
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
