// Fragmento 3: Error lógico
public class LogicoError {// se guarda el archivo bajo el mismo nombre que la clase
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            suma = suma + i ; //las iteraciones de la suma se estaban multiplicando por 2
        }
        System.out.println("La suma de los primeros 5 números es: " + suma);// el resultado de la suma estaba siendo multiplicada por 2
    }
}