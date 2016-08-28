/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejozepol.Punto1;

import java.util.Date;

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

    public Date getHoraDespertar() {
        return horaDespertar;
    }

    public void setHoraDespertar(Date horaDespertar) {
        this.horaDespertar = horaDespertar;
    }
    private String nombreTipo;
    private Date horaDespertar;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    private Date fechaInicio;
    private Date fechaFin;

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

    public String asignacionTipo() {
        if (tipo == 0) {
            nombreTipo = "Sencilla";
        } else if (tipo == 1) {
            nombreTipo = "Doble";
        } else if (tipo == 2) {
            nombreTipo = "Suite";
        }
        return nombreTipo;
    }

    @Override
    public String toString() {

        return "\n numeroHabitacion:" + numeroHabitacion
                + "\n numeroBaños:" + numeroBaños
                + "\n numeroExtencion:" + numeroExtencion
                + "\n calefaccion=" + calefaccion
                + "\n disponible=" + disponible
                + "\n tipo=" + asignacionTipo();
    }
}
