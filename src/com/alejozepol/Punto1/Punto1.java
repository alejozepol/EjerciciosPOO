/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejozepol.Punto1;

import java.util.Scanner;

/**
 *
 * @author alejozepol
 */
public class Punto1 {

    public static void punto1() {
//        
//        Habitacion ha1=new Habitacion(101, 2, 101, false, true);
//        Habitacion ha2=new Habitacion(102, 1, 102, true, true);
//        Habitacion ha3=new Habitacion(103, 3, 103, true, true);
        Hotel h1 = new Hotel("cr 20 20 20", "Bogotá", "Chapinero", 555555);
        h1.addHabitacion(101, 1, 101, true, true, 0);
        h1.addHabitacion(102, 2, 102, false, true, 1);
        h1.addHabitacion(103, 3, 103, true, false, 2);

        System.out.println(h1.getIndiceHabitacion());

        h1.mostrar();
        
        Huesped cliente1= new Huesped("jhon fredy ", "CR 34 20 23", "Consultor", "casado");
        
        System.out.println("Por Favor ingrese el numero de la Habitacion:");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        
        if(h1.ocuparHabitacion(num, cliente1)){
            
        } else{
            
        }
       
        System.out.println( cliente1);

    }

}
