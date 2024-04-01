import java.util.Scanner;

public class CajeroEstacionamiento {
    
    private double costoPorHora = 17.00;
    private double costoMaximo = 999.00;
    
    public void procesarPago() {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar las horas utilizadas por el cliente
        System.out.print("Ingrese las horas utilizadas por el cliente: ");
        double horas = scanner.nextDouble();
        
        // Calcular el costo total
        double costoTotal = calcularCostoTotal(horas);
        System.out.println("Costo total a pagar: $" + costoTotal);
        
        // Procesar el pago
        double montoDepositado = 0;
        while (montoDepositado < costoTotal) {
            montoDepositado += solicitarPagoRestante(costoTotal - montoDepositado);
        }
        
        // Calcular y desplegar el cambio, si es necesario
        if (montoDepositado > costoTotal) {
            double cambio = montoDepositado - costoTotal;
            System.out.println("Cambio a devolver: $" + cambio);
            calcularCambio(cambio);
        }
        
        System.out.println("Gracias por utilizar el cajero automático del estacionamiento.");
        System.out.println("-----------------------------------------");
    }
    
    private double calcularCostoTotal(double horas) {
        return Math.min(horas * costoPorHora, costoMaximo);
    }
    
    private double solicitarPagoRestante(double montoRestante) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Monto restante a pagar: $" + montoRestante);
        System.out.println("Seleccione la moneda que está introduciendo:");
        System.out.println("1. $100.00");
        System.out.println("2. $50.00");
        System.out.println("3. $20.00");
        System.out.println("4. $10.00");
        System.out.println("5. $5.00");
        System.out.println("6. $2.00");
        System.out.println("7. $1.00");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                return 100.00;
            case 2:
                return 50.00;
            case 3:
                return 20.00;
            case 4:
                return 10.00;
            case 5:
                return 5.00;
            case 6:
                return 2.00;
            case 7:
                return 1.00;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                return 0;
        }
    }
    
    private void calcularCambio(double cambio) {
        int[] monedas = {10, 5, 2, 1};
        
        System.out.println("Cambio en monedas:");
        for (int moneda : monedas) {
            int cantidad = (int) (cambio / moneda);
            if (cantidad > 0) {
                System.out.println("$" + moneda + ": " + cantidad + " moneda(s)");
                cambio %= moneda;
            }
        }
    }
}
