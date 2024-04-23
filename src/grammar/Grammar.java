package grammar;

import java.io.IOException;
import java.util.*;
public class Grammar {
    public Map<String, List<List<String>>> reglasGramaticales = new HashMap<>();
    public Set<String> cadenasGeneradas = new HashSet<>();

    public Grammar() {
        this.reglasGramaticales = generateGrammar();
    }
    public Map<String, List<List<String>>> generateGrammar(){
        // Reglas de la gramática
        reglasGramaticales.put("P", Arrays.asList(
                Arrays.asList("DOCTYPE_HTML")
        ));

        reglasGramaticales.put("DOCTYPE_HTML", Arrays.asList(
                Arrays.asList("<!DOCTYPE html>","H")
        ));

        reglasGramaticales.put("H", Arrays.asList(
                Arrays.asList("<html>", "Q", "</html>")
        ));

        reglasGramaticales.put("Q", Arrays.asList(
                Arrays.asList("<head>", "<title>", "T", "</title>", "</head>", "S", "<body>", "B", "</body>", "S")
        ));

        reglasGramaticales.put("T", Arrays.asList(
                Arrays.asList("_titulo"),
                Arrays.asList() // λ (producción vacía)
        ));

        reglasGramaticales.put("B", Arrays.asList(
                Arrays.asList("ETIQUETA"),
                Arrays.asList() // λ (producción vacía)
        ));

        reglasGramaticales.put("ETIQUETA", Arrays.asList(
                Arrays.asList("<", "NOMBRETAG", ">", "CONTENIDO", "</", "NOMBRETAG", ">")
        ));

        reglasGramaticales.put("NOMBRETAG", Arrays.asList(
                Arrays.asList("html"),
                Arrays.asList("head"),
                Arrays.asList("title"),
                Arrays.asList("body"),
                Arrays.asList("div"),
                Arrays.asList("p"),
                Arrays.asList("span"),
                Arrays.asList("a"),
                Arrays.asList("img"),
                Arrays.asList("ul"),
                Arrays.asList("ol"),
                Arrays.asList("li"),
                Arrays.asList("table"),
                Arrays.asList("tr"),
                Arrays.asList("td"),
                Arrays.asList("th"),
                Arrays.asList("form"),
                Arrays.asList("input"),
                Arrays.asList("button"),
                Arrays.asList("textarea"),
                Arrays.asList("label"),
                Arrays.asList("select"),
                Arrays.asList("option")
        ));

        reglasGramaticales.put("CONTENIDO", Arrays.asList(
                Arrays.asList("ETIQUETA"),
                Arrays.asList("TEXTO")
        ));

        reglasGramaticales.put("TEXTO", Arrays.asList(
                Arrays.asList("texto"),
                Arrays.asList() // λ (producción vacía)
        ));

        reglasGramaticales.put("S", Arrays.asList(
                Arrays.asList(), // λ (producción vacía)
                Arrays.asList("S")
        ));
        return reglasGramaticales;
    }
    public String stringGenerator(String symbol){
        if (symbol=="</html>") {
            return String.valueOf(symbol);
        }
        List<List<String>> reglas = reglasGramaticales.get(symbol);
        System.out.println(reglas.toString());
        List<String> regla = reglas.get(new Random().nextInt(reglas.size()));
        System.out.println(regla.toString());
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
