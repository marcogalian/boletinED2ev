package aulaVirtual;

/**
 * Representa a un profesor en el aula virtual.
 * Un profesor puede impartir varias asignaturas y calificar a los alumnos.
 * Hereda de la clase {@link Usuario}.
 *
 */
public class Profesor extends Usuario {

    /**
     * Constructor de la clase Profesor.
     * Inicializa un profesor con su nombre y correo electrónico.
     *
     * @param nombre Nombre del profesor.
     * @param email  Correo electrónico del profesor.
     */
    public Profesor(String nombre, String email) {
        super(nombre, email);
    }

    /**
     * Califica a un alumno en una asignatura, siempre que el profesor la imparta.
     * Si el profesor no imparte la asignatura, la calificación no se realiza.
     *
     * @param alumno     Alumno que recibirá la calificación.
     * @param asignatura Asignatura en la que se quiere evaluar al alumno.
     * @param nota       Nota que se asignará al alumno.
     * @return {@code true} si la calificación se asignó correctamente,
     *         {@code false} si el profesor no imparte la asignatura.
     */
    public boolean calificarAlumno(Alumno alumno, Asignatura asignatura, int nota) {
        if (getAsignaturas().contains(asignatura)) { // Verifica si el profesor imparte la asignatura
            alumno.asignarNota(asignatura, nota); // Asigna la nota al alumno
            System.out.println("Nota asignada a " + alumno.getNombre() + " en " + asignatura.getNombre() + ": " + nota);
            return true;
        } else {
            System.out.println("El profesor no imparte esta asignatura."); // Mensaje si no puede calificar
            return false;
        }
    }
}
