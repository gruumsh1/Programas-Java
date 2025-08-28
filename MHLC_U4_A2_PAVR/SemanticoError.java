// Fragmento 2: Error semántico
public class SemanticoError { // se guarda el archivo bajo el mismo nombre que la clase
    public static void main(String[] args) {
        int edad = 20;// edad estaba declarada como una cadena de texto, se modifica a entero
        if (edad > 18) {
            System.out.println("Eres mayor de edad");
        }
    }
} 
