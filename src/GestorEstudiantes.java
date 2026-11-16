// Clase GestorEstudiantes
// Guarda una lista de estudiantes y permite agregarlos, buscarlos,
// eliminarlos y mostrarlos. Usa un ArrayList para guardar los objetos.
// Autor: Zen Alejandro Tovar Cruz

import java.util.ArrayList;

public class GestorEstudiantes {

    // Atributo: lista donde se guardan los estudiantes
    private ArrayList<Estudiante> estudiantes;

    // Constructor: crea la lista vacía
    public GestorEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    // Método: agrega un estudiante a la lista
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado: " + estudiante.getNombre());
    }

    // Método: busca un estudiante por su matrícula, regresa null si no existe
    public Estudiante buscarPorMatricula(String matricula) {
        for (Estudiante e : estudiantes) {
            if (e.getMatricula().equals(matricula)) {
                return e;
            }
        }
        return null;
    }

    // Método: elimina un estudiante por su matrícula, regresa true si lo borró
    public boolean eliminarEstudiante(String matricula) {
        Estudiante encontrado = buscarPorMatricula(matricula);
        if (encontrado != null) {
            estudiantes.remove(encontrado);
            System.out.println("Estudiante eliminado: " + encontrado.getNombre());
            return true;
        }
        System.out.println("No se encontró ningún estudiante con esa matrícula.");
        return false;
    }

    // Método: muestra todos los estudiantes de la lista
    public void mostrarTodos() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        System.out.println("--- Lista de estudiantes (" + estudiantes.size() + ") ---");
        for (Estudiante e : estudiantes) {
            e.mostrarDatos();
            System.out.println("--------------------");
        }
    }

    // Método: calcula el promedio general de todos los estudiantes
    public double promedioGeneral() {
        if (estudiantes.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.getPromedio();
        }
        return suma / estudiantes.size();
    }

    // Método: cuenta cuántos estudiantes están aprobados
    public int contarAprobados() {
        int total = 0;
        for (Estudiante e : estudiantes) {
            if (e.estaAprobado()) {
                total++;
            }
        }
        return total;
    }
}
