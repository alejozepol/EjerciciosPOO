/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejozepol.Punto1;

/**
 *
 * @author alejozepol
 */
public class Huesped {
    
    private String nombre; 
    private String direccion; 
    private String profesion; 
    private String estadioCivil;
  

    public Huesped(String nombre, String direccion, String profesion, String estadioCivil) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.profesion = profesion;
        this.estadioCivil = estadioCivil;
    }

    @Override
    public String toString() {
        return "Huesped{" + "nombre=" + nombre + ", direccion=" + direccion + ", profesion=" + profesion + ", estadioCivil=" + estadioCivil + '}';
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEstadioCivil() {
        return estadioCivil;
    }

    public void setEstadioCivil(String estadioCivil) {
        this.estadioCivil = estadioCivil;
    }
    
    public void asignarHabitacion(){
       
        
    }
    
}
