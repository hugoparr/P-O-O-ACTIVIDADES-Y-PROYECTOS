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

    // Métodos
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

    public static void main(String[] args) {
        // Creando objetos sombrero
        Sombrero sombrero1 = new Sombrero(2235, "Texano", "6", "Negro");
        Sombrero sombrero2 = new Sombrero(2236, "Vaquero", "7", "Marrón");
        Sombrero sombrero3 = new Sombrero(2237, "Fedora", "5", "Gris");

        // Mostrando información de cada sombrero
        sombrero1.mostrarInfo();
        System.out.println("-----------------------------------");
        sombrero2.mostrarInfo();
        System.out.println("-----------------------------------");
        sombrero3.mostrarInfo();
        System.out.println("-----------------------------------");

        // Ejecutando acciones con los sombreros
        sombrero1.Poner();
        sombrero2.Colgar();
        sombrero3.Limpiar();
        sombrero1.Quitar();
    }
	
}
