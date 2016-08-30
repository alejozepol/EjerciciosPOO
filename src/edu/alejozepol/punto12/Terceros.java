/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.alejozepol.punto12;

/**
 *
 * @author alejozepol
 */
public class Terceros {

    private long identificacion;
    private String apellido;
    private String nombre;

    public Terceros(long identificacion, String apellido, String nombre) {
        this.identificacion = identificacion;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
