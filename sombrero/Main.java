package sombrero;

public class Main {
    public static void main(String[] args) {
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
