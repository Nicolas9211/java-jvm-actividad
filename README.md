# Proyecto: JVM + Compilación con `javac` (sin IDE)

Este repositorio documenta **todo el proceso** desde la elaboración del código fuente hasta la ejecución en la **JVM**, usando `javac` y `java` desde terminal, según la guía de actividad.

## 1) Requerimientos

### Funcionales
- Registrar datos del vehículo (marca, modelo, cilindrada, combustible, capacidad).
- Leer datos por teclado usando `Scanner` y mostrar resultados por consola.
- Compilar con `javac` y ejecutar con `java` sin usar IDE.
- Documentar cada paso en este repositorio (código, compilación, ejecución, cronograma).
- Mantener un registro de cambios y decisiones de diseño.

### No Funcionales
- Portabilidad (JDK/JVM multiplataforma).
- Simplicidad y legibilidad del código (estilo claro y comentarios).
- Tiempos de respuesta inmediatos en ejecución de consola.
- Organización del repositorio (carpetas, README, docs).
- Uso de GitHub Projects para el cronograma.

## 2) Prerrequisitos
- **JDK 8+** instalado y agregado al `PATH`.
- Consola/terminal (cmd/PowerShell en Windows, bash en Linux/macOS).

## 3) Estructura
```
.
├── src/
│   └── Vehiculo.java
├── docs/
│   ├── PROCESS_LOG.md
│   ├── USER_STORIES.md
│   └── PROJECT_PLAN.md
├── .gitignore
└── README.md
```

## 4) Compilación y ejecución (sin IDE)
```bash
# Ubicarse en la carpeta del proyecto
cd src

# Compilar (genera Vehiculo.class)
javac Vehiculo.java

# Ejecutar con la JVM
java Vehiculo
```

## 5) Notas de documentación
- Cada **línea de código** está comentada en `src/Vehiculo.java`.
- El **seguimiento del proceso** está en `docs/PROCESS_LOG.md`.
- Las **historias de usuario** y criterios de aceptación en `docs/USER_STORIES.md`.
- El **cronograma** está en `docs/PROJECT_PLAN.md`. Mantenerlo actualizado.


---

## 6) Caso de Estudio: Cálculo de Despacho

Reglas implementadas en `Despacho.java`:
- **Envío gratis** para compras **>= 50.000** dentro de **20 km**.
- Compras entre **25.000 y 49.999**: tarifa **$150** por km.
- Compras **< 25.000**: tarifa **$300** por km.
- Si la **distancia > 20 km**, se informa **fuera de cobertura** (según radio del servicio).

### Compilar y ejecutar
```bash
cd src
javac Despacho.java
java Despacho
```

### Ejemplo de uso (interactivo)
```
Ingrese el total de la compra en pesos (entero): 48000
Ingrese la distancia al domicilio en km (entero): 10

=== Resumen de Despacho ===
Total de compra: $48000
Distancia: 10 km
Costo de despacho: $1500
Total a pagar (compra + despacho): $49500
```
