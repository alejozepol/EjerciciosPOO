/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.alejozepol.Punto1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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
    private List<Confiteria> producto;
    public int indice;
    public int num = 0;

    public List<Confiteria> getProducto() {
        return producto;
    }

    public void setProducto(List<Confiteria> Producto) {
        this.producto = Producto;
    }

    public void addProducto(int idProducto, String producto, long valor) {
        Confiteria c = new Confiteria (idProducto, producto,valor);
        this.producto.add(c);
    }

    public Confiteria consultarIdProducto(int numero) {
        /**
         * Este medetodo consulta la List de Producto donde se
         * encuentra almacenados la informaccion de las Confiteria creados
         *
         * @param numero solicita el idProducto
         *
         */
        for (Confiteria prodConfiteria : producto) {
            if (prodConfiteria.getIdProducto() == numero) {
                return prodConfiteria;
            }
        }
        return null;

    }
    public boolean cargarProducto(int idProducto,int numHabitacion) {
        Confiteria p = consultarIdProducto(idProducto);
        Habitacion h = consultarNumeroHabitacion(numHabitacion);
        if (h != null) {
            h.setProducto(p);
            h.setNumeroHabitacion(numHabitacion);
            return true;
        }
        return false;
    }
    public List<Habitacion> getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(List<Habitacion> habitacion) {
        this.habitacion = habitacion;
    }

    public void addHabitacion(int numeroHabitacion, int numeroBaños, int numeroExtencion, boolean calefaccion, boolean disponible, int tipo) {
        Habitacion a = new Habitacion(numeroHabitacion, numeroBaños, numeroExtencion, calefaccion, disponible, tipo);
        habitacion.add(a);
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
        this.producto= new ArrayList<>();

    }

    public Habitacion consultarNumeroHabitacion(int numero) {
        /**
         * Este medetodo consulta la List de Habitaciones donde se
         * encuentra almacenados la informaccion de las habitaciones creados
         *
         * @param numero solicita el numero de la habitacion
         *
         */
        for (Habitacion habitacion1 : habitacion) {
            if (habitacion1.getNumeroHabitacion() == numero && habitacion1.isDisponible()) {
                return habitacion1;
            }
        }
        return null;

    }

    public boolean ocuparHabitacion(int numHabitacion, Huesped huesped, String fechaInicio, String fechaFin) {
        Habitacion h = consultarNumeroHabitacion(numHabitacion);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        Date f1 = null;
        Date f2 = null;
        try {
            f1 = formato.parse(fechaInicio);
            f2 = formato.parse(fechaFin);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        if (h != null) {
            h.setClientes(huesped);
            h.setDisponible(false);
            h.setFechaInicio(f1);
            h.setFechaFin(f2);
            return true;
        }
        return false;
    }

    public boolean despertar(String hora, int numHabitacion) {
        Habitacion h = consultarNumeroHabitacion(numHabitacion);
        Date despertar = null;
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        try {
            despertar = formato.parse(hora);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        if (h != null) {
            h.setHoraDespertar(despertar);
            return true;
        }

        return false;
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

    @Override
    public String toString() {
        return "Direccion:" + direccion + "\n Barrio:"
                + barrio;
    }

}
