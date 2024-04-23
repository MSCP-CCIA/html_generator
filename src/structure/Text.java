package structure;

public class Text {
    public String contenido;
    public String color;
    public String font_size;
    public String text_align;
    public String font_style;
    public String margin;
    public String padding;
    public String background;
    public Text(String contenido, String color, String font_size, String text_align, String font_style, String margin, String padding, String background) {
        this.contenido = contenido;
        this.color = color;
        this.font_size = font_size;
        this.text_align = text_align;
        this.font_style = font_style;
        this.margin = margin;
        this.padding = padding;
        this.background = background;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFont_size() {
        return font_size;
    }

    public void setFont_size(String font_size) {
        this.font_size = font_size;
    }

    public String getText_align() {
        return text_align;
    }

    public void setText_align(String text_align) {
        this.text_align = text_align;
    }

    public String getFont_style() {
        return font_style;
    }

    public void setFont_style(String font_style) {
        this.font_style = font_style;
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

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    @Override
    public String toString() {
        return "Text{" +
                "contenido='" + contenido + '\'' +
                ", color='" + color + '\'' +
                ", font_size='" + font_size + '\'' +
                ", text_align='" + text_align + '\'' +
                ", font_style='" + font_style + '\'' +
                ", margin='" + margin + '\'' +
                ", padding='" + padding + '\'' +
                ", background='" + background + '\'' +
                '}';
    }
}
