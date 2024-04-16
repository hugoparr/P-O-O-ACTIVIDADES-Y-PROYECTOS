//Hugo Said Taviras Parra 
//MATRICULA:010609124

// Clase EstudiantesProgram
import java.util.Scanner;

public class EstudiantesProgram {
    // Arreglos para almacenar los datos de los estudiantes
    private static String[] nombres;
    private static int[] edades;
    private static char[] sexos;

    // Método para asignar valores manualmente a los arreglos
    public static void asignarValoresManualmente() {
        nombres = new String[]{"Juan", "María", "Pedro", "Ana"};
        edades = new int[]{20, 22, 19, 21};
        sexos = new char[]{'M', 'F', 'M', 'F'};
    }

    // Método para mostrar los datos almacenados
    public static void mostrarDatos() {
        System.out.println("Datos de los estudiantes:");
        System.out.println("Nombre\tEdad\tSexo");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + "\t" + edades[i] + "\t" + sexos[i]);
        }
        System.out.println();
    }

    // Método para llenar los arreglos desde la captura a través del teclado
    public static void llenarDesdeTeclado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos a capturar: ");
        int cantidadAlumnos = scanner.nextInt();

        nombres = new String[cantidadAlumnos];
        edades = new int[cantidadAlumnos];
        sexos = new char[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese los datos para el estudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = scanner.next();

            System.out.print("Edad: ");
            edades[i] = scanner.nextInt();

            System.out.print("Sexo (M/F): ");
            sexos[i] = scanner.next().charAt(0);
        }

        scanner.close();
    }
}