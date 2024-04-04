public class Main {
    public static void main(String[] args) {
        CajeroEstacionamiento cajero = new CajeroEstacionamiento();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        char continuar;
        do {
            cajero.procesarPago();
            System.out.print("¿Desea realizar otro pago? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
        
        System.out.println("Gracias por utilizar el cajero automático del estacionamiento.");
    }
}
