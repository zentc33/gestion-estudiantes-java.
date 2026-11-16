// Programa principal
// Aquí se crean los objetos Estudiante, se prueban los métodos
// del gestor y se muestra el resultado en pantalla.
// Actividad formativa 3: se agregan objetos de las subclases
// EstudianteBecado y EstudianteIntercambio para probar la herencia.
// Autor: Zen Alejandro Tovar Cruz
// Para compilar: javac -encoding UTF-8 src/*.java -d out
// Para correr:   java -cp out Main

public class Main {

    public static void main(String[] args) {
        // Se crea el gestor (el objeto que administra la lista)
        GestorEstudiantes gestor = new GestorEstudiantes();

        // Instanciación de objetos: se crean 3 estudiantes con el constructor
        Estudiante e1 = new Estudiante("106470", "Zen Alejandro Tovar Cruz",
                "Ing. en Desarrollo de Software", 92.5);
        Estudiante e2 = new Estudiante("106471", "Ana López García",
                "Ing. en Desarrollo de Software", 85.0);
        Estudiante e3 = new Estudiante("106472", "Carlos Pérez Mendoza",
                "Ing. en Desarrollo de Software", 65.0);

        // Se agregan los estudiantes al gestor
        gestor.agregarEstudiante(e1);
        gestor.agregarEstudiante(e2);
        gestor.agregarEstudiante(e3);

        System.out.println();
        // Se muestran todos los estudiantes
        gestor.mostrarTodos();

        // Se busca un estudiante por matrícula
        System.out.println("Buscando al estudiante 106471:");
        Estudiante encontrado = gestor.buscarPorMatricula("106471");
        if (encontrado != null) {
            encontrado.mostrarDatos();
        }

        // Se prueba el setter: se corrige el promedio de Carlos
        System.out.println();
        System.out.println("Corrigiendo el promedio de Carlos a 78.0:");
        e3.setPromedio(78.0);
        e3.mostrarDatos();

        // Se muestran los resultados generales
        System.out.println();
        System.out.println("Promedio general del grupo: " + gestor.promedioGeneral());
        System.out.println("Estudiantes aprobados: " + gestor.contarAprobados()
                + " de " + 3);

        // Se prueba eliminar un estudiante
        System.out.println();
        gestor.eliminarEstudiante("106472");
        gestor.mostrarTodos();

        // ---- Actividad formativa 3: herencia ----
        System.out.println();
        System.out.println("=== Probando la herencia ===");

        // Instanciación de objetos de las subclases. Como EstudianteBecado
        // y EstudianteIntercambio heredan de Estudiante, el gestor los
        // acepta igual que a cualquier estudiante (polimorfismo).
        EstudianteBecado becado = new EstudianteBecado("106473",
                "Lucía Fernández Ruiz", "Ing. en Desarrollo de Software",
                95.0, 50.0);
        EstudianteIntercambio intercambio = new EstudianteIntercambio("106474",
                "John Smith", "Ing. en Desarrollo de Software",
                88.0, "University of Texas", "Estados Unidos");

        gestor.agregarEstudiante(becado);
        gestor.agregarEstudiante(intercambio);

        // mostrarDatos() está sobrescrito en cada subclase: se ven los
        // datos heredados y los propios de cada una
        System.out.println();
        becado.mostrarDatos();
        System.out.println("--------------------");
        intercambio.mostrarDatos();

        // Métodos exclusivos de cada subclase
        System.out.println();
        System.out.println("Colegiatura: $10,000");
        System.out.println("Descuento por beca: $"
                + becado.calcularDescuento(10000));
        System.out.println("Pago con beca: $"
                + becado.calcularPagoConBeca(10000));
        System.out.println();
        intercambio.mostrarOrigen();

        // El gestor sigue funcionando con todos, sin importar la subclase
        System.out.println();
        System.out.println("Promedio general del grupo: " + gestor.promedioGeneral());
        System.out.println("Estudiantes aprobados: " + gestor.contarAprobados()
                + " de " + 4);
    }
}
