/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.alejozepol.ejerciciospoo;

import edu.alejozepol.Punto1.Punto1;
import edu.alejozepol.Punto2.Punto2;
import edu.alejozepol.punto3.Punto3;
import edu.alejozepol.punto5.Lista;
import javax.swing.JOptionPane;

/**
 *
 * @author alejozepol
 */
public class Menu {

    public static void Menu() {

        Object opciones = JOptionPane.showInputDialog(null, "Seleccione el "
                + "programa que quiere ejecutar",
                "Opciones", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Punto 1", "Punto 2", "Punto 3", "Punto 5"}, "Seleccione");
        if (opciones.equals("Punto 1")) {
            Punto1.punto1();
        } else if (opciones.equals("Punto 2")) {
            Punto2.punto2();
        } else if (opciones.equals("Punto 3")) {
            Punto3.logeo();
        } else if (opciones.equals("Punto 5")) {
            Lista.punto5();
        }
    }
}
