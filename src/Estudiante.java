// Clase Estudiante
// Representa a un estudiante con sus datos básicos y su promedio.
// Autor: Zen Alejandro Tovar Cruz
// Materia: Actividad formativa 2 - Desarrollo de una Aplicación Simple en Línea

public class Estudiante {

    // Atributos de la clase (privados, se accede con getters y setters)
    private String matricula;
    private String nombre;
    private String carrera;
    private double promedio;

    // Constructor: crea un estudiante con todos sus datos
    public Estudiante(String matricula, String nombre, String carrera, double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Getters: leen los atributos
    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    // Setters: cambian los atributos (el promedio no puede ser negativo)
    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 100) {
            this.promedio = promedio;
        } else {
            System.out.println("El promedio debe estar entre 0 y 100.");
        }
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Método: dice si el estudiante está aprobado (promedio de 70 o más)
    public boolean estaAprobado() {
        return promedio >= 70;
    }

    // Método: muestra los datos del estudiante en pantalla
    public void mostrarDatos() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + (estaAprobado() ? "Aprobado" : "Reprobado"));
    }
}
