
import java.util.Scanner;

public class CasaDeCambio {
    private static final double TIPO_CAMBIO_DOLAR_PESO = 16.79;
    private static final double TIPO_CAMBIO_PESO_DOLAR = 0.059;
    private static final double TIPO_CAMBIO_DOLAR_CANADIENSE_PESO = 12.44;
    private static final double TIPO_CAMBIO_PESO_DOLAR_CANADIENSE = 0.080;
    private static final double TIPO_CAMBIO_EURO_PESO = 18.35;
    private static final double TIPO_CAMBIO_PESO_EURO = 0.054;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    convertirDolarAPeso(scanner);
                    break;
                case 2:
                    convertirPesoADolar(scanner);
                    break;
                case 3:
                    convertirDolarCanadienseAPeso(scanner);
                    break;
                case 4:
                    convertirPesoADolarCanadiense(scanner);
                    break;
                case 5:
                    convertirEuroAPeso(scanner);
                    break;
                case 6:
                    convertirPesoAEuro(scanner);
                    break;
                case 0:
                	 System.out.println("-----------------------------------------------");
                    System.out.println("Gracias por utilizar nuestra casa de cambio.");
                    System.out.println("-----------------------------------------------");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor ingrese un número del 0 al 6.");
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nBienvenido a la Casa de Cambio");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Dólares estadounidenses a pesos mexicanos");
        System.out.println("2. Pesos mexicanos a dólares estadounidenses");
        System.out.println("3. Dólares canadienses a pesos mexicanos");
        System.out.println("4. Pesos mexicanos a dólares canadienses");
        System.out.println("5. Euros a pesos mexicanos");
        System.out.println("6. Pesos mexicanos a euros");
        System.out.println("0. Salir");
        System.out.println("-----------------------------------------------");
        System.out.print("Seleccione una opción: ");
        System.out.println("");
     
    }

    private static void convertirDolarAPeso(Scanner scanner) {
    	 System.out.println("-----------------------------------------------");
        System.out.println("Cambio de dólares estadounidenses a pesos mexicanos");

        System.out.println("-----------------------------------------------");
        System.out.print("Introduce la cantidad de dólares a cambiar: ");
        System.out.println("");
        double dolares = scanner.nextDouble();
        double pesos = dolares * TIPO_CAMBIO_DOLAR_PESO;
        System.out.println("------------------------------------------------5-----");
        System.out.printf("Debes entregar al cliente: $%.2f pesos mexicanos.\n", pesos);
        System.out.println("-----------------------------------------------------");
    }

    private static void convertirPesoADolar(Scanner scanner) {
    	 System.out.println("-----------------------------------------------");
        System.out.println("Cambio de pesos mexicanos a dólares estadounidenses");
        System.out.println("-----------------------------------------------");
        System.out.print("Introduce la cantidad de pesos a cambiar: ");
        System.out.println("");
        double pesos = scanner.nextDouble();
        double dolares = pesos * TIPO_CAMBIO_PESO_DOLAR;
        System.out.println("------------------------------------------------------");
        System.out.printf("Debes entregar al cliente: $%.2f dólares estadounidenses.\n", dolares);
        System.out.println("------------------------------------------------------");
    }
    

    private static void convertirDolarCanadienseAPeso(Scanner scanner) {
    	 System.out.println("-----------------------------------------------");
    	System.out.println("Cambio de dólares canadienses a pesos mexicanos");
    	 System.out.println("-----------------------------------------------");
        System.out.print("Introduce la cantidad de dólares canadienses a cambiar: ");
        System.out.println("");
        double dolaresCanadienses = scanner.nextDouble();
        double pesos = dolaresCanadienses * TIPO_CAMBIO_DOLAR_CANADIENSE_PESO;
        System.out.println("-----------------------------------------------------");
        System.out.printf("Debes entregar al cliente: $%.2f pesos mexicanos.\n", pesos);
        System.out.println("-----------------------------------------------------");
    }

    private static void convertirPesoADolarCanadiense(Scanner scanner) {
    	 System.out.println("-----------------------------------------------");
        System.out.println("Cambio de pesos mexicanos a dólares canadienses");
        System.out.println("-----------------------------------------------");
        System.out.print("Introduce la cantidad de pesos a cambiar: ");
        System.out.println("");
        double pesos = scanner.nextDouble();
        double dolaresCanadienses = pesos * TIPO_CAMBIO_PESO_DOLAR_CANADIENSE;
        System.out.println("-----------------------------------------------------");
        System.out.printf("Debes entregar al cliente: $%.2f dólares canadienses.\n", dolaresCanadienses);
        System.out.println("-----------------------------------------------------");
    }

    private static void convertirEuroAPeso(Scanner scanner) {
    	 System.out.println("-----------------------------------------------");
        System.out.println("Cambio de euros a pesos mexicanos");
        System.out.println("-----------------------------------------------");
        System.out.print("Introduce la cantidad de euros a cambiar: ");
        System.out.println("");
        double euros = scanner.nextDouble();
        double pesos = euros * TIPO_CAMBIO_EURO_PESO;
        System.out.println("-----------------------------------------------------");
        System.out.printf("Debes entregar al cliente: $%.2f pesos mexicanos.\n", pesos);
        System.out.println("-----------------------------------------------------");
    }

    private static void convertirPesoAEuro(Scanner scanner) {
    	 System.out.println("-----------------------------------------------");
        System.out.println("Cambio de pesos mexicanos a euros");
        System.out.println("-----------------------------------------------");
        System.out.print("Introduce la cantidad de pesos a cambiar: ");
        System.out.println("");
        double pesos = scanner.nextDouble();
        double euros = pesos * TIPO_CAMBIO_PESO_EURO;
        System.out.println("-----------------------------------------------------");
        System.out.printf("Debes entregar al cliente: €%.2f euros.\n", euros);
        System.out.println("-----------------------------------------------------");
    }
}
