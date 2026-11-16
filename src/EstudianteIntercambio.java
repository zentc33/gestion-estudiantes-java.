// Clase EstudianteIntercambio
// Es una clase derivada de Estudiante: hereda todos sus atributos y
// métodos (matrícula, nombre, carrera, promedio, estaAprobado y
// mostrarDatos) y agrega los datos de su universidad de origen.
// Autor: Zen Alejandro Tovar Cruz
// Actividad formativa 3 - Herencia

public class EstudianteIntercambio extends Estudiante {

    // Atributos únicos de esta subclase
    private String universidadOrigen;
    private String paisOrigen;

    // Constructor: llama al constructor de la clase base con super()
    // y luego guarda los datos de origen
    public EstudianteIntercambio(String matricula, String nombre, String carrera,
                                 double promedio, String universidadOrigen,
                                 String paisOrigen) {
        super(matricula, nombre, carrera, promedio);
        this.universidadOrigen = universidadOrigen;
        this.paisOrigen = paisOrigen;
    }

    // Getters de los atributos propios de la subclase
    public String getUniversidadOrigen() {
        return universidadOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    // Método exclusivo de esta subclase: muestra de dónde viene
    // el estudiante de intercambio
    public void mostrarOrigen() {
        System.out.println("Universidad de origen: " + universidadOrigen);
        System.out.println("País de origen: " + paisOrigen);
    }

    // Sobrescritura del método de la clase base: primero muestra los
    // datos heredados con super.mostrarDatos() y luego los de origen
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Universidad de origen: " + universidadOrigen);
        System.out.println("País de origen: " + paisOrigen);
    }
}
