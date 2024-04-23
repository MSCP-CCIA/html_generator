package structure;

public class image {
    public String contenido;
    public String width;
    public String height;
    public String margin;
    public String padding;
    public String border;
    public String display;

    public image(String contenido, String width, String height, String margin, String padding, String border, String display) {
        this.contenido = contenido;
        this.width = width;
        this.height = height;
        this.margin = margin;
        this.padding = padding;
        this.border = border;
        this.display = display;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMargin() {
        return margin;
    }

    public void setMargin(String margin) {
        this.margin = margin;
    }

    public String getPadding() {
        return padding;
    }

    public void setPadding(String padding) {
        this.padding = padding;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
