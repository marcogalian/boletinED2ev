package aulaVirtual;

/**
 * Representa a un profesor del aula virtual.
 * Un profesor puede impartir varias asignaturas.
 */
public class Profesor extends Usuario {
    public Profesor(String nombre, String email) {
        super(nombre, email);
    }


    public boolean calificarAlumno(Alumno alumno, Asignatura asignatura, int nota) {
        if (getAsignaturas().contains(asignatura)) {
            alumno.asignarNota(asignatura, nota);
            System.out.println("Nota asignada a " + alumno.getNombre() + " en " + asignatura.getNombre() + ": " + nota);
            return true;
        } else {
            System.out.println("El profesor no imparte esta asignatura.");
            return false;
        }
    }
}
