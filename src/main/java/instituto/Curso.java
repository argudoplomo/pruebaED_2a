/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.TreeSet;

/**
 * Curso que cuenta con su nombre de curso (nombre) y con la lista de alumnos (listaAlumnos) que pertenecen al curso.
 * @author ProfDiurno
 * @version 1.0
 * @since 1.0
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    protected String getNombre() {
        return nombre;
    }

    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Añade una persona a la lista de alumnos (listaAlumnos) del curso donde se utilize el metodo
     * @param p Persona que se añade a la lista de alumnos (listaAlumnos)
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
