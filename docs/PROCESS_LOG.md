# Registro del Proceso (PROCESS_LOG)

Fecha de inicio: 2025-09-02

## Etapas
1. **Configuración del entorno**: Instalación/validación de JDK y variables de entorno.
2. **Inicialización del repositorio**: `git init`, creación de ramas, primer commit.
3. **Creación del código fuente**: `src/Vehiculo.java` con lectura por teclado y salidas.
4. **Compilación**: `javac Vehiculo.java` — verificación de `Vehiculo.class` generado.
5. **Ejecución**: `java Vehiculo` — ingreso de datos y salida por consola.
6. **Documentación**: README, comentarios línea a línea, historias de usuario, cronograma.
7. **Publicación**: Push a GitHub, creación de **Project** (tablero Kanban) y tareas.
8. **Ajustes**: Registro de mejoras/correcciones con fecha y motivo.

## Comandos útiles
```bash
git init
git add .
git commit -m "Inicializa proyecto JVM + javac sin IDE"
git branch -M main
git remote add origin https://github.com/USUARIO/java-jvm-actividad.git
git push -u origin main
```


### 2025-09-02 – Implementación del caso de estudio
- Agregado `src/Despacho.java` con cálculo de despacho según reglas.
- Actualizado `README.md` con instrucciones y ejemplo.
- Añadida HU-04 en `docs/USER_STORIES.md`.
