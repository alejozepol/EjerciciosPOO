/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejozepol.Punto1;

import com.alejozepol.Punto1.Habitacion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alejozepol
 */
public class Hotel {

    private String direccion;
    private String ciudad;
    private String barrio;
    private int telefono;
    private List<Habitacion> habitacion;
    public int indice;
    int num=0;

    public List<Habitacion> getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(List<Habitacion> habitacion) {
        this.habitacion = habitacion;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void mostrar() {
        Iterator<Habitacion> iteHabitacion = habitacion.iterator();
        while (iteHabitacion.hasNext()) {
            Habitacion elemento = iteHabitacion.next();

            System.out.println(elemento);
        }
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public Hotel(String direccion, String ciudad, String barrio, int telefono) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.telefono = telefono;
        this.habitacion = new ArrayList<>();

    }

    public Habitacion consultarNumeroHabitacion() {
        /**
         * Este medetodo consulta el ArreyList de Habitaciones donde se
         * encuentra almacenados la informaccion de las habitaciones creados
         *
         * @param indice el cual se encuentra solicitando por pantalla
         *
         */
        System.out.println("Por Favor ingrese el indice de la Habitacion:");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();

        setIndice(num);

        return habitacion.get(num);

    }

    public Habitacion getIndiceHabitacion() {
        /**
         * Este medetodo consulta el ArreyList de Habitaciones donde se
         * encuentra almacenados la informaccion de las habitaciones creados
         *
         * @param indice el cual se encuentra solicitando por pantalla
         *
         */
        System.out.println("Por Favor ingrese el indice de la Habitacion:");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();

        setIndice(num);

        return habitacion.get(indice);

    }

    public void addHabitacion(int numeroHabitacion, int numeroBaños, int numeroExtencion, boolean calefaccion, boolean disponible, int tipo) {
        Habitacion a = new Habitacion(numeroHabitacion, numeroBaños, numeroExtencion, calefaccion, disponible, tipo);
        habitacion.add(a);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
