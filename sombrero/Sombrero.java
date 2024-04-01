package sombrero;

public class Sombrero {
    private String color;
    private String talla;
    private String modelo;
    private int idSombrero;

    // Constructor
    public Sombrero(int idSombrero, String modelo, String talla, String color) {
        this.idSombrero = idSombrero;
        this.modelo = modelo;
        this.talla = talla;
        this.color = color;
    }

    // Métodos 7
    public void Quitar() {
        System.out.println("El sombrero ha sido quitado de la cabeza de su dueño");
    }

    public void Poner() {
        System.out.println("El sombrero está puesto en la cabeza de su dueño");
    }

    public void Limpiar() {
        System.out.println("El sombrero ha sido limpiado");
    }

    public void Colgar() {
        System.out.println("El sombrero ha sido colgado");
    }

    // Método para mostrar información del sombrero
    public void mostrarInfo() {
        System.out.println("ID del Sombrero: " + idSombrero);
        System.out.println("Modelo: " + modelo);
        System.out.println("Talla: " + talla);
        System.out.println("Color: " + color);
    }
}
