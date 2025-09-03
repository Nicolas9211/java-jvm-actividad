import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad (entero): ");
        int edad = sc.nextInt();

        System.out.println("\nNombre: " + nombre);
        System.out.println("Edad: " + edad);

        sc.close();
    }
}