/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.alejozepol.Punto9;

import edu.alejozepol.ejerciciospoo.Menu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alejozepol
 */
public class Punto9 {

    public static void punto9() {

        JOptionPane.showMessageDialog(null,
                "Realizar un sistema de Control de Alquiler de Vehículos:\n"
                + "El sistema debe tener un menú: Ingreso de Vehículos\n"
                + "Placa del Vehículo,\nNombre de la Persona que Alquila\nKm actual del vehículo\n"
                + "Permirit buscar los vehículos cuyo KM sea mayor a 20 y menor a 100 \n"
                + "Listar todo los vehículos Ingresados.\n"
                + "\n"
                + "NOTA: Trabajar con un ingreso de 10 Vehículos, Los reportes de Buscar\n"
                + " y Listar deben ser en columnas, Ej.: \n"
                + "Placa  KM 	Persona \n"
                + "GHJ456 12  	Julio Pérez\n");
        int numero;
        String teclado;
        String placa = null;
        String nombre = null;
        int km = 0;

        teclado = JOptionPane.showInputDialog("Ingrese la cantidad de vehiculos:");
        if (teclado != null && !teclado.contentEquals("")) {
            numero = (Integer.parseInt(teclado));
            ArrayList<Vehiculos> lista = new ArrayList();

            for (int i = 1; i <= numero; i++) {
                placa = JOptionPane.showInputDialog("El Números de la placa del vehiculo" + i);
                if (placa != null && !placa.contentEquals("")) {
                    nombre = JOptionPane.showInputDialog("El Nombre del dueño del vehiculo" + i);
                    if (nombre != null && !nombre.contentEquals("")) {
                        String tkm = JOptionPane.showInputDialog("El kilometro del vehiculo" + i);
                        if (tkm != null && !tkm.contentEquals("")) {
                            km = Integer.parseInt(tkm);
                            Vehiculos v = new Vehiculos(placa, nombre, km);
                            lista.add(v);
                        }
                    }
                }
            }

            Object opciones = JOptionPane.showInputDialog(null, "Seleccione la acción que quieres realizar:",
                    "Opciones", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Consultar Vehiculos", "Filtrar por KM"}, "Seleccione");
            if (opciones.equals("Consultar Vehiculos")) {
                Iterator<Vehiculos> iteLista = lista.iterator();
                while (iteLista.hasNext()) {
                    Vehiculos elemento = iteLista.next();
                    JOptionPane.showMessageDialog(null, (elemento));
                }
            } else if (opciones.equals("Filtrar por KM")) {
                String TkmInicio = JOptionPane.showInputDialog("Kilometro Inicio");
                if (TkmInicio != null && !TkmInicio.contentEquals("")) {
                    String TkmFin = JOptionPane.showInputDialog("Kilometro Fin");
                    if (TkmFin != null && !TkmFin.contentEquals("")) {
                        int kmInicio = Integer.parseInt(TkmInicio);
                        int kmFin = Integer.parseInt(TkmFin);
                        if (kmInicio < kmFin) {
                            Iterator<Vehiculos> iteLista = lista.iterator();
                            while (iteLista.hasNext()) {
                                Vehiculos elemento = iteLista.next();
                                if (elemento.getKm() > kmInicio && elemento.getKm() < kmFin) {
                                    JOptionPane.showMessageDialog(null, (elemento));
                                } else {
                                    JOptionPane.showMessageDialog(null, "KM inicial mayor que el Final;");
                                }
                            }
                        }
                    }
                }

            }
        } else {
            Menu.Menu();
        }

    }

}
