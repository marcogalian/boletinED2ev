package aulaVirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario genérico en el aula virtual.
 * Puede ser un {@link Alumno} o un {@link Profesor}.
 * Contiene información básica como nombre, email y asignaturas inscritas.
 *
 * @author Javier Barceló
 * @version 1.0
 */
public class Usuario {

    /**
     * Nombre del usuario.
     */
    protected String nombre;

    /**
     * Correo electrónico del usuario.
     */
    protected String email;

    /**
     * Lista de asignaturas en las que está inscrito el usuario.
     */
    private List<Asignatura> asignaturas;

    /**
     * Constructor de la clase Usuario.
     *
     * @param nombre Nombre del usuario.
     * @param email  Correo electrónico del usuario.
     */
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.asignaturas = new ArrayList<>(); // Inicializa la lista de asignaturas vacía
    }

    /**
     * Obtiene la lista de asignaturas en las que está inscrito el usuario.
     *
     * @return Una copia de la lista de asignaturas inscritas.
     */
    public List<Asignatura> getAsignaturas() {
        return new ArrayList<>(asignaturas); // Devuelve una copia para evitar modificaciones externas
    }

    /**
     * Inscribe al usuario en una nueva asignatura.
     *
     * @param asignatura La asignatura en la que se inscribirá el usuario.
     */
    public void inscribirAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     *
     * @return Correo electrónico del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Simula el inicio de sesión verificando la contraseña.
     * Para este caso, se convierte la contraseña en un hash sin que se compruebe de verdad.
     *
     * @param password Contraseña ingresada por el usuario.
     * @return Siempre devuelve {@code true}, ya que no valida realmente.
     */
    public boolean iniciarSesión(String password) {
        int hash = password.hashCode(); // Simulación de validación con hash
        return true;
    }
}
