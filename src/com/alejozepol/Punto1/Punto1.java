/*
 * Esta clase es la principal del paquete la cual se utiliza para acceder al
* desarrollo del punto 1 del taller del Programacion Orientado a Objetos del 
* programada de ADSI- SENA 1068180
 */
package com.alejozepol.Punto1;

import javax.swing.JOptionPane;

/**
 *
 * @author alejozepol
 */
public class Punto1 {

    public static void punto1() {
        /**
         * * mediante este metodo se implementa la logica del negocio. Por tal
         * motivo se crea el objeto Hotel de nominado como h1, y debido a que la
         * case Hotel y Habitacion tiene una relacion de agregacion se crea la
         * habitacion mediante el objeto hotel.
         *
         */
        Hotel h1 = new Hotel("cr 20 20 20", "Bogotá", "Chapinero", 555555);
        h1.addHabitacion(101, 1, 101, true, true, 0);
        h1.addHabitacion(102, 2, 102, false, true, 1);
        h1.addHabitacion(103, 3, 103, true, false, 2);

        JOptionPane.showMessageDialog(null,
                "Un turista se registra en un hotel ubicado en una dirección, ciudad y barrio.\n"
                + "Todos los hoteles tienen al menos un número de teléfono. Las habitaciones del\n"
                + "hotel son de distintos tipos: simples, dobles y suite. Es importante registrar\n"
                + "las características que tiene cada habitación, identificadas por un número; \n"
                + "tales como baño privado, teléfono y calefacción. El administrador solicita al\n"
                + "huésped su nombre, dirección, profesión y estado civil. El huésped puede solicitar\n"
                + "que lo despierten en un horario determinado. Al día siguiente, en la confitería\n"
                + "puede desayunar café con leche, te acompañado de pan, y beber lo que desee \n"
                + "(gaseosa, agua mineral con o sin gas). Un turista puede reservar telefónicamente\n"
                + "una habitación desde una fecha hasta otra determinada. ");

        Object opciones = JOptionPane.showInputDialog(null, "Seleccione la acción que quieres realizar:",
                "Opciones", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Revisar Informacion Hotel", "Revisar Informacion Hahbitaciones",
                    "Registrar Huesped", "Consultar Huesped"}, "Seleccione");
        if (opciones.equals("Revisar Informacion Hotel")) {
            JOptionPane.showMessageDialog(null, h1.toString());
        } else if (opciones.equals("Revisar Informacion Hahbitaciones")) {
            JOptionPane.showMessageDialog(null, h1.getHabitacion().toString());
        } else if (opciones.equals("Registrar Huesped")) {
          
            
            Huesped cliente1 = new Huesped("jhon fredy ", "CR 34 20 23", "Consultor", "casado");  
            
        } else if (opciones.equals("Consultar Huesped")) {
        }
//
//        System.out.println(h1.getIndiceHabitacion());
//
//        h1.mostrar();
//
//        Huesped cliente1 = new Huesped("jhon fredy ", "CR 34 20 23", "Consultor", "casado");
//
//        System.out.println("Por Favor ingrese el numero de la Habitacion:");
//        Scanner teclado = new Scanner(System.in);
//        int num = teclado.nextInt();
//
//        if (h1.ocuparHabitacion(num, cliente1)) {
//
//        } else {
//
//        }
//
//        System.out.println(cliente1);

    }

}
