public class Nintendo3DS {
	// Clase Nintendo3DS
	
	    // Atributos de la Nintendo 3DS
	    private String color;
	    private boolean encendida;

	    // Constructor
	    public Nintendo3DS() {
	        this.color = "Rojo"; // Por defecto, color rojo
	        this.encendida = false; // Por defecto, la Nintendo 3DS está apagada
	    }

	    // Método para describir las características del Nintendo 3DS
	    public void describirCaracteristicas() {
	        System.out.println("Características del Nintendo 3DS:");
	        System.out.println("Color: " + this.color);
	        System.out.println("Pantalla: 3.53 pulgadas");
	        System.out.println("Procesador: ARM11 dual-core");
	        System.out.println("Memoria RAM: 128 MB");
	        System.out.println("Almacenamiento interno: 1 GB");
	        System.out.println("...");
	    }

	    // Métodos de la Nintendo 3DS
	    public void encender() {
	        System.out.println("Encendiendo la Nintendo 3DS...");
	        this.encendida = true;
	    }

	    public void apagar() {
	        System.out.println("Apagando la Nintendo 3DS...");
	        this.encendida = false;
	    }

	    public void jugar(String juego) {
	        if (encendida) {
	            System.out.println("Jugando " + juego + " en la Nintendo 3DS");
	            // Código para iniciar el juego especificado
	        } else {
	            System.out.println("No se puede jugar, la Nintendo 3DS está apagada.");
	        }
	    }
	}
