package structure;

public class Video {
    public String contenido;
    public String width;
    public String height;
    public String border;
    public String background_color;
    public String padding;
    public String opacity;

    public Video(String contenido, String width, String height, String border, String background_color, String padding, String opacity) {
        this.contenido = contenido;
        this.width = width;
        this.height = height;
        this.border = border;
        this.background_color = background_color;
        this.padding = padding;
        this.opacity = opacity;
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

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getBackground_color() {
        return background_color;
    }

    public void setBackground_color(String background_color) {
        this.background_color = background_color;
    }

    public String getPadding() {
        return padding;
    }

    public void setPadding(String padding) {
        this.padding = padding;
    }

    public String getOpacity() {
        return opacity;
    }

    public void setOpacity(String opacity) {
        this.opacity = opacity;
    }

    @Override
    public String toString() {
        return "Video{" +
                "contenido='" + contenido + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", border='" + border + '\'' +
                ", background_color='" + background_color + '\'' +
                ", padding='" + padding + '\'' +
                ", opacity='" + opacity + '\'' +
                '}';
    }
}
