# Historias de Usuario (USER_STORIES)

## HU-01: Ingreso de datos de vehículo
**Como** usuario
**quiero** ingresar marca, modelo, cilindrada, combustible y capacidad
**para** que el sistema me muestre la información ingresada.

**Criterios de aceptación**
- Se solicitan 5 datos por consola.
- El sistema muestra exactamente los valores ingresados.
- No se cierra hasta imprimir todas las salidas.

## HU-02: Compilación y ejecución sin IDE
**Como** desarrollador
**quiero** compilar con `javac` y ejecutar con `java`
**para** probar el programa en la JVM sin herramientas gráficas.

**Criterios de aceptación**
- `javac Vehiculo.java` genera `Vehiculo.class` sin errores.
- `java Vehiculo` ejecuta el `main` y permite ingreso por teclado.

## HU-03: Documentación exhaustiva
**Como** docente evaluador
**quiero** revisar documentación del proceso y del código
**para** verificar que se cumplió la consigna.

**Criterios de aceptación**
- README con requerimientos, pasos y estructura.
- Comentarios en todas las líneas del código.
- Registro del proceso y cronograma actualizado.


## HU-04: Cálculo automático de despacho
**Como** cliente de la distribuidora
**quiero** que el sistema calcule el costo de despacho según el total y la distancia
**para** conocer el total a pagar de manera transparente.

**Criterios de aceptación**
- Si total >= 50.000 y distancia <= 20 km → costo $0 (gratis).
- Si 25.000 <= total <= 49.999 y distancia <= 20 km → costo = 150 * km.
- Si total < 25.000 y distancia <= 20 km → costo = 300 * km.
- Si distancia > 20 km → informar fuera de cobertura.
