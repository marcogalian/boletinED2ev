package aulaVirtual;

import java.util.ArrayList;

/**
 * Representa una asignatura en el aula virtual.
 * Cada asignatura tiene un nombre, un profesor encargado (opcional)
 * y una lista de alumnos inscritos.
 *
 */
public class Asignatura {

    /**
     * Nombre de la asignatura.
     */
    private String nombre;

    /**
     * Profesor encargado de la asignatura.
     * Puede ser {@code null} si no hay profesor asignado.
     */
    private Profesor profesor;

    /**
     * Lista de alumnos inscritos en la asignatura.
     */
    private ArrayList<Alumno> alumnos;

    /**
     * Constructor de la clase Asignatura.
     * Inicializa la asignatura sin profesor y sin alumnos inscritos.
     *
     * @param nombre Nombre de la asignatura.
     */
    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.profesor = null; // Inicialmente, la asignatura no tiene profesor asignado.
        this.alumnos = new ArrayList<>(); // Se inicializa la lista de alumnos vacía.
    }

    /**
     * Obtiene el nombre de la asignatura.
     *
     * @return El nombre de la asignatura.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el profesor asignado a la asignatura.
     *
     * @return El profesor encargado, o {@code null} si no hay profesor asignado.
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Inscribe un alumno en la asignatura.
     *
     * @param alumno Alumno que se va a inscribir en la asignatura.
     */
    public void agregarAlumno(Alumno alumno) {

        alumnos.add(alumno);
    }

    /**
     * Devuelve una copia de la lista de alumnos inscritos en la asignatura.
     *
     * @return Un nuevo {@code ArrayList} con los alumnos inscritos en la asignatura.
     */
    public ArrayList<Alumno> getAlumnos() {
        return new ArrayList<>(alumnos); // Devuelve una copia para evitar modificaciones externas
    }

    /**
     * Elimina un alumno de la asignatura si está inscrito.
     *
     * @param alumno Alumno que se quiere eliminar de la asignatura.
     */
    public void eliminarAlumno(Alumno alumno) {
        alumnos.removeIf(a -> a.getNombre().equals(alumno.getNombre())); // Se usa removeIf para simplificar la eliminación.
    }

}
