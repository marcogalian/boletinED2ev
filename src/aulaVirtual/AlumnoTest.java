package aulaVirtual;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Clase de pruebas unitarias para la clase {@link Alumno}.
 * Se prueba el método {@code obtenerNota()} en distintos escenarios.
 *
 */
public class AlumnoTest {
    private Alumno alumno;
    private Asignatura matematicas;
    private Asignatura historia;

    /**
     * Configuración inicial antes de cada prueba.
     * Se crea un alumno y se inscribe en una asignatura.
     */
    @Before
    public void setUp() {
        alumno = new Alumno("Juan Pérez", "juan@correo.com");
        matematicas = new Asignatura("Matemáticas");
        historia = new Asignatura("Historia");

        alumno.inscribirAsignatura(matematicas); // El alumno solo se inscribe en Matemáticas
    }

    /**
     * Prueba que verifica que {@code obtenerNota()} devuelve la nota correcta
     * cuando el alumno está inscrito en la asignatura y ha sido evaluado.
     */
    @Test
    public void obtenerNota_AsignaturaInscrita() {
        alumno.asignarNota(matematicas, 85); // Se asigna una nota de 85 en Matemáticas
        assertEquals(85, alumno.obtenerNota(matematicas)); // Se comprueba que la nota obtenida sea 85
    }

    /**
     * Prueba que verifica que {@code obtenerNota()} devuelve -1
     * cuando el alumno intenta obtener la nota de una asignatura en la que no está inscrito.
     */
    @Test
    public void obtenerNota_AsignaturaNoInscrita() {
        assertEquals(-1, alumno.obtenerNota(historia)); // Como no está inscrito en Historia, debe devolver -1
    }
}
