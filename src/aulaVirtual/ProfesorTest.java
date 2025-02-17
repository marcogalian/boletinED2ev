package aulaVirtual;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfesorTest {

    private Profesor profesor;
    private Alumno alumno;
    private Asignatura matematicas;
    private Asignatura historia;

    @Before
    public void setUp() {
        profesor = new Profesor("Carlos Gómez", "carlos@instituto.com");
        alumno = new Alumno("Ana López", "ana@correo.com");
        matematicas = new Asignatura("Matemáticas");
        historia = new Asignatura("Historia");

        profesor.inscribirAsignatura(matematicas);
        alumno.inscribirAsignatura(matematicas);
    }

    @Test
    public void calificar_ProfesorImparte() {
        boolean resultado = profesor.calificarAlumno(alumno, matematicas, 90);
        assertTrue(resultado);
        assertEquals(90, alumno.obtenerNota(matematicas));
    }

    @Test
    public void calificar_ProfesorNoImparte() {
        boolean resultado = profesor.calificarAlumno(alumno, historia, 80);
        assertFalse(resultado);
        assertEquals(-1, alumno.obtenerNota(historia));
    }
}