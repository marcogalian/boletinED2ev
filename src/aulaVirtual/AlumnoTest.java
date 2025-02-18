package aulaVirtual;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AlumnoTest {
    private Alumno alumno;
    private Asignatura matematicas;
    private Asignatura historia;

    @Before
    public void setUp() {
        alumno = new Alumno("Juan Pérez", "juan@correo.com");
        matematicas = new Asignatura("Matemáticas");
        historia = new Asignatura("Historia");

        alumno.inscribirAsignatura(matematicas);
    }

    @Test
    public void obtenerNota_AsignaturaInscrita() {
        alumno.asignarNota(matematicas, 85);
        assertEquals(85, alumno.obtenerNota(matematicas));
    }

    @Test
    public void obtenerNota_AsignaturaNoInscrita() {
        assertEquals(-1, alumno.obtenerNota(historia));
    }
}
