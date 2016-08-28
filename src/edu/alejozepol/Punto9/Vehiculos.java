/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.alejozepol.Punto9;

/**
 *
 * @author alejozepol
 */
public class Vehiculos {

    private String plata;
    private String nombreDueno;
    private int km;

    public Vehiculos() {
    }

    public Vehiculos(String plata, String nombreDueno, int km) {
        this.plata = plata;
        this.nombreDueno = nombreDueno;
        this.km = km;
    }

    @Override
    public String toString() {
        return "Plata=" + plata + ", Nombre Dueño=" + nombreDueno + ", Kilometro=" + km;
    }



    public String getPlata() {
        return plata;
    }

    public void setPlata(String plata) {
        this.plata = plata;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

}
