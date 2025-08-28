// Fragmento 4: Error en tiempo de ejecución
public class EjecucionError {// se guarda el archivo bajo el mismo nombre que la clase
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 1; // se produce un error al momento de efectuar la division por que el denominador era 0
        int resultado = numerador / denominador;
        System.out.println("Resultado: " + resultado);
    }
} 