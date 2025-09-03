import java.util.Scanner; // Importa la clase Scanner del paquete java.util para leer desde teclado

// Declaración de la clase pública 'Vehiculo'.
// 'public' indica que la clase es accesible desde cualquier paquete.
// 'class' define una clase en Java.
// 'Vehiculo' es el nombre del tipo/clase y debe coincidir con el nombre del archivo: Vehiculo.java
public class Vehiculo {

    // Método principal que la JVM invoca al ejecutar 'java Vehiculo'.
    // 'public' -> acceso público, 'static' -> no requiere instancia,
    // 'void' -> no retorna valor, 'main' -> nombre estándar del punto de entrada,
    // 'String[] args' -> arreglo de cadenas con argumentos de línea de comandos.
    public static void main(String[] args) {

        // Crea una instancia de Scanner asociada a la entrada estándar (teclado).
        // 'Scanner' es el tipo; 'sc' es el identificador de la variable.
        // 'new' crea un nuevo objeto; 'Scanner(System.in)' invoca el constructor con System.in.
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la marca: "); // Muestra un mensaje sin salto de línea.
        String marca = sc.nextLine(); // Lee una línea completa y la asigna a 'marca'. Tipo: String.

        System.out.print("Ingrese el modelo: ");
        String modelo = sc.nextLine(); // Lee el modelo.

        System.out.print("Ingrese la cilindrada: ");
        String cilindrada = sc.nextLine(); // Lee la cilindrada (como texto).

        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = sc.nextLine(); // Lee el tipo de combustible.

        System.out.print("Ingrese la capacidad en pasajeros: ");
        int capacidad = sc.nextInt(); // Lee un entero y lo asigna a 'capacidad'.

        // Salidas formateadas que confirman los datos ingresados.
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

        sc.close(); // Cierra el Scanner para liberar el recurso.
    }
}
