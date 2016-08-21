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
public class Habitacion {

    private int numeroHabitacion;
    private int numeroBaños;
    private int numeroExtencion;
    private boolean calefaccion;
    private boolean disponible;
    private int tipo;
     private Huesped clientes;

//    private final String tipoHabitacion[] = {"Sencillo", "Doble","Suite"};
    public Habitacion(int numeroHabitacion, int numeroBaños, int numeroExtencion, boolean calefaccion, boolean disponible, int tipo) {
        this.numeroHabitacion = numeroHabitacion;
        this.numeroBaños = numeroBaños;
        this.numeroExtencion = numeroExtencion;
        this.disponible = disponible;
        this.calefaccion = calefaccion;
        this.tipo = tipo;
    }

    public Habitacion() {
    }

    public Huesped getClientes() {
        return clientes;
    }

    public void setClientes(Huesped clientes) {
        this.clientes = clientes;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNumeroExtencion() {
        return numeroExtencion;
    }

    public void setNumeroExtencion(int numeroExtencion) {
        this.numeroExtencion = numeroExtencion;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(int numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

    @Override
    public String toString() {
        return "numeroHabitacion:" + numeroHabitacion + "\n numeroBaños:"
                + numeroBaños + "\n numeroExtencion:" + numeroExtencion
                + "\n calefaccion=" + calefaccion + "\n disponible="
                + disponible + "\n tipo=" + tipo;
    }

}
