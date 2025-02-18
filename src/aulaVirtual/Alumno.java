package aulaVirtual;

import java.util.HashMap;
import java.util.Map;

/**
 * Representa a un alumno en el aula virtual.
 * Un alumno puede estar inscrito en varias asignaturas y tener notas asociadas a ellas.
 * Hereda de la clase {@link Usuario}.
 *
 */
public class Alumno extends Usuario {

    /**
     * Mapa que asocia cada asignatura con la nota obtenida por el alumno.
     */
    private Map<Asignatura, Integer> notas;

    /**
     * Constructor de la clase Alumno.
     *
     * @param nombre Nombre del alumno.
     * @param email  Correo electrónico del alumno.
     */
    public Alumno(String nombre, String email) {
        super(nombre, email);
        this.notas = new HashMap<>(); // Inicializa el mapa de notas vacío
    }

    /**
     * Obtiene una copia del mapa de notas del alumno.
     *
     * @return Un nuevo {@code HashMap} con las asignaturas y sus respectivas notas.
     */
    public Map<Asignatura, Integer> getNotas() {
        return new HashMap<>(notas);
    }

    /**
     * Asigna una nota a una asignatura si el alumno está inscrito en ella.
     *
     * @param asignatura La asignatura en la que se va a asignar la nota.
     * @param nota       La calificación que se asignará al alumno.
     */
    protected void asignarNota(Asignatura asignatura, int nota) {
        if (getAsignaturas().contains(asignatura)) { // Verifica si el alumno está inscrito en la asignatura
            notas.put(asignatura, nota);
        } else {
            System.out.println("El alumno no está inscrito en esta asignatura."); // Mensaje si no está inscrito
        }
    }

    /**
     * Muestra en consola todas las notas del alumno en las asignaturas en las que ha sido evaluado.
     */
    public void mostrarNotas() {
        System.out.println("Notas del alumno " + nombre + ":");
        for (Map.Entry<Asignatura, Integer> entry : notas.entrySet()) {
            System.out.println(entry.getKey().getNombre() + ": " + entry.getValue());
        }
    }

    /**
     * Obtiene la nota de una asignatura específica.
     *
     * @param asignatura La asignatura de la que se quiere obtener la nota.
     * @return La nota si el alumno ha sido evaluado, o -1 si no tiene nota en esa asignatura.
     */
    public int obtenerNota(Asignatura asignatura) {
        return notas.getOrDefault(asignatura, -1); // Retorna la nota si existe, o -1 si no ha sido evaluado
    }

    /**
     * Devuelve una representación en cadena del alumno, incluyendo su nombre y correo electrónico.
     *
     * @return Una cadena con el formato:
     *         <pre>
     *         Nombre: [nombre]
     *         Email: [email]
     *         </pre>
     */
    @Override
    public String toString() {
        return "\nNombre: " + getNombre() + "\n" +
                "Email: " + getEmail() + "\n";
    }
}
