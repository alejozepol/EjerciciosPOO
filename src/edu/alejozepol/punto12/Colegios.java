/**
 * *
 * La clase Colegio representa al instituto de educacion
 */
package edu.alejozepol.punto12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alejozepol
 */
public class Colegios {

    private long nit;
    private String razonSocial;
    private String direccion;
    private long numeroTelefono;
    private List<Acudientes> acudientes;
    private List<Estudiantes> estudiantes;

    public Colegios(long nit, String razonSocial, String direccion, long numeroTelefono) {
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.acudientes = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public List<Estudiantes> addEstudiantes(long identificacion, String apellido, String nombre, int edad, int grado, double valorMatricula, double valorMensualidad, double valorSocidadPadres) {
        Estudiantes e = new Estudiantes(identificacion, apellido, nombre, edad, grado, valorMatricula, valorMensualidad, valorSocidadPadres);
        estudiantes.add(e);
        return estudiantes;
    }

    public List<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Acudientes> addAcudientes(long identificacionAcudiente, String apellidoAcudiente, String nombreAcudiente,List<Estudiantes> estudiantes) {
        Acudientes a = new Acudientes(identificacionAcudiente, apellidoAcudiente, nombreAcudiente, estudiantes);
        acudientes.add(a);
        return acudientes;
    }

    public List<Acudientes> getAcudientes() {
        return acudientes;
    }

    public void setAcudientes(List<Acudientes> acudientes) {
        this.acudientes = acudientes;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "NIT:" + nit + "\nRazon Socia:" + razonSocial + "\nDireccion:" + direccion + "\nNumero Telefono:" + numeroTelefono;
    }

    void addAcudientes(int i, String acudiente, String string, List<Estudiantes> list, List<Estudiantes> subList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
