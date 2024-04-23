package structure;

public class Title {
    public String contenido;

    public Title(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Title{" +
                "contenido='" + contenido + '\'' +
                '}';
    }
}
