package aulaVirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario genérico en el aula virtual.
 * Puede ser un Alumno o un Profesor.
 * @author Javier Barceló
 * @version 0.1
 */
public class Usuario {
    protected String nombre;
    protected String email;
    private List<Asignatura> asignaturas;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.asignaturas = new ArrayList<>();
    }

    public List<Asignatura> getAsignaturas() {
        return new ArrayList<>(asignaturas);
    }

    public void inscribirAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public boolean iniciarSesión (String password) {
        // simula la consulta a la base de datos de las credenciales del usuario
        int hash = password.hashCode();
        return true;
    }
}