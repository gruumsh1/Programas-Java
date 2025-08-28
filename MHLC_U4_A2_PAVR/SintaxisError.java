// Fragmento 1: Error sintáctico
public class SintaxisError { // se guarda el archivo bajo el mismo nombre que la clase
    public static void main(String[] args) {
        int numero = 10; // faltaba ; 
        System.out.println("El número es: " + numero); //se agrega parentesis que faltaba
    }
} 