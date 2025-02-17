package main;

import aulaVirtual.Alumno;
import aulaVirtual.Asignatura;
import aulaVirtual.Profesor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Crear asignaturas
        Asignatura matematicas = new Asignatura("Matemáticas");
        Asignatura programacion = new Asignatura("Programación");

        // Crear profesor
        Profesor profesor1 = new Profesor("Carlos Gómez", "carlos@instituto.com");
        profesor1.inscribirAsignatura(matematicas);
        profesor1.inscribirAsignatura(programacion);

        // Crear alumnos y asignarlos a asignaturas
        Alumno alumno1 = new Alumno("María Pérez", "maria@correo.com");
        alumno1.inscribirAsignatura(matematicas);
        alumno1.inscribirAsignatura(programacion);

        Alumno alumno2 = new Alumno("Pedro Martínez", "pedro@correo.com");
        alumno2.inscribirAsignatura(programacion);

        // El profesor califica a los alumnos
        profesor1.calificarAlumno(alumno1, matematicas, 85);
        profesor1.calificarAlumno(alumno1, programacion, 90);
        profesor1.calificarAlumno(alumno2, programacion, 78);

        // Mostrar notas de los alumnos
        alumno1.mostrarNotas();
        alumno2.mostrarNotas();

        // Agregar alumnos
        matematicas.agreagarAlumno(alumno1);
        matematicas.agreagarAlumno(alumno2);
        programacion.agreagarAlumno(alumno2);

        // Imprimir alumnos
        System.out.println();
        System.out.println("Alumnos de Matematicas: ");
        matematicas.getAlumnos(); // Llama al método sin almacenar el retorno

        System.out.println();
        System.out.println("Alumnos de Programacion: ");
        programacion.getAlumnos();




    }
}
