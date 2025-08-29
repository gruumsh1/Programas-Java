import java.util.Scanner;

/**
 * Programa para analizar el rendimiento diario de empleados en una tienda OCSO.
 * Permite ingresar ventas de 1 a 3 empleados y muestra métricas clave.
 */
public class Promedios {
    public static void main(String[] args) {
        // a. Solicitar número de empleados (1 a 3) con validación
        try (Scanner sc = new Scanner(System.in)) {
            // a. Solicitar número de empleados (1 a 3) con validación
            int numEmpleados;
            do {
                System.out.print("Ingrese el número de empleados (1 a 3): ");
                while (!sc.hasNextInt()) {
                    System.out.print("Entrada inválida. Ingrese un número entero (1 a 3): ");
                    sc.next(); // Limpia la entrada incorrecta
                }
                numEmpleados = sc.nextInt();
            } while (numEmpleados < 1 || numEmpleados > 3);
            // Arreglo para almacenar las ventas
            double[] ventas = new double[numEmpleados];
            // b. Ingresar ventas individuales (valores reales no negativos)
            for (int i = 0; i < numEmpleados; i++) {
                do {
                    System.out.print("Ingrese la venta del empleado " + (i + 1) + " (valor ≥ 0): ");
                    while (!sc.hasNextDouble()) {
                        System.out.print("Error: debe ser un número. Intente de nuevo: ");
                        sc.next();
                    }
                    ventas[i] = sc.nextDouble();
                    if (ventas[i] < 0) {
                        System.out.println("La venta no puede ser negativa. Intente de nuevo.");
                    }
                } while (ventas[i] < 0);
            }   // c.i. Total de ventas del día
            double totalVentas = 0;
            for (double venta : ventas) {
                totalVentas += venta;
            }   // c.ii. Promedio de ventas por empleado
            double promedioVentas = totalVentas / numEmpleados;
            // c.iii. Empleado con mayor y menor venta
            int indiceMax = 0;
            int indiceMin = 0;
            for (int i = 1; i < numEmpleados; i++) {
                if (ventas[i] > ventas[indiceMax]) {
                    indiceMax = i;
                }
                if (ventas[i] < ventas[indiceMin]) {
                    indiceMin = i;
                }
            }   // c.iv. Contar empleados que superaron el promedio
            int superaronPromedio = 0;
            for (double venta : ventas) {
                if (venta > promedioVentas) {
                    superaronPromedio++;
                }
            }   // d. Mostrar resultados con claridad
            System.out.println("\n" + "=".repeat(45));
            System.out.println("           INFORME DE RENDIMIENTO DIARIO");
            System.out.println("=".repeat(45));
            for (int i = 0; i < numEmpleados; i++) {
                System.out.println("Empleado " + (i + 1) + ": $" + String.format("%.2f", ventas[i]));
            }   System.out.println("─".repeat(35));
            System.out.println("Total de ventas del día:       $" + String.format("%.2f", totalVentas));
            System.out.println("Promedio por empleado:         $" + String.format("%.2f", promedioVentas));
            System.out.println("Mejor vendedor: Empleado " + (indiceMax + 1) + " ($" + String.format("%.2f", ventas[indiceMax]) + ")");
            System.out.println("Peor vendedor: Empleado " + (indiceMin + 1) + " ($" + String.format("%.2f", ventas[indiceMin]) + ")");
            System.out.println("Empleados que superaron el promedio: " + superaronPromedio);
            System.out.println("=".repeat(45));
            // Cierra el scanner
        }
    }
} 
