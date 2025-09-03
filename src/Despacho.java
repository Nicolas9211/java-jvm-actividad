import java.util.Scanner; // Importa Scanner para leer desde teclado

// Clase pública 'Despacho' que modela el cálculo de despacho según reglas de negocio.
// Debe guardarse en un archivo llamado Despacho.java para que 'javac' lo compile correctamente.
public class Despacho {

    // Punto de entrada del programa (método main) invocado por la JVM al ejecutar 'java Despacho'.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Crea un lector de entrada estándar (teclado).

        // Solicita el total de la compra (entero).
        System.out.print("Ingrese el total de la compra en pesos (entero): ");
        int totalCompra = sc.nextInt(); // Lee el monto de la compra como entero.

        // Solicita la distancia al domicilio (entero).
        System.out.print("Ingrese la distancia al domicilio en km (entero): ");
        int distanciaKm = sc.nextInt(); // Lee la distancia en kilómetros como entero.

        // Define constantes de reglas del negocio.
        final int RADIO_MAX_KM = 20;           // Radio máximo del servicio en kilómetros.
        final int UMBRAL_ENVIO_GRATIS = 50000; // Compras sobre 50.000 pesos (>= 50.000 asume gratis en el radio).
        final int UMBRAL_TARIFA_MEDIA_MIN = 25000;  // Límite inferior del tramo medio.
        final int UMBRAL_TARIFA_MEDIA_MAX = 49999;  // Límite superior del tramo medio (inclusive).
        final int TARIFA_MEDIA = 150;          // $150 por km para el tramo [25.000, 49.999].
        final int TARIFA_BAJA = 300;           // $300 por km para compras bajo 25.000.

        // Variable para almacenar el costo de despacho calculado.
        int costoDespacho = 0; // Inicializa el costo de despacho en 0.

        // Verifica cobertura por distancia antes de calcular.
        if (distanciaKm > RADIO_MAX_KM) { // Si la distancia supera el radio máximo...
            System.out.println("\nFuera de cobertura: el servicio de despacho opera hasta " + RADIO_MAX_KM + " km.");
            // En este caso no se calcula costo porque no hay servicio disponible.
        } else {
            // Aplica reglas:
            if (totalCompra >= UMBRAL_ENVIO_GRATIS) { // Compras de 50.000 o más dentro del radio.
                costoDespacho = 0; // Envío gratis dentro del radio permitido.
            } else if (totalCompra >= UMBRAL_TARIFA_MEDIA_MIN && totalCompra <= UMBRAL_TARIFA_MEDIA_MAX) {
                // Compras entre 25.000 y 49.999 (inclusive): $150 por km.
                costoDespacho = TARIFA_MEDIA * distanciaKm; // Multiplica tarifa por la distancia.
            } else {
                // Compras menores a 25.000: $300 por km.
                costoDespacho = TARIFA_BAJA * distanciaKm; // Multiplica tarifa por la distancia.
            }

            // Muestra resumen del cálculo.
            System.out.println("\n=== Resumen de Despacho ===");
            System.out.println("Total de compra: $" + totalCompra);
            System.out.println("Distancia: " + distanciaKm + " km");
            System.out.println("Costo de despacho: $" + costoDespacho);
            System.out.println("Total a pagar (compra + despacho): $" + (totalCompra + costoDespacho));
        }

        sc.close(); // Cierra el Scanner para liberar recursos.
    }
}
