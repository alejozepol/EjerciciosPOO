/**
 * *
 * Esta clase es la principal del paquete la cual se utiliza para acceder al
 * desarrollo del punto 2 del taller del Programacion Orientado a Objetos del
 * programada de ADSI- SENA 1068180
 *
 */
package edu.alejozepol.punto12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejozepol
 */
public final class Estudiantes extends Terceros{

    private int edad;
    private int grado;
    private double valorMatricula;
    private double valorMensualidad;
    private double valorSocidadPadres;

    
    public Estudiantes(long identificacion, String apellido, String nombre,int edad, int grado, double valorMatricula, double valorMensualidad, double valorSocidadPadres) {
        super(identificacion, apellido, nombre);
        this.edad = edad;
        this.grado = grado;
        this.valorMatricula = valorMatricula;
        this.valorMensualidad = valorMensualidad;
        this.valorSocidadPadres = valorSocidadPadres;
    }
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    public double getValorMensualidad() {
        return valorMensualidad;
    }
    public void setValorMensualidad(double valorMensualidad) {
        this.valorMensualidad = valorMensualidad;
    }

    public double getValorSocidadPadres() {
        return valorSocidadPadres;
    }

    public void setValorSocidadPadres(double valorSocidadPadres) {
        this.valorSocidadPadres = valorSocidadPadres;
    }
}
