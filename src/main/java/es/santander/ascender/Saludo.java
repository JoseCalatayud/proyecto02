package es.santander.ascender;

public class Saludo {
    private String nombre;

    public Saludo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String saludar(String nombre) {
        String saludo = "Buenos dias " + this.nombre;
        return saludo;
    }
}
