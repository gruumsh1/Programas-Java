// Fragmento 4: Error en tiempo de ejecución
public class EjecucionError {
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;
        int resultado = numerador / denominador;
        System.out.println("Resultado: " + resultado);
    }
}