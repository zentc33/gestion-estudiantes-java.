// Clase EstudianteBecado
// Es una clase derivada de Estudiante: hereda todos sus atributos y
// métodos (matrícula, nombre, carrera, promedio, estaAprobado y
// mostrarDatos) y agrega lo propio de un estudiante con beca.
// Autor: Zen Alejandro Tovar Cruz
// Actividad formativa 3 - Herencia

public class EstudianteBecado extends Estudiante {

    // Atributo único de esta subclase: el porcentaje de beca (0 a 100)
    private double porcentajeBeca;

    // Constructor: llama al constructor de la clase base con super()
    // y luego guarda el porcentaje de beca
    public EstudianteBecado(String matricula, String nombre, String carrera,
                            double promedio, double porcentajeBeca) {
        super(matricula, nombre, carrera, promedio);
        this.porcentajeBeca = porcentajeBeca;
    }

    // Getter del atributo propio de la subclase
    public double getPorcentajeBeca() {
        return porcentajeBeca;
    }

    // Método exclusivo de esta subclase: calcula cuánto se descuenta
    // de la colegiatura según el porcentaje de beca
    public double calcularDescuento(double colegiatura) {
        return colegiatura * porcentajeBeca / 100;
    }

    // Método exclusivo de esta subclase: calcula cuánto se paga
    // después de aplicar la beca
    public double calcularPagoConBeca(double colegiatura) {
        return colegiatura - calcularDescuento(colegiatura);
    }

    // Sobrescritura del método de la clase base: primero muestra los
    // datos heredados con super.mostrarDatos() y luego los de la beca
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Beca: " + porcentajeBeca + "%");
    }
}
