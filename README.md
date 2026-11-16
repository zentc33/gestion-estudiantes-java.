# Gestión de Estudiantes en Java

Aplicación simple en Java para la Actividad formativa 2: Desarrollo de una
Aplicación Simple en Línea.

## ¿Qué hace?

Guarda estudiantes en una lista y permite agregarlos, buscarlos por
matrícula, eliminarlos, ver sus datos y calcular el promedio general del
grupo.

## Clases

- **Estudiante**: tiene matrícula, nombre, carrera y promedio. Tiene
  constructor, getters y setters, y los métodos `estaAprobado()` y
  `mostrarDatos()`.
- **GestorEstudiantes**: guarda la lista de estudiantes (ArrayList) y tiene
  los métodos `agregarEstudiante()`, `buscarPorMatricula()`,
  `eliminarEstudiante()`, `mostrarTodos()`, `promedioGeneral()` y
  `contarAprobados()`.
- **Main**: programa principal. Crea 3 estudiantes, los agrega al gestor y
  prueba los métodos.

## Actividad formativa 3: Herencia

La aplicación se extendió con herencia, en la rama `herencia`:

- **Estudiante** es la clase base: tiene matrícula, nombre, carrera y
  promedio, con sus getters, setters, `estaAprobado()` y `mostrarDatos()`.
- **EstudianteBecado** hereda de Estudiante y agrega `porcentajeBeca`,
  con los métodos exclusivos `calcularDescuento()` y
  `calcularPagoConBeca()`. Sobrescribe `mostrarDatos()` llamando a
  `super.mostrarDatos()` y agregando la beca.
- **EstudianteIntercambio** hereda de Estudiante y agrega
  `universidadOrigen` y `paisOrigen`, con el método exclusivo
  `mostrarOrigen()`. También sobrescribe `mostrarDatos()` con
  `super.mostrarDatos()`.

El gestor no cambió: como las subclases son Estudiantes, `GestorEstudiantes`
las guarda y las trata igual que a cualquier estudiante (polimorfismo).
El programa principal crea un estudiante becado y uno de intercambio y
prueba sus métodos.

## Cómo compilar y correr

Necesitas Java (JDK 17 o mayor) y un IDE como IntelliJ IDEA, Eclipse o
NetBeans. Desde la terminal, en la carpeta del proyecto:

```bash
javac -encoding UTF-8 src/*.java -d out
java -cp out Main
```

(El `-encoding UTF-8` es para que los acentos de los comentarios y los
nombres se compilen bien. En el IDE no hace falta, porque IntelliJ, Eclipse
y NetBeans ya usan UTF-8 por defecto.)

## Autor

Zen Alejandro Tovar Cruz — Ing. en Desarrollo de Software, Universidad
Ciudadana de Nuevo León.
