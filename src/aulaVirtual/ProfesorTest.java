package aulaVirtual;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de pruebas unitarias para la clase {@link Profesor}.
 * Se prueba el método {@code calificarAlumno()} en distintos escenarios.
 *
 * @author [Tu Nombre]
 * @version 1.0
 */
public class ProfesorTest {

    private Profesor profesor;
    private Alumno alumno;
    private Asignatura matematicas;
    private Asignatura historia;

    /**
     * Configuración inicial antes de cada prueba.
     * Se crea un profesor y un alumno, y se asignan las asignaturas correspondientes.
     */
    @Before
    public void setUp() {
        profesor = new Profesor("Carlos Gómez", "carlos@instituto.com");
        alumno = new Alumno("Ana López", "ana@correo.com");
        matematicas = new Asignatura("Matemáticas");
        historia = new Asignatura("Historia");

        profesor.inscribirAsignatura(matematicas); // El profesor solo imparte Matemáticas
        alumno.inscribirAsignatura(matematicas); // El alumno solo se inscribe en Matemáticas
    }

    /**
     * Prueba que verifica que {@code calificarAlumno()} permite calificar correctamente
     * a un alumno cuando el profesor imparte la asignatura.
     */
    @Test
    public void calificar_ProfesorImparte() {
        boolean resultado = profesor.calificarAlumno(alumno, matematicas, 90); // Profesor califica en Matemáticas
        assertTrue(resultado); // Se espera que la calificación sea exitosa
        assertEquals(90, alumno.obtenerNota(matematicas)); // Se verifica que la nota asignada es la correcta
    }

    /**
     * Prueba que verifica que {@code calificarAlumno()} no permite calificar a un alumno
     * en una asignatura que el profesor no imparte.
     */
    @Test
    public void calificar_ProfesorNoImparte() {
        boolean resultado = profesor.calificarAlumno(alumno, historia, 80); // Intenta calificar en Historia, que no imparte
        assertFalse(resultado); // Se espera que la calificación falle
        assertEquals(-1, alumno.obtenerNota(historia)); // La nota no debe cambiar, por lo que debe ser -1
    }
}
