import java.util.Scanner;

public class Promedio {
	public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                int num1, num2, num3;
                double suma, promedio;
                System.out.println("Ingrese el primer número: ");
                num1 = sc.nextInt();
                System.out.println("Ingrese el segundo número: ");
                num2 = sc.nextInt();
                System.out.println("Ingrese el tercer número: ");
                num3 = sc.nextInt();
                suma = num1 + num2 + num3;
                promedio = suma / 3.0; // Se divide por 3.0 para asegurar una división de tipo double
                System.out.println("La suma es: " + suma);
                System.out.println("El promedio es: " + promedio);
                
            }
	}
}
